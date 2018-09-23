/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Control_instancias;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;



/**
 *
 * @author Sebas
 */
public class Ahorro_gas extends JPanel implements ActionListener{
    protected int width,heigth;
    private JLabel title,titulo2,imagen,fras;
    private JButton Ahorro_gass, Ahorro_gasss,ahorra,atras,adelante;
    private JTextArea area,frase;
    protected Control_instancias pp;
    public final int x=10,y=350;
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    private final int fx=700,fy=615,fs=50;
    public Ahorro_gas(Control_instancias instancias,int width, int heigh){
        this.width = width;
        this.heigth = heigh;
        pp=instancias;
        
            title=new JLabel("Sección: Aprende más sobre el gas");
                title.setFont(new Font("Microsoft New Tai Lue",1,16));
                title.setForeground(verde_seleccion);
                add(title);
                
                titulo2=new JLabel("En esta sección encontraras: ");
            titulo2.setFont(new Font("Microsoft New Tai Lue",1,16));
            titulo2.setForeground(verde_menu);
            add(titulo2);
            
            area = new JTextArea();
            area.setOpaque(false);
            area.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area.setEditable(false);
            area.setBackground(Color.white);
            area.setVisible(true);
            area.setLineWrap(true);
            area.setText("Aquí encontraras mucha información sobre este recurso tan esencial e importante para el día a día"
            +", que va"+"\n"+"desde ahorrar este servicio en el consumo en el hogar, maneras de cuidarlo, lo que es el gas, hasta que"+"\n"+"es la famosa "
            +"Huella de carbono y como minimizarla.");
            add(area);
            
             fras=new JLabel("Sabías que:");
                fras.setFont(new Font("Microsoft New Tai Lue",1, 18));
                fras.setForeground(verde_menu);
                add(fras);
                
            frase=new JTextArea();
                frase.setFont(new Font("Microsoft New Tai Lue",0, 16));
                frase.setForeground(verde_seleccion);
                frase.setLineWrap(true);
                frase.setEditable(false);
                frase.setBackground(verde_sabias);
                frase.setText("El gas natural libera menor cantidad de CO² que el petróleo y el carbón y es"+"\n"+"ecológicamente "
                +"el combustible fósil más aceptable.");
                add(frase);
            
            Ahorro_gass=new JButton("-El gas");
                Ahorro_gass.setFont(new Font("Microsoft New Tai Lue",0, 16));
                Ahorro_gass.addActionListener(this);
                Ahorro_gass.setFocusPainted(false);
                Ahorro_gass.setBorderPainted(false);
                Ahorro_gass.setContentAreaFilled(false);
                Ahorro_gass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                Ahorro_gass.setForeground(verde_seleccion);
                add(Ahorro_gass);
                     
         Ahorro_gasss=new JButton("-Huella de carbono");
            Ahorro_gasss.setFont(new Font("Microsoft New Tai Lue",0, 16));
            Ahorro_gasss.addActionListener(this);
            Ahorro_gasss.setFocusPainted(false);
            Ahorro_gasss.setBorderPainted(false);
            Ahorro_gasss.setContentAreaFilled(false);
            Ahorro_gasss.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            Ahorro_gasss.setForeground(verde_seleccion);
            add(Ahorro_gasss);
            
        ahorra=new JButton("-Ahorra en tu hogar");
            ahorra.setFont(new Font("Microsoft New Tai Lue",0, 16));
            ahorra.addActionListener(this);
            ahorra.setFocusPainted(false);
            ahorra.setBorderPainted(false);
            ahorra.setContentAreaFilled(false);
            ahorra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ahorra.setForeground(verde_seleccion);
            add(ahorra);
                  
        imagen=new JLabel();
            imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/gas.png")));
            add(imagen);
                     
                      Ahorro_gass.addMouseListener(new MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                       Ahorro_gass.setForeground(verde_menu);
                                       Ahorro_gass.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        Ahorro_gass.setForeground(verde_seleccion);
                                    }
                      });
                                     Ahorro_gasss.addMouseListener(new MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                       Ahorro_gasss.setForeground(verde_menu);
                                       Ahorro_gasss.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        Ahorro_gasss.setForeground(verde_seleccion);
                                    }
            
                              });
                                     ahorra.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent evt){
                            ahorra.setForeground(verde_menu);
                            ahorra.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                        @Override
                        public void mouseExited(MouseEvent evt){
                            ahorra.setForeground(verde_seleccion);
                        }
            });
                
    }
                              
    @Override
    public void paintComponent(Graphics g){  
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        int xf=20;
        int yf=550;
        
        fras.setBounds(xf, yf, 150, 25);
        frase.setBounds(xf, yf+35, 600, 50);

               
               title.setBounds(20, 20, 600, 25);
               imagen.setBounds(0, 50, 809,heigth-550);
               
                Ahorro_gasss.setBounds(x,y+30,175,25);
                Ahorro_gass.setBounds(x,y,100,25);
                ahorra.setBounds(x,y+30*2,175,25);
                titulo2.setBounds(20, 225, 250, 25);
                area.setBounds(20,250,750, 75);
              
               
               
              
           
}

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==Ahorro_gass){
            pp.getContenedor().controlPantallas_gas(0);
     }
            if(e.getSource()==Ahorro_gasss){
            pp.getContenedor().controlPantallas_gas(1);
        }    
      
        if(e.getSource()== ahorra){
            pp.getContenedor().controlPantallas_gas(2);
        }
      
     }
    }


