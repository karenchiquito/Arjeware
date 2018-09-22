/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class Manual_Menu extends JPanel implements ActionListener{
    protected int width,heigth;
    protected Control_instancias pp;
//-------------TITULOS-----------------------------------------
    private JLabel title,botones_agua,manual;
//-------------HUBICACIONES------------------------------------
    private final int xa=20,ya=20,
                      x=20,y=175,
                      fx=700,fy=615,fs=50;
//-------------ARGUMENTOS--------------------------------------
    private JTextArea nuevo,boton_inicio,boton_inicio_2;
//-------------IMAGENES----------------------------------------    
    private JLabel imagen1,imagen2,imagen3,imagen4;
//------------COLORES------------------------------------------  
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
//------------BOTONES-------------------------------------------
    private JButton menu,seccion_ahorro,seccion_servicios,ACGNS,
                    atras,adelante;
//--------------------------------------------------------------
    
    public Manual_Menu(Control_instancias instancias,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
        
        title = new JLabel("Manual de ayuda: Menú");
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            title.setForeground(verde_seleccion);
            add(title);
            
        nuevo = new JTextArea();
            nuevo.setLineWrap(true);
            nuevo.setText("Hora de aprender un poco sobre a donde te llevara cada botón del menú, y que te encontraras allí.");
            nuevo.setFont(new Font("Microsoft New Tai Lue",0,16));
            nuevo.setEditable(false);
            add(nuevo);
            
       boton_inicio= new JTextArea();
            boton_inicio.setLineWrap(true);
            boton_inicio.setText("-Al darle click a el boton INICIO te encontraras con una pantalla en la"+"\n"+"que hallaras"
            +" una breve introducción a ACGNS donde se explica un poco ");
            boton_inicio.setFont(new Font("Microsoft New Tai Lue",0,16));
            boton_inicio.setEditable(false);
            add(boton_inicio);
            
        boton_inicio_2= new JTextArea();
            boton_inicio_2.setLineWrap(true);
            boton_inicio_2.setText("la razón de ser de la aplicación y el por que se hizo."+
            "\n"+"\n"+"-Apareceran unas imagenes insentivadoras a "
            +"cuidar el planeta, las cuales podras cambiar dandole a los"+"\n"+"botones que parecen gotas de agua."+
            "\n"+"\n"+"-Allí estara hubicado también nuestro manual que gracias a el has llegado aquí."+
            "\n"+"\n"+"-También habra una ´subsección´ llamada SABIAS QUE en la cual te encontraras con datos curiosos"+
            " que"+"\n"+"buscan incentivar a los usuarios a ahorrar tanto en el hogar como a cuidar el medio ambiente."+
            "\n"+"\n"+"-Por ultimo te encontraras con una pregunta acompañada de un cerdito y un botón, ese botón te llevara a la Sección Ahorro.");
            boton_inicio_2.setFont(new Font("Microsoft New Tai Lue",0,16));
            boton_inicio_2.setEditable(false);
            add(boton_inicio_2);
        
        atras=new JButton();
            atras.setVisible(true);
            atras.addActionListener(this);
            atras.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
            atras.setContentAreaFilled(false);
            atras.setFocusPainted(false);
            atras.setBorderPainted(false);
          //uno.setDefaultCapable(false);
            atras.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_izquierda.png")));
            add(atras);
            
        adelante=new JButton();
            adelante.setVisible(true);
            adelante.addActionListener(this);
            adelante.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
            adelante.setContentAreaFilled(false);
            adelante.setFocusPainted(false);
            adelante.setBorderPainted(false);
          //uno.setDefaultCapable(false);
            adelante.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png")));
            add(adelante);
            
        imagen1=new JLabel();
            imagen1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_inicio.png")));
            add(imagen1);
            
        botones_agua = new JLabel("Botones de agua");
            botones_agua.setFont(new Font("Microsoft New Tai Lue",1,16));
            botones_agua.setForeground(verde_seleccion);
            add(botones_agua);
            
        imagen2=new JLabel();
            imagen2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
            add(imagen2);
        
        imagen3=new JLabel();
            imagen3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo_seleccion.png")));
            add(imagen3);
            
        manual= new JLabel("Manual");
            manual.setFont(new Font("Microsoft New Tai Lue",1,16));
            manual.setForeground(verde_seleccion);
            add(manual);
            
        imagen4=new JLabel();
            imagen4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/instruccion.png")));
            add(imagen4);
        
                atras.addMouseListener(new java.awt.event.MouseAdapter() {
                             @Override
                             public void mouseEntered(java.awt.event.MouseEvent evt){
                                atras.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_izquierda_seleccion.png")));
                                atras.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                                }
                             @Override
                             public void mouseExited(java.awt.event.MouseEvent evt){
                                atras.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_izquierda.png")));
                                }
                             });
                adelante.addMouseListener(new java.awt.event.MouseAdapter() {
                             @Override
                             public void mouseEntered(java.awt.event.MouseEvent evt){
                                adelante.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_derecha_seleccion.png")));
                                adelante.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                                }
                             @Override
                             public void mouseExited(java.awt.event.MouseEvent evt){
                                adelante.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png")));
                                }
                             });
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        
        title.setBounds(xa,ya,300,25);
        nuevo.setBounds(xa,ya+35,750,50);
        
        imagen1.setBounds(20,120,177,37);
        boton_inicio.setBounds(225,120,500,50);
        boton_inicio_2.setBounds(20, 170, 750, 275);
        
        botones_agua.setBounds(20,450,150,25);
        imagen2.setBounds(45,500,35,35);
        imagen3.setBounds(95,500,35,35);
        
        manual.setBounds(235,450,150,25);
        imagen4.setBounds(200, 500, 140, 140);
        
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlSubpantallas(8);
        }
        if(e.getSource()==adelante){
            pp.getContenedor().controlPantallas_Manual(1);
        }
    }

    
}
