/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_3;

/**
 *
 * @author isna
 */
public class Maste_Player {
        
     // Atribut
    String name;
    int speed;
    int healthPoin;

    // Method untuk menjalankan aksi 'run'
    void run() {
        System.out.println(name + " is running at  ...");
        System.out.println("Speed: " + speed);
    }

    // Method untuk mengecek apakah pemain sudah mati
    boolean isDead() {
        return healthPoin <= 90;
    }
    
    public static void main(String[] args) {
        PBO_Player petani = new PBO_Player();
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 70;

        petani.run();

        if (petani.isDead()) {
            System.out.println("Game Over");
        } else {
            System.out.println("Masih hidup, lanjutkan!");
        }
    }
}



    

