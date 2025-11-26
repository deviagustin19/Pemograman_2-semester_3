/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Keempat_inheritance;

/**
 *
 * @author livi
 */
public class Makhluk {
    String name;
    int hp;
    int attackPoint;

    // Konstruktor
    public Makhluk(String name, int hp, int attackPoint) {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    // Method umum
    void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPoint + "!");
    }

    void tampilInfo() {
        System.out.println("Nama: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack Point: " + attackPoint);
    }
}

