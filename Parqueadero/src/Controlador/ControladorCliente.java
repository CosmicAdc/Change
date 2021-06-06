package Controlador;

import java.util.ArrayList;
import java.util.List;
import Modelo.Cliente;
import Modelo.Empresa;

public class ControladorCliente {
    private List<Cliente> datos;
    private Cliente selecc;
    public ControladorCliente() {
        datos = new ArrayList<Cliente>();
        selecc = null;
    }
    
    public boolean crear(long id, String nombre, String apellido, String ced) {
        Cliente cliente = new Cliente(id, nombre, apellido, ced); 
        return datos.add(cliente); 
    }
    public boolean crear(long id, String nombre, String apellido, String ced, Empresa empresa) {
        Cliente cliente = new Cliente(id, nombre, apellido, ced, empresa); // Creo un nuevo cliente
        empresa.getListCliente().add(cliente); 
        return datos.add(cliente); 
    }
    public Cliente buscar(String ced){
        for (Cliente cliente : datos) { 
            if(cliente.getCed().equals(ced) == true){ 
                return cliente; 
            }
        }
        return null; 
    }
    public boolean actualizar(String ced, String nombre, String apellido) {
        Cliente cliente = this.buscar(ced); 
        if(cliente != null) { 
            int posicion = datos.indexOf(cliente); 
            cliente.setNombre(nombre); 
            cliente.setApellido(apellido); 
            datos.set(posicion, cliente); 
            return true;
        }
        return false;
    }
    public boolean eliminar(String ced) {
        Cliente cliente = this.buscar(ced);
        if(cliente != null){
            cliente.getEmpresa().getListCliente().remove(cliente);
            return datos.remove(cliente);
        }
        return false;
    }
    public void imprimir(){
        for (Cliente cliente : datos) {
            System.out.println(cliente);
        }
    }

    public List<Cliente> getdatos() {
        return datos;
    }

    public void setdatos(List<Cliente> datos) {
        this.datos = datos;
    }

    public Cliente getselecc() {
        return selecc;
    }

    public void setselecc(Cliente selecc) {
        this.selecc = selecc;
    }
    
   
}

