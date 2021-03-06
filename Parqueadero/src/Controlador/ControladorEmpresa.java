package Controlador;
import java.util.ArrayList;
import java.util.List;
import Modelo.Empresa;
public class ControladorEmpresa {
    private List<Empresa> listaEmpresa;
    private Empresa seleccionado; 
    
    public ControladorEmpresa(){
        listaEmpresa = new ArrayList();
        seleccionado = null;
    }
    
    public boolean crear(long id, String nombre){
        Empresa empresa = new Empresa(id, nombre);
        return listaEmpresa.add(empresa);
    }
    public Empresa buscar(String nombre){
        for (Empresa empresa : listaEmpresa) {
            if(empresa.getNombre().equals(nombre)){
                return empresa;
            }
        }
        return null;
    }
    public boolean actualizar(String nomViejo, String nomNue){
        Empresa empresa = this.buscar(nomViejo);
        if(empresa != null) {
            int posicion = listaEmpresa.indexOf(empresa);
            empresa.setNombre(nomNue);
            listaEmpresa.set(posicion, empresa);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre){
        Empresa empresa = this.buscar(nombre);
        if(empresa != null) {
            return listaEmpresa.remove(empresa);
        }
        return false;
    }

    public List<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(List<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }

    public Empresa getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Empresa seleccionado) {
        this.seleccionado = seleccionado;
    }
    

}
