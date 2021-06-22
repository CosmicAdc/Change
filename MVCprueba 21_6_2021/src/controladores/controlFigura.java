
package controladores;
import modelos.Figuras;
import java.util.ArrayList;
import modelos.Poligonos;
import java.util.List;
import modelos.Lineas;
import modelos.Poligonos;
import controladores.controlPoligonos;
public class controlFigura {
    private List <Figuras> datos;
    private Figuras selecc;
    private controlPoligonos controlP;
    private List<Poligonos> poliList;
    private ArrayList lista;
  public controlFigura(){
        datos = new ArrayList();
        selecc = null;
        controlP=new controlPoligonos();
        poliList= new ArrayList();
        lista=new ArrayList();
    }
  
    public long generarId(){
        if(datos.size() > 0)
            return datos.get(datos.size() -1).getId() + 1;
        return 1;
    }  
     public boolean crear(long id,String color, String nombre, double area, double perimetro, Poligonos poligonos,long c){     
        Figuras figura = new Figuras(this.generarId(),color,nombre,area,perimetro,poligonos);
        poligonos.getListaPoligonos().add(figura);
        return datos.add(figura);
    }
    
     
     public Figuras buscar(long id) {
         
        for (Figuras dato : datos) {
            long id1=dato.getId();
            if(id1==id){
                return dato;
            }
        }
        return null;
        
    }
     
     
      public boolean actualizar(long id,String color, String nombre, double area, double perimetro){
        Figuras figura = this.buscar(id);
        if(figura != null) {
            int posicion = datos.indexOf(figura);
            figura.setNombre(nombre);
            figura.setColor(color);
            datos.set(posicion, figura);   
            return true;
        }
        return false;
    }
     
      public boolean eliminar(long id){
        Figuras figura = this.buscar(id);
        if(figura != null) {
            figura.getPoligonos().getListaPoligonos().remove(figura);
            return datos.remove(figura);
        }
        return false;
    }
      
      
    public void imprimir(){
        for (Figuras figuras : datos) {
            System.out.println(figuras);
        }
    } 
      
    public List<Figuras> getDatos() {
        return datos;
    }

    public void setDatos(List<Figuras> datos) {
        this.datos = datos;
    }

    public Figuras getSelecc() {
        return selecc;
    }

    public void setSelecc(Figuras selecc) {
        this.selecc = selecc;
    }

    @Override
    public String toString() {
        return "controlFigura{" + "datos=" + datos + ", selecc=" + selecc + '}';
    }
      
      
      
      
      
      
}
