
package vista;
import controlador.ControladorDirectivo;
import java.util.Scanner;
import modelo.Directivo;

public class VistaDirectivo {
    public ControladorDirectivo controladorDirectivo;
    public Scanner leer;
    public VistaDirectivo(){
        controladorDirectivo = new ControladorDirectivo();
        leer = new Scanner(System.in);
    }
    public void menu(){
        int opcion = 0;
        do {            
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1: crear(); break;
                case 2: actualizar(); break;
                case 3: buscar(); break;
                case 4: eliminar(); break;
                case 5: listar(); break;
            }
        } while (opcion<6);
    }
    public void crear(){
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido");
        String apellido = leer.next();
        System.out.println("Ingrese el cedula");
        String cedula = leer.next();
        System.out.println("Ingrese el direccion");
        String direccion = leer.next();
        System.out.println("Ingrese el sueldo");
        double sueldo = leer.nextDouble();
        System.out.println("Ingrese el categoria");
        String categoria = leer.next();
        System.out.println("Resultado: " + controladorDirectivo.crear(nombre, apellido, cedula, direccion, sueldo, categoria));
    }
    public Directivo buscar(){
        System.out.println("Ingrese el cedula");
        String cedula = leer.next();
        Directivo directivo = controladorDirectivo.buscar(cedula);
        controladorDirectivo.setselecc(directivo);
        System.out.println(directivo);
        return directivo;
    }
    public void actualizar(){
        Directivo directivo = buscar();
        if(directivo != null){
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            System.out.println("Ingrese el apellido");
            String apellido = leer.next();
            System.out.println("Ingrese el direccion");
            String direccion = leer.next();
            System.out.println("Ingrese el sueldo");
            double sueldo = leer.nextDouble();
            System.out.println("Ingrese el categoria");
            String categoria = leer.next();
            System.out.println("Resultado: " +controladorDirectivo.actualizar(nombre, apellido, directivo.getCedula(), direccion, sueldo, categoria));
        }
    }
    public void eliminar(){
        Directivo directivo = buscar();
        if(directivo != null)
            System.out.println("Resultado: " + controladorDirectivo.eliminar(directivo.getCedula()));
    }
    public void listar(){
        for (Directivo directivo : controladorDirectivo.getListaDirectivo()) 
            System.out.println(directivo);
    }

    public ControladorDirectivo getControladorDirectivo() {
        return controladorDirectivo;
    }

    public void setControladorDirectivo(ControladorDirectivo controladorDirectivo) {
        this.controladorDirectivo = controladorDirectivo;
    }
    
}
