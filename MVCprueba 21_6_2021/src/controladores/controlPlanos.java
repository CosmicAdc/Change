
package controladores;
import java.util.ArrayList;
import java.util.List;
import modelos.Planos;
import modelos.Proyecto;
public class controlPlanos {
     private List<Planos> listaPlanos;
     private Planos selecc;
     
     public controlPlanos() {
        listaPlanos = new ArrayList();
        selecc=null;
    }
    
     
    public long generarId(){
        if(listaPlanos.size() > 0)
            return listaPlanos.get(listaPlanos.size() -1).getId() + 1;
        return 1;
    }  
     //CREATE
     public boolean crear(long Nroid, int dia, int mes, int anio, long nroArquitectos, int nroFiguras, Proyecto proyecto){

        Planos Plano = new Planos (this.generarId(),  Nroid,  dia,  mes, anio,  nroArquitectos,  nroFiguras,  proyecto);
        return listaPlanos.add(Plano);
    }
    //READ
    public Planos buscar(long id){
        for (Planos Plano : listaPlanos) {
            long a=Plano.getId();
            if(a==id){
                return Plano;
            }
        }
        return null;
    }
    //UPDATE
   public boolean actualizar(long id, long Nroid, int dia, int mes, int anio, long nroArquitectos, int nroFiguras){
        Planos Plano = this.buscar(id);
        if(Plano != null) {
            int posicion = listaPlanos.indexOf(Plano);
            Plano.setNroid(Nroid);
            Plano.setDia(dia);
            Plano.setMes(mes);
            Plano.setAnio(anio);
            Plano.setNroArquitectos(nroArquitectos);
            Plano.setNroFiguras(nroFiguras);
            listaPlanos.set(posicion, Plano);
            return true;
        }
        return false;
    }
    //DELETE
    public boolean eliminar(long id){
        Planos Plano = this.buscar(id);
        if(Plano != null) {
            return listaPlanos.remove(Plano);
        }
        return false;
    }
    //GETTER SETTERS
    public List<Planos> getListaPlanos() {
        return listaPlanos;
    }

    public void setListaPlanos(List<Planos> listaPlanos) {
        this.listaPlanos = listaPlanos;
    }

    public Planos getSelecc() {
        return selecc;
    }

    public void setSelecc(Planos selecc) {
        this.selecc = selecc;
    }
    public void imprimir(){
        for (Planos pla : listaPlanos) {
            System.out.println(pla);
        }
    }
    
}
