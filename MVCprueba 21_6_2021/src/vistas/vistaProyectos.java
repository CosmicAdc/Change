
package vistas;
import controladores.controlProyecto;
import java.util.Scanner;
import modelos.Proyecto;
import vistas.vistaJefe;

public class vistaProyectos {
    private VistaInter interme=new VistaInter();
    private vistaPlanos vistaPlano=new vistaPlanos();
    private controlProyecto datosP;
    private vistaJefe vistaJ;
    private Scanner leer ;
    
    public vistaProyectos(){
        leer= new Scanner(System.in);   
        this.datosP=new controlProyecto();
        this.vistaJ= new vistaJefe();
        this.vistaJ=vistaJ;
        this.vistaPlano=new vistaPlanos();
      
         
    }

    public controlProyecto getDatosP() {
        return datosP;
    }

    public void setDatosP(controlProyecto datosP) {
        this.datosP = datosP;
    }

    public vistaJefe getVistaJ() {
        return vistaJ;
    }

    public void setVistaJ(vistaJefe vistaJ) {
        this.vistaJ = vistaJ;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

   
    
    
     public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n-----Gestión de Proyectos----");
            System.out.println("1. Crear");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Listar");
            System.out.println("5. Actualizar");
            System.out.println("6. Gestionar Jefes de Proyecto");
            System.out.println("7. Gestionar Planos");
            System.out.println("8. Salir");
            opcion  = leer.nextInt();
            switch(opcion){
                case 1: crear(); break;
                case 2: buscar(); break;
                case 3: eliminar(); break;
                case 4:
                System.out.println("Listado de Proyectos:");
                datosP.imprimir(); 
                break;
                case 5:actualizar();break;
                case 6: interme.iraJefe();break;
                case 7: vistaPlano.menu();break;
            }
        } while (opcion < 8);
        
    }
     
     
     public void crear() {
        long id=0;
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Nombre de su Proyeccto: ");
        String nombre= leer.next(); 
        System.out.println("Ingrese el codigo de su proyecto");
        String codigo=leer.next();
        boolean P=datosP.crear(id, codigo, nombre);
        System.out.println("Proyecto creado: " + P);
    }
     public void eliminar(){
        System.out.println("ingrese su id para Eliminar el Proyecto");
        System.out.println("ID: ");
        long id = leer.nextLong();
        boolean resultado = datosP.eliminar(id);
        System.out.println("Proyecto eliminado: " + resultado);
    }
    
        public Proyecto buscar(){
        System.out.println("Ingrese el id del proyecto a buscar: ");
        long id=leer.nextLong();
        Proyecto pro = datosP.buscar(id);
        System.out.println(pro);
        return pro;
        
     
        
        
    }
        
        
        public void actualizar(){
        
        System.out.println("Ingrese el ID a buscar del proyecto");
        long id=leer.nextLong();
        System.out.println("Nombre a su  Proyecto: ");
        String nombre= leer.next(); 
        System.out.println("Ingrese el proyecto trabajador");
        String codigo=leer.next();      
        boolean resultado = datosP.actualizar(id, codigo, nombre);
        System.out.println("Jefe de proyecto actualizado: " + resultado);
    }

    @Override
    public String toString() {
        return "vistaProyectos{" + "datosP=" + datosP + ", vistaJ=" + vistaJ + ", leer=" + leer + '}';
    }
     
}
