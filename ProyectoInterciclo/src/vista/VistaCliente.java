
package vista;

import controlador.ControladorCliente;
import java.util.Scanner;
import modelo.DatosCliente;


public class VistaCliente {
    
    
    private Scanner leer;
    private ControladorCliente clienteControlador;

     public VistaCliente (){
        this.leer = new Scanner(System.in);
        this.clienteControlador = new ControladorCliente();
        
    }
     public void menu(){
        int opcion = 0;
        do{
            System.out.println("\nGestión de Clientes");
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
                    System.out.println("Listado de clientes: ");
                    clienteControlador.imprimir(); 
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

    public ControladorCliente getClienteControlador() {
        return clienteControlador;
    }

    public void setClienteControlador(ControladorCliente clienteControlador) {
        this.clienteControlador = clienteControlador;
    }
     
   
    
    public void crear() {
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Id: ");
        long id = leer.nextLong();
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Cedula: ");
        String cedula = leer.next();
        System.out.println("valor de fiabilidad de pago: ");
        long fiabPago = leer.nextLong();
        boolean resultado = clienteControlador.crear(id, nombre,cedula,fiabPago);
        System.out.println("Cliente creado: " + resultado);
    }
    
    public void eliminar(){
        System.out.println("Eliminar Cliente");
        System.out.println("Cedula: ");
        String cedula = leer.next();
        boolean resultado = clienteControlador.eliminar(cedula);
        System.out.println("Cliente eliminado: " + resultado);
    }
    
    public DatosCliente buscar(){
        System.out.println("Buscar Cedula");
        System.out.println("Cedula: ");
        String cedula = leer.next();
        DatosCliente cliente = clienteControlador.buscar(cedula);
        System.out.println(cliente);
        return cliente;
    }
    public void actualizar(){
        System.out.println("Actualizar");
        System.out.println("Ingrese la Cedula a buscar: ");
        String cedula = leer.next();
        System.out.println("Ingrese nuevo Nombre: ");
        String nombre = leer.next();
        
        System.out.println("Ingrese nuevo Valor de fiabilidad de pago: ");
        long fiabPago = leer.nextLong();
        boolean resultado = clienteControlador.actualizar(cedula, nombre, fiabPago);
        System.out.println("Cliente actualizado: " + resultado);
    }
   public void asignarSelecionado(DatosCliente cliente){
        clienteControlador.setSelecc(cliente);
    }
    
    
    
}
