/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_kelima_inheritance;

/**
 *
 * @author livi
 */
public class main {
     public static void main(String[]args){
         // objek bangndatar
         BangunDatar bangunDatar = new BangunDatar();
         
         Persegi persegi = new Persegi();
         persegi.sisi = 5;
         
         Lingkaran lingkaran = new Lingkaran();
         lingkaran.r = 22;
         
         PersegiPanjang persegiPanjang = new PersegiPanjang();
         persegiPanjang.lebar = 4;
         persegiPanjang.panjang = 8;
         
         Segitiga segitiga = new Segitiga();
         segitiga.alas = 12;
         segitiga.tinggi = 8;
         
         // menunjukan inheritance
         bangunDatar.luas();
         bangunDatar.keliling();
         
         persegi.luas();
         persegi.keliling();
         
         lingkaran.luas();
         lingkaran.keliling();
         
         persegiPanjang.luas();
         persegiPanjang.keliling();
         
         segitiga.luas();
         segitiga.keliling();
     }
}
