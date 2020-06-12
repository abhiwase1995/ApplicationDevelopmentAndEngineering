/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.VitalSigns;
import java.util.Scanner;

/**
 *
 * @author Abhilash Wase
 */
public class Patient {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Health Management System");
        System.out.println("------------------------------------");
        
        Patient patient = new Patient();
        VitalSigns vitalSigns = new VitalSigns();
        
        Scanner input = new Scanner(System.in);

    	System.out.println("Please enter age in Years: ");
        float age = input.nextFloat();
        if (age < 0 || age > 100){
            System.out.println("Please enter age between 0 to 100");
            age = input.nextFloat();
        }
        vitalSigns.setAgeGroup(age);
                
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

        System.out.println("Enter Respiratory Rate: ");
        vitalSigns.setRespiratoryRate(input.nextInt());
        
        System.out.println("Enter Heart Rate: ");
        vitalSigns.setHeartRate(input.nextInt());
        
        System.out.println("Enter Blood Pressure: ");
        vitalSigns.setBloodPressure(input.nextInt());
        
        System.out.println("Enter weight in KG ");
        vitalSigns.setWeightInKgs(input.nextFloat());
        
        System.out.println("Enter weight in Pound: ");
        vitalSigns.setWeightInPounds(input.nextFloat());
        
        System.out.println("------------------------------------");
         
        boolean var = isPatientNormal(vitalSigns);
        if (var == true)
        {
            System.out.println("Patient is Normal.");
        }
        else{
            System.out.println("Patient is Not Normal.");
        }
        
        System.out.println("------------------------------------");
        System.out.println("Thank You!");
    }

    public static boolean isPatientNormal(VitalSigns vitalSigns){     
        
        if((vitalSigns.getAgeGroup()>=0 && vitalSigns.getAgeGroup()<0.12) && 
           (vitalSigns.getRespiratoryRate()>=30 && vitalSigns.getRespiratoryRate()<=50) &&
           (vitalSigns.getHeartRate()>=120 && vitalSigns.getHeartRate()<=160)  &&
           (vitalSigns.getBloodPressure()>=50 && vitalSigns.getBloodPressure()<=70) &&
            (vitalSigns.getWeightInKgs()>=2 && vitalSigns.getWeightInKgs()<=3) &&
            (vitalSigns.getWeightInPounds()>=4.5 && vitalSigns.getWeightInPounds()<=7)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=0.12 && vitalSigns.getAgeGroup() < 1) && 
           (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30) &&
           (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=140)  &&
           (vitalSigns.getBloodPressure()>=70 && vitalSigns.getBloodPressure()<=100) &&
            (vitalSigns.getWeightInKgs()>=4 && vitalSigns.getWeightInKgs()<=10) &&
            (vitalSigns.getWeightInPounds()>=9 && vitalSigns.getWeightInPounds()<=22)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=1 && vitalSigns.getAgeGroup() < 3) && 
           (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30) &&
           (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=130)  &&
           (vitalSigns.getBloodPressure()>=80 && vitalSigns.getBloodPressure()<=110) &&
            (vitalSigns.getWeightInKgs()>=10 && vitalSigns.getWeightInKgs()<=14) &&
            (vitalSigns.getWeightInPounds()>=22 && vitalSigns.getWeightInPounds()<=31)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=3 && vitalSigns.getAgeGroup() <= 5) && 
           (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30) &&
           (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=120)  &&
           (vitalSigns.getBloodPressure()>=80 && vitalSigns.getBloodPressure()<=110) &&
            (vitalSigns.getWeightInKgs()>=14 && vitalSigns.getWeightInKgs()<=18) &&
            (vitalSigns.getWeightInPounds()>=31 && vitalSigns.getWeightInPounds()<=40)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=6 && vitalSigns.getAgeGroup() <=12) && 
           (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30) &&
           (vitalSigns.getHeartRate()>=70 && vitalSigns.getHeartRate()<=110)  &&
           (vitalSigns.getBloodPressure()>=80 && vitalSigns.getBloodPressure()<=120) &&
            (vitalSigns.getWeightInKgs()>=20 && vitalSigns.getWeightInKgs()<=42) &&
            (vitalSigns.getWeightInPounds()>=41 && vitalSigns.getWeightInPounds()<=92)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=13) && 
           (vitalSigns.getRespiratoryRate()>=12 && vitalSigns.getRespiratoryRate()<=20) &&
           (vitalSigns.getHeartRate()>=55 && vitalSigns.getHeartRate()<=105)  &&
           (vitalSigns.getBloodPressure()>=110 && vitalSigns.getBloodPressure()<=120) &&
            (vitalSigns.getWeightInKgs()>50) &&
            (vitalSigns.getWeightInPounds()>110)
          ){
            return true;
        }
        
        else {
        return false;
        }
    }
}
