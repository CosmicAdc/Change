
package controlador;
import java.util.ArrayList;

import java.util.List;
import modelo.factura;
import modelo.DatosCliente;
import modelo.datosProducto;
import java.util.Scanner;
public class ControladorFactura {
    
    Scanner leer = new Scanner (System.in);
    private List <factura> datos;
    private factura selecc;
    
    public ControladorFactura(){
        datos = new ArrayList();
        selecc = null;
    }
    
    public long generarId(){
        if(datos.size() > 0)
            return datos.get(datos.size() -1).getId() + 1;
        return 1;
    }
    //create
    public boolean crear(double totalPagar, int fechaMes, int fechaDia, int fechaAno, DatosCliente DatosCliente,datosProducto DatosProducto){
        factura facturas = new factura(this.generarId(), totalPagar, fechaMes,fechaDia,fechaAno,DatosCliente,DatosProducto);
        DatosCliente.getListafacturas().add(facturas);
        return datos.add(facturas);
    }
    
     public boolean crear(double totalPagar, int fechaMes, int fechaDia, int fechaAno){
       
        factura facturas = new factura(this.generarId(), totalPagar, fechaMes,fechaDia,fechaAno);
       
        return datos.add(facturas);
    }
    //read
     public factura buscar(long id) {
         
        for (factura dato : datos) {
            long id1=dato.getId();
            if(id1==id){
                return dato;
            }
        }
        return null;
        
    }
    //update
    public boolean actualizar(long id, double totalPagar, int fechaMes, int fechaDia, int fechaAno){
        factura facturas = this.buscar(id);
        if(facturas != null) {
            int posicion = datos.indexOf(facturas);
            facturas.setTotalPagar(totalPagar);
            facturas.setFechaMes(fechaMes);
            facturas.setFechaDia(fechaDia);
            facturas.setFechaAno(fechaAno);
            datos.set(posicion, facturas);   
            return true;
        }
        return false;
    }
    
    
    //delete
     public boolean eliminar(long id){
        factura facturas = this.buscar(id);
        if(facturas != null) {
            facturas.getDatosCliente().getListafacturas().remove(facturas);
            return datos.remove(facturas);
        }
        return false;
    }
     
     public void borrar(){
        long id;
        boolean factura;
        System.out.println("Ingrese la id de su factura: ");
        id=leer.nextLong();
        factura = this.eliminar(id);
        System.out.println("Factura borrada "+factura);
     }

    public List<factura> getDatos() {
        return datos;
    }

    public void setDatos(List<factura> datos) {
        this.datos = datos;
    }

    public factura getSelecc() {
        return selecc;
    }

    public void setSelecc(factura selecc) {
        this.selecc = selecc;
    }
     
     public void imprimir(){
        for (factura facturas : datos) {
            System.out.println(facturas);
        }
    }

    }
    

