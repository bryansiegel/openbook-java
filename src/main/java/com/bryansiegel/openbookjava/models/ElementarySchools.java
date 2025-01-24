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
    private int licensedSalariesAndBenefitsAppropriation;
    private int licensedSalariesAndBenefitsActual;
    private int supportSalariesAndBenefitsAppropriation;
    private int supportSalariesAndBenefitsActual;
    private int administrationSalariesAndBenefitsAppropriation;
    private int administrationSalariesAndBenefitsActual;
    private int servicesAppropiation;
    private int servicesActual;
    private int suppliesAppropriation;
    private int suppliesActual;
    private int equipmentAppropriation;
    private int equipmentActual;
    private int otherAppropriation;
    private int otherActual;
    private int salariesLicensedAppropriation;
    private int salariesLicensedActual;
    private int benefitsLicensedAppropriation;
    private int benefitsLicensedActual;
    private int salariesSupportAppropriation;
    private int salariesSupportAcctual;
    private int benefitsSupportAppropriation;
    private int benefitsSupportActual;
    private int salariesAdministrationAppropriation;
    private int salariesAdministrationActual;
    private int benefitsAdministrationAppropriation;
    private int benefitsAdministrationActual;
    private String expenseType;
    private int glAccount;
    private String glAccountDescription;
    private int expenseTypeAppropriation;
    private int expenseTypeActual;

    public ElementarySchools(Long id, String schoolName, int year, int appropriation, int actual, int licensedSalariesAndBenefitsAppropriation, int licensedSalariesAndBenefitsActual, int supportSalariesAndBenefitsAppropriation, int supportSalariesAndBenefitsActual, int administrationSalariesAndBenefitsAppropriation, int administrationSalariesAndBenefitsActual, int servicesAppropiation, int servicesActual, int suppliesAppropriation, int suppliesActual, int equipmentAppropriation, int equipmentActual, int otherAppropriation, int otherActual, int salariesLicensedAppropriation, int salariesLicensedActual, int benefitsLicensedAppropriation, int benefitsLicensedActual, int salariesSupportAppropriation, int salariesSupportAcctual, int benefitsSupportAppropriation, int benefitsSupportActual, int salariesAdministrationAppropriation, int salariesAdministrationActual, int benefitsAdministrationAppropriation, int benefitsAdministrationActual, String expenseType, int glAccount, String glAccountDescription, int expenseTypeAppropriation, int expenseTypeActual) {
        this.id = id;
        this.schoolName = schoolName;
        this.year = year;
        this.appropriation = appropriation;
        this.actual = actual;
        this.licensedSalariesAndBenefitsAppropriation = licensedSalariesAndBenefitsAppropriation;
        this.licensedSalariesAndBenefitsActual = licensedSalariesAndBenefitsActual;
        this.supportSalariesAndBenefitsAppropriation = supportSalariesAndBenefitsAppropriation;
        this.supportSalariesAndBenefitsActual = supportSalariesAndBenefitsActual;
        this.administrationSalariesAndBenefitsAppropriation = administrationSalariesAndBenefitsAppropriation;
        this.administrationSalariesAndBenefitsActual = administrationSalariesAndBenefitsActual;
        this.servicesAppropiation = servicesAppropiation;
        this.servicesActual = servicesActual;
        this.suppliesAppropriation = suppliesAppropriation;
        this.suppliesActual = suppliesActual;
        this.equipmentAppropriation = equipmentAppropriation;
        this.equipmentActual = equipmentActual;
        this.otherAppropriation = otherAppropriation;
        this.otherActual = otherActual;
        this.salariesLicensedAppropriation = salariesLicensedAppropriation;
        this.salariesLicensedActual = salariesLicensedActual;
        this.benefitsLicensedAppropriation = benefitsLicensedAppropriation;
        this.benefitsLicensedActual = benefitsLicensedActual;
        this.salariesSupportAppropriation = salariesSupportAppropriation;
        this.salariesSupportAcctual = salariesSupportAcctual;
        this.benefitsSupportAppropriation = benefitsSupportAppropriation;
        this.benefitsSupportActual = benefitsSupportActual;
        this.salariesAdministrationAppropriation = salariesAdministrationAppropriation;
        this.salariesAdministrationActual = salariesAdministrationActual;
        this.benefitsAdministrationAppropriation = benefitsAdministrationAppropriation;
        this.benefitsAdministrationActual = benefitsAdministrationActual;
        this.expenseType = expenseType;
        this.glAccount = glAccount;
        this.glAccountDescription = glAccountDescription;
        this.expenseTypeAppropriation = expenseTypeAppropriation;
        this.expenseTypeActual = expenseTypeActual;
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

    public int getLicensedSalariesAndBenefitsAppropriation() {
        return licensedSalariesAndBenefitsAppropriation;
    }

    public void setLicensedSalariesAndBenefitsAppropriation(int licensedSalariesAndBenefitsAppropriation) {
        this.licensedSalariesAndBenefitsAppropriation = licensedSalariesAndBenefitsAppropriation;
    }

    public int getLicensedSalariesAndBenefitsActual() {
        return licensedSalariesAndBenefitsActual;
    }

    public void setLicensedSalariesAndBenefitsActual(int licensedSalariesAndBenefitsActual) {
        this.licensedSalariesAndBenefitsActual = licensedSalariesAndBenefitsActual;
    }

    public int getSupportSalariesAndBenefitsAppropriation() {
        return supportSalariesAndBenefitsAppropriation;
    }

    public void setSupportSalariesAndBenefitsAppropriation(int supportSalariesAndBenefitsAppropriation) {
        this.supportSalariesAndBenefitsAppropriation = supportSalariesAndBenefitsAppropriation;
    }

    public int getSupportSalariesAndBenefitsActual() {
        return supportSalariesAndBenefitsActual;
    }

    public void setSupportSalariesAndBenefitsActual(int supportSalariesAndBenefitsActual) {
        this.supportSalariesAndBenefitsActual = supportSalariesAndBenefitsActual;
    }

    public int getAdministrationSalariesAndBenefitsAppropriation() {
        return administrationSalariesAndBenefitsAppropriation;
    }

    public void setAdministrationSalariesAndBenefitsAppropriation(int administrationSalariesAndBenefitsAppropriation) {
        this.administrationSalariesAndBenefitsAppropriation = administrationSalariesAndBenefitsAppropriation;
    }

    public int getAdministrationSalariesAndBenefitsActual() {
        return administrationSalariesAndBenefitsActual;
    }

    public void setAdministrationSalariesAndBenefitsActual(int administrationSalariesAndBenefitsActual) {
        this.administrationSalariesAndBenefitsActual = administrationSalariesAndBenefitsActual;
    }

    public int getServicesAppropiation() {
        return servicesAppropiation;
    }

    public void setServicesAppropiation(int servicesAppropiation) {
        this.servicesAppropiation = servicesAppropiation;
    }

    public int getServicesActual() {
        return servicesActual;
    }

    public void setServicesActual(int servicesActual) {
        this.servicesActual = servicesActual;
    }

    public int getSuppliesAppropriation() {
        return suppliesAppropriation;
    }

    public void setSuppliesAppropriation(int suppliesAppropriation) {
        this.suppliesAppropriation = suppliesAppropriation;
    }

    public int getSuppliesActual() {
        return suppliesActual;
    }

    public void setSuppliesActual(int suppliesActual) {
        this.suppliesActual = suppliesActual;
    }

    public int getEquipmentAppropriation() {
        return equipmentAppropriation;
    }

    public void setEquipmentAppropriation(int equipmentAppropriation) {
        this.equipmentAppropriation = equipmentAppropriation;
    }

    public int getEquipmentActual() {
        return equipmentActual;
    }

    public void setEquipmentActual(int equipmentActual) {
        this.equipmentActual = equipmentActual;
    }

    public int getOtherAppropriation() {
        return otherAppropriation;
    }

    public void setOtherAppropriation(int otherAppropriation) {
        this.otherAppropriation = otherAppropriation;
    }

    public int getOtherActual() {
        return otherActual;
    }

    public void setOtherActual(int otherActual) {
        this.otherActual = otherActual;
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

    public int getSalariesSupportAcctual() {
        return salariesSupportAcctual;
    }

    public void setSalariesSupportAcctual(int salariesSupportAcctual) {
        this.salariesSupportAcctual = salariesSupportAcctual;
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

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public int getGlAccount() {
        return glAccount;
    }

    public void setGlAccount(int glAccount) {
        this.glAccount = glAccount;
    }

    public String getGlAccountDescription() {
        return glAccountDescription;
    }

    public void setGlAccountDescription(String glAccountDescription) {
        this.glAccountDescription = glAccountDescription;
    }

    public int getExpenseTypeAppropriation() {
        return expenseTypeAppropriation;
    }

    public void setExpenseTypeAppropriation(int expenseTypeAppropriation) {
        this.expenseTypeAppropriation = expenseTypeAppropriation;
    }

    public int getExpenseTypeActual() {
        return expenseTypeActual;
    }

    public void setExpenseTypeActual(int expenseTypeActual) {
        this.expenseTypeActual = expenseTypeActual;
    }

    @Override
    public String toString() {
        return "ElementarySchools{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                ", year=" + year +
                ", appropriation=" + appropriation +
                ", actual=" + actual +
                ", licensedSalariesAndBenefitsAppropriation=" + licensedSalariesAndBenefitsAppropriation +
                ", licensedSalariesAndBenefitsActual=" + licensedSalariesAndBenefitsActual +
                ", supportSalariesAndBenefitsAppropriation=" + supportSalariesAndBenefitsAppropriation +
                ", supportSalariesAndBenefitsActual=" + supportSalariesAndBenefitsActual +
                ", administrationSalariesAndBenefitsAppropriation=" + administrationSalariesAndBenefitsAppropriation +
                ", administrationSalariesAndBenefitsActual=" + administrationSalariesAndBenefitsActual +
                ", servicesAppropiation=" + servicesAppropiation +
                ", servicesActual=" + servicesActual +
                ", suppliesAppropriation=" + suppliesAppropriation +
                ", suppliesActual=" + suppliesActual +
                ", equipmentAppropriation=" + equipmentAppropriation +
                ", equipmentActual=" + equipmentActual +
                ", otherAppropriation=" + otherAppropriation +
                ", otherActual=" + otherActual +
                ", salariesLicensedAppropriation=" + salariesLicensedAppropriation +
                ", salariesLicensedActual=" + salariesLicensedActual +
                ", benefitsLicensedAppropriation=" + benefitsLicensedAppropriation +
                ", benefitsLicensedActual=" + benefitsLicensedActual +
                ", salariesSupportAppropriation=" + salariesSupportAppropriation +
                ", salariesSupportAcctual=" + salariesSupportAcctual +
                ", benefitsSupportAppropriation=" + benefitsSupportAppropriation +
                ", benefitsSupportActual=" + benefitsSupportActual +
                ", salariesAdministrationAppropriation=" + salariesAdministrationAppropriation +
                ", salariesAdministrationActual=" + salariesAdministrationActual +
                ", benefitsAdministrationAppropriation=" + benefitsAdministrationAppropriation +
                ", benefitsAdministrationActual=" + benefitsAdministrationActual +
                ", expenseType='" + expenseType + '\'' +
                ", glAccount=" + glAccount +
                ", glAccountDescription='" + glAccountDescription + '\'' +
                ", expenseTypeAppropriation=" + expenseTypeAppropriation +
                ", expenseTypeActual=" + expenseTypeActual +
                '}';
    }
}
