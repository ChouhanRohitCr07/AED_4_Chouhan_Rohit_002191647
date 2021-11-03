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
//    ArrayList<Type> list = new ArrayList<Type>(Arrays.asList(
//		elem1, elem2,..., elemN
//        ));
    
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
//    VitalSigns v1Signs = new VitalSigns("Rohit",25,"Male",8982253354,"810 Longwood","Roxbury","Boston",99.0,120.0,80.0,80.0,80.0,1,"1/09/2021");
}

    
