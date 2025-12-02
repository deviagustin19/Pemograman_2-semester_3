/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_ketuju_Interface;

/**
 *
 * @author livi
 */
public class phoneUser {
    private Phone phone;
    
    public phoneUser(Phone phone){
        this.phone = phone;
    }
    
    void turnOnThePhone (){
        this.phone.powerOn();
    }
    
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
     void makePhoneSilent(){
        this.phone.volumeDown();
}
}