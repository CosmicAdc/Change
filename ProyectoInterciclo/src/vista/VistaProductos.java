
package vista;

import controlador.ControladorCliente;
import controlador.ControladorProductos;
import java.util.Scanner;
import modelo.datosProducto;

public class VistaProductos {
  Scanner leer = new Scanner(System.in);
  
  
    private ControladorProductos ProductosControlador;
     public VistaProductos(){
        
        this.ProductosControlador = new ControladorProductos();
        
    }

 public void menu(){
        int opcion = 0;
        do{
            System.out.println("\nGestión de Productos");
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
                    ProductosControlador.imprimir(); 
                break;
            }
        }while(opcion<6);
    }
     
   
    
    public void crear() {
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Id: ");
        long id = leer.nextLong();
        System.out.println("PrecioU: ");
        double precioU = leer.nextDouble();
        System.out.println("stock: ");
        long stock = leer.nextLong();
        System.out.println("descripcion del producto: ");
        String descripcion = leer.next();
        System.out.println("Producto con IVA (True/False): ");
        Boolean iva = leer.nextBoolean();
        
        boolean resultado = ProductosControlador.crear(id, precioU,stock,descripcion,iva);
        System.out.println("Producto creado: " + resultado);
    }
    
    public void eliminar(){
        System.out.println("Eliminar producto");
        System.out.println("Descripcion del producto: ");
        String descripcion = leer.next();
        boolean resultado = ProductosControlador.eliminar(descripcion);
        System.out.println("Producto eliminado: " + resultado);
    }
    
    public datosProducto buscar(){
        System.out.println("Buscar Descripcion");
        System.out.println("Descripcion: ");
        String descripcion = leer.next();
        datosProducto descrip = ProductosControlador.buscar(descripcion);
        System.out.println(descrip);
        return descrip;
    }
    public void actualizar(){
        System.out.println("Actualizar Producto");
        System.out.println("Ingrese la descripcion a buscar: ");
        String descripcion = leer.next();
        System.out.println("Ingrese nuevo PrecioU: ");
        long precioU = leer.nextLong();
        System.out.println("Ingrese nuevo numero de stock: ");
        long stock = leer.nextLong();
        System.out.println("Ingrese si tiene IVA (True/False) : ");
        boolean iva = leer.nextBoolean();
        boolean resultado = ProductosControlador.actualizar(precioU,stock,descripcion,iva);
        System.out.println("Producto actualizado: " + resultado);
    }
   
   public void asignarSelecionado(datosProducto producto){
        ProductosControlador.setSelecc(producto);
    } 

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public ControladorProductos getProductosControlador() {
        return ProductosControlador;
    }

    public void setProductosControlador(ControladorProductos ProductosControlador) {
        this.ProductosControlador = ProductosControlador;
    }
     
     
     
}
