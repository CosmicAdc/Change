package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private long id;
    private String nombre;
    private String apellido;
    private String ced;
    private Empresa empresa;
    private List<Vehiculo> listVeh;
    
     public Cliente() {
        this.id = -1;
    }

     public Cliente(long id, String nombre, String apellido, String ced) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ced = ced;
        this.empresa = empresa;
        this.listVeh = new ArrayList();
    }
     
    public Cliente(long id, String nombre, String apellido, String ced, Empresa empresa) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ced = ced;
        this.empresa = empresa;
        this.listVeh = new ArrayList();
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Vehiculo> getListVeh() {
        return listVeh;
    }

    public void setListVeh(List<Vehiculo> listVeh) {
        this.listVeh = listVeh;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ced=" + ced + ", empresa=" + empresa + '}';
    }

   
    
    
    
    
}
