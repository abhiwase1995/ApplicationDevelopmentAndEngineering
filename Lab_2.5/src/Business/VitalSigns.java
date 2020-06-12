/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Abhilash Wase
 */
public class VitalSigns {
    private double temprature;
    private double bloodPressure;
    private int pluse;
    private String date;

    public double getTemprature() {
        return temprature;
    }

    public void setTemprature(double temprature) {
        this.temprature = temprature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPluse() {
        return pluse;
    }

    public void setPluse(int pluse) {
        this.pluse = pluse;
    }

    public String getState() {
        return date;
    }

    public void setState(String state) {
        this.date = state;
    }
    
    @Override
    public String toString(){
        return this.date;
    }
    
    
}
