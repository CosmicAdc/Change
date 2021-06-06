package Modelo;
import java.util.ArrayList;
import java.util.List;
public class Vehiculo {
   private long id;
   private String marca;
   private String modelo;
   private Cliente propietario;
   private String placa;
   private List<Servicio> listServ;

   public Vehiculo(long id, String placa, String marca, String modelo, Cliente propietario) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
      
    }
   
   public Vehiculo(long id, String placa, String marca, String modelo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.listServ = new ArrayList();
    }
   
   
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<Servicio> getListServ() {
        return listServ;
    }

    public void setListServ(List<Servicio> listServ) {
        this.listServ = listServ;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + ", placa=" + placa + '}';
    }
    
    
   
}
