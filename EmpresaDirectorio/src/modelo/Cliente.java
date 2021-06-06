package modelo;

public class Cliente  extends Persona {
     private String telefono;

    public Cliente(long id, String nombre, String apellido, String cedula, String direccion) {
        super(id, nombre, apellido, cedula, direccion);
    }
    
    public Cliente(long id, String nombre, String apellido, String cedula, String direccion, String telefono) {
        super(id, nombre, apellido, cedula, direccion);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "telefono=" + telefono + super.toString()+ '}';
    }
}
