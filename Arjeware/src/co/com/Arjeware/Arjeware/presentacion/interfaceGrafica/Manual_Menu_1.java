/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

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

/**
 *
 * @author Sebas
 */
public class Manual_Menu_1 extends JPanel implements ActionListener{
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
    
    public Manual_Menu_1(Control_instancias instancias,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
        
        title = new JLabel("Manual de ayuda: Menú");
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            title.setForeground(verde_seleccion);
            add(title);
               
       boton_inicio= new JTextArea();
            boton_inicio.setLineWrap(true);
            boton_inicio.setText("-Al darle click a el boton Servicio te encontraras con una pantalla en la"+"\n"+"que hallaras"
            +" Información sobre cada sección y lo que encontraras en");
            boton_inicio.setFont(new Font("Microsoft New Tai Lue",0,16));
            boton_inicio.setEditable(false);
            add(boton_inicio);
            
        boton_inicio_2= new JTextArea();
            boton_inicio_2.setLineWrap(true);
            boton_inicio_2.setText("cada una de ellas."+"\n"+"\n"+"-También habra una ´subsección´ llamada SABIAS QUE en la cual te encontraras con datos curisos que\n" +
            "buscan incentivar a los usuarios a ahorrar tanto en el hogar como a cuidar el medio ambiente.");
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
            imagen1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_servicio.png")));
            add(imagen1);
            
        
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
        
        imagen1.setBounds(20,85,177,37);
        boton_inicio.setBounds(225,85,500,50);
        boton_inicio_2.setBounds(20, 135, 750, 275);
        
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlPantallas_Manual(0);
        }
    }

    
}
