/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_ketuju_polimorfisme_dinamis;

/**
 *
 * @author livi
 */
public class Persegi extends bangunDatar {
    int sisi;
    
    public Persegi (int sisi){
        this.sisi = sisi;
    }
    @Override
    public float luas(){
        return this.sisi * this.sisi;
    }
    @Override
    public float keliling(){
        return this.sisi * 4;
    }
}
