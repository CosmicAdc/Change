
package modelos;

import java.util.ArrayList;
import java.util.List;

public class Lineas {
    private  long id;
    private double coorXINICIAL;
    private double coorYINICIAL;
    private double coorXFINAL;
    private double coorYFINAL;
    private double identificador;
    private double longitud ;
    private List<Poligonos> listaL;
    public Lineas(long id, double coorXINICIAL, double coorYINICIAL, double coorXFINAL, double coorYFINAL, double identificador, double longitud) {
        this.id = id;
        this.coorXINICIAL = coorXINICIAL;
        this.coorYINICIAL = coorYINICIAL;
        this.coorXFINAL = coorXFINAL;
        this.coorYFINAL = coorYFINAL;
        this.identificador = identificador;
        this.longitud = longitud;
        this.listaL = new ArrayList();
    }
    
  public Lineas(long id, double coorXINICIAL, double coorYINICIAL, double coorXFINAL, double coorYFINAL, double identificador) {
        this.id = id;
        this.coorXINICIAL = coorXINICIAL;
        this.coorYINICIAL = coorYINICIAL;
        this.coorXFINAL = coorXFINAL;
        this.coorYFINAL = coorYFINAL;
        this.identificador = identificador;
     
        this.listaL = new ArrayList();
    }
    public Lineas(long id, double coorXINICIAL, double coorYINICIAL, double coorXFINAL, double coorYFINAL, double identificador, double longitud, List<Poligonos> listaL) {
        this.id = id;
        this.coorXINICIAL = coorXINICIAL;
        this.coorYINICIAL = coorYINICIAL;
        this.coorXFINAL = coorXFINAL;
        this.coorYFINAL = coorYFINAL;
        this.identificador = identificador;
        this.longitud = longitud;
        this.listaL = listaL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCoorXINICIAL() {
        return coorXINICIAL;
    }

    public void setCoorXINICIAL(double coorXINICIAL) {
        this.coorXINICIAL = coorXINICIAL;
    }

    public double getCoorYINICIAL() {
        return coorYINICIAL;
    }

    public void setCoorYINICIAL(double coorYINICIAL) {
        this.coorYINICIAL = coorYINICIAL;
    }

    public double getCoorXFINAL() {
        return coorXFINAL;
    }

    public void setCoorXFINAL(double coorXFINAL) {
        this.coorXFINAL = coorXFINAL;
    }

    public double getCoorYFINAL() {
        return coorYFINAL;
    }

    public void setCoorYFINAL(double coorYFINAL) {
        this.coorYFINAL = coorYFINAL;
    }

    public double getIdentificador() {
        return identificador;
    }

    public void setIdentificador(double identificador) {
        this.identificador = identificador;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public List<Poligonos> getListaL() {
        return listaL;
    }

    public void setListaL(List<Poligonos> listaL) {
        this.listaL = listaL;
    }

    @Override
    public String toString() {
        return "Lineas{" + "id=" + id + ", coorXINICIAL=" + coorXINICIAL + ", coorYINICIAL=" + coorYINICIAL + ", coorXFINAL=" + coorXFINAL + ", coorYFINAL=" + coorYFINAL + ", longitud=" + longitud + '}';
    }
    
    
    
    
    
    
    
}
