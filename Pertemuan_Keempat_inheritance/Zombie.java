/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Keempat_inheritance;

/**
 *
 * @author livi
 */
public class Zombie extends Makhluk {

    public Zombie(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    void walk() {
        System.out.println(name + " berjalan lambat sambil mengerang...");
    }
}  

