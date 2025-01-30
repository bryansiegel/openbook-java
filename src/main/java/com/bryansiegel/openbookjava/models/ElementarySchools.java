package com.bryansiegel.openbookjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class ElementarySchools {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolName;
    private int year;
    private BigDecimal appropriation;
    private BigDecimal actual;
    private BigDecimal salariesLicensedAppropriation;
    private BigDecimal salariesLicensedActual;
    private BigDecimal benefitsLicensedAppropriation;
    private BigDecimal benefitsLicensedActual;
    private BigDecimal salariesSupportAppropriation;
    private BigDecimal salariesSupportActual;
    private BigDecimal benefitsSupportAppropriation;
    private BigDecimal benefitsSupportActual;
    private BigDecimal salariesAdministrationAppropriation;
    private BigDecimal salariesAdministrationActual;
    private BigDecimal benefitsAdministrationAppropriation;
    private BigDecimal benefitsAdministrationActual;


    public ElementarySchools(Long id, String schoolName, int year, BigDecimal appropriation, BigDecimal actual, BigDecimal salariesLicensedAppropriation, BigDecimal salariesLicensedActual, BigDecimal benefitsLicensedAppropriation, BigDecimal benefitsLicensedActual, BigDecimal salariesSupportAppropriation, BigDecimal salariesSupportActual, BigDecimal benefitsSupportAppropriation, BigDecimal benefitsSupportActual, BigDecimal salariesAdministrationAppropriation, BigDecimal salariesAdministrationActual, BigDecimal benefitsAdministrationAppropriation, BigDecimal benefitsAdministrationActual) {
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

    public BigDecimal getAppropriation() {
        return appropriation;
    }

    public void setAppropriation(BigDecimal appropriation) {
        this.appropriation = appropriation;
    }

    public BigDecimal getActual() {
        return actual;
    }

    public void setActual(BigDecimal actual) {
        this.actual = actual;
    }

    public BigDecimal getSalariesLicensedAppropriation() {
        return salariesLicensedAppropriation;
    }

    public void setSalariesLicensedAppropriation(BigDecimal salariesLicensedAppropriation) {
        this.salariesLicensedAppropriation = salariesLicensedAppropriation;
    }

    public BigDecimal getSalariesLicensedActual() {
        return salariesLicensedActual;
    }

    public void setSalariesLicensedActual(BigDecimal salariesLicensedActual) {
        this.salariesLicensedActual = salariesLicensedActual;
    }

    public BigDecimal getBenefitsLicensedAppropriation() {
        return benefitsLicensedAppropriation;
    }

    public void setBenefitsLicensedAppropriation(BigDecimal benefitsLicensedAppropriation) {
        this.benefitsLicensedAppropriation = benefitsLicensedAppropriation;
    }

    public BigDecimal getBenefitsLicensedActual() {
        return benefitsLicensedActual;
    }

    public void setBenefitsLicensedActual(BigDecimal benefitsLicensedActual) {
        this.benefitsLicensedActual = benefitsLicensedActual;
    }

    public BigDecimal getSalariesSupportAppropriation() {
        return salariesSupportAppropriation;
    }

    public void setSalariesSupportAppropriation(BigDecimal salariesSupportAppropriation) {
        this.salariesSupportAppropriation = salariesSupportAppropriation;
    }

    public BigDecimal getSalariesSupportActual() {
        return salariesSupportActual;
    }

    public void setSalariesSupportActual(BigDecimal salariesSupportActual) {
        this.salariesSupportActual = salariesSupportActual;
    }

    public BigDecimal getBenefitsSupportAppropriation() {
        return benefitsSupportAppropriation;
    }

    public void setBenefitsSupportAppropriation(BigDecimal benefitsSupportAppropriation) {
        this.benefitsSupportAppropriation = benefitsSupportAppropriation;
    }

    public BigDecimal getBenefitsSupportActual() {
        return benefitsSupportActual;
    }

    public void setBenefitsSupportActual(BigDecimal benefitsSupportActual) {
        this.benefitsSupportActual = benefitsSupportActual;
    }

    public BigDecimal getSalariesAdministrationAppropriation() {
        return salariesAdministrationAppropriation;
    }

    public void setSalariesAdministrationAppropriation(BigDecimal salariesAdministrationAppropriation) {
        this.salariesAdministrationAppropriation = salariesAdministrationAppropriation;
    }

    public BigDecimal getSalariesAdministrationActual() {
        return salariesAdministrationActual;
    }

    public void setSalariesAdministrationActual(BigDecimal salariesAdministrationActual) {
        this.salariesAdministrationActual = salariesAdministrationActual;
    }

    public BigDecimal getBenefitsAdministrationAppropriation() {
        return benefitsAdministrationAppropriation;
    }

    public void setBenefitsAdministrationAppropriation(BigDecimal benefitsAdministrationAppropriation) {
        this.benefitsAdministrationAppropriation = benefitsAdministrationAppropriation;
    }

    public BigDecimal getBenefitsAdministrationActual() {
        return benefitsAdministrationActual;
    }

    public void setBenefitsAdministrationActual(BigDecimal benefitsAdministrationActual) {
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
                ", salariesSupportActual=" + salariesSupportActual +
                ", benefitsSupportAppropriation=" + benefitsSupportAppropriation +
                ", benefitsSupportActual=" + benefitsSupportActual +
                ", salariesAdministrationAppropriation=" + salariesAdministrationAppropriation +
                ", salariesAdministrationActual=" + salariesAdministrationActual +
                ", benefitsAdministrationAppropriation=" + benefitsAdministrationAppropriation +
                ", benefitsAdministrationActual=" + benefitsAdministrationActual +
                '}';
    }
}
