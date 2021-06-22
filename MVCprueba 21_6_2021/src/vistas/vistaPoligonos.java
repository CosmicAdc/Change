
package vistas;
import controladores.controlLineas;
import controladores.controlPoligonos;
import modelos.Poligonos;
import java.util.Scanner;
import vistas.vistaLineas;
import modelos.Lineas;
public class vistaPoligonos {
    
    public long abc;
     public double P;
    private vistaPoligonos vistaP;
    private controlLineas controlLineas;
    private controlPoligonos controlPoligono;
    private vistaLineas vistaL;
    long nLineas;
    Scanner leer = new Scanner(System.in);   
    public vistaPoligonos(){
        this.controlLineas= new controlLineas();
        vistaP=vistaP;
        vistaL=new vistaLineas();
        controlPoligono = new controlPoligonos();
    }
    public vistaPoligonos(controlLineas controlLineas) {
        this.controlLineas= new controlLineas();
        vistaL=new vistaLineas();
        vistaP=new vistaPoligonos();
        controlPoligono = new controlPoligonos();
       
    }
    
    
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n♠♠♠♠♠ Gestión de poligonos ♠♠♠♠♠♠");
            System.out.println("1. Crear");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Listar");
            System.out.println("5. Gestionar Lineas");
            System.out.println("6. Salir");
            opcion  = leer.nextInt();
            switch(opcion){
                case 1: crear(); break;
                case 2: buscar(); break;
                case 3: eliminar(); break;
                case 4:
                System.out.println("Listado de poligonos:");
                controlPoligono.imprimir(); 
                break;
                case 5: vistaL.menu();break;
            }
        } while (opcion < 6);
        
    }

    public vistaPoligonos(controlLineas controlLineas, controlPoligonos controlPoligono) {
        this.controlLineas = controlLineas;
        this.controlPoligono = controlPoligono;
    }
    
      public void crear() {
        long id=0;
       
        boolean resultado1=false;
        System.out.println("Ingrese los siguientes datos:");
        do{
        System.out.println("Cuantas lineas forman su poligono: ");
        nLineas= leer.nextLong(); 
        System.out.println("--Ingrese el Id de sus lineas--");
        }while (nLineas<=2);
        System.out.println("--Ingrese el Id de sus lineas--");
        for (int i=0;i<nLineas;i++){
            
            
            
             Lineas linea = vistaL.buscar();
             long linForman= vistaL.abc;
             if(linea != null){ 
             controlLineas.setSelecc(linea);
             resultado1 = controlPoligono.crear(nLineas, linForman,controlLineas.getSelecc());
             
             }else {
             System.out.println("No exite la linea");
           
            }
            
        }
        P=controlPoligono.perimetro(nLineas,controlLineas.getSelecc());
        System.out.println("Perimetro:"+P);
        System.out.println("Poligono creado: " + resultado1);
    }
    
    public void eliminar(){
        System.out.println("Eliminar Poligono");
        System.out.println("ID: ");
        long id = leer.nextLong();
        boolean resultado = controlPoligono.eliminar(id);
        System.out.println("Poligono eliminado: " + resultado);
    }
    
    public Poligonos buscar(){
        System.out.println("Ingrese ID deL poligono: ");
         long id=this.pregunta();
        Poligonos poli = controlPoligono.buscar(id);
        System.out.println(poli);
        return poli;
        
     
    }
    
    
 
   
   public void asignarSelecionado(Poligonos poligono){
        controlPoligono.setSelecc(poligono);
    }
    
   
   public long pregunta(){
    System.out.println("ID: ");
    abc = leer.nextLong();
    return abc;
}
   
}
