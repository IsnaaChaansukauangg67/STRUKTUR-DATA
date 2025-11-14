/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */
class Maste_Mobil {
    String karakteristik;
    String merkMobil;
    int tahunPembuatan;
    String warnaMobil;
    
    
    public void jalan (){
        System.out.println("Mobil sedang berjalan...");
    }
    
    public void berhenti(){
        System.out.println("Mobil berhenti.");
    }
}

 //public → supaya bisa diakses dari luar class

//static → bisa dijalankan tanpa membuat objek dari class-nya

//void → tidak mengembalikan nilai

//main → nama method khusus yang dikenali Java sebagai titik awal eksekusi

//String[] args → argumen dari command line (boleh kosong kalau tidak dipakai)
