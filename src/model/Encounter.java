/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jarvis
 */
public class Encounter{
    
    private String date;
    VitalSigns vitalSigns;
    Encounter eh;
    PatientDirectory patientDirectory = new PatientDirectory();
//    private ArrayList<VitalSigns> historyArrayList;

//    public Encounter() {
//        this.historyArrayList = new ArrayList<VitalSigns>();
//    }

    public Encounter(String date, VitalSigns vitalSigns) {
        this.date = date;
        this.vitalSigns = vitalSigns;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    
//    public VitalSigns addNewVitalSigns(){
//    
//        VitalSigns newVitalSigns= new VitalSigns();
//        historyArrayList.add(newVitalSigns);
//        return newVitalSigns;
//    }
    @Override
    public String toString(){
    return date;
    }
    
}
