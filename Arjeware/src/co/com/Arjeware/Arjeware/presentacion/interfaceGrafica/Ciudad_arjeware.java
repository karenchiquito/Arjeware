package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Control_instancias;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Sebas
 */
public class Ciudad_arjeware extends JPanel implements ActionListener{
    //Fundamentales----------------------
    protected int width,height;
    protected Control_instancias pp;
    //Titulos-------------------------------
    private JLabel title;
    //Argumentos-----------------------------
    private JEditorPane arje_ware,conciencia;
    //BOTONES-------------------------------
    private JButton informacion,servicios,tienda;
    //FONDO-----------------------------------
    private JLabel fondo_arjeware;
    //FLECHAS--------------------------------
    private JButton atras;
    //Sabias que?--------------------------
    private JLabel fras;
    private JTextArea frase;
    //Colores-------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    public Ciudad_arjeware(Control_instancias instancias,int width,int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        title=new JLabel("ARJEWARE");
            title.setForeground(verde_menu);
            title.setFont(new Font("Microsoft New Tai Lui",1,45));
            this.add(title);
            
        arje_ware = new JEditorPane();
            arje_ware.setEditable(false);
            arje_ware.setForeground(verde_menu);
            arje_ware.setBackground(verde_menu);
            arje_ware.setBorder(BorderFactory.createLineBorder(verde_seleccionar, 2, true));
            arje_ware.setOpaque(true);
            arje_ware.setContentType("text/html");
            arje_ware.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\">En <b>ArjeWare</b> creemos que el avance teconológico puede"
                    + " ir en conjunto con el cuidado del medio ambiente, por eso hemos tomado la iniciativa de crear una aplicación que le permita a el usuario no solo conocer su <b>gasto de servicios</b>"
                    + " y gestionarlo sino también maneras de como economizar estos recursos, pudiendo <b>ahorrar</b> un poco de sus ingresos para tus proyectos y el día a día; y de paso"
                    + " ayudando al cuidado del medio ambiente.</FONT><br>");
            arje_ware.setFont(new Font("Microsoft New Tai Lui",0,15));
            this.add(arje_ware);
            
        conciencia = new JEditorPane();
            conciencia.setEditable(false);
            conciencia.setBackground(new Color(150,225,150));
            conciencia.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
            conciencia.setOpaque(true);
            conciencia.setContentType("text/html");
            conciencia.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"000000\" font size=\"5\">En los ultimos años el <b>cambio climatico,</b> y sus repercusiones a largo y corto plazo para los seres vivos"
                    + " y el medio ambiente han dejado grandes efectos negativos que nos afectan a todos, desde aumento en la temperatura hasta de 5°C, "
                    + "la desaparición de varias especies, entre otros efectos negativos.<br>¿Quién es el responsable del cambio climatico?<br>En una gran parte las empresas "
                    + "cuyo fin es solo lucrativo y <b>no les importa dañar el ecosistema</b> para alcanzar sus metas, personas que no tienen "
                    + "suficiente información o conciencia de como nos afecta el contaminar nuestra ciudad.</FONT><br>");
            conciencia.setFont(new Font("Microsoft New Tai Lui",0,15));
            this.add(conciencia);
            
        informacion=new JButton();
            informacion.setToolTipText("Información de ArjeWare");
            informacion.addActionListener(this);
            informacion.setContentAreaFilled(false);
            informacion.setFocusable(false);
            informacion.setFocusPainted(false);
            informacion.setBorderPainted(false);
            informacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Informacion.png")));
            this.add(informacion);
            
        servicios=new JButton();
            servicios.setToolTipText("Servicio de programación de ArjeWare");
            servicios.addActionListener(this);
            servicios.setContentAreaFilled(false);
            servicios.setFocusable(false);
            servicios.setFocusPainted(false);
            servicios.setBorderPainted(false);
            servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Chip_arjeware.png")));
            this.add(servicios);
            
        tienda=new JButton();
            tienda.setToolTipText("Tienda de ArjeWare");
            tienda.addActionListener(this);
            tienda.setContentAreaFilled(false);
            tienda.setFocusable(false);
            tienda.setFocusPainted(false);
            tienda.setBorderPainted(false);
            tienda.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Tienda_arjeware.png")));
            this.add(tienda);
        
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
            
        informacion.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                informacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Informacion_seleccion.png")));
                informacion.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                informacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Informacion.png")));
            }
        });
        servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Chip_arjeware_seleccion.png")));
                servicios.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Chip_arjeware.png")));
            }
        });
        tienda.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                tienda.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Tienda_arjeware_seleccion.png")));
                tienda.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                tienda.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Tienda_arjeware.png")));
            }
        });
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
            
        fras=new JLabel("Sabías que:");
            fras.setFont(new Font("Microsoft New Tai Lue",1, 18));
            fras.setForeground(verde_menu);
            this.add(fras);
                
        frase=new JTextArea();
            frase.setFont(new Font("Microsoft New Tai Lue",0, 16));
            frase.setForeground(verde_seleccionar);
            frase.setLineWrap(true);
            frase.setEditable(false);
            frase.setBackground(verde_sabias);
            frase.setText("Más de 1100 millones de personas en el mundo carecen de acceso directo a fuentes"
                + "\n"+"de agua potable.");
            this.add(frase);
                
        fondo_arjeware=new JLabel();
            fondo_arjeware.setVisible(false);
            fondo_arjeware.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo_ciudad_arjeware_negro.png")));
            this.add(fondo_arjeware);        
    }
    @Override
    public void paintComponent(Graphics  g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        fondo_arjeware.setBounds(0,0,825,700);
        
        conciencia.setBounds(30, 20, 375, 365);
        
        title.setBounds(486, 30, 300, 50);
        arje_ware.setBounds(450, 100, 322, 293);
        
        int y_Bt=445;
        int x_bt=451;
        
        informacion.setBounds(x_bt, y_Bt, 100, 100);
        servicios.setBounds(x_bt+110, y_Bt, 100, 100);
        tienda.setBounds(x_bt+110+110, y_Bt, 100, 100);
        
        final int fx=700,fy=605;
        atras.setBounds(fx,fy,35,35);
        
        int xf=20;
        int yf=550;
        
        fras.setBounds(xf, yf, 150, 25);
        frase.setBounds(xf, yf+35, 600, 50);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==tienda){
            pp.getContenedor().controlPantallas_Servicios(4);
        }
        if(e.getSource()==atras){
            pp.getContenedor().controlPantallas(7);
        }
        if(e.getSource()==servicios){
            pp.getContenedor().controlPantallas_topMenu(1);
        }
    }
}
