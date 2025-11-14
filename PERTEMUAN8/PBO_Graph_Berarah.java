/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_8final;

/**
 *
 * @author isna
 */
public class PBO_Graph_Berarah {
    public static void main(String[] args) {
        Master_Graph_Berarah graf = new Master_Graph_Berarah ();
        
        graf.insertVertex('A');
        graf.insertVertex('B');
        graf.insertVertex('C');
        graf.insertVertex('D');
        graf.insertVertex('E');
        graf.insertVertex('F');
        
        graf.insertEdge('A', 'D');
        graf.insertEdge('A', 'B');
        graf.insertEdge('B', 'A');
        graf.insertEdge('B', 'D');
        graf.insertEdge('D', 'C');
        graf.insertEdge('B', 'C');
        graf.insertEdge('C', 'E');
        graf.insertEdge('E', 'F');
        graf.insertEdge('F', 'F');
        
         System.out.println("Graph: ");
         graf.display ();
         
         graf.deleteEdge('E', 'F');
         System.out.println("Setelah E-F dihapus:  ");
         graf.display();
         
         graf.deleteVertex('A');
         System.out.println("Setelah A dihapus: ");
         
         graf.display();
         
         System.out.println("Jumlah vertex sekarang: " + graf.length());
    }
}