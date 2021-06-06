
package Controlador;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import Modelo.Servicio;
import Modelo.Vehiculo;

public class ControladorServicio  {
    private List<Servicio> datos;
    private Servicio selecc;
    public static double COST_H = 1;
    
    
    public ControladorServicio(){
        datos = new ArrayList();
        selecc = null;
    } 
    public ControladorServicio(List<Servicio> datos, Servicio selecc) {
        datos = new ArrayList();
        selecc = null;
    }
    public long generarId(){
        if(datos.size() > 0)
            return datos.get(datos.size() -1).getId() + 1;
        return 1;
    }
    public boolean crear(Date hEntrada, Date hSalida, double Pago, Vehiculo vehiculo){
        Servicio servicio = new Servicio(this.generarId(), hEntrada, hSalida, Pago, vehiculo);
        vehiculo.getListServ().add(servicio);
        return datos.add(servicio);
    }
    public Servicio buscar(Date hEntrada) {
        for (Servicio dato : datos) {
            if(dato.gethEntrada().equals(hEntrada))
                return dato;
        }
        return null;
    }
    public boolean actualizar(Date hEntrada, Date hSalida){
        Servicio servicio = this.buscar(hEntrada);
        if(servicio != null) {
            int posicion = datos.indexOf(servicio);
            servicio.sethSalida(hSalida);
            long diferenciaSegundos = Math.abs(servicio.gethSalida().getTime() - servicio.gethEntrada().getTime());
            long minutos = TimeUnit.MINUTES.convert(diferenciaSegundos, TimeUnit.MILLISECONDS);
            double Pago = minutos * (this.COST_H / 60);
            servicio.setPago(Pago);
            datos.set(posicion, servicio);
            return true;
        }
        return false;
    }
    public boolean eliminar(Date hEntrada) {
        Servicio servicio = this.buscar(hEntrada);
        if(servicio != null){
            servicio.getVehiculo().getListServ().remove(servicio);
            return datos.remove(servicio);
        }
        return false;
    }

    public List<Servicio> getDatos() {
        return datos;
    }

    public void setDatos(List<Servicio> datos) {
        this.datos = datos;
    }

    public Servicio getselecc() {
        return selecc;
    }

    public void setselecc(Servicio selecc) {
        this.selecc = selecc;
    } 
    
    
}
