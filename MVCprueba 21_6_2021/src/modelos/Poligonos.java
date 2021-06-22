package modelos;

import java.util.ArrayList;
import java.util.List;

public class Poligonos {
    private long id;
    private long nroLineas;
    private long linForman;
    private long perimetro;
    private Lineas lineas;
     private List<Figuras> listaPoligonos; 

    public Poligonos(long id,long nroLineas, long linForman, Lineas lineas) {
        this.id = id;
        this.nroLineas = nroLineas;
        this.linForman = linForman;
        this.lineas = lineas;
        listaPoligonos=new ArrayList();
        this.perimetro = perimetro;
    }

    public Poligonos(long id, long nroLineas, long linForman) {
        this.id = id;
        this.nroLineas = nroLineas;
        this.linForman = linForman;
    }

    public long getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(long perimetro) {
        this.perimetro = perimetro;
    }

    
    
    public long getNroLineas() {
        return nroLineas;
    }

    public void setNroLineas(long nroLineas) {
        this.nroLineas = nroLineas;
    }

    public long getLinForman() {
        return linForman;
    }

    public void setLinForman(long linForman) {
        this.linForman = linForman;
    }

    public List<Figuras> getListaPoligonos() {
        return listaPoligonos;
    }

    public void setListaPoligonos(List<Figuras> listaPoligonos) {
        this.listaPoligonos = listaPoligonos;
    }

    public Lineas getLineas() {
        return lineas;
    }

    public void setLineas(Lineas lineas) {
        this.lineas = lineas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Poligonos{" + "id=" + id + ", nroLineas=" + nroLineas + ", linForman=" + linForman + ", lineas=" + lineas + '}';
    }

    
    
    
    
}
