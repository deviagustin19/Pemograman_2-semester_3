/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_keenam_enkapsulasi;

/**
 *
 * @author livi
 */
public class main {
  public static void main(String[]args){
        
  //membuat objek dari class 
    user dian = new user();
    
    // mnggunkan method setter
    dian.setUsername ("dian");
    dian.setPassword ("kopijava");
    
    // menggunkan method gtter
    System.out.println("Username : " + dian.getUsername());
    System.out.println("Password : " + dian.getPassword());
    
    }     
}
