
package controlador;
import java.util.ArrayList;
import java.util.List;
import modelo.DatosCliente;

public class ControladorCliente {
    private List<DatosCliente> listaCliente;
    private DatosCliente selecc;

    public ControladorCliente() {
        listaCliente = new ArrayList();
        selecc=null;
    }
    //CRUD
    //CREATE
    public boolean crear(long id, String nombre, String cedula, long fiabPago ){
        DatosCliente datosCliente = new DatosCliente(id,nombre,cedula,fiabPago);
        return this.listaCliente.add(datosCliente);
    }
    //READ
    public DatosCliente buscar(String cedula){
        for (DatosCliente datosCliente : listaCliente) {
            if(datosCliente.getCedula().equals(cedula)){
                return datosCliente;
            }
        }
        return null;
    }
    //UPDATE
   public boolean actualizar( String cedula,String nombre, long fiabPago){
      
      
        DatosCliente datosCliente = buscar(cedula);
        if(datosCliente != null) {
            int posicion = listaCliente.indexOf(datosCliente);
            datosCliente.setNombre(nombre);
            datosCliente.setCedula(cedula);
            datosCliente.setFiabPago(fiabPago);
            listaCliente.set(posicion, datosCliente);
            return true;
        }
        return false;
    }
    //DELETE
    public boolean eliminar(String cedula){
        DatosCliente datosCliente = this.buscar(cedula);
        if(datosCliente != null) {
            return listaCliente.remove(datosCliente);
        }
        return false;
    }
    //GETTER SETTERS
    public List<DatosCliente> getListaCliente() {
        return listaCliente;
    }
    public void imprimir(){
        for (DatosCliente cliente : listaCliente) {
            System.out.println(cliente);
        }
    }

    public void setListaCliente(List<DatosCliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public DatosCliente getSelecc() {
        return selecc;
    }

    public void setSelecc(DatosCliente selecc) {
        this.selecc = selecc;
    }
    
    
    
   
}
