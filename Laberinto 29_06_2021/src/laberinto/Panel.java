
package laberinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Panel extends JPanel implements MouseListener{
    int posNO1X=250;
    int posNO1Y=150;
    int posNO2X=140;
    int posNO2Y=375;
    int posNO3X=250;
    int posNO3Y=250;
    int posNO4X=250;
    int posNO4Y=70;
    int posGANARX=400;
    int posGANARY=350;
    public Panel() {
        addMouseListener(this);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }
    
    
     public void paint(Graphics lienzo){
         lienzo.setColor(Color.RED);
         lienzo.drawString("ESQUIVA LOS OBSTACULOS", 150, 10);
         lienzo.drawString("CLICKEA PARA PINTAR", 150, 35);
         lienzo.setColor(Color.BLUE);
         lienzo.drawString("INICIO", 10,150);
         lienzo.drawString("FINAL", 350, 400);
         lienzo.setColor(Color.RED);
         
         lienzo.drawOval(posNO1X, posNO1Y, 50, 50);
         lienzo.drawOval(posNO2X, posNO2Y, 50, 50);
         lienzo.drawOval(posNO3X, posNO3Y, 50, 50);
         lienzo.drawOval(posNO4X, posNO4Y, 50, 50);
         
     }
  
   
    @Override
    public void mouseClicked(MouseEvent arg0) {
        
        System.out.print("HOLA");
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(arg0.getX(),arg0.getY(),15,15);  
        POSICION obj=new POSICION(true, arg0.getX(), arg0.getY());
        System.out.println(obj);
        if (obj.getXX()>=posNO1X-30 && obj.getXX()<=posNO1X+60  && obj.getYY()>=posNO1Y+10 && obj.getYY()<=posNO1Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
     
        }
        if (obj.getXX()>=posNO2X-30 && obj.getXX()<=posNO2X+60  && obj.getYY()>=posNO2Y-5 && obj.getYY()<=posNO2Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
  
        }
        if (obj.getXX()>=posNO3X-30 && obj.getXX()<=posNO3X+60  && obj.getYY()>=posNO3Y-5 && obj.getYY()<=posNO3Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
          
        }
        if (obj.getXX()>=posNO4X-30 && obj.getXX()<=posNO4X+60  && obj.getYY()>=posNO4Y-5 && obj.getYY()<=posNO4Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
         
        }
        if (obj.getXX()>=posGANARX-85 && obj.getXX()<=posGANARX+60  && obj.getYY()>=posGANARY && obj.getYY()<=posGANARY+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "*****FELICIDADES GANASTE******");
             repaint();
        }
        
        

    }

    @Override
    public void mousePressed(MouseEvent arg0) {
       System.out.print("HOLA2");
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(arg0.getX(),arg0.getY(),15,15); 
        POSICION obj=new POSICION(true, arg0.getX(), arg0.getY());
         
        System.out.println(obj);
         if (obj.getXX()>=posNO1X-30 && obj.getXX()<=posNO1X+60  && obj.getYY()>=posNO1Y+10 && obj.getYY()<=posNO1Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
     
        }
        if (obj.getXX()>=posNO2X-30 && obj.getXX()<=posNO2X+60  && obj.getYY()>=posNO2Y-5 && obj.getYY()<=posNO2Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
  
        }
        if (obj.getXX()>=posNO3X-30 && obj.getXX()<=posNO3X+60  && obj.getYY()>=posNO3Y-5 && obj.getYY()<=posNO3Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
          
        }
        if (obj.getXX()>=posNO4X-30 && obj.getXX()<=posNO4X+60  && obj.getYY()>=posNO4Y-5 && obj.getYY()<=posNO4Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
         
        }
        if (obj.getXX()>=posGANARX-85 && obj.getXX()<=posGANARX+60  && obj.getYY()>=posGANARY-5 && obj.getYY()<=posGANARY+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "*****FELICIDADES GANASTE******");
                   repaint();
        }
        
        
        
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        System.out.print("HOLA3");
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(arg0.getX(),arg0.getY(),15,15);
        POSICION obj=new POSICION(true, arg0.getX(), arg0.getY());

        System.out.println(obj);
          if (obj.getXX()>=posNO1X-30 && obj.getXX()<=posNO1X+60  && obj.getYY()>=posNO1Y+10 && obj.getYY()<=posNO1Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
     
        }
        if (obj.getXX()>=posNO2X-30 && obj.getXX()<=posNO2X+60  && obj.getYY()>=posNO2Y-5 && obj.getYY()<=posNO2Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
  
        }
        if (obj.getXX()>=posNO3X-30 && obj.getXX()<=posNO3X+60  && obj.getYY()>=posNO3Y-5 && obj.getYY()<=posNO3Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
          
        }
        if (obj.getXX()>=posNO4X-30 && obj.getXX()<=posNO4X+60  && obj.getYY()>=posNO4Y-5 && obj.getYY()<=posNO4Y+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "LASTIMA PERDISTE");
         
        }
         if (obj.getXX()>=posGANARX-85 && obj.getXX()<=posGANARX+60  && obj.getYY()>=posGANARY-5 && obj.getYY()<=posGANARY+60&& obj.isVar()==true){
               JOptionPane.showMessageDialog(null, "*****FELICIDADES GANASTE******");
               repaint();
         
        }
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        
       
    }

    @Override
    public void mouseExited(MouseEvent arg0) {

    }

    
    
}
