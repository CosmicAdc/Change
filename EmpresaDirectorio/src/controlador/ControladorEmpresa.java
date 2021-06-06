
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Empresa;
public class ControladorEmpresa {
   private List<Empresa> listaEmpresa;
    private Empresa selecc;
    
    public ControladorEmpresa(){
        listaEmpresa = new ArrayList();
        selecc = null;
    }
    public long generarId(){   
        return (listaEmpresa.size()>0)? listaEmpresa.get(listaEmpresa.size()-1).getId()+1 : 1;
    }
    public boolean crear(String nombre){
        return listaEmpresa.add(new Empresa(generarId(), nombre));
    }
    public Empresa buscar(String nombre){
        for (Empresa empresa : listaEmpresa) {
            if(empresa.getNombre().equals(nombre))
                return empresa;
        }
        return null;
    }
    public boolean actualizar(String nombreAnterior, String nombre){
        Empresa empresa = buscar(nombreAnterior);
        if(empresa != null){
            int posicion = listaEmpresa.indexOf(empresa);
            empresa.setNombre(nombre);
            listaEmpresa.set(posicion, empresa);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre){
        return listaEmpresa.remove(buscar(nombre));
    }
   
    public List<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(List<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }

    public Empresa getselecc() {
        return selecc;
    }

    public void setselecc(Empresa selecc) {
        this.selecc = selecc;
    } 
}
