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
public class Community extends City{
    
    String communityName;

    public  Community(){
    
    }
    
    public Community(String communityName, String cityName) {
        super(cityName);
        this.communityName = communityName;
    }
    
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
@Override
    public String toString() {
        return this.communityName + super.toString();
          
    }
   
}
