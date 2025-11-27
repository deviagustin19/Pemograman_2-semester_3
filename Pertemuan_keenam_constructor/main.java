/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_keenam_constructor;

/**
 *
 * @author livi
 */
public class main {
    public static void main (String[]agrs){
        user petani = new user("petanikode", "kopi");
        System.out.println("username: " + petani.username);
        System.out.println("password: " + petani.password);
    }
}
