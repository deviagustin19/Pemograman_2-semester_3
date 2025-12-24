/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Mahasiswa   {
     // ===== Enkapsulasi =====
    private String nama;
    private String ttl;
    private String nim;
    private String programStudi;
    private String fakultas;
    private String semester;
    private String alamat;
    private String visiMisi;
    private String jenisKelamin;
    private String agama;

    // ===== Constructor =====
    public Mahasiswa(String nama, String ttl, String nim,
                     String programStudi, String fakultas, String semester,
                     String alamat, String visiMisi,
                     String jenisKelamin, String agama) {

        this.nama = nama;
        this.ttl = ttl;
        this.nim = nim;
        this.programStudi = programStudi;
        this.fakultas = fakultas;
        this.semester = semester;
        this.alamat = alamat;
        this.visiMisi = visiMisi;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
    }

    // ===== Getter =====
    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public String getProdi() { return programStudi; }

    // ===== Method =====
    public String tampilkanData() {
        return
            "========= DATA MAHASISWA UNU BLITAR =========\n" +
            "Nama           : " + nama + "\n" +
            "TTL            : " + ttl + "\n" +
            "Jenis Kelamin  : " + jenisKelamin + "\n" +
            "Agama          : " + agama + "\n" +
            "NIM            : " + nim + "\n" +
            "Program Studi  : " + programStudi + "\n" +
            "Fakultas       : " + fakultas + "\n" +
            "Semester       : " + semester + "\n" +
            "Alamat         : " + alamat + "\n" +
            "Visi & Misi    : " + visiMisi + "\n";
    }
}
