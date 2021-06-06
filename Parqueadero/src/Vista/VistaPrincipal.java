package Vista;
import java.util.Scanner;
import Modelo.Cliente;
import Modelo.Empresa;
import Modelo.Vehiculo;

public class VistaPrincipal {
    private VistaCliente VistaCliente;
    private VistaEmpresa VistaEmpresa;
    private VistaVehiculo VistaVehiculo;
    private VistaServicio VistaServicio;
    private Scanner teclado;

    public VistaPrincipal() {
        VistaEmpresa = new VistaEmpresa();
        VistaCliente = new VistaCliente(VistaEmpresa.getControladorEmpresa()); // estoy unificando el controlador de empresa en uno solo
        VistaVehiculo = new VistaVehiculo(VistaCliente.getControladorCliente());
        VistaServicio = new VistaServicio(VistaVehiculo.getControladorVehiculo());
        teclado = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Empresa");
            System.out.println("2. Cliente");
            System.out.println("3. Vehiculo");
            System.out.println("4. Servicio");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: VistaEmpresa.menu(); break;
                case 2: this.cliente(); break;
                case 3: this.vehiculo(); break;
                case 4: this.servicio();break;
            }
        } while (opcion < 5);
    }
    public void cliente() {
        System.out.println("Seleccione una empresa para gestionar los clientes");
        Empresa empresa = VistaEmpresa.buscar();
        if(empresa != null){ 
            VistaEmpresa.asignarSelecionado(empresa);
            VistaCliente.menu();
        }else {
            System.out.println("No exite la empresa");
            this.cliente();
        }
    }
    public void vehiculo(){
        System.out.println("Seleccione una propietario para gestionar los vechiculos");
        Cliente cliente = VistaCliente.buscar();
        if(cliente != null){ 
            VistaCliente.asignarSeleccionado(cliente);
            VistaVehiculo.menu();
        }else {
            System.out.println("No exite la empresa");
            this.vehiculo();
        }
    }
    public void servicio(){
        System.out.println("Selecione un vehiculo");
        Vehiculo vehiculo = VistaVehiculo.buscar();
        if(vehiculo != null){
            VistaVehiculo.asignarSeleccionado(vehiculo);
            VistaServicio.menu();
        }else {
            System.out.println("No existe vehiculo");
            this.menu();
        }
    }
}
