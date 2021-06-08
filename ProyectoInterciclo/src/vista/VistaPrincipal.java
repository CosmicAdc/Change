
package vista;

import java.util.Scanner;
import modelo.DatosCliente;
import modelo.datosProducto;
import vista.VistaCliente;
import vista.VistaFactura;
import vista.VistaProductos;


public class VistaPrincipal {
    private VistaCliente clienteVista;
    private VistaProductos productoVista;
    private VistaFactura facturaVista;
    Scanner leer = new Scanner(System.in);
    public VistaPrincipal() {
        clienteVista = new VistaCliente();
        productoVista= new VistaProductos();
        facturaVista=new VistaFactura(productoVista.getProductosControlador(),clienteVista.getClienteControlador());
        
    }
    
   
 public void menu() {
        int opcion = 0;
        do {
            System.out.println("\nSeleccione una opción");
            System.out.println("1. Datos Cliente");
            System.out.println("2. Datos Producto");
            System.out.println("3. Factura");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: clienteVista.menu(); break;
                case 2: productoVista.menu(); break;
                case 3: this.factura(); break;

            }
        } while (opcion <=4 );
    }
    public void factura() {
        System.out.println("Seleccione el  cliente para gestionar sus facturas");
        DatosCliente cliente = clienteVista.buscar();
        if(cliente != null){ 
            clienteVista.asignarSelecionado(cliente);
           
        }else {
            System.out.println("No exite el cliente");
            this.menu();
        }
         System.out.println("Seleccione el  id de la lista de productos a gestionar");
         datosProducto producto = productoVista.buscar();
        if(cliente != null){ 
            productoVista.asignarSelecionado(producto);
         
        }else {
            System.out.println("No exiten los productos");
            this.menu();
        }
        facturaVista.menu();
        
        
    }
    
}
