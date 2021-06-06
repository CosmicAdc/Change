package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
public class ControladorEmpleado {
     private List<Empleado> listaEmpleado;
    private Empleado selecc;
    
    public ControladorEmpleado(){
        listaEmpleado = new ArrayList();
        selecc = null;
    }
    public long generarId(){
        if(listaEmpleado.size() > 0) {
            return listaEmpleado.get(listaEmpleado.size() - 1).getId() + 1;
        }else {
            return 1;
        }
    }
    public boolean crear(String nombre,  String apellido, String cedula, String direccion, double sueldoBruto){
        Empleado e = new Empleado(this.generarId(), nombre, apellido, cedula, direccion, sueldoBruto);
        return listaEmpleado.add(e);
    }
    public Empleado buscar(String cedula){
        for (Empleado empleado : listaEmpleado) {
            if(empleado.getCedula().equals(cedula))
                return empleado;
        }
        return null;
    }
    public boolean actualizar(String nombre,  String apellido, String cedula, String direccion, double sueldoBruto){
        Empleado empleado = this.buscar(cedula);
        if(empleado != null){
            int posicion = listaEmpleado.indexOf(empleado);
            empleado.setDireccion(direccion);
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setSueldoBruto(sueldoBruto);
            listaEmpleado.set(posicion, empleado);
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula){
        Empleado empleado = this.buscar(cedula);
        if(empleado != null)
            return listaEmpleado.remove(empleado);
        return false;
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public Empleado getselecc() {
        return selecc;
    }

    public void setselecc(Empleado selecc) {
        this.selecc = selecc;
    }
    
}
