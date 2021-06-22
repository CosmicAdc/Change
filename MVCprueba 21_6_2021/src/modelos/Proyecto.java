
package modelos;

public class Proyecto {
    private long id;
    private String codigo;
    private String nombre;

    
    
    public Proyecto(long id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
    
    
    
}
