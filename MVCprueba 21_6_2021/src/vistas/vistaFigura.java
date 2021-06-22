
package vistas;
import controladores.controlPoligonos;
import modelos.Figuras;
import java.util.Scanner;
import modelos.Poligonos;
import controladores.controlFigura;
import modelos.Lineas;
import vistas.vistaPoligonos;
public class vistaFigura {
    private controlFigura controlFigura;
    private controlPoligonos controlPoligonos;
    private Figuras datos;
    private vistaPoligonos vistaP;
    Scanner leer = new Scanner(System.in);  
    
    
     public vistaFigura() {
        controlFigura=new controlFigura();
        this.vistaP= new vistaPoligonos();
        this.controlPoligonos = new controlPoligonos();
        datos = new Figuras();
        
       
    }

    public vistaFigura(controlPoligonos controlPoligonos) {
        this.vistaP=new vistaPoligonos();
        this.controlPoligonos = controlPoligonos;
         datos = new Figuras();
    }
    
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n//////// Gestión de Figuras ///////");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6.Gestionar Poligonos");
            System.out.println("7. Salir");
            opcion  = leer.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar(); break;
                case 3: this.buscar(); break;
                case 4: eliminar();break;
                case 5: 
                System.out.println("Listado de figuras:");
                controlFigura.imprimir(); 
                break;
                case 6:vistaP.menu();break;
            }
        } while (opcion < 7);
    }
    
    public void crear(){
        System.out.println("Ingrese los datos de su figura:");
        System.out.println("Nombre de la figura");
        String nombre = leer.next();
        System.out.println("Color de la figura");
        String color = leer.next();
       
        long id=0;
        boolean resultado=false;
        System.out.println("--Identificador de su Poligono--");
     
        
        Poligonos poli=vistaP.buscar();
        long c=vistaP.abc;
        
        if (poli!=null){
            
             controlPoligonos.setSelecc(poli);
             
           //  double peri = controlPoligonos.perimetro(poli.getNroLineas(),controlPoligonos.getSelecc());
             resultado=controlFigura.crear(id,color,nombre,0,vistaP.P ,controlPoligonos.getSelecc(),c);
             }else {
             System.out.println("No exite la Poligono");
           
         }
         
        
        
        
       
        System.out.println("Producto creado: " + resultado);
    }
    
    public void eliminar(){
        System.out.println("Eliminar Figura");
        System.out.println("ID: ");
        long id = leer.nextLong();
        boolean resultado = controlFigura.eliminar(id);
        System.out.println("Figura eliminado: " + resultado);
    }
    
     public Figuras buscar(){
        System.out.println("Buscar Linea");
        System.out.println("Ingrese ID a buscar");
        long id=leer.nextLong();
         Figuras figura = controlFigura.buscar(id);
        System.out.println(figura);
        return figura;
    }
     
     
     public void actualizar(){
        long id1=0;
        System.out.println("Ingrese los datos de su figura:");
        System.out.println("Nombre de la figura");
        String nombre = leer.next();
        System.out.println("Color de la figura");
        String color = leer.next();
       
        long id=0;
        
        System.out.println("--Identificador de su Poligono--");

        boolean resultado=false;
        Poligonos poli=vistaP.buscar();
        long c=vistaP.abc;
        if (poli!=null){
             
             controlPoligonos.setSelecc(poli);
          //   double peri = controlPoligonos.perimetro(poli.getNroLineas(),controlPoligonos.getSelecc());  
             resultado=controlFigura.crear(id,color,nombre,0,vistaP.P,controlPoligonos.getSelecc(),c);
             }else {
             System.out.println("No exite la Poligono");
           
         }
        
        
        
        
       
        System.out.println("Figura actualizado: " + resultado);
    }
    
}
