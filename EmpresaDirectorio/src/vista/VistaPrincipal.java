
package vista;

import java.util.Scanner;


public class VistaPrincipal {
    private Scanner leer;
    private VistaEmpresa vistaEmpresa;
    
    public VistaPrincipal(){
        vistaEmpresa = new VistaEmpresa();
        leer = new Scanner(System.in);
    }
    public void menu(){
        int opcion = 0;
        do {            
            System.out.println("1. Empresa");
            System.out.println("2. salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1: vistaEmpresa.menu(); break;
            }
        } while (opcion<5);
    }
}
