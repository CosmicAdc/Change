
package Controlador;

import colegio.Grupo;
import java.util.ArrayList;
import java.util.List;

public class ControladorGrupo {
    private List<Grupo> grupos;
    private Grupo selecc;

    public ControladorGrupo() {
      grupos= new ArrayList();    
      selecc=null;
    }
    //CRUD
    public boolean crear(long id, String nombre) {
        Grupo mat= new Grupo(id,nombre);
        return grupos.add(mat);
    }
    
    public Grupo buscar(String nombre){
        for (Grupo mat:grupos){
            if (mat.getNombre().equals(nombre)==true){
                return mat;
            }
        }
        return null;
        
    } 
    public boolean actualizar(String nombre,long id){
         Grupo mat= this.buscar(nombre);
         if (mat!= null){
             int pos=  grupos.indexOf(mat);
             mat.setNombre(nombre);
             mat.setId(id);
             grupos.set(pos,mat);
             return true;
         }
         return false;

    }
    public boolean borrar(String nombre){ 
        Grupo mat = this.buscar(nombre);
        if (mat !=null){
            return grupos.remove(mat);
            
        }
        return false;
        
    }
    public void mostrar(){
        for  (Grupo mat:grupos){
            System.out.println(mat);
        }
    }

        public List<Grupo> getgrupos() {
            return grupos;
        }

        public void setgrupos(List<Grupo> grupos) {
            this.grupos = grupos;
        }

    public Grupo getSelecc() {
        return selecc;
    }

    public void setSelecc(Grupo selecc) {
        this.selecc = selecc;
    }

}
