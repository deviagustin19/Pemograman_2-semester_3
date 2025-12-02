/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_ketuju_Interface;

import java.util.Scanner;

/**
 *
 * @author livi
 */
public class main {
    public static void main(String[]args){
        
        Phone Redmi2Pro = new Xiaomi();
         
        phoneUser Devi = new phoneUser(Redmi2Pro);
        
        Devi.turnOnThePhone();
        
        Scanner input = new Scanner (System.in);
        String aksi = null;
        
        while(true) {
            System.out.println("====== APLIKASI INTERFACE ======");
            System.out.println("[1] Naylakan HP");
            System.out.println("[2] Matikan Hp");
            System.out.println("[3] Perbesar Volume ");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Aksi");
        
            aksi = input.nextLine();
            if(aksi.equals("1")){
                Devi.turnOnThePhone();
            }
            else if(aksi.equals("2")){
                Devi.turnOffThePhone();
            }
            else if(aksi.equals("3")){
                Devi.makePhoneLouder();
            }
            else if(aksi.equals("4")){
                Devi.makePhoneSilent();
            }
            else if(aksi.equals("")){
                System.out.println("SALAH WOY.....");
            }
        }
        
    }
}
