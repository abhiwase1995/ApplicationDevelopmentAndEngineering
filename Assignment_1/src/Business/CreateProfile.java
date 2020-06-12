/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author wase.a
 */

public class CreateProfile {

    private DemographicInfo demographicInfo;
    private AddressInfo addressInfo;
    private DriverLicenseInfo driverLicenseInfo;
    private SavingAccountInfo savingAccountInfo;
    private CheckingAccountInfo checkingAccountInfo;
    private MedicalRecord medicalRecord;

    public DemographicInfo getDemographicInfo() {
        return demographicInfo;
    }

    public void setDemographicInfo(DemographicInfo demographicInfo) {
        this.demographicInfo = demographicInfo;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    public DriverLicenseInfo getDriverLicenseInfo() {
        return driverLicenseInfo;
    }

    public void setDriverLicenseInfo(DriverLicenseInfo driverLicenseInfo) {
        this.driverLicenseInfo = driverLicenseInfo;
    }

    public SavingAccountInfo getSavingAccountInfo() {
        return savingAccountInfo;
    }

    public void setSavingAccountInfo(SavingAccountInfo savingAccountInfo) {
        this.savingAccountInfo = savingAccountInfo;
    }

    public CheckingAccountInfo getCheckingAccountInfo() {
        return checkingAccountInfo;
    }

    public void setCheckingAccountInfo(CheckingAccountInfo checkingAccountInfo) {
        this.checkingAccountInfo = checkingAccountInfo;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
    
    
    
    
}
