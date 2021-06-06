package Vista;
import Controlador.ControladorCliente;
import Controlador.ControladorEmpresa;
import java.util.Scanner;
import Modelo.Cliente;
import Modelo.Empresa;
public class VistaCliente {
     private Scanner leer;
    private ControladorCliente ControladorCliente;
    private ControladorEmpresa ControladorEmpresa;
    
    public VistaCliente(ControladorEmpresa ControladorEmpresa){
        this.leer = new Scanner(System.in);
        this.ControladorCliente = new ControladorCliente();
        this.ControladorEmpresa = ControladorEmpresa;
    }
    
    public void menu(){
        int opcion = 0;
        do{
            System.out.println("\nGestión de Clientes");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar/Leer");
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
                    System.out.println("Listado de clientes: ");
                    ControladorCliente.imprimir(); 
                break;
            }
        }while(opcion<6);
    }
    public void crear() {
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Id: ");
        long id = leer.nextLong();
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        System.out.println("Cedula: ");
        String cedula = leer.next();
        boolean resultado = ControladorCliente.crear(id, nombre, apellido, cedula, ControladorEmpresa.getSeleccionado());
        System.out.println("Cliente creado: " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar");
        System.out.println("Cedula: ");
        String cedula = leer.next();
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        boolean resultado = ControladorCliente.actualizar(cedula, nombre, apellido);
        System.out.println("Cliente actualizado: " + resultado);
    }
    public void eliminar(){
        System.out.println("Eliminar Cliente: ");
        System.out.println("Cedula: ");
        String cedula = leer.next();
        boolean resultado = ControladorCliente.eliminar(cedula);
        System.out.println("Cliente eliminado: " + resultado);
    }
    public Cliente buscar(){
        System.out.println("Buscar Cliente: ");
        System.out.println("Cedula: ");
        String cedula = leer.next();
        Cliente cliente = ControladorCliente.buscar(cedula);
        System.out.println(cliente);
        return cliente;
    }
    public void asignarSeleccionado(Cliente cliente) {
        ControladorCliente.setselecc(cliente);
    }


    public ControladorCliente getControladorCliente() {
        return ControladorCliente;
    }

    public void setControladorCliente(ControladorCliente ControladorCliente) {
        this.ControladorCliente = ControladorCliente;
    }

    public ControladorEmpresa getControladorEmpresa() {
        return ControladorEmpresa;
    }

    public void setControladorEmpresa(ControladorEmpresa ControladorEmpresa) {
        this.ControladorEmpresa = ControladorEmpresa;
    }
}
