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
public class Manual_acgns extends JPanel implements ActionListener{
    protected int width,heigth;
    protected Control_instancias pp;
//-------------TITULOS-----------------------------------------
    private JLabel title,necesita,impac,ambien,tecno;
//-------------HUBICACIONES------------------------------------
    private final int xa=20,ya=20,
                      x=20,y=175,s=30,
                      fx=700,fy=615,fs=50;
//-------------ARGUMENTOS--------------------------------------
    private JTextArea nuevo,impacto,ambiental,educativo,tecnologico,desarrollo,ciudad;
//-------------IMAGENES----------------------------------------    
    private JLabel imagen1,imagen2,imagen3;
//------------COLORES------------------------------------------  
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
//------------BOTONES-------------------------------------------
    private JButton menu,seccion_ahorro,seccion_servicios,ACGNS,sabias_que,
            atras,adelante;
//--------------------------------------------------------------

    
    public Manual_acgns (Control_instancias instancias,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
        
        title = new JLabel("Manual de ayuda: Información de la aplicación");
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            title.setForeground(verde_menu);
            add(title);
            
        nuevo=new JTextArea();
            nuevo=new JTextArea();
            nuevo.setLineWrap(true);
            nuevo.setEditable(false);
            nuevo.setOpaque(false);
            nuevo.setFont(new Font("Microsoft New Tai Lue",0,16));
            nuevo.setText("ACGNS fue hecha con el fin y propósito de ayudar a las personas consumidoras de los "
            +"servicios públicos a"+"\n"+"tener un verdadero conocimiento de lo que se les esta cobrando en las facturas "
            +"que llegan cada mes al"+"\n"+"hogar, y por el camino ayudar a económizar en el consumo de estos servicios "
            +"de una manera"+"\n"+"práctica, entendible y de comodo manejo.");
            add(nuevo);
            
        impac = new JLabel("Nuestro impacto económico");
            impac.setFont(new Font("Microsoft New Tai Lue",1,16));
            impac.setForeground(verde_menu);
            add(impac);
            
        impacto=new JTextArea();
            impacto=new JTextArea();
            impacto.setLineWrap(true);
            impacto.setEditable(false);
            impacto.setOpaque(false);
            impacto.setFont(new Font("Microsoft New Tai Lue",0,16));
            impacto.setText("ACGNS tiene un enorme impacto económico a nivel del hogar y empresarial, ya que permite"
            +" tener un"+"\n"+"conocimiento completo del consumo de los servicios permitiendote controlar tu gasto desmedido de los"+"\n"+"mismos"
            +" evitando que te cobren por un exceso e incluso puedes reducir tu gasto del servicio para así"+"\n"+"ahorrarte unos cuantos"
            +" pesos más, permitiendote invertirlos en tus proyectos.");
            add(impacto);
            
        ambien = new JLabel("Nuestro impacto ambiental");
            ambien.setFont(new Font("Microsoft New Tai Lue",1,16));
            ambien.setForeground(verde_menu);
            add(ambien);
        
        ambiental=new JTextArea();
            ambiental=new JTextArea();
            ambiental.setLineWrap(true);
            ambiental.setEditable(false);
            ambiental.setOpaque(false);
            ambiental.setFont(new Font("Microsoft New Tai Lue",0,16));
            ambiental.setText("ACGNS vio más allá. Al tener un conocimiento completo de nuestro gasto de servicios en el hogar"
            +" solo"+"\n"+"faltaba aprender a reducir ese consumo y no solo eso, de paso vimos la solución a otro problema que tiene"+"\n"+"la ciudad"
            +" de Medellín que es la contaminación que hay. Al saber esto buscamos alternativas para reducir"+"\n"+"nuestro "
            +"gasto económico en los servicios que fueran completamente ecologícas y que favorecieran al"+"\n"+"cuidado del "
            +"medio ambiente. Solucinando de paso dos problemas con los que lidia la ciudad.");
            add(ambiental);
            
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
        
        title.setBounds(20, 20, 750, 25);
        nuevo.setBounds(20,75,750,100);
        
        impac.setBounds(20,185,750,25);
        impacto.setBounds(20,210,750,100);
        
        ambien.setBounds(20,320,750,25);
        ambiental.setBounds(20,345,750,125);
        
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==atras){
            pp.getContenedor().controlSubpantallas(8);
        }
        if(e.getSource()==adelante){
            pp.getContenedor().controlPantallas_Manual(3);
        }
    }
    
}
