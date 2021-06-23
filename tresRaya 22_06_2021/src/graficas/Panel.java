
package graficas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JPanel;
public class Panel  extends JPanel   {
    javax.swing.JPanel jPanel = new javax.swing.JPanel();
    private Figuras figuraF;
    private Ventana vent;
    private int a,b,c,d;
    boolean X,act=false;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    JButton boton6;
    JButton boton7;
    JButton boton8;
    JButton boton9;
    JButton boton10;


    public Panel() {
        vent=new Ventana();
        System.out.println("Hola");
        setBackground(Color.red);  
        repaint();

    }
    public boolean creo(int XO,int a,int b){
        act=true;
        if (XO==1){
          this.a=a;
          this.b=b;
          X=true;
        }else{
          this.a=a;
          this.b=b;

          X=false;
        }  
        repaint();
        return true; 
      
    }
    
    public boolean reinicio(boolean AB){
        act=AB;
        return true;
    }
    

    
        @Override
    public void paint(Graphics lienzo){
  
        lienzo.setColor(Color.red);
        lienzo.drawLine(100,180,100 ,370);
        lienzo.drawLine(200,180,200 ,370);
        
        lienzo.drawLine(50,235,265 ,235);
        lienzo.drawLine(50,315,265 ,315);
        
     
        lienzo.setColor(Color.RED);
        lienzo.drawString("PASE EL MOUSE ATRAVES DE LOS BOTONES PARA VERLOS", 80,90);  
        if (act==true){
           if (X==true){
            lienzo.drawRect(40+a,170+b , 50, 50);
            }if (X==false){
            lienzo.drawOval(40+a,170+b , 50, 50);
            } 
        }
        
       
        //lienzo.fillOval(vent.getFig().getX(),vent.getFig().getY(),vent.getFig().getAlto(),vent.getFig().getAncho());
        
            
    }
    
  
       
    
}
