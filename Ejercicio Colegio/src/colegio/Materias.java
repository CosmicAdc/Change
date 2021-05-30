package colegio;
import java.util.List;
public class Materias {
    private  long id;
    private String nombre;
    private List<Grupo> listaGrupos;
    public Materias(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Materias(List<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public List<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(List<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
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

    @Override
    public String toString() {
        return "Materias{" + "id=" + id + ", nombre=" + nombre+" )" ;
    }

  

    

    
}
