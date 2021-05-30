package Vista;
import Controlador.ControladorMaterias;
import colegio.Materias;
import java.util.Scanner;
public class vistaMaterias {
    private Scanner leer;
    private ControladorMaterias Cmateria;
    
    public vistaMaterias(){
        leer =new Scanner(System.in);
        Cmateria=new ControladorMaterias();
        
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
                case 5: Cmateria.mostrar();break; 
                
            }
        }while(opc<6);
    }
    
    public void crear(){
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("ID: ");
        long id=leer.nextLong();
        System.out.println("Nombre de la materia: ");
        String nombre=leer.next();
        boolean resultado =Cmateria.crear(id,nombre);
        System.out.println("Materia creada: "+resultado);
    }
    
    public void actualizar(){
        System.out.println("Que materia desea actualizar:");
        System.out.println("Materia: ");
        String nombre=leer.next();
        System.out.println("id: ");
        long id=leer.nextLong();
        boolean resultado =Cmateria.actualizar(nombre,id);
        System.out.println("Materia actualizada: "+resultado);
       
    }
    public void eliminar(){
        System.out.println("Que materia desea borrar:");
        System.out.println("Materia: ");
        String nombre=leer.next();
        boolean resultado =Cmateria.borrar(nombre);
        System.out.println("Cliente eliminado");
       
    }
    public void buscar(){
        System.out.println("Que materia desea buscar:");
        System.out.println("Materia: ");
        String nombre=leer.next();
        Materias mat =Cmateria.buscar(nombre);
        System.out.println(mat);
       
    }
    
    
    
}
