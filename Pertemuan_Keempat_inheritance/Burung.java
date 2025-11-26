/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Keempat_inheritance;

/**
 *
 * @author livi
 */
public class Burung extends Makhluk {

    public Burung(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    void fly() {
        System.out.println(name + " terbang tinggi di langit!");
    }

    void walk() {
        System.out.println(name + " berjalan dengan kedua kakinya.");
    }

    void jump() {
        System.out.println(name + " melompat ke dahan pohon!");
    }
}
