package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Tienda extends JPanel implements ActionListener{
    //Fundamentales---------------------------
    protected int width, height;
    protected Control_instancias pp;
    //PANEL CONTENEDOR------------------------
    private JPanel tienda;
    //CONTENIDO DEL PANEL---------------------
    private JPanel producto_1;
    private JEditorPane produc_1;
    //IMAGENES-------------------
    private JLabel img_1;
    //JTextFields---------------------------
    private JTextField buscador;
    //Tesxto areas
    String busqueda_string="BUSQUEDA";
    //Banderas-----------------------------
    int bandera_buscador=0;
    //Colores-------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    
    public Tienda(Control_instancias instancias, int width, int height){
        this.width=width;
        this.height=height;
        pp = instancias;

        buscador=new JTextField();
            buscador.setText(busqueda_string);
            buscador.setHorizontalAlignment(SwingConstants.CENTER);
            buscador.setFont(new Font("Microsoft New Tai Lue",1,15));
            buscador.setForeground(new Color(200,200,200));
            buscador.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, verde_seleccionar));
            this.add(buscador);
        
        produc_1=new JEditorPane();
            produc_1.setContentType("text/html");
            produc_1.setOpaque(false);
            produc_1.setEditable(false);
            produc_1.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\"><b>Producto:</b> Solar Tracked<br>"
                +"<b>Descripción:</b> Panel solar que busca en todo momento la energía solar para mantener cargada una fuente de poder o bateria.<br>"
                    + "<b>Precio:</b> $60.000 COP</FONT><br>");
        
        
        img_1=new JLabel("hola");
            img_1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Paneles_1.png")));
        
            //Paneles tipo 1
        producto_1=new JPanel();
            producto_1.setBackground(verde_menu);
            producto_1.add(img_1);
            producto_1.add(produc_1);
        
        tienda=new JPanel();
            tienda.setBackground(Color.white);
            tienda.setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, verde_menu));
            tienda.add(producto_1);
            this.add(tienda);
            
        buscador.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                if(bandera_buscador==0){
                    busqueda_string="";
                    buscador.setText(busqueda_string);
                    buscador.setHorizontalAlignment(SwingConstants.LEFT);
                    buscador.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, verde_seleccionar));
                    buscador.setForeground(new Color(50,50,50));
                }
                if(bandera_buscador==1){
                    busqueda_string=busqueda_string;
                    buscador.setText(busqueda_string);
                    buscador.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, verde_seleccionar));
                    buscador.setForeground(new Color(50,50,50));
                    bandera_buscador++;
                }
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(bandera_buscador==0){
                    buscador.setHorizontalAlignment(SwingConstants.CENTER);
                    busqueda_string="BUSQUEDA";
                    buscador.setText(busqueda_string);
                    buscador.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, verde_seleccionar));
                    buscador.setForeground(new Color(200,200,200));
                }
                if(bandera_buscador==1){
                    buscador.setHorizontalAlignment(SwingConstants.LEFT);
                    busqueda_string=busqueda_string;
                    //buscador.setText(busqueda_string);
                    buscador.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, verde_seleccionar));
                    buscador.setForeground(new Color(50,50,50));
                    bandera_buscador++;
                }
            }
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt){
                bandera_buscador++;
                if(bandera_buscador>=2){
                    busqueda_string=busqueda_string;
                }
            }
        });
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        buscador.setBounds(550, 75, 250, 30);
        
        tienda.setBounds(20, 200, 780, 430);
            producto_1.setBounds(20,20,740,200);
                img_1.setBounds(10, 10, 270, 185);
                produc_1.setBounds(300, 5, 350, 150);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
