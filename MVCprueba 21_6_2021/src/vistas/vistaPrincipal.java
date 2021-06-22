
package vistas;
import java.util.Scanner;
public class vistaPrincipal {
        Scanner leer= new Scanner (System.in);
        vistaFigura vistaF=new vistaFigura();
        vistaJefe vistaJ= new vistaJefe();
        vistaLineas vistaL = new vistaLineas();
        vistaPoligonos vistaPoli=new vistaPoligonos();
        vistaProyectos vistaPro=new vistaProyectos();
        vistaPlanos vistaPlanos= new vistaPlanos();
        
        public void menu(){
        int opcion = 0;
        do{
             System.out.println("\n******** Gestión de vistas ***********");
            System.out.println("1. vista de jefes de Proyecto");
            System.out.println("2. vista de Proyectos");
            System.out.println("3. vista de Planos");
            System.out.println("4. vista de Figuras");
            System.out.println("5. vista de Poligono");
            System.out.println("6. vista de lineas");
            System.out.println("7. Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1: 
                    vistaJ.menu(); 
                break;
                case 2: 
                    vistaPro.menu(); 
                break;
                case 3: 
                    vistaPlanos.menu(); 
                break;
                case 4: 
                     vistaF.menu(); 
                break;
                case 5: 
                    vistaPoli.menu();
                break;
                case 6:
                    vistaL.menu();
                break;
                
            }
        }while(opcion<6);
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public vistaFigura getVistaF() {
        return vistaF;
    }

    public void setVistaF(vistaFigura vistaF) {
        this.vistaF = vistaF;
    }

    public vistaJefe getVistaJ() {
        return vistaJ;
    }

    public void setVistaJ(vistaJefe vistaJ) {
        this.vistaJ = vistaJ;
    }

    public vistaLineas getVistaL() {
        return vistaL;
    }

    public void setVistaL(vistaLineas vistaL) {
        this.vistaL = vistaL;
    }

    public vistaPoligonos getVistaPoli() {
        return vistaPoli;
    }

    public void setVistaPoli(vistaPoligonos vistaPoli) {
        this.vistaPoli = vistaPoli;
    }

    public vistaProyectos getVistaPro() {
        return vistaPro;
    }

    public void setVistaPro(vistaProyectos vistaPro) {
        this.vistaPro = vistaPro;
    }

    public vistaPlanos getVistaPlanos() {
        return vistaPlanos;
    }

    public void setVistaPlanos(vistaPlanos vistaPlanos) {
        this.vistaPlanos = vistaPlanos;
    }

    @Override
    public String toString() {
        return "vistaPrincipal{" + "leer=" + leer + ", vistaF=" + vistaF + ", vistaJ=" + vistaJ + ", vistaL=" + vistaL + ", vistaPoli=" + vistaPoli + ", vistaPro=" + vistaPro + ", vistaPlanos=" + vistaPlanos + '}';
    }
        
        
        
}
