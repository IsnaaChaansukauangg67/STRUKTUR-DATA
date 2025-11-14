/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */

    // File: Main.java
import java.util.Scanner;

public class PBO_Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        // Membuat objek Lingkaran
        Maste_Lingkaran lingkaran = new Maste_Lingkaran(r);

        // Menampilkan hasil
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        input.close();
    }
}
