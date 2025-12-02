/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_ketuju_polimorfisme_dinamis;

/**
 *
 * @author livi
 */
public class MainUtama {
    public static void main (String[] args){
        
    bangunDatar bangunD = new bangunDatar();
    Persegi persegi = new Persegi(5);
    Segitiga segitiga = new Segitiga(5, 10);
    Lingkaran lingkaran = new Lingkaran(10);
    
    bangunD.luas();
    bangunD.keliling();
    
    System.out.println("luas Persegi : " + persegi.luas());
    System.out.println("keliling Persegi : " + persegi.keliling());
    System.out.println("luas segitiga : " + segitiga.luas());
    System.out.println("luas lingkaran : " + lingkaran.luas());
    System.out.println("keliling lingkaran : " + lingkaran.keliling());
    }  
 }
