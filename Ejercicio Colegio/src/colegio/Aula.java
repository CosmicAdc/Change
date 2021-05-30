package colegio;
import java.util.List;
public class Aula {
    private  long id;
    private String descripcion;
    private List<Grupo> listaGrupos;

    public Aula(long id, String descripcion, List<Grupo> listaGrupos) {
        this.id = id;
        this.descripcion = descripcion;
        this.listaGrupos = listaGrupos;
    }

    public Aula(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(List<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    @Override
    public String toString() {
        return "Aula{" + "id=" + id + ", descripcion=" + descripcion + ", listaGrupos=" + listaGrupos + '}';
    }

    
      

}
