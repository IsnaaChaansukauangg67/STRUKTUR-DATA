/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author isna
 */
public class Menghapus_Duplikat {
    public static void main(String[] args) {
        int[]array = {1,2,2,3,4,4,5};
        int length = array.length;
        
        int[]temp = new int[length];
        int newIndex =0;
        
        //Menghapus Duplikat
        for (int i= 0; i< length;i++){
            boolean isDuplikat = false;
            for (int j =0; j< newIndex; j++){
                if(array[i]== temp[j]){
                    isDuplikat = true;
                    break;
                }
            }
                            if (!isDuplikat){
                                temp[newIndex++] =array[i];
                     
                            }
                        }
                        //menampilkan array tanpa duplikat
                        System.out.print("Array tanpa duplikat: {");
                        for (int i=0; i< newIndex; i++){
                            System.out.print(temp[i]);
                            if (i< newIndex -1){
                                System.out.print(",");}
                        }
                      
                        
    
    
                                System.out.println("}");
                            }
}
                   

