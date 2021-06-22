
package vistas;

import controladores.controlPlanos;
import java.util.Scanner;
import modelos.Planos;
import modelos.Proyecto;
import controladores.controlProyecto;

public class vistaPlanos {
    Scanner leer = new Scanner(System.in);
    private vistaProyectos vistaP;
    private controlProyecto controlPro;
     private controlPlanos controlPl;
    
     public vistaPlanos(){
         this.controlPro=new controlProyecto();
      
        this.controlPl=new controlPlanos();
    
        
    }
     
     public void menu(){
        int opcion = 0;
        do{
            System.out.println("\n##### Gestión de Planos ######");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar/Imprimir");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1: 
                    this.crear(); 
                break;
                case 2: 
                    this.actualizar(); 
                break;
                case 3: 
                    this.buscar(); 
                break;
                case 4: 
                    this.eliminar(); 
                break;
                case 5: 
                    System.out.println("Listado de Productos: ");
                    controlPl.imprimir(); 
                break;
            }
        }while(opcion<6);
    }
     
    public void crear() {
        long id=0;
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Nro de codigo del plano: ");
        long Nroid = leer.nextLong();
        System.out.println("dia de creacion del plano: ");
        int  dia = leer.nextInt();
        System.out.println("mes de creacion del plano: ");
        int mes = leer.nextInt();
        System.out.println("Año de creacion del plano: ");
        int anio = leer.nextInt();
        System.out.println("Ingrese número de Arquitectos ");
        long nroArquitectos = leer.nextLong();
        System.out.println("Ingrese el número de figuras del plano");
        int nroFiguras=leer.nextInt();
        
        System.out.println("Ingrese el ID del Proyecto al asignar a este Plano");
        long id1=leer.nextLong();
        Proyecto proyecto  = controlPro.buscar(id);
        boolean resultado1;   
             if(proyecto != null){ 
             controlPro.setSelecc(proyecto);
              
             }else {
             
                 System.out.println("No se encontro el proyecto  asignado null");
            }
         resultado1 =controlPl.crear(Nroid, dia, mes, anio, nroArquitectos, nroFiguras, proyecto);
             
        System.out.println("Producto creado: " + resultado1);
    }
    
    public void eliminar(){
        System.out.println("Eliminar producto");
        System.out.println("ID a buscar: ");
        long id = leer.nextLong();
        boolean resultado = controlPl.eliminar(id);
        System.out.println("Producto eliminado: " + resultado);
    }
    
    public Planos buscar(){
        System.out.println("Buscar ID ");
        System.out.println("ID: ");
        Long id = leer.nextLong();
        Planos descrip = controlPl.buscar(id);
        System.out.println(descrip);
        return descrip;
    }
    public void actualizar(){
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Id del plano a buscar: ");
        long id = leer.nextLong();
        System.out.println("Nro de codigo del plano: ");
        long Nroid = leer.nextLong();
        System.out.println("dia de creacion del plano: ");
        int  dia = leer.nextInt();
        System.out.println("mes de creacion del plano: ");
        int mes = leer.nextInt();
        System.out.println("Año de creacion del plano: ");
        int anio = leer.nextInt();
        System.out.println("Ingrese nuro de Arquitectos ");
        long nroArquitectos = leer.nextLong();
        System.out.println("Ingrese el numero de figuras");
        int nroFiguras=leer.nextInt();
        boolean resultado1 =controlPl.actualizar(id, Nroid, dia, mes,  anio, nroArquitectos, nroFiguras);
             
        System.out.println("Producto creado: " + resultado1);
    }
}
