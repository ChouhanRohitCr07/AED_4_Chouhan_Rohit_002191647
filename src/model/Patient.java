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
public class Patient extends Person{
    
    VitalSignHistory vitalSignHistory;
//    ArrayList<VitalSignHistory> vitalSignHistoryArrayList;

    
    public Patient(VitalSignHistory vitalSignHistory, String personName, int personAge, String gender, long contactNumber, String houseAddress, String communityName, String cityName) {
        super(personName,personAge,gender,contactNumber,houseAddress, communityName, cityName);
        this.vitalSignHistory=vitalSignHistory;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }  
}
//    public VitalSignHistory addVitalSignHistory(){
//        //VitalSignHistory vitalSignHistory =  new VitalSignHistory();
//        vitalSignHistoryArrayList.add(vitalSignHistory);
//        return vitalSignHistory;
//    }

