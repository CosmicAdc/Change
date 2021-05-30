
package Controlador;
import colegio.Aula;
import java.util.ArrayList;
import java.util.List;
import colegio.Aula;
import colegio.Materias;
import colegio.Grupo;


public class ControladorAula {
    public ControladorAula controladorAula;
    private List<Aula> aula;
    private Aula selecc;
    public ControladorAula() {
        aula = new ArrayList();  
        selecc=null;
    }  
    //CRUD
    public boolean crear(long id, String descripcion) {
        Aula mat= new Aula(id,descripcion);
        return aula.add(mat);
    }
    public Aula buscar(String descripcion){
        for (Aula mat:aula){
            if (mat.getDescripcion().equals(descripcion)==true){
                return mat;
            }
        }
        return null;
        
    } 
    public boolean actualizar(String descripcion,long id){
         Aula mat= this.buscar(descripcion);
         if (mat!= null){
             int pos=  aula.indexOf(mat);
             mat.setDescripcion(descripcion);
             mat.setId(id);
             aula.set(pos,mat);
             return true;
         }
         return false;

    }
    public boolean borrar(String descripcion){ 
        Aula mat = this.buscar(descripcion);
        if (mat !=null){
            return aula.remove(mat);
            
        }
        return false;
        
    }
    public void mostrar(){
        for  (Aula aul:aula){
            System.out.println(aul);
        }
    }

        public List<Aula> getAula() {
            return aula;
        }

        public void setAula(List<Aula> Aula) {
            this.aula = Aula;
        }
    public Aula getSelecc(){
         return selecc;
    }
    public void setSelecc(Aula seleccionado) {
        this.selecc = selecc;
    }
       
    }

