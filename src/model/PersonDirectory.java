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
public class PersonDirectory {
    
    private ArrayList<Person> personDirectoryArrayList;

    public PersonDirectory() {
        personDirectoryArrayList= new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectoryArrayList() {
        return personDirectoryArrayList;
    }

    public void setPersonDirectoryArrayList(ArrayList<Person> personDirectoryArrayList) {
        this.personDirectoryArrayList = personDirectoryArrayList;
    }
    
    public Person addNewPersonDetails() {
        Person newPersonDetails = new Person();
        personDirectoryArrayList.add(newPersonDetails);
        return newPersonDetails;
    }

    public void deletePersonDetails(Person person) {
        personDirectoryArrayList.remove(person); 
    }
    
}
