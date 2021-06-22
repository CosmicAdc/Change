
package modelos;

import java.util.List;
import java.util.ArrayList;
public class Planos {
    private long id;
    private long Nroid;
    private int dia;
    private int mes;
    private int anio;
    private long nroArquitectos;
    private int nroFiguras;
    private Proyecto proyecto;

    public Planos(long id, long Nroid, int dia, int mes, int anio, long nroArquitectos, int nroFiguras, Proyecto proyecto) {
        this.id = id;
        this.Nroid = Nroid;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.nroArquitectos = nroArquitectos;
        this.nroFiguras = nroFiguras;
        this.proyecto = proyecto;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNroid() {
        return Nroid;
    }

    public void setNroid(long Nroid) {
        this.Nroid = Nroid;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public long getNroArquitectos() {
        return nroArquitectos;
    }

    public void setNroArquitectos(long nroArquitectos) {
        this.nroArquitectos = nroArquitectos;
    }

    public int getNroFiguras() {
        return nroFiguras;
    }

    public void setNroFiguras(int nroFiguras) {
        this.nroFiguras = nroFiguras;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    

    @Override
    public String toString() {
        return "Planos{" + "id=" + id + ", codigo=" + Nroid + ", Fechas=" + dia + "/" + mes + "/" + anio + ", nroArquitectos=" + nroArquitectos + ", nroFiguras=" + nroFiguras + ", proyecto=" + proyecto+ '}';
    }
    
    
    
    
    
    
    
}
