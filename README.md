```markdown
# OpenBookJava

OpenBookJava is a Spring Boot-based web application designed to manage and display content for various pages, including CMS content and school data. The project uses Java, Spring Boot, Maven, and integrates with a database for data persistence.

## Features

- **CMS Management**: Manage content for the public-facing website.
- **School Data Management**: Admin interface to create, edit, view, and delete elementary school records.
- **Authentication**: Secure access to admin pages.
- **Public Pages**: Display content for public users.

## Technologies Used

- **Backend**: Java, Spring Boot
- **Frontend**: Thymeleaf templates
- **Database**: JPA/Hibernate
- **Build Tool**: Maven
- **Security**: Spring Security

## Project Structure

- `src/main/java/com/bryansiegel/openbookjava/controllers`: Contains controllers for handling HTTP requests.
- `src/main/java/com/bryansiegel/openbookjava/models`: Contains entity classes for database models.
- `src/main/java/com/bryansiegel/openbookjava/repositories`: Contains repository interfaces for database operations.
- `src/main/resources/templates`: Contains Thymeleaf templates for rendering views.

## Endpoints

### CMSController
- `GET /admin/cms/`: Displays the CMS admin page.

### PagesController
- `GET /`: Displays the public homepage.

### ElementarySchoolsController
- `GET /admin/elementary-schools/`: Displays the admin list of elementary schools.
- `GET /admin/elementary-schools/create`: Displays the form to create a new elementary school.
- `POST /admin/elementary-schools/store`: Saves a new elementary school.
- `GET /admin/elementary-schools/edit/{id}`: Displays the form to edit an elementary school.
- `GET /admin/elementary-schools/show/{id}`: Displays details of an elementary school.
- `GET /admin/elementary-schools/delete/{id}`: Deletes an elementary school.
- `GET /elementary-schools/`: Displays the public list of elementary schools.

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/bryansiegel/openbookjava.git
   ```
2. Navigate to the project directory:
   ```bash
   cd openbookjava
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. Access the application:
    - Public pages: `http://localhost:8080/`
    - Admin pages: `http://localhost:8080/admin/`

## License

This project is licensed under the MIT License.
```