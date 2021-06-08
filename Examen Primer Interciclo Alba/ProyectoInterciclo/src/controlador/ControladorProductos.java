package controlador;
import java.util.ArrayList;
import java.util.List;
import modelo.datosProducto;


public class ControladorProductos {
     private List<datosProducto> listaProductos;
     private datosProducto selecc;
     
     public ControladorProductos() {
        listaProductos = new ArrayList();
        selecc=null;
    }
    
     
     //CREATE
     public boolean crear(long id, double precioU, long stock, String descripcion, boolean iva){
        datosProducto datosProductos = new datosProducto (id,  precioU, stock, descripcion, iva);
        return listaProductos.add(datosProductos);
    }
    //READ
    public datosProducto buscar(String descripcion){
        for (datosProducto datosProductos : listaProductos) {
            if(datosProductos.getDescripcion().equals(descripcion)){
                return datosProductos;
            }
        }
        return null;
    }
    //UPDATE
   public boolean actualizar(double precioU, long stock, String descripcion, boolean iva){
        datosProducto datosProductos = this.buscar(descripcion);
        if(datosProductos != null) {
            int posicion = listaProductos.indexOf(datosProductos);
            datosProductos.setPrecioU(precioU);
            datosProductos.setStock(stock);
            datosProductos.setDescripcion(descripcion);
            datosProductos.setIva(iva);
            listaProductos.set(posicion, datosProductos);
            return true;
        }
        return false;
    }
    //DELETE
    public boolean eliminar(String descripcion){
        datosProducto datosProductos = this.buscar(descripcion);
        if(datosProductos != null) {
            return listaProductos.remove(datosProductos);
        }
        return false;
    }
    //GETTER SETTERS
    public List<datosProducto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<datosProducto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public datosProducto getSelecc() {
        return selecc;
    }

    public void setSelecc(datosProducto selecc) {
        this.selecc = selecc;
    }
    public void imprimir(){
        for (datosProducto producto : listaProductos) {
            System.out.println(producto);
        }
    }
    
}
