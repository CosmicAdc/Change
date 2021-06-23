
package graficas;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Ventana extends JFrame  implements ActionListener{
    private JTextField textfield1;
    private Panel jPanel;
    private JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10;
    private Boolean b1=false,b2=false,b3=false,b4=false,b5=false,b6=false,b7=false,b8=false,b9=false,b10=false;
    private int A1,A2,A3,A4,A5,A6,A7,A8,A9;
    private int XO=0;
    public Figuras fig;
    
    
    
    public Ventana(){
        
        setTitle("Tres en raya");
        setBounds (0,500,500,500);
       
        setBounds(0,0,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
    
 public void actionPerformed(ActionEvent e) {
       if (e.getSource()==boton1) {
           if (b1==false){
               int a=0,b=0,c=0,d=0;
               boolean panel=jPanel.creo(XO,a, b);
               b1=true;
               A1=XO;
               verificar(XO);
               if (XO==1){
                   
                   XO=0;
               }else{
                   XO=1;
               }
                   
                   
           }
            
        }
       if (e.getSource()==boton2) {

             if (b2==false){
               int a=80,b=0,c=0,d=0;
               boolean panel=jPanel.creo(XO,a, b);
               b2=true;
               A2=XO;
               verificar(XO);
               if (XO==1){
                   XO=0;
               }else{
                   XO=1;
               }
           }
          }
        if (e.getSource()==boton3) {
   
             if (b3==false){
               int a=170,b=0,c=0,d=0;
               boolean panel=jPanel.creo(XO,a, b);
               b3=true;
               A3=XO;
               verificar(XO);
               if (XO==1){
                   XO=0;
               }else{
                   XO=1;
               }
           }
        }
        if (e.getSource()==boton4) {
        
             if (b4==false){
               int a=0,b=75,c=0,d=0;
               boolean panel=jPanel.creo(XO,a, b);
               b4=true;
               A4=XO;
               verificar(XO);
               if (XO==1){
                   XO=0;
               }else{
                   XO=1;
               }
           }
        }
         if (e.getSource()==boton5) {
        
            
             if (b5==false){
               int a=80,b=75,c=0,d=0;
               boolean panel=jPanel.creo(XO,a, b);
               b5=true;
               A5=XO;
               verificar(XO);
               if (XO==1){
                   XO=0;
               }else{
                   XO=1;
               }
           }
        }
         if (e.getSource()==boton6) {
       
           
             if (b6==false){
               int a=180,b=75,c=0,d=0;
               boolean panel=jPanel.creo(XO,a, b);
               b6=true;
               A6=XO;
               verificar(XO);
               if (XO==1){
                   XO=0;
               }else{
                   XO=1;
               }
           }
        }
         if (e.getSource()==boton7) {
         
            
             if (b7==false){
               int a=0,b=150,c=0,d=0;
               boolean panel=jPanel.creo(XO,a, b);
               b7=true;
                A7=XO;
                verificar(XO);
               if (XO==1){
                   XO=0;
               }else{
                   XO=1;
               }
           }
        }
        if (e.getSource()==boton8) {
         
             
             if (b8==false){
               int a=80,b=150,c=0,d=0;
               boolean panel=jPanel.creo(XO,a, b);
               b8=true;
                A8=XO;
                verificar(XO);
               if (XO==1){
                   XO=0;
               }
               if(XO==0){
                   XO=1;
               }
           }
        }
        if (e.getSource()==boton9) {
                
             
             if (b9==false){
               int a=170,b=150,c=0,d=0;
               boolean panel=jPanel.creo(XO,a, b);
               b9=true;
                A9=XO;
                verificar(XO);
               if (XO==1){
                   XO=0;
               }else{
                   XO=1;
               }
           }
        }
        
        
        
        if (e.getSource()==boton10) {
             boolean AB=false;
             boolean panel=jPanel.reinicio(AB);
             b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;
             A1=2;A2=3;A3=4;A4=5;A5=6;A6=7;A7=8;A8=9;A9=10;
             repaint();
        }
         
        
        
              
    }
    public void verificar(int XO){
        //Condicion VERTICALES
        if (b1==true && b4==true && b7==true && A1==A4 && A4==A7){
            JOptionPane.showMessageDialog(null, "FELICIDADES GANO "+XO);
            
        }
         if (b2==true && b5==true && b8==true && A2==A5 && A5==A9){
            JOptionPane.showMessageDialog(null, "FELICIDADES GANO "+XO);
            
        }  
         if (b3==true && b6==true && b9==true && A3==A6 && A6==A9){
            JOptionPane.showMessageDialog(null, "FELICIDADES GANO "+XO);
            
        }
        //Condicion HORIZONTALES
        if (b1==true && b2==true && b3==true && A1==A2 && A2==A3){
            JOptionPane.showMessageDialog(null, "FELICIDADES GANO "+XO);
            
        }
         if (b4==true && b5==true && b6==true && A4==A5 && A5==A6){
            JOptionPane.showMessageDialog(null, "FELICIDADES GANO "+XO);
            
        }  
         if (b7==true && b8==true && b9==true && A7==A8 && A6==A9){
            JOptionPane.showMessageDialog(null, "FELICIDADES GANO "+XO);
            
        } 
          //Condicion diagonales
        if (b1==true && b5==true && b9==true && A1==A5 && A5==A9){
            JOptionPane.showMessageDialog(null, "FELICIDADES GANO "+XO);
             
        }
         if (b3==true && b5==true && b7==true && A3==A5 && A5==A7){
            JOptionPane.showMessageDialog(null, "FELICIDADES GANO "+XO);
            
        }  
        if (b1==true && b2==true && b3==true && b4==true && b5==true && b6==true && b7==true && b8==true && b9==true){
            JOptionPane.showMessageDialog(null, "LASTIMA NINGUNO GANO ");
        }
         
         
            
    }

   
    public void initComponentes(){

       
     
        boton1=new JButton("1");
        boton2=new JButton("2");
        boton3=new JButton("3");
        boton4=new JButton("4"); 
        boton5=new JButton("5");
        boton6=new JButton("6");
        boton7=new JButton("7");
        boton8=new JButton("8");
        boton9=new JButton("9");
        jPanel = new Panel();
        setContentPane(jPanel);
        Container botones= getContentPane();
        botones.setLayout(new FlowLayout());

        boton10=new JButton("BORRAR");
       
        boton1.setBounds(new Rectangle(500,50,100,75));
        boton2.setBounds(new Rectangle(500,50,100,75));
        boton3.setBounds(new Rectangle(500,50,100,75));
        boton4.setBounds(new Rectangle(500,50,100,75));
        boton5.setBounds(new Rectangle(500,50,100,75));
        boton6.setBounds(new Rectangle(500,50,100,75));
        boton7.setBounds(new Rectangle(500,50,100,75));
        boton8.setBounds(new Rectangle(500,50,100,75));
        boton9.setBounds(new Rectangle(500,50,100,75));
        boton10.setBounds(new Rectangle(500,50,100,75));
       

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        boton10.addActionListener(this);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
        add(boton7);
        add(boton8);
        add(boton9);
        add(boton10);

    }

    @Override
    public String toString() {
        return "Ventana{" + "jPanel=" + jPanel + ", boton1=" + boton1 + ", boton2=" + boton2 + ", boton3=" + boton3 + ", boton4=" + boton4 + ", boton5=" + boton5 + ", boton6=" + boton6 + ", boton7=" + boton7 + ", boton8=" + boton8 + ", boton9=" + boton9 + ", boton10=" + boton10 + ", b1=" + b1 + ", b2=" + b2 + ", b3=" + b3 + ", b4=" + b4 + ", b5=" + b5 + ", b6=" + b6 + ", b7=" + b7 + ", b8=" + b8 + ", b9=" + b9 + ", b10=" + b10 + ", XO=" + XO + ", fig=" + fig + '}';
    }
   

    
}
