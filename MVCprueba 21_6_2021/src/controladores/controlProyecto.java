
package controladores;

import java.util.ArrayList;
import java.util.List;
import modelos.Proyecto;
import vistas.vistaJefe;
import java.util.Scanner;
public class controlProyecto {
    public long abc;
    private Scanner leer=new Scanner(System.in);
    public List <Proyecto> listaProyecto;
    private Proyecto selecc;
    public controlProyecto() {
        
        this.listaProyecto = new ArrayList();
        this.selecc = selecc;
    }
    
    public long generarId(){
        if(listaProyecto.size() > 0)
            return listaProyecto.get(listaProyecto.size() -1).getId() + 1;
        return 1;
    }
    
     public boolean crear(long id, String codigo, String nombre){
     
            Proyecto jefe = new Proyecto(this.generarId(), codigo, nombre);
            System.out.println(jefe);
            return this.listaProyecto.add(jefe);
       
        
        
    }
     public Proyecto buscar(long id){
        for (Proyecto jefe : listaProyecto) {
            long id1=jefe.getId();
            if(id1==id){
                return jefe;
            }
        }
        return null;
    }
     
    public boolean actualizar(long id, String codigo, String nombre){
      
      
        Proyecto jefe = buscar(id);
        if(jefe != null) {
            int posicion = listaProyecto.indexOf(jefe);
            jefe.setCodigo(codigo);
            jefe.setNombre(nombre);
            listaProyecto.set(posicion, jefe);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(long id){
        Proyecto jefe = this.buscar(id);
        if(jefe != null) {
            return listaProyecto.remove(jefe);
        }
        return false;
    }
    
    public void imprimir(){
        for (Proyecto jefe : listaProyecto) {
            System.out.println(jefe);
        }
    }

    public List<Proyecto> getlistaProyecto() {
        return listaProyecto;
    }

    public void setlistaProyecto(List<Proyecto> listaProyecto) {
        this.listaProyecto = listaProyecto;
    }

    public Proyecto getSelecc() {
        return selecc;
    }

    public void setSelecc(Proyecto selecc) {
        this.selecc = selecc;
    }

    @Override
    public String toString() {
        return "controlProyecto{" + "listaProyecto=" + listaProyecto + ", selecc=" + selecc + '}';
    }
    
     

    
    
}
