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
public class Ahorro_gas_huella extends JPanel implements ActionListener{
    protected int width, heigth;
    protected Control_instancias pp;
    private JLabel title, title1,imagen,fras;
    private JTextArea info,frase;
    private JButton atras, adelante;
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    private final int fx=700,fy=615,fs=50;
     
    public Ahorro_gas_huella(Control_instancias instancias,int width, int heigth){
        this.width=width;
        this.heigth=heigth;
        pp=instancias;
        
        title=new JLabel("Sección: Aprende más sobre el gas");
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            title.setForeground(verde_menu);
            add(title);
            
        title1=new JLabel("¿Qué es la huella de carbono?");
            title1.setFont(new Font("Microsoft New Tai Lue",1,16));
            title1.setForeground(verde_seleccionar);
            add(title1);
            
        info=new JTextArea();
            info.setOpaque(false);
            info.setLineWrap(true);
            info.setEditable(false);
            info.setFont(new Font("Microsoft New Tai Lue",0,16));
            info.setText("La huella de carbono se conoce como la totalidad de gases de efecto invernadero (GEI)"+"\n"+
            "emitidos por efecto directo o inderecto de un individuo, organizacion, evento o producto."+"\n"+"\n"+
            "Un gas de efecto invernadero es un gas atmosférico que absorbe y emite radiación dentro"+
            "del rango"+"\n"+"infrarrojo. Los principales GEI en la atmósfera terrestre son el vapor de"+
            " agua, el dióxido de carbono,"+"\n"+ "el metano, el óxido de nitrógeno y el ozono."+"\n"+"\n"+
            "Las emisiones de CO2(concentración atmosférica del dióxido de carbono)producidas por"+
            " actividades"+"\n"+ "humanas provienen de la combustion de combustibles fósiles, "+
            "principalmente carbón, petróleo y gas"+"\n"+ "natural."+"\n"+"\n"+"Al usar ACGNS no solo ahorras unos"+
            " cuantos pesos en tu bolsillo sino que también ayudas a preserbar nuestro planeta de una "+
                    "mejor manera, para las generaciones futuras");
            add(info);
            
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
                frase.setText("El gas natural es el más limpio de todos los combustibles fósiles, imagina los otros"
                +"\n"+"tipos de gas el daño que le hacen a nuestro planeta.");
                add(frase);
            
        imagen=new JLabel();
                imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/huella.jpg")));
                add(imagen);
                
                  atras=new JButton();
            atras.setVisible(true);
            atras.addActionListener(this);
            atras.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
            atras.setContentAreaFilled(false);
            atras.setFocusPainted(false);
            atras.setBorderPainted(false);
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
        
    }
    
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        imagen.setBounds(0, 50, 809,heigth-550);
        
        title.setBounds(20, 20, 300, 25);
        title1.setBounds(20, 200, 300, 25);
        info.setBounds(20, 250, 775, 300);
        
        int xf=20;
        int yf=550;
        
        fras.setBounds(xf, yf, 150, 25);
        frase.setBounds(xf, yf+35, 600, 50);
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==atras){
            pp.getContenedor().controlSubpantallas(5);
        }
    }
}