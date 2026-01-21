/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas_semester3;

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Koneksi {
             private static Connection con;

    // METHOD UNTUK AMBIL KONEKSI
    public static Connection getKoneksi() {
        if (con == null) {
            try {
                String connectionURL = 
                    "jdbc:mysql://localhost:3306/2455201011_tokodevi?useSSL=false&serverTimezone=UTC";
                String username = "root";
                String password = "";

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(connectionURL, username, password);

                System.out.println("Koneksi Berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, 
                    "Koneksi gagal: " + e.getMessage());
            }
        }
        return con;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection c = getKoneksi();
        if (c != null) {
            JOptionPane.showMessageDialog(null, "Tes koneksi berhasil");
        } else {
            JOptionPane.showMessageDialog(null, "Tes koneksi gagal");
        }
    }
}
