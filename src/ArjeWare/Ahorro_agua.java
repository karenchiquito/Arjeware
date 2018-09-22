/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import Utilidades.Colores;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 *
 * @author Sebas
 */
public class Ahorro_agua extends JPanel implements ActionListener{
    protected int width,heigth;
    protected Control_instancias pp;
    private JLabel title,imagen,titulo2,fras;
    private JTextArea area,frase;
    private JButton agua,huella,impacto,ahorra,cuida;
    public final int x=10,y=350;
    
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    public Ahorro_agua(Control_instancias instancias,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
        
        title = new JLabel("Sección: Aprende más sobre el agua");
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            title.setForeground(verde_seleccion);
            add(title);
            
        titulo2=new JLabel("En esta sección encontraras: ");
            titulo2.setFont(new Font("Microsoft New Tai Lue",1,16));
            titulo2.setForeground(verde_menu);
            add(titulo2);
        
        area = new JTextArea();
            area.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area.setEditable(false);
            area.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            area.setVisible(true);
            area.setLineWrap(true);
            area.setText("Aquí encontraras mucha información sobre este recurso tan esencial e importante para el día a día"
            +", que va"+"\n"+"desde ahorrar este servicio en el consumo en el hogar, maneras de cuidarlo, lo que es el agua, hasta que"+"\n"+"es la famosa "
            +"Huella Hídrica y como minimizar nuestro impacto en ella.");
            add(area);
            
        agua=new JButton("-El agua");
            agua.setFont(new Font("Microsoft New Tai Lue",0, 16));
            agua.addActionListener(this);
            agua.setFocusPainted(false);
            agua.setBorderPainted(false);
            agua.setContentAreaFilled(false);
            agua.setBackground(Colores.color_verdeOscuro);
            agua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            agua.setForeground(verde_seleccion);
            add(agua);
            
        cuida=new JButton("-Cuida este recurso");
            cuida.setFont(new Font("Microsoft New Tai Lue",0, 16));
            cuida.addActionListener(this);
            cuida.setFocusPainted(false);
            cuida.setBorderPainted(false);
            cuida.setContentAreaFilled(false);
            cuida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            cuida.setForeground(verde_seleccion);
            add(cuida);
            
        ahorra=new JButton("-Ahorra en tu hogar");
            ahorra.setFont(new Font("Microsoft New Tai Lue",0, 16));
            ahorra.addActionListener(this);
            ahorra.setFocusPainted(false);
            ahorra.setBorderPainted(false);
            ahorra.setContentAreaFilled(false);
            ahorra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ahorra.setForeground(verde_seleccion);
            add(ahorra);
            
        huella=new JButton("-La huella hídrica");
            huella.setFont(new Font("Microsoft New Tai Lue",0, 16));
            huella.addActionListener(this);
            huella.setFocusPainted(false);
            huella.setBorderPainted(false);
            huella.setContentAreaFilled(false);
            huella.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            huella.setForeground(verde_seleccion);
            add(huella);
            
        impacto=new JButton("-Reduce tu impacto en la huella hídrica");
            impacto.setFont(new Font("Microsoft New Tai Lue",0, 16));
            impacto.addActionListener(this);
            impacto.setFocusPainted(false);
            impacto.setBorderPainted(false);
            impacto.setContentAreaFilled(false);
            impacto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            impacto.setForeground(verde_seleccion);
            add(impacto);
            
            
        imagen=new JLabel();
            imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/fondo_agua.jpg")));
            add(imagen);
            
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
            frase.setText("*La falta de agua potable causa la muerte de 4500 niños por día, en su mayoría "
            +"pertenecientes a los"+"\n"+"países en desarrollo.");
            add(frase);
            
        agua.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent evt){
                            agua.setForeground(verde_menu);
                            agua.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                        @Override
                        public void mouseExited(MouseEvent evt){
                            agua.setForeground(verde_seleccion);
                        }
            });
        
        cuida.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent evt){
                            cuida.setForeground(verde_menu);
                            cuida.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                        @Override
                        public void mouseExited(MouseEvent evt){
                            cuida.setForeground(verde_seleccion);
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
        
        huella.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent evt){
                            huella.setForeground(verde_menu);
                            huella.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                        @Override
                        public void mouseExited(MouseEvent evt){
                            huella.setForeground(verde_seleccion);
                        }
            });
        
        impacto.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseEntered(MouseEvent evt){
                            impacto.setForeground(verde_menu);
                            impacto.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                        @Override
                        public void mouseExited(MouseEvent evt){
                            impacto.setForeground(verde_seleccion);
                        }
            });
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        title.setBounds(20,20,300,25);
        imagen.setBounds(0, 50, 809,heigth-550);
        
        titulo2.setBounds(20, 225, 250, 25);
        area.setBounds(20,250,750, 75);
        
        agua.setBounds(x,y,100,25);
        cuida.setBounds(x,y+30,175,25);
        ahorra.setBounds(x,y+30*2,175,25);
        huella.setBounds(x,y+30*3,175,25);
        impacto.setBounds(x,y+30*4,325,25);
        
        int xf=20;
        int yf=550;
        
        fras.setBounds(xf, yf, 150, 25);
        frase.setBounds(xf, yf+35, 700, 50);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== agua){
            pp.getContenedor().controlPantallas_agua(0);
        }
        if(e.getSource()== cuida){
            pp.getContenedor().controlPantallas_agua(1);
        }
        if(e.getSource()== huella){
            pp.getContenedor().controlPantallas_agua(2);
        }
        if(e.getSource()== ahorra){
            pp.getContenedor().controlPantallas_agua(3);
        }
        
    }
}
