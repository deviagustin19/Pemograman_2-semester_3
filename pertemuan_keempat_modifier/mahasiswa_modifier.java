/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_keempat_modifier;

/**
 *
 * @author livi
 */
 class mahasiswa_modifier {
    private String nim;
    private String nama;
    private double ipk;
    private String predikat;

    // Konstruktor: method khusus untuk mengisi data objek saat dibuat
    public mahasiswa_modifier(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        
    }

    // Method untuk menampilkan data(Prosdur)
    public void tampilkanData() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("IPK      : " + ipk);
        System.out.println("Predikat : " + getPredikat());   
        
    }
    //update ipk
    // Method untuk mengupdate IPK (Prosedur)parameter
     void updateData (String nimbaru, String namabaru, double ipkbaru ){
        this.nim = nimbaru;
        this.nama = namabaru;
        this.ipk = ipkbaru;
        System.out.println("\ndata mahasiswa diperbarui!");
}
    
    
    // Method untuk menentukan predikat berdasarkan IPK (fungsi)
    public String getPredikat() {
        if (ipk >= 3.5) {
            predikat = "Cumlaude";
        } else if (ipk >= 3.0) {
            predikat = "Sangat Memuaskan";
        } else if (ipk >= 2.5) {
            predikat = "Memuaskan";
        } else {
            predikat = "Cukup";
        }
    return predikat;
    }
}


  

