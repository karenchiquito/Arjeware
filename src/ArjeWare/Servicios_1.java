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
public class Servicios_1 extends JPanel implements ActionListener{
    //Fundamentales-------------------------------
    protected int width,height;
    protected Control_instancias pp;
    //Titulos-------------------------------------
    private JLabel Sec_ciudad,otros_servi,progr;
    //Areas de Texto------------------------------
    private JTextArea seccion_ciudad,programadores;
    //Imagenes------------------------------------
    private JLabel imagen_fondo;
    //Colores-------------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    //Flechas-------------------------------------
    private JButton atras;
    //Variables enteras(Int)---------------------------
    int programadores_en_funcion_mercado = 4;
    //Variables tipo Texto(String)--------------------
    
    public Servicios_1(Control_instancias instancias, int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        Sec_ciudad=new JLabel("Sección: CIUDAD");
            Sec_ciudad.setForeground(verde_menu);
            Sec_ciudad.setFont(new Font("Microsoft New Tai Lue",1, 18));
            add(Sec_ciudad);
        
        otros_servi=new JLabel("Nuestros servicios: ACGNS");
            otros_servi.setForeground(verde_menu);
            otros_servi.setFont(new Font("Microsoft New Tai Lue",1, 18));
            add(otros_servi);
        
        progr=new JLabel("PROGRAMADORES");
            progr.setForeground(verde_seleccion);
            progr.setFont(new Font("Microsoft New Tai Lue",1, 18));
            add(progr);
        
        seccion_ciudad = new JTextArea();
            seccion_ciudad.setFont(new Font("Microsoft New Tai Lue",0, 16));
            seccion_ciudad.setEditable(false);
            seccion_ciudad.setOpaque(false);
            seccion_ciudad.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            seccion_ciudad.setVisible(true);
            seccion_ciudad.setLineWrap(true);
            seccion_ciudad.setText("En esta sección encontraras tanto los proyectos proximos de ACGNS hasta las"
            +" maneras de como los usuarios podran contribuir con el mejoramiento de la ciudad de Medellín.");
            add(seccion_ciudad);
            
        programadores = new JTextArea();
            programadores.setFont(new Font("Microsoft New Tai Lue",0, 16));
            programadores.setEditable(false);
            programadores.setOpaque(false);
            programadores.setBackground(Color.white);
            //programadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            programadores.setVisible(true);
            programadores.setLineWrap(true);
            programadores.setText("En ACGNS contamos con un equipo de "+programadores_en_funcion_mercado+" programadores en función de la producción"
            +" de ideas innovadoras al"+"\n"+"mercado, que estan en constante aprendizaje de las nuevas tecnologias y lenguajes"
            +" que puedan ir surgiendo a la"+"\n"+"medida que avanza el tiempo."+"\n"+"Es un equipo especializado en resolver"
            +" problemas desde lo más cotidiano hasta lo más complejo y que cuenta"+"\n"+"con una calidad humana excelente,"
            +" donde impera el respeto, solidaridad, compromiso, disciplina y buen"+"\n"+"discernimiento tanto con el usuaio como con los miembros del equipo."
            +"\n"+"Puedes precindir de sus servicios y ver los diferentes tipos de equipos de trabajo disponibles en la parte del"+"\n"+"submenú"
            +" Contactanos/Nuestros servicios/Como programadores.");
            add(programadores);
            
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
            
        /*imagen_fondo=new JLabel();
                imagen_fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/logo_final_max.png")));
                //imagenes.setBorder(BorderFactory.createLineBorder(Color.black, 1));
                add(imagen_fondo);*/
        
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
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        int x=20;
        Sec_ciudad.setBounds(x,10,150,25);
        seccion_ciudad.setBounds(x, 40, 775, 75);
        
        otros_servi.setBounds(x,125,300,25);
        
        progr.setBounds(x,175,300,25);
        programadores.setBounds(x,215,775,175);
        
        int fx=700,fy=605,fs=50;
        atras.setBounds(fx,fy,35,35);
        
        //imagen_fondo.setBounds(50,50,500,500);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlPantallas(2);
        }
    }
}
