/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sebas
 */
public class Ciudad extends JPanel implements ActionListener{
    //Fundamentales-------------------------
    protected int width,height;
    protected Control_instancias pp;
    //Banderas------------------------------
    private int bandera_proyecto=0;
    //Titulos-------------------------------
    private JLabel title;
    //Botones-------------------------------
    private JButton Proyectos,contaminacion,acgns;
    //private JLabel fondo;
    private JLabel fondo_arjeware,fondo_contaminacion;
    //Colores-------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    
    public Ciudad (Control_instancias instancias,int width,int hegiht){
        this.width=width;
        this.height=hegiht;
        this.setLayout(new FlowLayout(FlowLayout.LEFT,1,1)); 
        pp=instancias;
  
        /*title=new JLabel("Bienvenido a nuestra sección: CIUDAD");
            title.setForeground(verde_seleccionar);
            title.setFont(new Font("Microsoft New Tai Lui",1,16));
            add(title);*/
            
        Proyectos=new JButton();
            Proyectos.setToolTipText("Proyectos de ACGNS");
            Proyectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            Proyectos.addActionListener(this);
            Proyectos.setBorderPainted(false);
            Proyectos.setContentAreaFilled(false);
            Proyectos.setFocusPainted(false);
            Proyectos.setBackground(verde_menu);
            Proyectos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_proyectos.png")));
            add(Proyectos);
            
        contaminacion=new JButton();
            contaminacion.setToolTipText("Cuida la ciudad con ACGNS");
            contaminacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            contaminacion.addActionListener(this);
            contaminacion.setBorderPainted(false);
            contaminacion.setContentAreaFilled(false);
            contaminacion.setFocusPainted(false);
            contaminacion.setBackground(verde_menu);
            contaminacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_contaminacion.png")));
            add(contaminacion);
            
        acgns=new JButton();
            acgns.setToolTipText("Conoce nuestros servicios.");
            acgns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            acgns.addActionListener(this);
            acgns.setBorderPainted(false);
            acgns.setContentAreaFilled(false);
            acgns.setFocusPainted(false);
            acgns.setBackground(verde_menu);
            acgns.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_arjeware_prueba.png")));
            add(acgns);
            
        Proyectos.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                Proyectos.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                Proyectos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_proyectos_seleccion.png")));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                Proyectos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_proyectos.png")));
            }        
        });
        
        contaminacion.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                contaminacion.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                contaminacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_contaminacion_seleccion.png")));
                fondo_contaminacion.setVisible(true);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                contaminacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_contaminacion.png")));
                fondo_contaminacion.setVisible(false);
            }
        });
        
        acgns.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                acgns.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                acgns.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_arjeware_prueba_seleccion.png")));
                fondo_arjeware.setVisible(true);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                acgns.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_arjeware_prueba.png")));
                fondo_arjeware.setVisible(false);
            }
        });
            
        fondo_arjeware=new JLabel();
            fondo_arjeware.setVisible(false);
            fondo_arjeware.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo_ciudad_arjeware.png")));
            add(fondo_arjeware);
            
        fondo_contaminacion=new JLabel();
            fondo_contaminacion.setVisible(false);
            fondo_contaminacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo_ciudad_contaminacion.png")));
            add(fondo_contaminacion);
            
        
            
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        //title.setBounds(250,10,300,25);
        int separacion_y=140;
        Proyectos.setBounds(0,separacion_y,500,100);
        
        contaminacion.setBounds(319,separacion_y+150,500,100);
        fondo_contaminacion.setBounds(0,0,825,700);
        
        acgns.setBounds(0,separacion_y+290,500,100);
        fondo_arjeware.setBounds(0,0,825,700);
        
        //fondo.setBounds(350,250,400,350);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Proyectos){
            pp.getContenedor().controlPantallas_Ciudad(0);
        }
        if(e.getSource()==contaminacion){
            pp.getContenedor().controlPantallas_Ciudad(1);
        }
        if(e.getSource()==acgns){
            pp.getContenedor().controlPantallas_Ciudad(3);
        }
    }
}