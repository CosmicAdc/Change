
package Vista;
import Controlador.ControladorCliente;
import Controlador.ControladorVehiculo;
import java.util.Scanner;
import Modelo.Cliente;
import Modelo.Vehiculo;
public class VistaVehiculo {
     private ControladorVehiculo ControladorVehiculo;
    private ControladorCliente ControladorCliente;
    private Scanner leer;

    public VistaVehiculo(ControladorCliente ControladorCliente) {
        this.ControladorCliente = ControladorCliente;
        ControladorVehiculo = new ControladorVehiculo();
        leer= new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Gestión de Vehiculos");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Imprimir");
            System.out.println("6. Salir");
            opcion  = leer.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar(); break;
                case 3: this.buscar(); break;
                case 4: this.eliminar(); break;
                case 5: this.imprimir(); break;
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("Crear - Ingrese los datos:");
        System.out.println("Placa: ");
        String placa = leer.next();
        System.out.println("Marca: ");
        String marca = leer.next();
        System.out.println("Modelo: ");
        String modelo = leer.next();
        boolean resultado = ControladorVehiculo.crear(placa, marca, modelo, ControladorCliente.getselecc());
        System.out.println("Creado = " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar - Ingrese los datos: ");
        System.out.println("Placa: ");
        String placa = leer.next();
        System.out.println("Marca:");
        String marca = leer.next();
        System.out.println("Modelo: ");
        String modelo = leer.next();
        boolean resultado = ControladorVehiculo.actualizar(placa, marca, modelo);
        System.out.println("Actualizado = " + resultado);
    }
    public Vehiculo buscar(){
        System.out.println("Ingresar la placa: ");
        String placa = leer.next();
        Vehiculo vehiculo = ControladorVehiculo.buscar(placa);
        System.out.println(vehiculo);
        return vehiculo;
    }
    public void eliminar(){
        System.out.println("Ingresar la placa:");
        String placa = leer.next();
        boolean resultado = ControladorVehiculo.eliminar(placa);
    }
    public void imprimir(){
        for (Vehiculo vehiculo : ControladorVehiculo.getListaVehiculo()) {
            System.out.println(vehiculo);
        }
    }
    public void asignarSeleccionado(Vehiculo vehiculo){
        ControladorVehiculo.setSeleccionado(vehiculo);
    }

    public ControladorVehiculo getControladorVehiculo() {
        return ControladorVehiculo;
    }

    public void setControladorVehiculo(ControladorVehiculo ControladorVehiculo) {
        this.ControladorVehiculo = ControladorVehiculo;
    }

    public ControladorCliente getControladorCliente() {
        return ControladorCliente;
    }

    public void setControladorCliente(ControladorCliente ControladorCliente) {
        this.ControladorCliente = ControladorCliente;
    }
}
