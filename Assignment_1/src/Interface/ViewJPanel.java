/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.DemographicInfo;
import Business.CreateProfile;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author wase.a
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(CreateProfile createProfile) {
        initComponents();
        displayProduct(createProfile);
    }
    
    private void displayProduct(CreateProfile createProfile){
        String firstName=createProfile.getDemographicInfo().getFirstName();
        String lastName=createProfile.getDemographicInfo().getLastName();
        String phoneNumber=createProfile.getDemographicInfo().getPhoneNumber();
        String dateOfBirth=createProfile.getDemographicInfo().getDateOfBirth();
        String age=createProfile.getDemographicInfo().getAge();
        String height=createProfile.getDemographicInfo().getHeight();
        String weight=createProfile.getDemographicInfo().getWeight();
        String ssn=createProfile.getDemographicInfo().getSSN();
        
        firstNameTextField.setText(firstName);
        lastNameTextField.setText(lastName);
        phoneNumberTextField.setText(phoneNumber);
        dateOfBirthTextField.setText(dateOfBirth);
        ageTextField.setText(age);
        heightTextField.setText(height);
        weightTextField.setText(weight);
        ssnTextField.setText(ssn);
        
        //------------------
        
        String streetAddress=createProfile.getAddressInfo().getStreetAddress();
        String city=createProfile.getAddressInfo().getCity();
        String state=createProfile.getAddressInfo().getState();
        String zipCode=createProfile.getAddressInfo().getZipCode();
        
        streetAddressTextField.setText(streetAddress);
        cityTextField.setText(city);
        stateTextField.setText(state);
        zipCodeTextField.setText(zipCode);
        
        //-----------------
        
        String bankName=createProfile.getSavingAccountInfo().getBankName();
        String bankRoutingNumber=createProfile.getSavingAccountInfo().getBankRoutingNumber();
        String bankAccountNumber=createProfile.getSavingAccountInfo().getBankAccountNumber();
        String accountBalance=createProfile.getSavingAccountInfo().getAccountBalance();
        String accountType=createProfile.getSavingAccountInfo().getAccountType();
        
        bankNameTextField.setText(bankName);
        routingNoTextField.setText(bankRoutingNumber);
        accountNoTextField.setText(bankAccountNumber);
        accountBalanceTextField.setText(accountBalance);
        accountTypeTextField.setText(accountType);
        
        //------------------
        
       
        String bankName2=createProfile.getCheckingAccountInfo().getBankName();
        String bankRoutingNumber2=createProfile.getCheckingAccountInfo().getBankRoutingNumber();
        String bankAccountNumber2=createProfile.getCheckingAccountInfo().getBankAccountNumber();
        String accountBalance2=createProfile.getCheckingAccountInfo().getAccountBalance();
        String accountType2=createProfile.getCheckingAccountInfo().getAccountType();
        
        bankName2TextField.setText(bankName2);
        routingNo2TextField.setText(bankRoutingNumber2);
        accountNo2TextField.setText(bankAccountNumber2);
        accountBalance2TextField.setText(accountBalance2);
        accountType2TextField.setText(accountType2);
        
        //--------------------
        
        String licenseNumber=createProfile.getDriverLicenseInfo().getLicenseNumber();
        String dateOfIssue=createProfile.getDriverLicenseInfo().getDateOfIssue();
        String dateOfExpiration=createProfile.getDriverLicenseInfo().getDateOfExpiration();
        String bloodType=createProfile.getDriverLicenseInfo().getBloodType();
        String imagePath= createProfile.getDriverLicenseInfo().getPhotoIdLocation();
        
        licenseNumberTextField.setText(licenseNumber);
        dateOfBirthTextField.setText(dateOfIssue);
        dateOfExpirationTextField.setText(dateOfExpiration);
        bloodTypeTextField.setText(bloodType);
 
        ImageIcon imageIcon = new ImageIcon(imagePath);
        picture.setIcon(imageIcon);
        
        //-----------------------
        
       
        String medicalRecordNumber=createProfile.getMedicalRecord().getMedicalRecordNumber();
        String alergy1=createProfile.getMedicalRecord().getAlergy1();
        String alergy2=createProfile.getMedicalRecord().getAlergy2();
        String alergy3=createProfile.getMedicalRecord().getAlergy3();
        
        medicalRecordNumberTextField.setText(medicalRecordNumber);
        alergy1TextField.setText(alergy1);
        alergy2TextField.setText(alergy2);
        alergy3TextField.setText(alergy3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DemographicInformationJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateOfBirthTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ssnTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        AddressInformationJPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        streetAddressTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        zipCodeTextField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        BankInformationJPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bankNameTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        accountTypeTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        accountNoTextField = new javax.swing.JTextField();
        routingNoTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        accountBalanceTextField = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        bankName2TextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        accountType2TextField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        routingNo2TextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        accountBalance2TextField = new javax.swing.JTextField();
        accountNo2TextField = new javax.swing.JTextField();
        DriverInformationJPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        licenseNumberTextField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        dateOfIssueTextField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        dateOfExpirationTextField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        bloodTypeTextField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        MedicalRecordJPanel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        medicalRecordNumberTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        alergy1TextField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        alergy2TextField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        alergy3TextField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(245, 249, 254));
        setRequestFocusEnabled(false);

        jPanel5.setBackground(new java.awt.Color(245, 249, 254));

        jLabel1.setBackground(new java.awt.Color(245, 249, 254));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 52, 161));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Profile");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        DemographicInformationJPanel.setBackground(new java.awt.Color(245, 249, 254));
        DemographicInformationJPanel.setForeground(new java.awt.Color(38, 131, 249));
        DemographicInformationJPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DemographicInformationJPanel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 52, 161));
        jLabel2.setText("First Name");

        firstNameTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        firstNameTextField.setForeground(new java.awt.Color(0, 52, 161));
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 52, 161));
        jLabel5.setText("Date of Birth");

        dateOfBirthTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        dateOfBirthTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 52, 161));
        jLabel8.setText("Weight");

        weightTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        weightTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 52, 161));
        jLabel3.setText("Last Name");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 52, 161));
        jLabel6.setText("Age");

        lastNameTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lastNameTextField.setForeground(new java.awt.Color(0, 52, 161));
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 52, 161));
        jLabel4.setText("Phone Number");

        phoneNumberTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        phoneNumberTextField.setForeground(new java.awt.Color(0, 52, 161));
        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });

        ageTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ageTextField.setForeground(new java.awt.Color(0, 52, 161));
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 52, 161));
        jLabel7.setText("Height");

        heightTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        heightTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 52, 161));
        jLabel9.setText("Social Security Number");

        ssnTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ssnTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 52, 161));
        jLabel10.setText("Demographic Information");

        javax.swing.GroupLayout DemographicInformationJPanelLayout = new javax.swing.GroupLayout(DemographicInformationJPanel);
        DemographicInformationJPanel.setLayout(DemographicInformationJPanelLayout);
        DemographicInformationJPanelLayout.setHorizontalGroup(
            DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DemographicInformationJPanelLayout.createSequentialGroup()
                .addGroup(DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DemographicInformationJPanelLayout.createSequentialGroup()
                        .addGroup(DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DemographicInformationJPanelLayout.createSequentialGroup()
                                .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DemographicInformationJPanelLayout.createSequentialGroup()
                                .addGroup(DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DemographicInformationJPanelLayout.createSequentialGroup()
                                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(DemographicInformationJPanelLayout.createSequentialGroup()
                                        .addComponent(dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DemographicInformationJPanelLayout.createSequentialGroup()
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(DemographicInformationJPanelLayout.createSequentialGroup()
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(heightTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(phoneNumberTextField)))))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DemographicInformationJPanelLayout.setVerticalGroup(
            DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DemographicInformationJPanelLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DemographicInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        AddressInformationJPanel.setBackground(new java.awt.Color(245, 249, 254));
        AddressInformationJPanel.setForeground(new java.awt.Color(0, 52, 161));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 52, 161));
        jLabel11.setText("Address Information");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 52, 161));
        jLabel12.setText("Street Address");

        streetAddressTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        streetAddressTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 52, 161));
        jLabel13.setText("City");

        cityTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cityTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 52, 161));
        jLabel14.setText("State");

        stateTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        stateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTextFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 52, 161));
        jLabel15.setText(" Zip Code");

        zipCodeTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        zipCodeTextField.setForeground(new java.awt.Color(0, 52, 161));
        zipCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddressInformationJPanelLayout = new javax.swing.GroupLayout(AddressInformationJPanel);
        AddressInformationJPanel.setLayout(AddressInformationJPanelLayout);
        AddressInformationJPanelLayout.setHorizontalGroup(
            AddressInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressInformationJPanelLayout.createSequentialGroup()
                .addGroup(AddressInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(AddressInformationJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddressInformationJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(streetAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        AddressInformationJPanelLayout.setVerticalGroup(
            AddressInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressInformationJPanelLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(streetAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        BankInformationJPanel.setBackground(new java.awt.Color(245, 249, 254));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 52, 161));
        jLabel16.setText("Bank Account Information");

        jLabel38.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 52, 161));
        jLabel38.setText("1st Bank Account");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 52, 161));
        jLabel17.setText("Bank Name");

        bankNameTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bankNameTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 52, 161));
        jLabel20.setText("Routing Number");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 52, 161));
        jLabel18.setText("Account Type");

        accountTypeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accountTypeTextField.setForeground(new java.awt.Color(0, 52, 161));
        accountTypeTextField.setText("Savings");
        accountTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTypeTextFieldActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 52, 161));
        jLabel19.setText("Account Number");

        accountNoTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        accountNoTextField.setForeground(new java.awt.Color(0, 52, 161));

        routingNoTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        routingNoTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 52, 161));
        jLabel21.setText("Account Balance");

        accountBalanceTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        accountBalanceTextField.setForeground(new java.awt.Color(0, 52, 161));
        accountBalanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBalanceTextFieldActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 52, 161));
        jLabel39.setText("2nd Bank Account");

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 52, 161));
        jLabel23.setText("Bank Name");

        bankName2TextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bankName2TextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 52, 161));
        jLabel24.setText("Account Type");

        accountType2TextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        accountType2TextField.setForeground(new java.awt.Color(0, 52, 161));
        accountType2TextField.setText("Checking");
        accountType2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountType2TextFieldActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 52, 161));
        jLabel25.setText("Account Number");

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 52, 161));
        jLabel26.setText("Routing Number");

        routingNo2TextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        routingNo2TextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 52, 161));
        jLabel27.setText("Account Balance");

        accountBalance2TextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        accountBalance2TextField.setForeground(new java.awt.Color(0, 52, 161));

        accountNo2TextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        accountNo2TextField.setForeground(new java.awt.Color(0, 52, 161));

        javax.swing.GroupLayout BankInformationJPanelLayout = new javax.swing.GroupLayout(BankInformationJPanel);
        BankInformationJPanel.setLayout(BankInformationJPanelLayout);
        BankInformationJPanelLayout.setHorizontalGroup(
            BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                        .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                                .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BankInformationJPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                        .addComponent(bankName2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BankInformationJPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(routingNoTextField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BankInformationJPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                                        .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel18))
                                        .addGap(18, 18, 18)
                                        .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(accountBalanceTextField)
                                            .addComponent(accountTypeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                                    .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                        .addComponent(accountType2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(routingNo2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(accountBalance2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(accountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(accountNo2TextField)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        BankInformationJPanelLayout.setVerticalGroup(
            BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(accountTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(accountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(routingNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(accountBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BankInformationJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bankName2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(accountType2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(accountNo2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BankInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(routingNo2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(accountBalance2TextField))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        DriverInformationJPanel.setBackground(new java.awt.Color(245, 249, 254));

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 52, 161));
        jLabel28.setText("Driver License Information");

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 52, 161));
        jLabel29.setText("License Number");

        licenseNumberTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        licenseNumberTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 52, 161));
        jLabel30.setText("Date of Issue");

        dateOfIssueTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        dateOfIssueTextField.setForeground(new java.awt.Color(0, 52, 161));
        dateOfIssueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfIssueTextFieldActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 52, 161));
        jLabel31.setText("Date of Expiration");

        dateOfExpirationTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        dateOfExpirationTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 52, 161));
        jLabel32.setText("Blood Type");

        bloodTypeTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bloodTypeTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 52, 161));
        jLabel40.setText("Driver License");

        javax.swing.GroupLayout DriverInformationJPanelLayout = new javax.swing.GroupLayout(DriverInformationJPanel);
        DriverInformationJPanel.setLayout(DriverInformationJPanelLayout);
        DriverInformationJPanelLayout.setHorizontalGroup(
            DriverInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DriverInformationJPanelLayout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(DriverInformationJPanelLayout.createSequentialGroup()
                .addGroup(DriverInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel32)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(DriverInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dateOfIssueTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloodTypeTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(licenseNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateOfExpirationTextField))
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DriverInformationJPanelLayout.setVerticalGroup(
            DriverInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DriverInformationJPanelLayout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DriverInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DriverInformationJPanelLayout.createSequentialGroup()
                        .addGroup(DriverInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(licenseNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DriverInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(bloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DriverInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(dateOfIssueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DriverInformationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(dateOfExpirationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        MedicalRecordJPanel.setBackground(new java.awt.Color(245, 249, 254));

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 52, 161));
        jLabel33.setText("Medical Record");

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 52, 161));
        jLabel34.setText("Medical Record Number");

        medicalRecordNumberTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        medicalRecordNumberTextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 52, 161));
        jLabel35.setText("Alergy 1");

        alergy1TextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        alergy1TextField.setForeground(new java.awt.Color(0, 52, 161));

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 52, 161));
        jLabel36.setText("Alergy 2");

        alergy2TextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        alergy2TextField.setForeground(new java.awt.Color(0, 52, 161));
        alergy2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy2TextFieldActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 52, 161));
        jLabel37.setText("Alergy 3");

        alergy3TextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        alergy3TextField.setForeground(new java.awt.Color(0, 52, 161));

        javax.swing.GroupLayout MedicalRecordJPanelLayout = new javax.swing.GroupLayout(MedicalRecordJPanel);
        MedicalRecordJPanel.setLayout(MedicalRecordJPanelLayout);
        MedicalRecordJPanelLayout.setHorizontalGroup(
            MedicalRecordJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalRecordJPanelLayout.createSequentialGroup()
                .addGroup(MedicalRecordJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addGroup(MedicalRecordJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(medicalRecordNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MedicalRecordJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(alergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(alergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(alergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 60, Short.MAX_VALUE))
        );
        MedicalRecordJPanelLayout.setVerticalGroup(
            MedicalRecordJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalRecordJPanelLayout.createSequentialGroup()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MedicalRecordJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(medicalRecordNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MedicalRecordJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(alergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(alergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(alergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DemographicInformationJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DriverInformationJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressInformationJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BankInformationJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(MedicalRecordJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator6))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DemographicInformationJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressInformationJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BankInformationJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DriverInformationJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MedicalRecordJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void stateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateTextFieldActionPerformed

    private void zipCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeTextFieldActionPerformed

    private void accountTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTypeTextFieldActionPerformed

    private void accountBalanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountBalanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountBalanceTextFieldActionPerformed

    private void accountType2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountType2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountType2TextFieldActionPerformed

    private void dateOfIssueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfIssueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateOfIssueTextFieldActionPerformed

    private void alergy2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy2TextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddressInformationJPanel;
    private javax.swing.JPanel BankInformationJPanel;
    private javax.swing.JPanel DemographicInformationJPanel;
    private javax.swing.JPanel DriverInformationJPanel;
    private javax.swing.JPanel MedicalRecordJPanel;
    private javax.swing.JTextField accountBalance2TextField;
    private javax.swing.JTextField accountBalanceTextField;
    private javax.swing.JTextField accountNo2TextField;
    private javax.swing.JTextField accountNoTextField;
    private javax.swing.JTextField accountType2TextField;
    private javax.swing.JTextField accountTypeTextField;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField alergy1TextField;
    private javax.swing.JTextField alergy2TextField;
    private javax.swing.JTextField alergy3TextField;
    private javax.swing.JTextField bankName2TextField;
    private javax.swing.JTextField bankNameTextField;
    private javax.swing.JTextField bloodTypeTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField dateOfBirthTextField;
    private javax.swing.JTextField dateOfExpirationTextField;
    private javax.swing.JTextField dateOfIssueTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField licenseNumberTextField;
    private javax.swing.JTextField medicalRecordNumberTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField routingNo2TextField;
    private javax.swing.JTextField routingNoTextField;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField streetAddressTextField;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}
