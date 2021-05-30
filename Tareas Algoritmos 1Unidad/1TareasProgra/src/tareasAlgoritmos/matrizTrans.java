package tareasAlgoritmos;
import java.util.Scanner;
public class matrizTrans {
     public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        int a;
        System.out.println("ingrese el tamaño de su matriz para las filas");
        a=leer.nextInt(); 
        int b;
        System.out.println("ingrese el tamaño de su matriz para las columna");
        b=leer.nextInt(); 
        int matriz[][] = new int[a][b];
        int matrizTrans[][] =new int[b][a];
        //peidido de datos
        for (int i=0; i<a;i++){
            for (int j=0; j<b;j++){
             System.out.println("Ingrese el valor para ["+i+"] ["+ j +"] de su vector");
             matriz[i][j]=leer.nextInt();
         } 
        }
        //muestra de datos
        System.out.println("------------");
        System.out.println("MATRIZ NORMAL");
        for (int i=0; i<a;i++){
            System.out.print("[");
            for (int j=0; j<b;j++){
             System.out.print(matriz[i][j]+"    ");
            } 
            System.out.println("]");
        }
        //transpuesta
        for (int i=0; i < a; i++) {
          for (int j=0; j < b; j++) {
            matrizTrans[j][i] = matriz[i][j];
            }
        }
        //MUESTRA DE DATOS 2
        System.out.println("------------");
        System.out.println("MATRIZ TRANSPUESTA");
         for (int i=0; i<a;i++){
            System.out.print("[");
            for (int j=0; j<b;j++){
             System.out.print(matrizTrans[i][j]+"    ");
            } 
            System.out.println("]");
        }
     }
     
    
}
