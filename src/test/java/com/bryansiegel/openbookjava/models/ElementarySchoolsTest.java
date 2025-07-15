package com.bryansiegel.openbookjava.models;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class ElementarySchoolsTest {

    @Test
    void testNoArgsConstructor() {
        ElementarySchools school = new ElementarySchools();
        assertNotNull(school);
        assertNull(school.getId());
        assertNull(school.getSchoolName());
        assertEquals(0, school.getYear());
    }

    @Test
    void testAllArgsConstructor() {
        Long id = 1L;
        String schoolName = "Test School";
        int year = 2023;
        BigDecimal appropriation = new BigDecimal("100000.00");
        BigDecimal actual = new BigDecimal("95000.00");
        
        ElementarySchools school = new ElementarySchools(
            id, schoolName, year, appropriation, actual,
            new BigDecimal("50000.00"), new BigDecimal("48000.00"),
            new BigDecimal("10000.00"), new BigDecimal("9500.00"),
            new BigDecimal("20000.00"), new BigDecimal("19000.00"),
            new BigDecimal("5000.00"), new BigDecimal("4800.00"),
            new BigDecimal("10000.00"), new BigDecimal("9500.00"),
            new BigDecimal("2000.00"), new BigDecimal("1900.00")
        );
        
        assertEquals(id, school.getId());
        assertEquals(schoolName, school.getSchoolName());
        assertEquals(year, school.getYear());
        assertEquals(appropriation, school.getAppropriation());
        assertEquals(actual, school.getActual());
    }

    @Test
    void testSettersAndGetters() {
        ElementarySchools school = new ElementarySchools();
        
        Long id = 1L;
        String schoolName = "Test School";
        int year = 2023;
        BigDecimal appropriation = new BigDecimal("100000.00");
        BigDecimal actual = new BigDecimal("95000.00");
        
        school.setId(id);
        school.setSchoolName(schoolName);
        school.setYear(year);
        school.setAppropriation(appropriation);
        school.setActual(actual);
        
        assertEquals(id, school.getId());
        assertEquals(schoolName, school.getSchoolName());
        assertEquals(year, school.getYear());
        assertEquals(appropriation, school.getAppropriation());
        assertEquals(actual, school.getActual());
    }

    @Test
    void testSalariesLicensedFields() {
        ElementarySchools school = new ElementarySchools();
        BigDecimal appropriation = new BigDecimal("50000.00");
        BigDecimal actual = new BigDecimal("48000.00");
        
        school.setSalariesLicensedAppropriation(appropriation);
        school.setSalariesLicensedActual(actual);
        
        assertEquals(appropriation, school.getSalariesLicensedAppropriation());
        assertEquals(actual, school.getSalariesLicensedActual());
    }

    @Test
    void testBenefitsLicensedFields() {
        ElementarySchools school = new ElementarySchools();
        BigDecimal appropriation = new BigDecimal("10000.00");
        BigDecimal actual = new BigDecimal("9500.00");
        
        school.setBenefitsLicensedAppropriation(appropriation);
        school.setBenefitsLicensedActual(actual);
        
        assertEquals(appropriation, school.getBenefitsLicensedAppropriation());
        assertEquals(actual, school.getBenefitsLicensedActual());
    }

    @Test
    void testSalariesSupportFields() {
        ElementarySchools school = new ElementarySchools();
        BigDecimal appropriation = new BigDecimal("20000.00");
        BigDecimal actual = new BigDecimal("19000.00");
        
        school.setSalariesSupportAppropriation(appropriation);
        school.setSalariesSupportActual(actual);
        
        assertEquals(appropriation, school.getSalariesSupportAppropriation());
        assertEquals(actual, school.getSalariesSupportActual());
    }

    @Test
    void testBenefitsSupportFields() {
        ElementarySchools school = new ElementarySchools();
        BigDecimal appropriation = new BigDecimal("5000.00");
        BigDecimal actual = new BigDecimal("4800.00");
        
        school.setBenefitsSupportAppropriation(appropriation);
        school.setBenefitsSupportActual(actual);
        
        assertEquals(appropriation, school.getBenefitsSupportAppropriation());
        assertEquals(actual, school.getBenefitsSupportActual());
    }

    @Test
    void testSalariesAdministrationFields() {
        ElementarySchools school = new ElementarySchools();
        BigDecimal appropriation = new BigDecimal("10000.00");
        BigDecimal actual = new BigDecimal("9500.00");
        
        school.setSalariesAdministrationAppropriation(appropriation);
        school.setSalariesAdministrationActual(actual);
        
        assertEquals(appropriation, school.getSalariesAdministrationAppropriation());
        assertEquals(actual, school.getSalariesAdministrationActual());
    }

    @Test
    void testBenefitsAdministrationFields() {
        ElementarySchools school = new ElementarySchools();
        BigDecimal appropriation = new BigDecimal("2000.00");
        BigDecimal actual = new BigDecimal("1900.00");
        
        school.setBenefitsAdministrationAppropriation(appropriation);
        school.setBenefitsAdministrationActual(actual);
        
        assertEquals(appropriation, school.getBenefitsAdministrationAppropriation());
        assertEquals(actual, school.getBenefitsAdministrationActual());
    }

    @Test
    void testToString() {
        ElementarySchools school = new ElementarySchools();
        school.setId(1L);
        school.setSchoolName("Test School");
        school.setYear(2023);
        school.setAppropriation(new BigDecimal("100000.00"));
        
        String result = school.toString();
        
        assertTrue(result.contains("ElementarySchools{"));
        assertTrue(result.contains("id=1"));
        assertTrue(result.contains("schoolName='Test School'"));
        assertTrue(result.contains("year=2023"));
        assertTrue(result.contains("appropriation=100000.00"));
    }
}