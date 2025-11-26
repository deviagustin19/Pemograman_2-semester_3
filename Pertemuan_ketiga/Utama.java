/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_ketiga;

/**
 *
 * @author livi
 */
public class Utama {   
    public static void main(String[]args){
    Mahasiswa m1 = new Mahasiswa (" Devi agustin", "2455201011" ," ilmu komputer", 3.80) ;
    Mahasiswa m2 = new Mahasiswa ("bella ardania", "2455201012" ," peternakan", 3.75) ;
    m1.tampilkanData();
    m1.updateIpk(4.0);
    m1.tampilkanData();
    m1.cekspp(true);
    System.out.println("predikat yang diperoleh " + m1.predikat());
    
    m2.tampilkanData();
    m2.updateIpk(4.0);
    m2.tampilkanData();
    m2.cekspp(true);
    System.out.println("predikat yang diperoleh " + m2.predikat());
    }
}

