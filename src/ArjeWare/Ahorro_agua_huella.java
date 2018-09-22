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

/**
 *
 * @author Sebas
 */
public class Ahorro_agua_huella extends JPanel implements ActionListener{
    protected int width,heigth;
    protected Control_instancias pp;
//-----------TITULOS-------------------
    private JLabel title,title1,fras;
//-----------COLORES--------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
//-----------BÓTONES-------------------------------
    private JButton atras,adelante;
//-----------COORDENADAS------------------
    private final int fx=700,fy=605,fs=50;
//-----------ARGUMENTOS--------------------
    private JTextArea area,area1,frase;
    
    public Ahorro_agua_huella(Control_instancias instancias,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
        
        title=new JLabel("¿Qué es la huella hidríca?");
            title.setFont(new Font("Microsoft New Tai Lue",1,18));
            title.setForeground(verde_seleccionar);
            add(title);
            
        area = new JTextArea();
            area.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area.setEditable(false);
            area.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            area.setVisible(true);
            area.setLineWrap(true);
            area.setText("La huella hídrica es un indicador del uso de agua dulce que hace referencia tanto "
            +"al uso directo del agua de"+"\n"+"un consumidor o productor, como a su uso indirecto."+"\n"+"La huella "
            +"hídrica puede considerarse como un indicador integral de la apropiación de los recursos de agua"+"\n"+"dulce"
            +", ya que se utiliza para medir el volumen total de agua dulce usado para producir los bienes y "
            +"servicios producidos por una empresa, o consumidos por un individuo o comunidad.");
            add(area);
        
        title1=new JLabel("La huella hidríca en el hogar.");
            title1.setFont(new Font("Microsoft New Tai Lue",1,18));
            title1.setForeground(verde_seleccionar);
            add(title1);
            
        area1 = new JTextArea();
            area1.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area1.setEditable(false);
            area1.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            area1.setVisible(true);
            area1.setLineWrap(true);
            area1.setText("Es muy difícil lograr un gran cambio a nivel mundial, pero desde casa podemos hacer la diferencia"
            +", se tiene"+"\n"+"que tomar conciencia si de verdad estoy económizando y cuidando el agua del planeta, es"
            + " necesario"+"\n"+"empezar a tomar medidas, más con noticias sobre el gran paso que esta dando el cambio climático"
            +"\n"+"afectando a todos."+"\n"+"En el hogar podremos reducir esta huella que dejamos, no solo con"
            + "la ayuda de esta aplicación sino con las miles de maneras y formas que hoy por hoy hay en el mundo."+"\n"+
            "\n"+"Te invitamos a ir a la sección: Reduce tu impacto hidríco.");
            add(area1);
            
        fras=new JLabel("Sabías que:");
                fras.setFont(new Font("Microsoft New Tai Lue",1, 18));
                fras.setForeground(verde_menu);
                add(fras);
                
            frase=new JTextArea();
                frase.setFont(new Font("Microsoft New Tai Lue",0, 16));
                frase.setForeground(verde_seleccionar);
                frase.setLineWrap(true);
                frase.setEditable(false);
                frase.setBackground(verde_sabias);
                frase.setText("Sólo el 2.5% del agua que existe en la Tierra es agua dulce. De esa cantidad, "
                +"el 0.5% se encuentra en depósitos subterráneos y el 0.01% en ríos y lagos.");
                add(frase);
            
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
        
        title.setBounds(20, 20, 600, 25);
        area.setBounds(20,55,750,115);
        
        title1.setBounds(20, 200, 600, 25);
        area1.setBounds(20,235,750,175);
        
        int xf=20;
        int yf=550;
        
        fras.setBounds(xf, yf, 150, 25);
        frase.setBounds(xf, yf+35, 600, 50);
        
        
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlSubpantallas(7);
        }
    }

    
}

