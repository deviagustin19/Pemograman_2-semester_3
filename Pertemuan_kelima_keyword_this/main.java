/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_kelima_keyword_this;

/**
 *
 * @author livi
 */
public class main {
   public static void main(String[]args){
        
  //membuat objek dari class 
    User dian = new User();
    
    // mnggunkan method setter
    dian.setUsername ("dian");
    dian.setPassword ("kopijava");
    
    // menggunkan method gtter
    System.out.println("Username : " + dian.getUsername());
    System.out.println("Password : " + dian.getPassword());
    
    }      
}
