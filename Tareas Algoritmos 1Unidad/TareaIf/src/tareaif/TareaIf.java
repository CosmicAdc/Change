package tareaif;
/**
 *
 * @author andre
 */
public class TareaIf {
    public static void main(String[] args) {
        int edad=23;
        if (edad<=0){
            System.out.println("ESA EDAD NO EXISTE");
        }else if (edad>0 && edad<=2){
            System.out.println("USTED ES UN BEBE");
        }else if (edad>2 && edad<=12){
            System.out.println("USTED ES UN NIÑO");
        }else if (edad>12 && edad<=18){
            System.out.println("USTED ES UN JOVEN");
        }else if (edad>18 && edad<=65){
            System.out.println("USTED ES UN ADULTO");
        }else {
            System.out.println("ES UN ADULTO MAYOT");
        }  
    }
    
}
