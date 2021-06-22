
package controladores;
import modelos.Lineas;
import java.util.ArrayList;
import java.util.List;
public class controlLineas {
    
    public List <Lineas> listaLineas;
    private Lineas selecc;

    public controlLineas() {
        this.listaLineas = new ArrayList();
        this.selecc = selecc;
    }
    public long generarId(){
        if(listaLineas.size() > 0)
            return listaLineas.get(listaLineas.size() -1).getId() + 1;
        return 1;
    }
     public boolean crear(double coorXINICIAL, double coorYINICIAL, double coorXFINAL, double coorYFINAL, double identificador,double longitud){
        Lineas lineas = new Lineas( this.generarId(),  coorXINICIAL, coorYINICIAL, coorXFINAL, coorYFINAL,identificador,longitud);
         System.out.println(lineas);
        return this.listaLineas.add(lineas);
    }
    //READ
    public Lineas buscar(long id){
        for (Lineas lineas : listaLineas) {
            long id1=lineas.getId();
            if(id1==id){
                return lineas;
            }
        }
        return null;
    }
    //UPDATE
   public boolean actualizar( long id, double coorXINICIAL, double coorYINICIAL, double coorXFINAL, double coorYFINAL, double identificador, double longitud){
      
      
        Lineas lineas = buscar(id);
        if(lineas != null) {
            int posicion = listaLineas.indexOf(lineas);
            lineas.setCoorXINICIAL(coorXINICIAL);
            lineas.setCoorYINICIAL(coorYINICIAL);
            lineas.setCoorXFINAL(coorXFINAL);
            lineas.setCoorYFINAL(coorYFINAL);
            lineas.setLongitud(longitud);
            listaLineas.set(posicion, lineas);
            return true;
        }
        return false;
    }
    //DELETE
    public boolean eliminar(long id){
        Lineas lineas = this.buscar(id);
        if(lineas != null) {
            return listaLineas.remove(lineas);
        }
        return false;
    }
    
    public double Slongitud(double coorXINICIAL, double coorYINICIAL, double coorXFINAL, double coorYFINAL){
       double a= Math.pow(coorXFINAL-coorXINICIAL, 2);
       double b= Math.pow(coorYFINAL-coorYINICIAL, 2);
       double longitud=Math.sqrt(a+b);
       return longitud;
    }
    
    
    public void imprimir(){
        for (Lineas lineas : listaLineas) {
            System.out.println(lineas);
        }
    }

    public List<Lineas> getListaLineas() {
        return listaLineas;
    }

    public void setListaLineas(List<Lineas> listaLineas) {
        this.listaLineas = listaLineas;
    }

    public Lineas getSelecc() {
        return selecc;
    }

    public void setSelecc(Lineas selecc) {
        this.selecc = selecc;
    }

    @Override
    public String toString() {
        return "controlLineas{" + "listaLineas=" + listaLineas + ", selecc=" + selecc + '}';
    }
    
    
    
}
