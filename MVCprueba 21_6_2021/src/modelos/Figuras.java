
package modelos;

import java.util.ArrayList;
import java.util.List;

public class Figuras {
    private long id;
    private long identificador;
    private String nombre;
    private String color;
    private double area;
    private double perimetro;
    private Poligonos poligonos;
    private List<Poligonos> listapoli;
    public Figuras() {
    }
  
    public Figuras(long id,String color, String nombre, double area, double perimetro, Poligonos poligonos) {
        this.id = id;
        this.color=color;
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
        this.poligonos = poligonos;
        listapoli=new ArrayList();
    }
    public Figuras(long id,String color, String nombre, double area, double perimetro) {
        this.id = id;
        this.color=color;
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
        this.poligonos = poligonos;
        listapoli=new ArrayList();
        this.listapoli=listapoli;
    }
     public Figuras(long id,String color, String nombre, double area, double perimetro, List<Poligonos> listapoli) {
        this.id = id;
        this.color=color;
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
        this.poligonos = poligonos;
        listapoli=new ArrayList();
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Poligonos getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(Poligonos poligonos) {
        this.poligonos = poligonos;
    }

    @Override
    public String toString() {
        return "Figuras{" + "id=" + id + ", nombre=" + nombre + ", color=" + color + ", area=" + area + ", perimetro=" + perimetro + ", poligonos=" + poligonos + '}';
    }

    
    
    
    
    
    
    
}
