
package vistas;
import controladores.controlLineas;
import java.util.Scanner;
import modelos.Lineas;
public class vistaLineas {
        
    private Scanner leer;
    private controlLineas lineas;
    public  long abc;
     public vistaLineas (){
        this.leer = new Scanner(System.in);
        this.lineas =new controlLineas();
        
    }
     public void menu(){
        int opcion = 0;
        do{
            System.out.println("\n>>>>>>> Gestión de Lineas <<<<<<<");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
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
                    System.out.println("Listado de Lineas: ");
                    lineas.imprimir(); 
                break;
            }
        }while(opcion<6);
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public controlLineas getClienteControlador() {
        return lineas;
    }

    public void setClienteControlador(controlLineas lineas) {
        this.lineas = lineas;
    }
     
   
    
    public void crear() {
        long id=0;
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("PUNTO DE INICIO DE COORDENADA X: ");
        double CXI = leer.nextDouble();
        System.out.println("PUNTO DE INICIO DE COORDENADA Y: ");
        double CYI = leer.nextDouble();
        System.out.println("PUNTO DE FIN DE COORDENADA X: ");
        double CXF = leer.nextDouble();
        System.out.println("PUNTO DE FIN DE COORDENADA Y: ");
        double CYF = leer.nextDouble();
        double longitud=lineas.Slongitud(CXI, CYI, CXF, CYF);
        boolean resultado = lineas.crear(CXI,CYI,CXF,CYF,id,longitud);
        System.out.println("Linea creada: " + resultado);
    }
    
    public void eliminar(){
        System.out.println("Eliminar Lineas");
        System.out.println("ID: ");
        long id = leer.nextLong();
        boolean resultado = lineas.eliminar(id);
        System.out.println("Linea eliminado: " + resultado);
    }
    
    public Lineas buscar(){
        System.out.println("Buscar Linea");
        long id=this.pregunta();
        
        Lineas linea = lineas.buscar(id);
        System.out.println(lineas);
        return linea;
    }
    public void actualizar(){
        long id1=0;
        System.out.println("Ingrese ID a buscar");
        long id=leer.nextLong();
        System.out.println("Ingrese sus nuevos siguientes datos:");
        System.out.println("PUNTO DE INICIO DE COORDENADA X: ");
        double CXI = leer.nextDouble();
        System.out.println("PUNTO DE INICIO DE COORDENADA Y: ");
        double CYI = leer.nextDouble();
        System.out.println("PUNTO DE FIN DE COORDENADA X: ");
        double CXF = leer.nextDouble();
        System.out.println("PUNTO DE FIN DE COORDENADA Y: ");
        double CYF = leer.nextDouble();
        
        double longitud=lineas.Slongitud(CXI, CYI, CXF, CYF);
        boolean resultado = lineas.actualizar(id,CXI,CYI,CXF,CYF,id1,longitud);
        System.out.println("Cliente actualizado: " + resultado);
    }
   public void asignarSelecionado(Lineas linea){
        lineas.setSelecc(linea);
    }
   
   public long pregunta(){
    System.out.println("ID: ");
    abc = leer.nextLong();
    return abc;
}
}

