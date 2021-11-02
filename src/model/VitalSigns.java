/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jarvis
 */
public class VitalSigns {
    
    private double bodyTemperature;
    private double bloodPressure;
    private double heartRate;
    private double weight;
    private int id;
   
//    public VitalSigns() {
//    }

    public VitalSigns(double bodyTemperature, double bloodPressure, double heartRate, double weight, int id) {
        this.bodyTemperature = bodyTemperature;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.weight = weight;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    @Override
    public String toString(){
    String bodyTemperatureString =String.valueOf(bodyTemperature); 
    return bodyTemperatureString;
    }
}
