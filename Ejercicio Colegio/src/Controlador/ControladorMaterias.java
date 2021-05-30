package Controlador;
import java.util.List;
import java.util.ArrayList;
import colegio.Materias;

public class ControladorMaterias {
    private List<Materias> materias;

    public ControladorMaterias() {
      materias= new ArrayList<Materias>();    
    }
    //CRUD
    public boolean crear(long id, String nombre) {
        Materias mat= new Materias(id,nombre);
        return materias.add(mat);
    }
    
    public Materias buscar(String nombre){
        for (Materias mat:materias){
            if (mat.getNombre().equals(nombre)==true){
                return mat;
            }
        }
        return null;
        
    } 
    public boolean actualizar(String nombre,long id){
         Materias mat= this.buscar(nombre);
         if (mat!= null){
             int pos=  materias.indexOf(mat);
             mat.setNombre(nombre);
             mat.setId(id);
             materias.set(pos,mat);
             return true;
         }
         return false;

    }
    public boolean borrar(String nombre){ 
        Materias mat = this.buscar(nombre);
        if (mat !=null){
            return materias.remove(mat);
            
        }
        return false;
        
    }
    public void mostrar(){
        for  (Materias mat:materias){
            System.out.println(mat);
        }
    }

        public List<Materias> getMaterias() {
            return materias;
        }

        public void setMaterias(List<Materias> materias) {
            this.materias = materias;
        }

}


