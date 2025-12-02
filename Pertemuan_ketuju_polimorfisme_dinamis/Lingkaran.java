/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_ketuju_polimorfisme_dinamis;

/**
 *
 * @author livi
 */
public class Lingkaran extends bangunDatar{
    int r;
    
    public Lingkaran(int r){
        this.r = r ;
    }
    public float luas(){
        return (float) Math.PI  * r * r ;
    }
    @Override
    public float keliling(){
        return (float) ( 2* Math.PI * r);
    }
}
