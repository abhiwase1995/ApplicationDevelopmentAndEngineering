/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.VitalSigns;
import Business.Patient;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abhilash Wase
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        int patientId = 0;
        
        while (true){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n------------------------------------------------");
        System.out.println("Welcome to Health Management System");
        System.out.println("------------------------------------------------");
        
        System.out.println("1. Add new patient");
        System.out.println("2. Check new vital signs (for exisiting patient)");
        System.out.println("3. Check history of vital signs");
        System.out.println("4. Exit");
 
        int option = input.nextInt();
        while (true){
            if (option <0  || option > 4){
                System.out.println("Please select option 1 to 4!");
                option = input.nextInt();
            }
            else{
                break;
            }
        }
        
        if ( option == 1){
            
            System.out.println("------------------------------------------------");
            Patient patient = new Patient();
            VitalSigns vitalSigns = new VitalSigns();
            
            System.out.println("\nEnter Name: ");
            String name = input.next();
            patient.setName(name);
            
            patientId = patientId+1;
            patient.setId(patientId);
            
            System.out.println("\nPatient ID is : "+ patientId);
            
            
            System.out.println("\nEnter age in Years: ");
        
            float age = input.nextFloat();
            while (true){
                if (age < 0 || age > 100){
                    System.out.println("\nPlease enter age between 0 to 100");
                    age = input.nextFloat();
                }
                else{
                    break;
                }
            }

            vitalSigns.setAgeGroup(age);
            
            System.out.println("------------------------------------------------");

            if((vitalSigns.getAgeGroup()>=0 && vitalSigns.getAgeGroup()<0.12)){
                System.out.println("Patient is a newborn Baby");
            }
            else if((vitalSigns.getAgeGroup()>=0.12 && vitalSigns.getAgeGroup()<1)){
                System.out.println("Patient ia an Infant (1-12 Months)");

            }
            else if((vitalSigns.getAgeGroup()>=1 && vitalSigns.getAgeGroup()<3)){
                System.out.println("Patient ia a Toddler (1-3 Years)");

            }
            else if((vitalSigns.getAgeGroup()>=3 && vitalSigns.getAgeGroup()<=5)){
                System.out.println("Patient is a Preschooler (3-5 Years)");

            }
            else if((vitalSigns.getAgeGroup()>=6 && vitalSigns.getAgeGroup()<=12)){
                System.out.println("Patient is in School Age (6-12 Years)");

            }
            else if(vitalSigns.getAgeGroup()>=13 && (vitalSigns.getAgeGroup()<=100)){
                System.out.println("Patient is an Adolescent (13+ Years)");

            }
            System.out.println("------------------------------------------------");
            System.out.println("Provide patient's vital sign details");

            System.out.println("\nEnter Respiratory Rate: ");
            vitalSigns.setRespiratoryRate(input.nextInt());

            System.out.println("\nEnter Heart Rate: ");
            vitalSigns.setHeartRate(input.nextInt());

            System.out.println("\nEnter Blood Pressure: ");
            vitalSigns.setBloodPressure(input.nextInt());

            System.out.println("\nEnter weight in KG ");
            vitalSigns.setWeightInKgs(input.nextFloat());

            System.out.println("\nEnter weight in Pound: ");
            vitalSigns.setWeightInPounds(input.nextFloat());
            
            
            
            patient.vitalSignHistory.add(vitalSigns);
            
            patientList.add(patient);
            
            System.out.println("------------------------------------------------");
            //System.out.println(vitalSignHistory.size());
            
            boolean var = patient.isPatientNormal(vitalSigns);

            if (var == true)
            {

                System.out.println("Patient's vital signs are normal.");
            }
            else{
                System.out.println("Patient's vital signs are not normal.");
            }
            
            System.out.println("------------------------------------------------");
            System.out.println("\nDo you want to check perticular vital sign level ? (Y/N)");
            char response = input.next().charAt(0);
            while (response != 'y' && response != 'n') {
                System.out.println("\nPlease enter Y/N");
                response = input.next().charAt(0);
            }
            if (response == 'y') {
                
                
                System.out.println("\nPlease enter the name of vital sign.\n1. Respiratory Rate\n2. Heart Rate\n3. Blood Pressure\n4. Weight in KG\n5. Weight in Pound ");

                String vsign = input.nextLine();
                vsign+=input.nextLine();
                vsign = vsign.toLowerCase();
                //System.out.println(vsign);

                boolean isNormal = Patient.isThisVitalSignNormal(vitalSigns, vsign);
                
                System.out.println("------------------------------------------------");
                if (isNormal == true){
                    System.out.println("Patient's "+ vsign + " is in normal range.");
                    
                }
                else{
                    System.out.println("Patient's "+ vsign + " is not in normal range.");
                    
                }
                
            } else if (response == 'n') {
                System.out.println("\nThank You!");
                continue;
            }
            
            
            
        }

        
        
        else if (option == 2){
            System.out.println("\nPlease enter patient ID:");
            int id = input.nextInt();
            
            Patient patient = patientList.get(id-1);
            System.out.println("\nDear "+ patient.getName() + ", Enter patient's new vital signs");
            
            
            VitalSigns vitalSigns = new VitalSigns();
            
            System.out.println("\nEnter age in Years: ");
        
            float age = input.nextFloat();
            while (true){
                if (age < 0 || age > 100){
                    System.out.println("\nEnter age between 0 to 100");
                    age = input.nextFloat();
                }
                else{
                    break;
                }
            }

            vitalSigns.setAgeGroup(age);

            System.out.println("------------------------------------------------");
            if((vitalSigns.getAgeGroup()>=0 && vitalSigns.getAgeGroup()<0.12)){
                System.out.println("Patient is a newborn Baby");
            }
            else if((vitalSigns.getAgeGroup()>=0.12 && vitalSigns.getAgeGroup()<1)){
                System.out.println("Patient ia an Infant (1-12 Months)");

            }
            else if((vitalSigns.getAgeGroup()>=1 && vitalSigns.getAgeGroup()<3)){
                System.out.println("Patient ia a Toddler (1-3 Years)");

            }
            else if((vitalSigns.getAgeGroup()>=3 && vitalSigns.getAgeGroup()<=5)){
                System.out.println("Patient is a Preschooler (3-5 Years)");

            }
            else if((vitalSigns.getAgeGroup()>=6 && vitalSigns.getAgeGroup()<=12)){
                System.out.println("Patient is in School Age (6-12 Years)");

            }
            else if(vitalSigns.getAgeGroup()>=13 && (vitalSigns.getAgeGroup()<=100)){
                System.out.println("Patient is an Adolescent (13+ Years)");

            }
            System.out.println("------------------------------------------------");

            System.out.println("\nEnter Respiratory Rate: ");
            vitalSigns.setRespiratoryRate(input.nextInt());

            System.out.println("\nEnter Heart Rate: ");
            vitalSigns.setHeartRate(input.nextInt());

            System.out.println("\nEnter Blood Pressure: ");
            vitalSigns.setBloodPressure(input.nextInt());

            System.out.println("\nEnter weight in KG ");
            vitalSigns.setWeightInKgs(input.nextFloat());

            System.out.println("\nEnter weight in Pound: ");
            vitalSigns.setWeightInPounds(input.nextFloat());
            
            
            
            patient.vitalSignHistory.add(vitalSigns);
            
            
            System.out.println("------------------------------------------------");
            //System.out.println(patient.vitalSignHistory.size());
            
            boolean var = patient.isPatientNormal(vitalSigns);

            if (var == true)
            {

                System.out.println("Patient's vital signs are normal.");
            }
            else{
                System.out.println("Patient's vital signs are not normal.");
            }
            System.out.println("------------------------------------------------");
            
            System.out.println("\nDo you want to check perticular vital sign level ? (Y/N)");
            char resp = input.next().charAt(0);
            while (resp != 'y' && resp != 'n') {
                System.out.println("\nPlease enter Y/N");
                resp = input.next().charAt(0);
            }
            if (resp == 'y') {
                
                System.out.println("\nPlease enter the name of vital sign.\n1. Respiratory Rate\n2. Heart Rate\n3. Blood Pressure\n4. Weight in KG\n5. Weight in Pound");

                String vsign = input.nextLine();
                vsign+=input.nextLine();
                vsign = vsign.toLowerCase();
                //System.out.println(vsign);

                boolean isNormal = Patient.isThisVitalSignNormal(vitalSigns, vsign);
                
                System.out.println("------------------------------------------------");
                if (isNormal == true){
                    System.out.println("\nPatient's "+ vsign + " is in normal range.");
                    
                }
                else{
                    System.out.println("\nPatient's "+ vsign + " is not in normal range.");
                    
                }
                
                
            } else if (resp == 'n') {
                System.out.println("\nThank You!");
                continue;
            }
        
        }
        
        else if (option == 3){
            System.out.println("\nEnter patient ID:");
            int id = input.nextInt();
            
            Patient patient = patientList.get(id-1);
            System.out.println("------------------------------------------------");
            System.out.println("\n Dear "+ patient.getName() + ", Please find below history of vital signs");
            

            for (VitalSigns v : patient.vitalSignHistory) {
                System.out.println("------------------------------------------------");
                System.out.println("Patient's age: "+v.getAgeGroup());
                System.out.println("Patient's Respiratory Rate: "+v.getRespiratoryRate());
                System.out.println("Patient's Heart Rate: "+v.getHeartRate());
                System.out.println("Patients Blood Pressure: "+v.getBloodPressure());
                System.out.println("Patient's Weight in KGs: "+v.getWeightInKgs());
                System.out.println("Patients Weight in Pounds: "+v.getWeightInPounds());
                
            }
        }
        
        else if (option == 4){
            break;
        }

        System.out.println("------------------------------------------------");
        System.out.println("\nDo you want to exit ? (Y/N)");
        
        char response = input.next().charAt(0);
        while (response != 'y' && response != 'n') {
          System.out.println("\nPlease enter Y/N");
          response = input.next().charAt(0);
        }
        
        if (response == 'y') {
          System.out.println("\nThank You!");
          break;
        } else if (response == 'n') {
          continue;
        }
         
    }
    }
}
