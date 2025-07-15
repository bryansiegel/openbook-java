
//Intro Chart
const ctx = document.getElementById('myChart');

new Chart(ctx, {
    type: 'bar',
    data: {
        labels: ['Teachers', 'Students', 'Schools', 'Magnet Schools', 'Private Schools', 'Graduations'],
        datasets: [{
            label: 'Number of Students',
            data: [12, 19, 3, 5, 2, 3],
            borderWidth: 1,
            backgroundColor: "rgba(9, 79, 163)",
        }]
    },
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
});
// Elementary Schools Pie Chart
const elementaryCtx = document.getElementById('elementaryChart');
new Chart(elementaryCtx, {
    type: 'pie',
    data: {
        labels: ['Math', 'Science', 'Arts', 'Sports'],
        datasets: [{
            data: [25, 30, 20, 25],
            backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56', '#4BC0C0']
        }]
    }
});

// High Schools Pie Chart
const highSchoolCtx = document.getElementById('highSchoolChart');
new Chart(highSchoolCtx, {
    type: 'pie',
    data: {
        labels: ['English', 'History', 'Music', 'Technology'],
        datasets: [{
            data: [15, 35, 25, 25],
            backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56', '#4BC0C0']
        }]
    }
});

// Middle Schools Pie Chart
const middleSchoolCtx = document.getElementById('middleSchoolChart');
new Chart(middleSchoolCtx, {
    type: 'pie',
    data: {
        labels: ['Math', 'Science', 'Arts', 'Sports'],
        datasets: [{
            data: [20, 25, 30, 25],
            backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56', '#4BC0C0']
        }]
    }
});

// Magnet Schools Pie Chart
const magnetSchoolCtx = document.getElementById('magnetSchoolChart');
new Chart(magnetSchoolCtx, {
    type: 'pie',
    data: {
        labels: ['STEM', 'Arts', 'Humanities', 'Sports'],
        datasets: [{
            data: [30, 20, 25, 25],
            backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56', '#4BC0C0']
        }]
    }
});
$(document).ready(function () {
    // Initialize the DataTable and remove the 2023 column
    const table = $('#budgetTable').DataTable({
        columnDefs: [
            {targets: 1, visible: false, searchable: false} // Hide the 2023 column
        ]
    });

    // Extract data from the DataTable for the bar chart
    const labels = [];
    const data = [];
    table.rows().every(function () {
        const rowData = this.data();
        labels.push(rowData[0]); // School Name
        data.push(parseFloat(rowData[2].replace(/[$,]/g, ''))); // Budget (2025)
    });

    // Create the bar chart
    const ctx = document.getElementById('budgetPieChart').getContext('2d');
    new Chart(ctx, {
        type: 'bar',
        data: {
            labels: labels,
            datasets: [{
                label: 'Budget (2025)',
                data: data,
                backgroundColor: '#36A2EB'
            }]
        },
        options: {
            responsive: true,
            plugins: {
                legend: {
                    display: false
                },
                tooltip: {
                    callbacks: {
                        label: function (tooltipItem) {
                            return `$${tooltipItem.raw.toLocaleString()}`;
                        }
                    }
                }
            },
            scales: {
                x: {
                    title: {
                        display: true,
                        text: 'School Name'
                    }
                },
                y: {
                    beginAtZero: true,
                    title: {
                        display: true,
                        text: 'Budget (2025)'
                    }
                }
            }
        }
    });
});


