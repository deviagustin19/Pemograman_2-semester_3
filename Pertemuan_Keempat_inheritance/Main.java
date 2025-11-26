/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_Keempat_inheritance;

/**
 *
 * @author livi
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Zombie z = new Zombie("Zombie Jalan", 80, 15);
        Pocong p = new Pocong("Pocong Suro", 100, 25);
        Burung b = new Burung("Garuda", 120, 30);

        System.out.println("=== DATA ZOMBIE ===");
        z.tampilInfo();
        z.attack();
        z.walk();

        System.out.println("\n=== DATA POCONG ===");
        p.tampilInfo();
        p.attack();
        p.jump();

        System.out.println("\n=== DATA BURUNG ===");
        b.tampilInfo();
        b.attack();
        b.fly();
        b.walk();
        b.jump();
    }
}
