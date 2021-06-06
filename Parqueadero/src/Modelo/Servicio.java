package Modelo;

import java.util.Date;
public class Servicio {
    private long id;
    private Date hEntrada;
    private Date hSalida;
    private double Pago;
    private Vehiculo vehiculo;

    public Servicio(long id, Date hEntrada, Date hSalida, double Pago, Vehiculo vehiculo) {
        this.id = id;
        this.hEntrada = hEntrada;
        this.hSalida = hSalida;
        this.Pago = Pago;
        this.vehiculo = vehiculo;
    }

    public Servicio(long id, Date hEntrada, Date hSalida, double Pago) {
        this.id = id;
        this.hEntrada = hEntrada;
        this.hSalida = hSalida;
        this.Pago = Pago;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date gethEntrada() {
        return hEntrada;
    }

    public void sethEntrada(Date hEntrada) {
        this.hEntrada = hEntrada;
    }

    public Date gethSalida() {
        return hSalida;
    }

    public void sethSalida(Date hSalida) {
        this.hSalida = hSalida;
    }

    public double getPago() {
        return Pago;
    }

    public void setPago(double Pago) {
        this.Pago = Pago;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id=" + id + ", hora Entrada=" + hEntrada + ", hora Salida=" + hSalida + ", Valor dePago=" + Pago + "$ , vehiculo=" + vehiculo + '}';
    }
  
    
    
}
