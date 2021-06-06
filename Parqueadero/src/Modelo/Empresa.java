package Modelo;
import java.util.ArrayList;
import java.util.List;
public class Empresa {
    private long id;
    private String nombre;
    private List<Cliente> listCliente;

    public Empresa(long id, String nombre, List<Cliente> listCliente) {
        this.id = id;
        this.nombre = nombre;
        this.listCliente = listCliente;
    }
    
    public Empresa(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listCliente = new ArrayList();
    }
    
    public Empresa() {
        id = 0;
        nombre = "";
        listCliente = new ArrayList();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListCliente() {
        return listCliente;
    }

    public void setListCliente(List<Cliente> listCliente) {
        this.listCliente = listCliente;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
}
