
package tareasAlgoritmos;
import java.util.Scanner;
public class Vector {
     public static void main(String args[]){
         Scanner leer = new Scanner(System.in);
         int a;
         System.out.println("ingrese el tamaño de su vector");
         a=leer.nextInt();
         int vector[] = new int[a];
         //ingrear datos
         for (int i=0; i<vector.length-1;i++){
             System.out.println("Ingrese el valor "+ i +" de su vector");
             vector[i]=leer.nextInt();
         }
         //Mostrar datos 1
         System.out.println("--------------------------------");
         System.out.println("VECTOR SIN ORDENAR");
         System.out.print("[");
           for (int i=0; i<vector.length-1;i++){
             System.out.print(vector[i]+"-");
         }
         System.out.println("]");  
         //Ordenamiento 
         for (int i=0; i<vector.length-1;i++){
         int aux = vector[i];
         int j = i - 1;
            while (j >= 0 && aux < vector[j]) {
            vector[j + 1] = vector[j];
            j = j - 1;
            }
         vector[j + 1] = aux;
         }
         
         
         
          //Mostrar datos 2
         System.out.println("VECTOR ORDENADO");
         System.out.print("[");
         for (int i=0; i<vector.length-1;i++){
             System.out.print(vector[i]+"-");
         }
         System.out.println("]");  
     }
}
