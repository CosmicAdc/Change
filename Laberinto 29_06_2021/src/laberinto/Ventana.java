
package laberinto;

import java.awt.Robot;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {
        Robot robot = null;
       private Panel panelP;
         JButton boton1;
         public Ventana(){
        
        setTitle("Laberinto");
        setBounds (0,500,500,500);
        setBounds(0,0,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
         
         public void initComponentes(){
            
             boton1=new JButton("Salir");
             panelP=new Panel();   
            
             panelP.repaint();
             setContentPane(panelP);
             
             boton1.setBounds(500, 250, 200, 30);
             add(boton1);
            try{
              robot = new Robot();
            }
             catch(Exception e){System.out.println( e.toString() ); }
         
            {
             robot.mouseMove(10, 150);
            }
            
    }
   
 
         
         
}
