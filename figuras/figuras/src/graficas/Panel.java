
package graficas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Panel  extends JPanel implements KeyListener{
    
    private Ventana vent;
    private figuras figuraF;
    
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    int a=0,b=0,c=0,d=0;
    boolean af=false, bf=false,cf=false,df=false;
    public Panel() {
        vent=new Ventana();
        setBackground(Color.red);  
        
    }
    public boolean creo1(figuras figurasF){
        if (figurasF!=null){
            figuraF=figurasF;
            a=figuraF.getX();
            b=figuraF.getY();
            c=figuraF.getAlto();
            d=figuraF.getAncho();
            System.out.println("A");
            af=true;
            return true;
        }else{
            System.out.println("falsee");
            return false;
        }
        
        
    }
    
    
      public boolean creo2(figuras figurasF){
        if (figurasF!=null){
            figuraF=figurasF;
            a=figuraF.getX();
            b=figuraF.getY();
            c=figuraF.getAlto();
            d=figuraF.getAncho();
            System.out.println("B");
             bf=true;
            return true;
        }else{
            System.out.println("falsee");
            return false;
        }
        
    }
        public boolean creo3(figuras figurasF){
        if (figurasF!=null){
            figuraF=figurasF;
            a=figuraF.getX();
            b=figuraF.getY();
            c=figuraF.getAlto();
            d=figuraF.getAncho();
            System.out.println("C");
            cf=true;
            return true;
        }else{
            System.out.println("falsee");
            return false;
        }
        
    }
          public boolean creo4(figuras figurasF){
        if (figurasF!=null){
            figuraF=figurasF;
            a=figuraF.getX();
            b=figuraF.getY();
            c=figuraF.getAlto();
            d=figuraF.getAncho();
            System.out.println("D");
             df=true;
            return true;
        }else{
            System.out.println("falsee");
            return false;
        }
        
    }
    
    @Override
    public void paint(Graphics lienzo){
  
        lienzo.setColor(Color.red);
        
        if (af==true){
            lienzo.drawRect(a,b,c,d);
            af=false;
        }
        if (bf==true){
            lienzo.drawOval(a,b,c,d);
            bf=false;
        }
        if (cf==true){
            lienzo.drawOval(a,b,c,d);
            cf=false;
        }
        if (df==true){
            lienzo.drawRect(a,b,c,d);
            df=false;
        }
  
        lienzo.setColor(Color.blue);
        lienzo.drawString("ELIJA SU FIGURA", 100,100);  
      
        //lienzo.fillOval(vent.getFig().getX(),vent.getFig().getY(),vent.getFig().getAlto(),vent.getFig().getAncho());
        
            
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        if (arg0.getKeyCode()==KeyEvent.VK_UP){
            b=(b+10);
        }else if (arg0.getKeyCode()==KeyEvent.VK_DOWN){
            b=(b-10);
        }else if (arg0.getKeyCode()==KeyEvent.VK_LEFT){
            a=(a-10);
        }else if (arg0.getKeyCode()==KeyEvent.VK_RIGHT){
           a=(a+10);
        }
        repaint();
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
