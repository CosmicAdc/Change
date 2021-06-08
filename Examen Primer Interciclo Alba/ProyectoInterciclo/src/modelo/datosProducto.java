
package modelo;

import java.util.ArrayList;
import java.util.List;

public class datosProducto {
   private long id;
   private  double precioU;
   private long stock;
   private String descripcion;
   private boolean iva;
   private List<factura> listafacturas; 
   private double valoriva;


    public datosProducto(long id, double precioU, long stock, String descripcion, boolean iva) {
        this.id = id;
        this.precioU = precioU;
        this.stock = stock;
        this.descripcion = descripcion;
        this.iva = iva;
        this.valoriva=valoriva;
        this.listafacturas = new ArrayList();
    }

    public datosProducto(long id, double precioU, long stock, String descripcion, boolean iva, List<factura> listafacturas) {
        this.id = id;
        this.precioU = precioU;
        this.stock = stock;
        this.descripcion = descripcion;
        this.iva = iva;
        this.valoriva=valoriva;
        this.listafacturas = listafacturas;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    public List<factura> getListafacturas() {
        return listafacturas;
    }

    public void setListafacturas(List<factura> listafacturas) {
        this.listafacturas = listafacturas;
    }

    public double getValoriva() {
        return valoriva;
    }

    public void setValoriva(double valoriva) {
        this.valoriva = valoriva;
    }

    @Override
    public String toString() {
        if(iva==true){
          valoriva=(precioU*0.12)+precioU;
          return "datosProducto{" + "id=" + id + ", precioU=" + precioU + "$ , stock=" + stock + "unidades  , descripcion=" + descripcion + ", iva=" + iva +  ", SI TIENE IVA SU VALOR CON IVA ES=" + valoriva +"$" +'}';
        }else{
          valoriva=precioU;  
        }return "datosProducto{" + "id=" + id + ", precioU=" + precioU + "$ , stock=" + stock + " unidades  , descripcion=" + descripcion + ", iva=" + iva + ", NO TIENE IVA SU VALOR SIN IVA ES=" + valoriva +"$"+ '}';
  
    }

 

   
  
   
   
   
   
}
