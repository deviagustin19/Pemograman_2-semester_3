/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Keempat_inheritance;

/**
 *
 * @author livi
 */
public class Pocong extends Makhluk {

    public Pocong(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    void jump() {
        System.out.println(name + " melompat-lompat dengan kain kafannya!");
    }
}
