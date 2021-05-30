package colegio;
import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private  long id;
    private String nombre;
    private List<Aula> listaAula;
    private List<Materias> listaMaterias;

    public Grupo(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listaAula = new ArrayList();
        this.listaMaterias = new ArrayList();
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Aula> getListaAula() {
        return listaAula;
    }

    public void setListaAula(List<Aula> listaAula) {
        this.listaAula = listaAula;
    }

    public List<Materias> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<Materias> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nombre=" + nombre + ", listaAula=" + listaAula + ", listaMaterias=" + listaMaterias + '}';
    }
   
    
}
