package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Colores;
import java.awt.Color;
import java.awt.Cursor;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
/**
 *
 * @author wmuno
 */
public class Servicios extends JPanel implements ActionListener{
    protected int width, heigth;
    private JLabel title, inf,lbl_frase,ag,ahorrar,imagen_fondo;
    public JComboBox<?> mes;
    private JTextArea ahorra;
    private JEditorPane txt_frase;
    protected Control_instancias pp;
    //ARGUMENTOS-------------------------------
    private JButton gasto,ahorro,ciudad,arjeware;
    //COLORES----------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    //-------------HUBICACIONES------------------------------------
    private final int fx=700,fy=605,fs=50;
    //----------------------
    public String frasess= new A_Banderas_publicas().setFrase();
    //Flechas--------------------------------------------
    private JButton atras,adelante;
    
    public Servicios(int width, int heigh, Control_instancias instancia) {
        this.width = width;
        this.heigth = heigh;
        this.pp = instancia;
        
        ag=new JLabel("Sección: GASTOS");
            ag.setForeground(verde_menu);
            ag.setFont(new Font("Microsoft New Tai Lue",1, 18));
            //add(ag);
            
        inf=new JLabel("Información de los servicios que te brinda Arjeware.");
            inf.setForeground(verde_seleccion);
            inf.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            add(inf);
            
        gasto=new JButton();
            gasto.addActionListener(this);
            gasto.setBorderPainted(false);
            gasto.setFocusPainted(false);
            gasto.setContentAreaFilled(false);
            gasto.setFont(new Font("Microsoft New Tai Lue",0, 16));
            gasto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_gasto.png")));
            add(gasto);
        
        ahorro=new JButton();
            ahorro.addActionListener(this);
            ahorro.setBorderPainted(false);
            ahorro.setFocusPainted(false);
            ahorro.setContentAreaFilled(false);
            ahorro.setFont(new Font("Microsoft New Tai Lue",0, 16));
            ahorro.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_ahorro.png")));
            add(ahorro);
            
        ciudad=new JButton();
            ciudad.addActionListener(this);
            ciudad.setBorderPainted(false);
            ciudad.setFocusPainted(false);
            ciudad.setContentAreaFilled(false);
            ciudad.setFont(new Font("Microsoft New Tai Lue",0, 16));
            ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_ciudad.png")));
            add(ciudad);
            
        arjeware=new JButton();
            arjeware.addActionListener(this);
            arjeware.setBorderPainted(false);
            arjeware.setFocusPainted(false);
            arjeware.setContentAreaFilled(false);
            arjeware.setFont(new Font("Microsoft New Tai Lue",0, 16));
            arjeware.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_arjeware.png")));
            add(arjeware);
        
        /*ahorra=new JTextArea();
            ahorra.setFont(new Font("Microsoft New Tai Lue",0, 16));
            ahorra.setLineWrap(true);
            ahorra.setOpaque(false);
            ahorra.setEditable(false);
            ahorra.setText("En la sección ahorrar encontraras información concreta y practica de cada servicio;"+
            " sobre su"+"\n"+"definición, que es, como cuidarlo, como ahorrarlo en el hogar y como nos vemos afectados al usarlo "+"\n"+
            "indebidamente."+"\n"+"\n"+"Todo en pos del bien común tanto para la economía de tú hogar como para fomentar el"
            +"\n"+"consumo minimo de estos recursos y así reducir nuestro impacto negativo en el medioambiente.");
            add(ahorra);  */  
            
        lbl_frase=new JLabel("Sabías que:");
            lbl_frase.setFont(new Font("Microsoft New Tai Lue",1, 18));
            lbl_frase.setForeground(verde_menu);
            add(lbl_frase);
            
        txt_frase=new JEditorPane();
            txt_frase.setEditable(false);
            txt_frase.setContentType("text/html");
            txt_frase.setBackground(Colores.verde_sabias);
            txt_frase.setOpaque(false);
            txt_frase.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#347A34\" font size=\"4\">"+frasess+"</FONT>");
            add(txt_frase);

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
                
        imagen_fondo=new JLabel();
                imagen_fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/fondo_servicios.png")));
                //add(imagen_fondo);
                
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
        
        gasto.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                gasto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_gasto_seleccion.png")));
                gasto.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                gasto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_gasto.png")));
            }
        });
        ahorro.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                ahorro.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_ahorro_seleccion.png")));
                ahorro.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                ahorro.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_ahorro.png")));
            }
        });
        ciudad.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_ciudad_seleccion.png")));
                ciudad.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_ciudad.png")));
            }
        });
        arjeware.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                arjeware.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_arjeware_seleccion.png")));
                arjeware.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                arjeware.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Cuadro_texto_seccion_arjeware.png")));
            }
        });
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width, heigth);
        
        //imagen_fondo.setBounds(160,20,700,600);
        inf.setBounds(20,20,650,25);
        
        int x=20;
        int y=65;
        //ag.setBounds(x, y, 150, 25);
        gasto.setBounds(x+40,y,290,242);
        ahorro.setBounds(x+278+175,y,290,242);
        ciudad.setBounds(x+40, y+285, 290, 242);
        arjeware.setBounds(x+278+175,y+285,290,242);
        
        lbl_frase.setBounds(10, 600, 150, 25);
            txt_frase.setBounds(10, 600+25, 700, 50);
        
        adelante.setBounds(fx+fs+5,fy,35,35);
 
      }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==adelante){
            pp.getContenedor().controlPantallas_Servicios(0);
        }if(e.getSource()==gasto){
            pp.getContenedor().controlPantallas_gastos(0);
        }if(e.getSource()==ahorro){
            pp.getContenedor().controlSubpantallas(3);
        }if(e.getSource()==ciudad){
            pp.getContenedor().controlPantallas(7);
        }
        
        
    }
    
}
