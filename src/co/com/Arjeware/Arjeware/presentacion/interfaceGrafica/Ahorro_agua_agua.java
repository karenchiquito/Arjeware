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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Sebas
 */
public class Ahorro_agua_agua extends JPanel implements ActionListener{
    protected int width,heigth;
    protected Control_instancias pp;
    private JLabel title,ag,imagen,imagen_gris,imagen_verde,title1,title2,title3;
    private JTextArea area,area1,area_grises,area3;
    private JButton atras;
    
    //-------------HUBICACIONES------------------------------------
    private final int fx=700,fy=605,fs=50;
//-------------ARGUMENTOS--------------------------------------
    
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    
    public Ahorro_agua_agua(Control_instancias instancias,int width,int heigth){
        try{
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
        
        title = new JLabel("En este lugar encontras informacón general del agua:");
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            title.setForeground(verde_seleccion);
            add(title);
        
        ag=new JLabel("¿Qué es el agua?");
            ag.setFont(new Font("Microsoft New Tai Lue",1,16));
            ag.setForeground(verde_seleccion);
            add(ag);
            
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
            
        title1 = new JLabel("Aguas verdes");
            title1.setFont(new Font("Microsoft New Tai Lue",1,16));
            title1.setForeground(verde_seleccion);
            add(title1);
            
         area1 = new JTextArea();
            area1.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area1.setEditable(false);
            area1.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            area1.setVisible(true);
            area1.setLineWrap(true);
            area1.setText("Es el agua evaporada y transpirada desde los recursos globales de agua verde "
            +"principalmente agua de lluvia almacenada en el suelo agrícola en forma de humedad durante "
            +"el periodo de crecimiento de los cultivos");
            add(area1);
            
        title2= new JLabel("Aguas grises");
            title2.setFont(new Font("Microsoft New Tai Lue",1,16));
            title2.setForeground(verde_seleccion);
            add(title2);
          
        area_grises = new JTextArea();
            area_grises.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area_grises.setEditable(false);
            area_grises.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            area_grises.setVisible(true);
            area_grises.setLineWrap(true);
            area_grises.setText("Son las aguas que han sido contaminadas por el hombre y no tiene potabilidad, "
            +"es decir, que no es apta para"+"\n"+"el consumo humano,pero tienen algunos tratamientos, suelen ser también las aguas de los alcantarillados."
            +"\n"+"En un contexto familiar, las aguas grises son las aguas sobrantes de baños, regaderas, lavabos y lavadoras.");
            add(area_grises);
            
        title3 = new JLabel("Aguas azules");
            title3.setFont(new Font("Microsoft New Tai Lue",1,16));
            title3.setForeground(verde_seleccion);
            add(title3);
            
        area3 = new JTextArea();
            area3.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area3.setEditable(false);
            area3.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            area3.setVisible(true);
            area3.setLineWrap(true);
            area3.setText("Son las aguas más escazas en el planeta, y son aptas para el consumo humano ya que solo el 0.007% del agua existente en la Tierra es potable."
            +"\n"+"Estas aguas deben de ser las que más cuidemos además de las verdes.");
            add(area3);
            
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
            
        imagen=new JLabel();
            imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/agua_agua.png")));
            add(imagen);
            
        imagen_gris=new JLabel();
            imagen_gris.setIcon(new ImageIcon(getClass().getResource("/Imagenes/agua_agua_gris.png")));
            add(imagen_gris);
            
        imagen_verde=new JLabel();
            imagen_verde.setIcon(new ImageIcon(getClass().getResource("/Imagenes/agua_agua_verde.png")));
            add(imagen_verde);
            
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
        }catch(Exception e){
            System.out.println("Error en: "+e);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        title.setBounds(20,20,700,25);
        imagen.setBounds(337, 50, 150,150);
        imagen_gris.setBounds(337-150-50, 50, 150,150);
        imagen_verde.setBounds(337+150+50, 50, 150,150);
        
        ag.setBounds(20, 225, 250, 25);
        area.setBounds(20,250,750, 75);
        
        title1.setBounds(20, 250+75, 750, 25);
        area1.setBounds(20, 250+75+25, 750, 50);
        
        title2.setBounds(20, 400, 750, 25);
        area_grises.setBounds(20, 430, 750, 70);
        
        title3.setBounds(20, 515, 750, 25);
        area3.setBounds(20, 550, 600, 75);

        atras.setBounds(fx,fy,35,35);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlSubpantallas(7);
        }
    }
}
