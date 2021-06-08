package modelo;
import java.util.ArrayList;
import java.util.List;

public class factura {
    private long id;
    private double totalPagar;
    private int fechaMes;
    private int fechaDia;
    private int fechaAno;
    private DatosCliente DatosCliente;
    private List<datosProducto> listaDatosProducto;
    private datosProducto DatosProducto;
  

    public factura(long id, double totalPagar, int fechaMes, int fechaDia, int fechaAno) {
        this.id = id;
        this.totalPagar = totalPagar;
        this.fechaMes = fechaMes;
        this.fechaDia = fechaDia;
        this.fechaAno = fechaAno;
         this.listaDatosProducto = new ArrayList();
    }
    
    
    

    public factura(long id, double totalPagar, int fechaMes, int fechaDia, int fechaAno, DatosCliente DatosCliente,datosProducto DatosProducto, List<datosProducto> listaDatosProducto) {
        this.id = id;
        this.totalPagar = totalPagar;
        this.fechaMes = fechaMes;
        this.fechaDia = fechaDia;
        this.fechaAno = fechaAno;
        this.DatosCliente = DatosCliente;
        this.DatosProducto = DatosProducto;
        this.listaDatosProducto = listaDatosProducto;
    }

    public factura(long id, double totalPagar, int fechaMes, int fechaDia, int fechaAno, DatosCliente DatosCliente,datosProducto DatosProducto) {
        this.id = id;
        this.totalPagar = totalPagar;
        this.fechaMes = fechaMes;
        this.fechaDia = fechaDia;
        this.fechaAno = fechaAno;
        this.DatosCliente = DatosCliente;
        this.DatosProducto = DatosProducto;
        this.listaDatosProducto = new ArrayList();
    }
    
    public factura( double totalPagar, int fechaMes, int fechaDia, int fechaAno, DatosCliente DatosCliente) {
      
        this.totalPagar = totalPagar;
        this.fechaMes = fechaMes;
        this.fechaDia = fechaDia;
        this.fechaAno = fechaAno;
        this.DatosCliente = DatosCliente;
        this.listaDatosProducto = new ArrayList();
    }
    

     
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getFechaMes() {
        return fechaMes;
    }

    public void setFechaMes(int fechaMes) {
        this.fechaMes = fechaMes;
    }

    public int getFechaDia() {
        return fechaDia;
    }

    public void setFechaDia(int fechaDia) {
        this.fechaDia = fechaDia;
    }

    public int getFechaAno() {
        return fechaAno;
    }

    public void setFechaAno(int fechaAno) {
        this.fechaAno = fechaAno;
    }

   

    public List<datosProducto> getListaDatosProducto() {
        return listaDatosProducto;
    }

    public void setListaDatosProducto(List<datosProducto> listaDatosProducto) {
        this.listaDatosProducto = listaDatosProducto;
    }

   

    public DatosCliente getDatosCliente() {
        return DatosCliente;
    }

    public void setDatosCliente(DatosCliente DatosCliente) {
        this.DatosCliente = DatosCliente;
    }

    @Override
    public String toString() {
        return "factura{" + "id=" + id + ", totalPagar=" + totalPagar + ", fecha de la factura=" + fechaMes + "/" + fechaDia + "/" + fechaAno + " DatosCliente=" + DatosCliente + ", DatosProducto=" + DatosProducto + '}';
    }

   

    
   
    

   
    
     
}
