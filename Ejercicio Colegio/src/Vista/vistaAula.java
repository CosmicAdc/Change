package Vista;

import Controlador.ControladorAula;
import colegio.Aula;
import java.util.Scanner;

public class vistaAula {
    private Scanner leer;
    private ControladorAula Caula;
    
    public vistaAula(){
        leer =new Scanner(System.in);
        Caula=new ControladorAula();
        
    }
    
    public void menu(){
        int opc=0;
        do{
        System.out.println("------Menú------");
        System.out.println("1)Crear");
        System.out.println("2)Actualizar");
        System.out.println("3)Buscar/leer");
        System.out.println("4)Eliminar");
        System.out.println("5)Listar");
        System.out.println("6)Salir");
            opc= leer.nextInt();
            switch (opc){
                case 1: this.crear();break;
                case 2: this.actualizar();break;
                case 3: this.buscar();break;
                case 4: this.eliminar();break;
                case 5: Caula.mostrar();break; 
                
            }
        }while(opc<6);
    }
    
    public void crear(){
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("ID: ");
        long id=leer.nextLong();
        System.out.println("Descripcion del aula: ");
        String descripcion=leer.next();
        boolean resultado =Caula.crear(id,descripcion);
        System.out.println("Aula creada: "+resultado);
    }
    
    public void actualizar(){
        System.out.println("Que aula desea actualizar:");
        System.out.println("Aula: ");
        String descripcion=leer.next();
        System.out.println("id: ");
        long id=leer.nextLong();
        boolean resultado =Caula.actualizar(descripcion,id);
        System.out.println("Aula actualizada: "+resultado);
       
    }
    public void eliminar(){
        System.out.println("Que aula desea borrar:");
        System.out.println("aula: ");
        String descripcion=leer.next();
        boolean resultado =Caula.borrar(descripcion);
        System.out.println("Cliente eliminado");
       
    }
    public Aula buscar(){
        System.out.println("Que aula desea buscar:");
        System.out.println("aula: ");
        String descripcion=leer.next();
        Aula aul =Caula.buscar(descripcion);
        System.out.println(aul);
        Caula.setSelecc(aul);
        return aul;
    }
}
