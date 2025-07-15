package com.bryansiegel.openbookjava.repositories;

import com.bryansiegel.openbookjava.models.ElementarySchools;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class ElementarySchoolsRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ElementarySchoolsRepo elementarySchoolsRepo;

    @Test
    void testSaveAndFindById() {
        ElementarySchools school = new ElementarySchools();
        school.setSchoolName("Test School");
        school.setYear(2023);
        school.setAppropriation(new BigDecimal("100000.00"));
        school.setActual(new BigDecimal("95000.00"));

        ElementarySchools savedSchool = elementarySchoolsRepo.save(school);
        
        assertNotNull(savedSchool.getId());
        assertEquals("Test School", savedSchool.getSchoolName());
        assertEquals(2023, savedSchool.getYear());
        assertEquals(new BigDecimal("100000.00"), savedSchool.getAppropriation());
        assertEquals(new BigDecimal("95000.00"), savedSchool.getActual());

        Optional<ElementarySchools> foundSchool = elementarySchoolsRepo.findById(savedSchool.getId());
        assertTrue(foundSchool.isPresent());
        assertEquals("Test School", foundSchool.get().getSchoolName());
    }

    @Test
    void testFindAll() {
        ElementarySchools school1 = new ElementarySchools();
        school1.setSchoolName("School 1");
        school1.setYear(2023);
        school1.setAppropriation(new BigDecimal("100000.00"));

        ElementarySchools school2 = new ElementarySchools();
        school2.setSchoolName("School 2");
        school2.setYear(2023);
        school2.setAppropriation(new BigDecimal("150000.00"));

        elementarySchoolsRepo.save(school1);
        elementarySchoolsRepo.save(school2);

        List<ElementarySchools> schools = elementarySchoolsRepo.findAll();
        
        assertEquals(2, schools.size());
        assertTrue(schools.stream().anyMatch(s -> "School 1".equals(s.getSchoolName())));
        assertTrue(schools.stream().anyMatch(s -> "School 2".equals(s.getSchoolName())));
    }

    @Test
    void testDeleteById() {
        ElementarySchools school = new ElementarySchools();
        school.setSchoolName("Test School");
        school.setYear(2023);
        school.setAppropriation(new BigDecimal("100000.00"));

        ElementarySchools savedSchool = elementarySchoolsRepo.save(school);
        Long schoolId = savedSchool.getId();

        assertTrue(elementarySchoolsRepo.existsById(schoolId));

        elementarySchoolsRepo.deleteById(schoolId);

        assertFalse(elementarySchoolsRepo.existsById(schoolId));
    }

    @Test
    void testFindByIdNotFound() {
        Optional<ElementarySchools> result = elementarySchoolsRepo.findById(999L);
        assertFalse(result.isPresent());
    }

    @Test
    void testSaveWithAllFields() {
        ElementarySchools school = new ElementarySchools();
        school.setSchoolName("Complete School");
        school.setYear(2023);
        school.setAppropriation(new BigDecimal("200000.00"));
        school.setActual(new BigDecimal("190000.00"));
        school.setSalariesLicensedAppropriation(new BigDecimal("100000.00"));
        school.setSalariesLicensedActual(new BigDecimal("95000.00"));
        school.setBenefitsLicensedAppropriation(new BigDecimal("20000.00"));
        school.setBenefitsLicensedActual(new BigDecimal("19000.00"));
        school.setSalariesSupportAppropriation(new BigDecimal("40000.00"));
        school.setSalariesSupportActual(new BigDecimal("38000.00"));
        school.setBenefitsSupportAppropriation(new BigDecimal("10000.00"));
        school.setBenefitsSupportActual(new BigDecimal("9500.00"));
        school.setSalariesAdministrationAppropriation(new BigDecimal("25000.00"));
        school.setSalariesAdministrationActual(new BigDecimal("24000.00"));
        school.setBenefitsAdministrationAppropriation(new BigDecimal("5000.00"));
        school.setBenefitsAdministrationActual(new BigDecimal("4800.00"));

        ElementarySchools savedSchool = elementarySchoolsRepo.save(school);
        
        assertNotNull(savedSchool.getId());
        assertEquals("Complete School", savedSchool.getSchoolName());
        assertEquals(2023, savedSchool.getYear());
        assertEquals(new BigDecimal("200000.00"), savedSchool.getAppropriation());
        assertEquals(new BigDecimal("190000.00"), savedSchool.getActual());
        assertEquals(new BigDecimal("100000.00"), savedSchool.getSalariesLicensedAppropriation());
        assertEquals(new BigDecimal("95000.00"), savedSchool.getSalariesLicensedActual());
        assertEquals(new BigDecimal("20000.00"), savedSchool.getBenefitsLicensedAppropriation());
        assertEquals(new BigDecimal("19000.00"), savedSchool.getBenefitsLicensedActual());
        assertEquals(new BigDecimal("40000.00"), savedSchool.getSalariesSupportAppropriation());
        assertEquals(new BigDecimal("38000.00"), savedSchool.getSalariesSupportActual());
        assertEquals(new BigDecimal("10000.00"), savedSchool.getBenefitsSupportAppropriation());
        assertEquals(new BigDecimal("9500.00"), savedSchool.getBenefitsSupportActual());
        assertEquals(new BigDecimal("25000.00"), savedSchool.getSalariesAdministrationAppropriation());
        assertEquals(new BigDecimal("24000.00"), savedSchool.getSalariesAdministrationActual());
        assertEquals(new BigDecimal("5000.00"), savedSchool.getBenefitsAdministrationAppropriation());
        assertEquals(new BigDecimal("4800.00"), savedSchool.getBenefitsAdministrationActual());
    }
}