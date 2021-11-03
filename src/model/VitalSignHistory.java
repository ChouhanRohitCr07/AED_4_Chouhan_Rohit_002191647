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
public class VitalSignHistory extends VitalSigns{
    
//    Encounter encounter;
    ArrayList<VitalSigns> vitalSignArrayList;
    
    public VitalSignHistory() {
        this.vitalSignArrayList = new ArrayList<VitalSigns>();
    }
   
    public VitalSigns addNewPatient(){
    VitalSigns vitalSigns = new VitalSigns();
    vitalSignArrayList.add(vitalSigns);
    return vitalSigns;
    }
    
    public ArrayList<VitalSigns> getVitalSignArrayList() {
        return vitalSignArrayList;
    }

    public void setVitalSignArrayList(ArrayList<VitalSigns> vitalSignArrayList) {
        this.vitalSignArrayList = vitalSignArrayList;
    }
   
}

    
