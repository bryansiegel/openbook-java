package com.bryansiegel.openbookjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ElementarySchools {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolName;
    private int year;
    private int appropriation;
    private int actual;
    private int salariesLicensedAppropriation;
    private int salariesLicensedActual;
    private int benefitsLicensedAppropriation;
    private int benefitsLicensedActual;
    private int salariesSupportAppropriation;
    private int salariesSupportActual;
    private int benefitsSupportAppropriation;
    private int benefitsSupportActual;
    private int salariesAdministrationAppropriation;
    private int salariesAdministrationActual;
    private int benefitsAdministrationAppropriation;
    private int benefitsAdministrationActual;


    public ElementarySchools(Long id, String schoolName, int year, int appropriation, int actual, int licensedSalariesAndBenefitsAppropriation, int licensedSalariesAndBenefitsActual, int supportSalariesAndBenefitsAppropriation, int supportSalariesAndBenefitsActual, int administrationSalariesAndBenefitsAppropriation, int administrationSalariesAndBenefitsActual, int servicesAppropiation, int servicesActual, int suppliesAppropriation, int suppliesActual, int equipmentAppropriation, int equipmentActual, int otherAppropriation, int otherActual, int salariesLicensedAppropriation, int salariesLicensedActual, int benefitsLicensedAppropriation, int benefitsLicensedActual, int salariesSupportAppropriation, int salariesSupportActual, int benefitsSupportAppropriation, int benefitsSupportActual, int salariesAdministrationAppropriation, int salariesAdministrationActual, int benefitsAdministrationAppropriation, int benefitsAdministrationActual, String expenseType, int glAccount, String glAccountDescription, int expenseTypeAppropriation, int expenseTypeActual) {
        this.id = id;
        this.schoolName = schoolName;
        this.year = year;
        this.appropriation = appropriation;
        this.actual = actual;
        this.salariesLicensedAppropriation = salariesLicensedAppropriation;
        this.salariesLicensedActual = salariesLicensedActual;
        this.benefitsLicensedAppropriation = benefitsLicensedAppropriation;
        this.benefitsLicensedActual = benefitsLicensedActual;
        this.salariesSupportAppropriation = salariesSupportAppropriation;
        this.salariesSupportActual = salariesSupportActual;
        this.benefitsSupportAppropriation = benefitsSupportAppropriation;
        this.benefitsSupportActual = benefitsSupportActual;
        this.salariesAdministrationAppropriation = salariesAdministrationAppropriation;
        this.salariesAdministrationActual = salariesAdministrationActual;
        this.benefitsAdministrationAppropriation = benefitsAdministrationAppropriation;
        this.benefitsAdministrationActual = benefitsAdministrationActual;
    }

    public ElementarySchools() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAppropriation() {
        return appropriation;
    }

    public void setAppropriation(int appropriation) {
        this.appropriation = appropriation;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getSalariesLicensedAppropriation() {
        return salariesLicensedAppropriation;
    }

    public void setSalariesLicensedAppropriation(int salariesLicensedAppropriation) {
        this.salariesLicensedAppropriation = salariesLicensedAppropriation;
    }

    public int getSalariesLicensedActual() {
        return salariesLicensedActual;
    }

    public void setSalariesLicensedActual(int salariesLicensedActual) {
        this.salariesLicensedActual = salariesLicensedActual;
    }

    public int getBenefitsLicensedAppropriation() {
        return benefitsLicensedAppropriation;
    }

    public void setBenefitsLicensedAppropriation(int benefitsLicensedAppropriation) {
        this.benefitsLicensedAppropriation = benefitsLicensedAppropriation;
    }

    public int getBenefitsLicensedActual() {
        return benefitsLicensedActual;
    }

    public void setBenefitsLicensedActual(int benefitsLicensedActual) {
        this.benefitsLicensedActual = benefitsLicensedActual;
    }

    public int getSalariesSupportAppropriation() {
        return salariesSupportAppropriation;
    }

    public void setSalariesSupportAppropriation(int salariesSupportAppropriation) {
        this.salariesSupportAppropriation = salariesSupportAppropriation;
    }

    public int getSalariesSupportActual() {
        return salariesSupportActual;
    }

    public void setSalariesSupportActual(int salariesSupportAcctual) {
        this.salariesSupportActual = salariesSupportAcctual;
    }

    public int getBenefitsSupportAppropriation() {
        return benefitsSupportAppropriation;
    }

    public void setBenefitsSupportAppropriation(int benefitsSupportAppropriation) {
        this.benefitsSupportAppropriation = benefitsSupportAppropriation;
    }

    public int getBenefitsSupportActual() {
        return benefitsSupportActual;
    }

    public void setBenefitsSupportActual(int benefitsSupportActual) {
        this.benefitsSupportActual = benefitsSupportActual;
    }

    public int getSalariesAdministrationAppropriation() {
        return salariesAdministrationAppropriation;
    }

    public void setSalariesAdministrationAppropriation(int salariesAdministrationAppropriation) {
        this.salariesAdministrationAppropriation = salariesAdministrationAppropriation;
    }

    public int getSalariesAdministrationActual() {
        return salariesAdministrationActual;
    }

    public void setSalariesAdministrationActual(int salariesAdministrationActual) {
        this.salariesAdministrationActual = salariesAdministrationActual;
    }

    public int getBenefitsAdministrationAppropriation() {
        return benefitsAdministrationAppropriation;
    }

    public void setBenefitsAdministrationAppropriation(int benefitsAdministrationAppropriation) {
        this.benefitsAdministrationAppropriation = benefitsAdministrationAppropriation;
    }

    public int getBenefitsAdministrationActual() {
        return benefitsAdministrationActual;
    }

    public void setBenefitsAdministrationActual(int benefitsAdministrationActual) {
        this.benefitsAdministrationActual = benefitsAdministrationActual;
    }



    @Override
    public String toString() {
        return "ElementarySchools{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                ", year=" + year +
                ", appropriation=" + appropriation +
                ", actual=" + actual +
                ", salariesLicensedAppropriation=" + salariesLicensedAppropriation +
                ", salariesLicensedActual=" + salariesLicensedActual +
                ", benefitsLicensedAppropriation=" + benefitsLicensedAppropriation +
                ", benefitsLicensedActual=" + benefitsLicensedActual +
                ", salariesSupportAppropriation=" + salariesSupportAppropriation +
                ", salariesSupportAcctual=" + salariesSupportActual +
                ", benefitsSupportAppropriation=" + benefitsSupportAppropriation +
                ", benefitsSupportActual=" + benefitsSupportActual +
                ", salariesAdministrationAppropriation=" + salariesAdministrationAppropriation +
                ", salariesAdministrationActual=" + salariesAdministrationActual +
                ", benefitsAdministrationAppropriation=" + benefitsAdministrationAppropriation +
                ", benefitsAdministrationActual=" + benefitsAdministrationActual +
                '}';
    }
}
