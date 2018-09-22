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
public class Manual_acgns_1 extends JPanel implements ActionListener{
    protected int width,heigth;
    protected Control_instancias pp;
//-------------TITULOS-----------------------------------------
    private JLabel title,necesita,impac,ambien,tecno;
//-------------HUBICACIONES------------------------------------
    private final int xa=20,ya=20,
                      x=20,y=175,s=30,
                      fx=700,fy=615,fs=50;
//-------------ARGUMENTOS--------------------------------------
    private JTextArea educativo,tecnologico,desarrollo,ciudad;
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

    
    public Manual_acgns_1 (Control_instancias instancias,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
        
        title = new JLabel("Nuestro impacto educativo");
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            title.setForeground(verde_menu);
            add(title);
            
        educativo=new JTextArea();
            educativo=new JTextArea();
            educativo.setLineWrap(true);
            educativo.setEditable(false);
            educativo.setOpaque(false);
            educativo.setFont(new Font("Microsoft New Tai Lue",0,16));
            educativo.setText("ACGNS tiene un muy gran impacto en la educación, dado que permite incentivar a los jovenes"
            +" a que cuiden el planeta, conozcan más de el y sepan como al cuidarlo son beneficiados no solo ellos"
            +" sino también las"+"\n"+"generaciones futuras. Ayuda a que tegan más conciencia sobre el alarmante cambio climatico"
            +" y permite"+"\n"+"conocer formas de en comunidad acabar con el. Todo gran cambio comienza por un cambio pequeño en"
            +"\n"+"nuestro hogar.");
            add(educativo);
            
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
        educativo.setBounds(20,60,750,125);
        
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==atras){
            pp.getContenedor().controlPantallas_Manual(2);
        }
        /*if(e.getSource()==adelante){
            pp.getContenedor().controlPantallas_Manual(1);
        }*/
    }
    
}
