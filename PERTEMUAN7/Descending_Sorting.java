/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_7;

import java.util.Scanner;

/**
 *
 * @author isna
 */
public class Descending_Sorting {
     private static Scanner sc;
     public static void main(String[] args) 
     {
        int Size, i, j, Temp;
        sc = new Scanner (System.in);
        System.out.print("Silakan isi jumlah elemen array:\n ");
        Size = sc.nextInt();
        
        int [] a = new int [Size];
        System.out.print("Enter " + Size +" elemen array: \n ");
        
        for (i= 0; i< Size ; i++)
        {
            a[i] = sc.nextInt();
        }
        //Menggunakan Selection atau Bubble Sort
        for (i= 0; i< Size; i++){
            for (j = i+1; j < Size; j++){
                if (a[i] < a[j]){
                    Temp = a[i];
                    a[i] = a[j];
                    a[j] = Temp;
                }
            }
        }
        System.out.print("Hasil array setelah Sorting dg Discending: \n ");
        for (i=0; i<Size; i++){
            System.out.print(a[i]+ " ");
        }System.out.println();
    }
}
