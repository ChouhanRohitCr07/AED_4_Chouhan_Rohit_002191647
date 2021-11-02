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
public class VitalSignHistory extends Encounter{
    
    Encounter encounter;
    ArrayList<Encounter> encounterArrayList;

    public VitalSignHistory() {
        encounterArrayList = new ArrayList<Encounter>();
    }

    public VitalSignHistory(Encounter encounter) {
        this.encounter = encounter;
    }
    
    
    public ArrayList<Encounter> getEncounterArrayList() {
        return encounterArrayList;
    }

    public void setEncounterArrayList(ArrayList<Encounter> encounterArrayList) {
        this.encounterArrayList = encounterArrayList;
    }
    public Encounter addNewVitalSigns(Encounter encounter){
    
        Encounter newEncounter= new Encounter();
        this.encounterArrayList.add(newEncounter);
        return newEncounter;
    }
   
}