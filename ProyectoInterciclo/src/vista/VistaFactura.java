
package vista;
import controlador.ControladorCliente;
import controlador.ControladorProductos;
import controlador. ControladorFactura;
import modelo.factura;
import java.util.Scanner;



public class VistaFactura {
    
    private ControladorCliente controladorCliente;
    private ControladorProductos controladorProducto;
    private ControladorFactura datos;
    Scanner leer = new Scanner(System.in);  

    
     public VistaFactura(ControladorProductos controladorProducto, ControladorCliente controladorCliente) {
        this.controladorCliente= controladorCliente;
        this.controladorProducto = controladorProducto;
        datos = new ControladorFactura();
       
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\nGestión de factura");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion  = leer.nextInt();
            switch(opcion){
                case 1: crear(); break;
                case 2: actualizar(); break;
                case 3: buscar(); break;
                case 4: eliminar(); break;
                case 5:
                System.out.println("Listado de facturas:");
                datos.imprimir(); 
                break;
            }
        } while (opcion < 6);
    }
    
    public void crear(){
        
        System.out.println("Ingrese los datos de la factura:");
       
        System.out.println("total a pagar");
        double totalPagar = leer.nextDouble();
        System.out.println("Ingrese el Dia de creacion de la factura");
        int fechaDia = leer.nextInt();
        System.out.println("Ingrese el Mes de creacion de la factura");
        int fechaMes = leer.nextInt();
        System.out.println("Ingrese el Año de creacion de la factura");
        int fechaAno = leer.nextInt();
        boolean resultado ;
        resultado= datos.crear(totalPagar,fechaMes,fechaDia,fechaAno,controladorCliente.getSelecc(),controladorProducto.getSelecc());
        System.out.println("Producto creado: " + resultado);
    }
    
        public factura buscar(){
        System.out.println("Ingrese ID de la factura: ");
        long id= leer.nextLong();
        factura factura = datos.buscar(id);
        System.out.println(factura);
        return factura;
        
     
    }
    
        public void actualizar(){
        System.out.println("Ingrese los datos: ");
        System.out.println("Id de la factura a buscar");
        long id = leer.nextLong();
        System.out.println("Nuevo Total a pagar");
        double totalPagar = leer.nextDouble();
        System.out.println("Ingrese el nuevo Dia de creacion de la factura");
        int fechaDia = leer.nextInt();
        System.out.println("Ingrese el nuevo Mes de creacion de la factura");
        int fechaMes = leer.nextInt();
        System.out.println("Ingrese el nuevo Año de creacion de la factura");
        int fechaAno = leer.nextInt();
        boolean resultado = datos.actualizar(id,totalPagar,fechaDia,fechaMes,fechaAno);
        System.out.println("Producto actualizado: " + resultado);
       
       
    }
        
    public void eliminar(){
        datos.borrar();
    }
    

    public void asignarSelecionado(factura factura){
        datos.setSelecc(factura);
    } 

    public ControladorCliente getControladorCliente() {
        return controladorCliente;
    }

    public void setControladorCliente(ControladorCliente controladorCliente) {
        this.controladorCliente = controladorCliente;
    }

    public ControladorProductos getControladorProducto() {
        return controladorProducto;
    }

    public void setControladorProducto(ControladorProductos controladorProducto) {
        this.controladorProducto = controladorProducto;
    }

    public ControladorFactura getDatos() {
        return datos;
    }

    public void setDatos(ControladorFactura datos) {
        this.datos = datos;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    

    
    
    
    
}


