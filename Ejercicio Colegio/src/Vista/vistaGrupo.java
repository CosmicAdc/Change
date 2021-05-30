
package Vista;

import Controlador.ControladorGrupo;
import colegio.Grupo;
import java.util.Scanner;
import colegio.Grupo;
import colegio.Aula;
import colegio.Materias;


public class vistaGrupo {
    private Scanner leer;
    private ControladorGrupo Cgrupo;
    private vistaAula vistaAula;
     private vistaMaterias vistaMaterias;
    public vistaGrupo(){
        leer =new Scanner(System.in);
        Cgrupo=new ControladorGrupo();
        
    }
    
    public void menu(){
        int opc=0;
        do{
        System.out.println("------Menú------");
        System.out.println("1)Crear");
        System.out.println("2)Actualizar");
        System.out.println("3)Buscar/leer");
        System.out.println("4)Eliminar");
        System.out.println("5)Listar");
        System.out.println("6)Gestionar Aula");
        System.out.println("7)Gestionar Materia");
        System.out.println("8)Salir");
            opc= leer.nextInt();
            switch (opc){
                case 1: this.crear();break;
                case 2: this.actualizar();break;
                case 3: this.buscar();break;
                case 4: this.eliminar();break;
                case 5: Cgrupo.mostrar();break; 
                case 6: aula();break; 
                case 7: materias();break; 
                
            }
        }while(opc<8);
    }
    
    public void crear(){
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("ID: ");
        long id=leer.nextLong();
        System.out.println("Nombre de la grupo: ");
        String nombre=leer.next();
        boolean resultado =Cgrupo.crear(id,nombre);
        System.out.println("grupo creada: "+resultado);
    }
    
    public void actualizar(){
        System.out.println("Que grupo desea actualizar:");
        System.out.println("grupo: ");
        String nombre=leer.next();
        System.out.println("id: ");
        long id=leer.nextLong();
        boolean resultado =Cgrupo.actualizar(nombre,id);
        System.out.println("grupo actualizada: "+resultado);
       
    }
    public void eliminar(){
        System.out.println("Que grupo desea borrar:");
        System.out.println("grupo: ");
        String nombre=leer.next();
        boolean resultado =Cgrupo.borrar(nombre);
        System.out.println("Cliente eliminado");
       
    }
    public Grupo buscar(){
        System.out.println("Que grupo desea buscar:");
        System.out.println("grupo: ");
        String nombre=leer.next();
        Grupo mat =Cgrupo.buscar(nombre);
        System.out.println(mat);
       return mat;
    }
    
    public void aula() {
        Grupo grupo = buscar();
        if (grupo != null) {
            this.vistaAula = new vistaAula();
            vistaAula.menu();
        }
    }

    public void materias() {
        Grupo grupo = buscar();
        if (grupo != null) {
            this.vistaMaterias = new vistaMaterias();
            vistaAula.menu();
        }
        }
    }
    
    
    

