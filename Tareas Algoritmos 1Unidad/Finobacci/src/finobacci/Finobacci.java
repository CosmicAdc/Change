package finobacci;

public class Finobacci {
    public static void main(String[] args) {
        
        //finobacci
        System.out.println("FINOBACCI CON FOR");
        System.out.println("0"); 
        int a=8, inicio=1, inicio2=0,aux;
        for(int i=3 ;i<=a;i++){         
            aux = inicio2 + inicio;
            inicio2=inicio;
            inicio=aux;
            System.out.println(inicio2 + " ");         
        }
        
        System.out.println("FINOBACCI CON DO WHILE");
        a=10;
        inicio=1;
        inicio2=0;
        int c=0;
        do{
            System.out.println(inicio2 + " "); 
            aux = inicio2 + inicio;
            inicio2=inicio;
            inicio=aux;
            c++;
                    
        }while(c<=a-1);
        
        
         System.out.println("FINOBACCI CON DO");
        a=6;
        inicio=1;
        inicio2=0;
        c=0;
        while(c<=a){
            
            System.out.println(inicio2 + " "); 
            aux = inicio2 + inicio;
            inicio2=inicio;
            inicio=aux;
            c++;
                    
        }
    
    }
    
}
