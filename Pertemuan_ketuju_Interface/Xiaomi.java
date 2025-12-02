/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_ketuju_Interface;

/**
 *
 * @author livi
 */
public class Xiaomi implements Phone {

    private int volume;
    private boolean isPowerOn;
    
    public Xiaomi(){
        this.volume = 50;
    }
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("HandPhone Menyalaa......");
        System.out.println("Selamat Datang di Xiaomi PHONE");
        System.out.println("Andrid Version 100");
    }

    @Override
    public void powerOff() {
        isPowerOn= false;
        System.out.println("HandPhone Dimatikan");
    }

    @Override
    public void volumeUp() {
        if ( isPowerOn){
            if (this.volume == MAX_VOLUME){
                System.out.println("Volume FULL");
                System.out.println("Sudah" + this.getVolume() + "%");
            }
            else{
                this.volume+=10;
                System.out.println("Volume Sekarang: " + this.getVolume());
                System.out.println("HandPhone Nyalakan Dulu Cuy....");
            }    
        }
        else{
            System.out.println("HandPhone Nyalakan Dulu Cuy....");
        }
    }
    @Override
    public void volumeDown() {
        if ( isPowerOn){
            if (this.volume == MIN_VOLUME){
                System.out.println("Volume Sudah Tinggal Sedikit");
                System.out.println("Sudah" + this.getVolume() + "%");
            }
            else{
                this.volume -=10;
                System.out.println("Volume Sekarang: " + this.getVolume());
                System.out.println("HandPhone Nyalakan Dulu Cuy....");
            }    
        }
        else{
            System.out.println("HandPhone Nyalakan Dulu Cuy....");
        }
    }
     public int getVolume(){
         return this.volume;
     }
}
