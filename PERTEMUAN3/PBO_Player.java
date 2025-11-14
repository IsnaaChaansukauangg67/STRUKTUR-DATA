/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */
public class PBO_Player {
    public static void main(String[] args) {
        
        
        //membuat objek player
        Maste_Player petani = new Maste_Player ();
        
        //mengisi atribut palyer
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 70;
        
        //menjalankan method
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over");
        }
    }
    String name;
    int speed;
    int healthPoin;

    void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean isDead() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
