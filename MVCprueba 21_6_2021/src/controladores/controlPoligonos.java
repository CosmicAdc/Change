
package controladores;

import modelos.Poligonos;
import java.util.ArrayList;
import java.util.List;
import modelos.Lineas;
import controladores.controlLineas;

public class controlPoligonos {
    private long abc=1;
    private List <Poligonos> datos;
    private Poligonos selecc;
    private controlLineas controlLineas;
    private Lineas L;
    public long id1;
    
     public controlPoligonos(){
        controlLineas= new controlLineas();
        datos = new ArrayList();

        selecc = null;
    }
    long c=1; 
    long a=1;
    long b=0;
    private double perimetro;
    public long generarId(long nroLineas){
        
        if(datos.size() > 0 && c==nroLineas ){
            c=1;
            return a++;
        }else{
            c++;
            return a;
        }
        
            
        
    }
    public boolean crear(long nroLineas, long linForman,Lineas lineas){
        
        
       
        Poligonos Poligonos = new Poligonos(this.generarId(nroLineas), nroLineas,  linForman,lineas);
        System.out.println(lineas); 
        for (int i=0;i<nroLineas;i++) {       
            long a=0;
            if (a==linForman){
                lineas=controlLineas.getListaLineas().get(i);
                Poligonos = new Poligonos(this.generarId(nroLineas), nroLineas,  linForman,lineas);
            }
                   
        }
        System.out.println(Poligonos);
        return datos.add(Poligonos);
    }
    
    
     public Poligonos buscar(long id) {
         
        for (Poligonos dato : datos) {
            id1=dato.getId();
            if(id1==id){
                return dato;
            }
        }
        return null;
        
    }
    //update
    public boolean actualizar(long id,long nroLineas, long linForman){
        Poligonos Poligonos = this.buscar(id);
        if(Poligonos != null) {
            int posicion = datos.indexOf(Poligonos);
            Poligonos.setNroLineas(nroLineas);
            Poligonos.setLinForman(linForman);       
            datos.set(posicion, Poligonos);   
            return true;
        }
        return false;
    }
    
    
    public boolean eliminar(long id){
        Poligonos Poligonos = this.buscar(id);
        if(Poligonos != null) {
            Poligonos.getLineas().getListaL().remove(Poligonos);
            return datos.remove(Poligonos);
        }
        return false;
    }

    public List<Poligonos> getDatos() {
        return datos;
    }

    public void setDatos(List<Poligonos> datos) {
        this.datos = datos;
    }

    public Poligonos getSelecc() {
        return selecc;
    }

    public void setSelecc(Poligonos selecc) {
        this.selecc = selecc;
    }
    public void imprimir(){
        System.out.println("---------"+a+"---------");
        for (Poligonos poligonos : datos) {
            System.out.println(poligonos);
        }
        System.out.println("------------------------");
        
    }
    
    public double perimetro(long nroLineas,Lineas lineas){
        double sum=0;
        long a=datos.size();
        for (int i=0;i<a;i++ ) {
            
            sum=sum+datos.get(i).getLineas().getLongitud();
        }
       
        return sum;
        
       
        
        
    }
    
    
    @Override
    public String toString() {
        return "controlPoligonos{" + "datos=" + datos + ", selecc=" + selecc + '}';
    }
    
    
    
    
    
}
