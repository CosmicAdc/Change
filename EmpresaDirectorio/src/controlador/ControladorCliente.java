package controlador;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
public class ControladorCliente {
   private List<Cliente> listaCliente;
    private Cliente selecc;
    
    
     public ControladorCliente(){
        listaCliente = new ArrayList();
        selecc = null;
    }
    
    public long generarId(){
        if(listaCliente.size() >0)
            return listaCliente.get(listaCliente.size() - 1).getId() + 1;
        else
            return 1;
    }
    public boolean crear(String nombre, String apellido, String cedula, String direccion, String telefono){
        Cliente cliente = new Cliente(this.generarId(), nombre, apellido, cedula, direccion, telefono);
        return listaCliente.add(cliente);
    }
    public Cliente buscar(String cedula){
        for (Cliente cliente : listaCliente) {
            if(cliente.getCedula().equals(cedula))
                return cliente;
        }
        return null;
    }
    public boolean actualizar(String nombre, String apellido, String cedula, String direccion, String telefono){
        Cliente cliente = this.buscar(cedula);
        if(cliente != null){
            int posicion = listaCliente.indexOf(cliente);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);
            listaCliente.set(posicion, cliente);
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula){
        Cliente cliente = this.buscar(cedula);
        if(cliente != null)
            return listaCliente.remove(cliente);
        return false;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cliente getselecc() {
        return selecc;
    }

    public void setselecc(Cliente selecc) {
        this.selecc = selecc;
    }
    
}
