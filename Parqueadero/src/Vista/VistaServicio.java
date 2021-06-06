package Vista;

import Controlador.ControladorServicio;
import Controlador.ControladorVehiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Servicio;
import Modelo.Vehiculo;

public class VistaServicio {
    private ControladorServicio ControladorServicio;
    private ControladorVehiculo ControladorVehiculo;
    private Scanner leer;
    private SimpleDateFormat formatoFecha;
    public static String formato = "dd-MM-yyyy HH:mm";
    
    public VistaServicio(ControladorVehiculo ControladorVehiculo){
        this.ControladorVehiculo = ControladorVehiculo;
        ControladorServicio = new ControladorServicio();
        leer = new Scanner(System.in);
        formatoFecha = new SimpleDateFormat(formato);
    }
    public void menu(){
        int opcion = 0;
        do {            
            System.out.println("Gestión del Servicio");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
            switch(opcion){
                    case 1: this.crear(); break;
                    case 2: this.actualizar();break;
                    case 3: this.buscar(); break;
                    case 4: this.eliminar(); break;
                    case 5: this.listar(); break;
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("Ingresar hora entrada: " + formato);
        leer.nextLine();
        try {
            Date hEntrada = formatoFecha.parse(leer.nextLine());
            boolean resultado = ControladorServicio.crear(hEntrada, null, 0, ControladorVehiculo.getSeleccionado());
            System.out.println("Creado " + resultado);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            this.crear();
        }
    }
    public Servicio buscar(){
        System.out.println("Ingrese hora entrada: " + formato);
        leer.nextLine();
        try {
            Date hEntrada = formatoFecha.parse(leer.nextLine());
            Servicio servicio = ControladorServicio.buscar(hEntrada);
            System.out.println(servicio);
            return servicio;
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            this.menu();
        }
        return null;
    }
    public void actualizar(){
        Servicio servicio = this.buscar();
        System.out.println("Ingrese hora salida: " + formato);
        try {
            Date horaSalida = formatoFecha.parse(leer.nextLine());
            boolean resultado = ControladorServicio.actualizar(servicio.gethEntrada(), horaSalida);
            System.out.println("Resultado: " + resultado);
            System.out.println("Valor a pagar = " + servicio.getPago());
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            this.actualizar();
        }
    }
    public void eliminar(){
        Servicio servicio = this.buscar();
        if (servicio != null) {
            boolean resultado = ControladorServicio.eliminar(servicio.gethEntrada());
            System.out.println("Elminado : " + resultado);
        }
    }
    public void listar(){
        for (Servicio dato : ControladorServicio.getDatos()) 
            System.out.println(dato);
    }
}
