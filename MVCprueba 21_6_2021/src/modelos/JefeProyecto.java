
package modelos;

public class JefeProyecto {
        
    private long id;
    private String codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    
    public JefeProyecto(long id, String codigo, String nombre, String direccion, String telefono) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "JefeProyecto{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    
    
    
    
}
