
package vistas;
import controladores.controlJefe;
import java.util.Scanner;
import modelos.JefeProyecto;
import vistas.vistaProyectos;
import controladores.controlProyecto;
public class vistaJefe {
    
    private controlJefe datosJ;
    private Scanner leer ; 

    public vistaJefe() {
   

        datosJ = new controlJefe();
        leer=new Scanner(System.in);
        
    }
 
   

    public controlJefe getDatosJ() {
        return datosJ;
    }

    public void setDatosJ(controlJefe datosJ) {
        this.datosJ = datosJ;
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
            System.out.println("\n+++Gestión de Jefes de Proyecto+++");
            System.out.println("1. Crear");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Listar");
            System.out.println("5. Actualizar");
            System.out.println("6. Salir");
        
            opcion  = leer.nextInt();
            switch(opcion){
                case 1: crear(); break;
                case 2: buscar(); break;
                case 3: eliminar(); break;
                case 4:
                System.out.println("Listado de Jefes de Proyecto:");
                datosJ.imprimir(); 
                break;
                case 5: actualizar();break;
                case 6: break;
            }
        } while (opcion < 6);
        
    }
      public void crear() {
        long id=0;
       
      
        System.out.println("Ingrese los siguientes datos:");
      
        System.out.println("Nombre de su jefe de proyeccto: ");
        String nombre= leer.next(); 
        System.out.println("Ingrese el codigo del trabajador");
        String codigo=leer.next();
        System.out.println("Ingrese la dirreccion: ");
        String dir= leer.next(); 
        System.out.println("Ingrese el telefono");
        String tlf=leer.next();
        boolean f=datosJ.confirmar(nombre);
        boolean P;
        if (f==true){
            P=datosJ.crear(id, codigo, nombre, dir, tlf);
        }else{
            P=false;
        }
        
       
        System.out.println("Jefe de proyecto creado: " + P);
    }
    
    public void eliminar(){
        System.out.println("Eliminar Jefe de Proyecto");
        System.out.println("Codigo: ");
        String codigo = leer.next();
        boolean resultado = datosJ.eliminar(codigo);
        System.out.println("Jefe de Proyecto eliminado: " + resultado);
    }
    
        public JefeProyecto buscar(){
        System.out.println("Ingrese el codigo a buscar del jefe de proyecto: ");
        String codigo=leer.next();
        JefeProyecto jefe = datosJ.buscar(codigo);
        System.out.println(jefe);
        return jefe;
        
     
        
        
    }
        
        
        public void actualizar(){
        long id1=0;
        System.out.println("Ingrese el codigo del trabajador a actualizar");
        String codigo=leer.next();
        
        System.out.println("Nombre a buscar de su jefe de proyeccto: ");
        String nombre= leer.next(); 
        
        System.out.println("Ingrese la dirreccion: ");
        String dir= leer.next(); 
        System.out.println("Ingrese el telefono");
        String tlf=leer.next();
        
       
        boolean resultado = datosJ.actualizar(id1, codigo, nombre, dir, tlf);
        System.out.println("Jefe de proyecto actualizado: " + resultado);
    }

    @Override
    public String toString() {
        return "vistaJefe{" + "datosJ=" + datosJ + ", leer=" + leer + '}';
    }

    
        
        
        
     
     
     
}
