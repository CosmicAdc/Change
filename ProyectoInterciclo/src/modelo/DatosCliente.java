
package modelo;

import java.util.ArrayList;
import java.util.List;
public class DatosCliente {
   private long id;
   private String nombre;
   private String cedula;
   private long fiabPago;
   private List<factura> listafacturas; 
   
   
   
    public DatosCliente(long id, String nombre, String cedula, long fiabPago) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fiabPago = fiabPago;
        this.listafacturas = new ArrayList();
    }

    public DatosCliente(long id, String nombre, String cedula, long fiabPago, List<factura> listafacturas) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fiabPago = fiabPago;
        this.listafacturas = listafacturas;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public long getFiabPago() {
        return fiabPago;
    }

    public void setFiabPago(long fiabPago) {
        this.fiabPago = fiabPago;
    }

    public List<factura> getListafacturas() {
        return listafacturas;
    }

    public void setListafacturas(List<factura> listafacturas) {
        this.listafacturas = listafacturas;
    }

    @Override
    public String toString() {
        return "DatosCliente{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", fiabPago=" + fiabPago+" $ " +'}';
    }

    
   
   
   
   
}
