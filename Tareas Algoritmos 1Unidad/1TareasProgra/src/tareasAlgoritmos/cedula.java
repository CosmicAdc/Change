package tareasAlgoritmos;
public class cedula {
    public static void main(String args[]){
    String[] cedula= new String[10];
    int[] cedulaInt = new int[10];
    String nroCed ="0107300469";
    System.out.println("***"+nroCed+"***");
    int i;
    for ( i=0; i<=nroCed.length()-1; i++){
        cedula[i]=nroCed.substring(i,i+1);
        System.out.println(cedula[i]);
    }
    //validadación pt1
    String union1="";
    union1=union1.concat(cedula[0]).concat(cedula[1]);
    int v1= Integer.parseInt(union1);
    int v2= cedulaInt[2];
    int v3;
    int sumaP=0,sumaI=0;
    //validacion pt2
    for ( i=0; i<=nroCed.length()-1; i++){
      cedulaInt[i]=Integer.parseInt(cedula[i]);
    }
    for ( i=0; i<=nroCed.length()-1; i+=2){
      cedulaInt[i]=cedulaInt[i]*2;
      if (cedulaInt[i]>9){
          cedulaInt[i]= cedulaInt[i]-9;
      }
      sumaI=sumaI+cedulaInt[i];
    }
    for ( i=1; i<=nroCed.length()-2; i+=2){
      sumaP=sumaP+cedulaInt[i];
    }
    sumaP=(sumaP+sumaI)%10;
   if (sumaP==0){
     v3=0;
   }else{
    v3=10-sumaP;
   }      
   //VERIFICACIÓN     
   if (v1>24 || v1<=0){
       System.out.println("---NRO DE CEDULA INVALIDO1---");
   }else{
       if(v2>5){
          System.out.println("---NRO DE CEDULA INVALIDO---");
       }else{
           if (cedulaInt[9]!=v3){
              System.out.println("---NRO DE CEDULA INVALIDO---");
           }else{
               System.out.println("+++NUMERO DE CEDULA CORRECTO+++");
           }
       }  
   }
   }   
}
