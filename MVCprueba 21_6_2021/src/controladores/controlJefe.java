
package controladores;

import modelos.JefeProyecto;
import java.util.ArrayList;
import java.util.List;
import modelos.JefeProyecto;
public class controlJefe {
    public List <JefeProyecto> listaJefe;
    private JefeProyecto selecc;

    public controlJefe() {
        this.listaJefe = new ArrayList();
        this.selecc = selecc;
    }
    
    public long generarId(){
        if(listaJefe.size() > 0)
            return listaJefe.get(listaJefe.size() -1).getId() + 1;
        return 1;
    }
    
     public boolean crear(long id, String codigo, String nombre, String direccion, String telefono){
        boolean f=this.confirmar(nombre);
        if (f==true){
            JefeProyecto jefe = new JefeProyecto(this.generarId(), codigo, nombre, direccion, telefono);
            System.out.println(jefe);
            return this.listaJefe.add(jefe);
        }else{
            return false;
        }
        
        
    }
     public JefeProyecto buscar(String codigo){
        for (JefeProyecto jefe : listaJefe) {
            String nombre1=jefe.getCodigo();
            if(nombre1.equals(codigo)){
                return jefe;
            }
        }
        return null;
    }
     
    public boolean actualizar(long id, String codigo, String nombre, String direccion, String telefono){
      
      
        JefeProyecto jefe = buscar(nombre);
        if(jefe != null) {
            int posicion = listaJefe.indexOf(jefe);
            jefe.setCodigo(codigo);
            jefe.setNombre(nombre);
            jefe.setDireccion(direccion);
            jefe.setTelefono(telefono);
            listaJefe.set(posicion, jefe);
            return true;
        }
        return false;
    }
    public boolean confirmar(String nombre){
        for(int i=0;i<listaJefe.size();i++){
            if (nombre.equals(listaJefe.get(i).getNombre())){
                System.out.println("NO PUEDEN HABER 2 JEFES CON EL MISMO NOMBRE");
                return false;
            }
        }
        return true;
    }
    public boolean eliminar(String codigo){
        JefeProyecto jefe = this.buscar(codigo);
        if(jefe != null) {
            return listaJefe.remove(jefe);
        }
        return false;
    }
    
    public void imprimir(){
        for (JefeProyecto jefe : listaJefe) {
            System.out.println(jefe);
        }
    }

    public List<JefeProyecto> getListaJefe() {
        return listaJefe;
    }

    public void setListaJefe(List<JefeProyecto> listaJefe) {
        this.listaJefe = listaJefe;
    }

    public JefeProyecto getSelecc() {
        return selecc;
    }

    public void setSelecc(JefeProyecto selecc) {
        this.selecc = selecc;
    }

    @Override
    public String toString() {
        return "controlJefe{" + "listaJefe=" + listaJefe + ", selecc=" + selecc + '}';
    }
    
    
}
