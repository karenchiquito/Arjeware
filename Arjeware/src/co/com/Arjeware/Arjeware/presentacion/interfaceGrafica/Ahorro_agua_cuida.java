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

public class Ahorro_agua_cuida extends JPanel implements ActionListener{
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
    
    public Ahorro_agua_cuida(Control_instancias instancias,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
        
        title=new JLabel("¿Qué pasaria si no cuidamos el agua?");
            title.setFont(new Font("Microsoft New Tai Lue",1,18));
            title.setForeground(verde_seleccionar);
            add(title);
            
        area = new JTextArea();
            area.setOpaque(false);
            area.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area.setEditable(false);
            area.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            area.setVisible(true);
            area.setLineWrap(true);
            area.setText("Las consecuencias serían desastrozas para todos los habitantes del planeta, ya que"
            +" es el recurso más vital para la vida humana además, sin este la vida en la tierra no sería posible."
            +" Es común pensar que este recurso abunda en exceso en la tierra y en parte es verdad, pero"
            +" la mayoria que abunda no es apta para el consumo.");
            add(area);
        
        title1=new JLabel("Consejos para cuidar el planeta:");
            title1.setFont(new Font("Microsoft New Tai Lue",1,18));
            title1.setForeground(verde_seleccionar);
            add(title1);
            
        area1 = new JTextArea();
            area1.setOpaque(false);
            area1.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area1.setEditable(false);
            area1.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            area1.setVisible(true);
            area1.setLineWrap(true);
            area1.setText("-Usar la agua que queda en la lavadora después de lavar para limpiar pisos, traperas"
            +" ,trapos, etc..."+"\n"+"\n"+"-Puedes usar las aguas lluvias para lavar los platos, utencílios, zapatos,etc..."
            +"(Proximamente te enseñaremos a crear tu propio filtro para purificar el agua)."+"\n"+"\n"
            +"-Usar los baldes para lavar los autos en lugar de la manguera."+"\n"+"\n"+"-Coloca una o dos "
            +"botellas llenas de agua dentro del compartimento de recarga del inodoro");
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
                frase.setText("Millones de mujeres y niños deben caminar más de 10 kilómetros diarios para"+"\n"+"conseguir agua potable");
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
        area.setBounds(20,55,750,90);
        
        title1.setBounds(20, 150, 600, 25);
        area1.setBounds(20,185,750,300);
        
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
