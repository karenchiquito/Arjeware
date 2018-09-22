/*
Jhon Sebastian Agudelo Sierra
Leidy Johana Pamplona Cortez
Juan Diego Sierra Escobar
 */
package ArjeWare;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Sebas
 */
public class Ciudad_contaminacion_01 extends JPanel implements ActionListener{
    //Fundamentales-----------------
    protected int width,height;
    protected Control_instancias pp;
    //titulos-----------------------
    private JLabel paso_2,paso_3,paso_4,paso_5,paso_6;
    //Imagenes------------------------------
    private JLabel ps2_foto,anotar,cel,pc;
    //Argumentos-----------------------------
    private JEditorPane paso_02,paso_03,paso_04,paso_05,paso_06;
    //BOTONES--------------------------------
    private JButton diccionario;
    //FLECHAS-------------------------------
    private JButton atras,adelante;
    //COORDENADAS---------------------------
    private final int fx=700,fy=605,fs=50;
    //Colores-------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    public Color negro_texto = new Color(70,70,70);
    //ENSAYOS-----------------
    private JScrollPane scroll;
    
    public Ciudad_contaminacion_01(Control_instancias instancias,int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        scroll = new JScrollPane();
            scroll.add(this);
            
        diccionario=new JButton();
            diccionario.setContentAreaFilled(false);
            diccionario.setFocusable(false);
            diccionario.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
            diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario.png")));
            add(diccionario);
        
        paso_2=new JLabel("Paso 2: Tomale una foto y anota su dirección.");
            paso_2.setForeground(verde_menu);
            paso_2.setFont(new Font("Microsoft New Tai Lui",1,18));
            add(paso_2);
            
        paso_3=new JLabel("Paso 3: Accede a ACGNS.");
            paso_3.setForeground(verde_menu);
            paso_3.setFont(new Font("Microsoft New Tai Lui",1,18));
            add(paso_3);
            
        paso_4=new JLabel("Paso 4: Sube la foto.");
            paso_4.setForeground(verde_menu);
            paso_4.setFont(new Font("Microsoft New Tai Lui",1,18));
            add(paso_4);
            
        paso_5=new JLabel("Paso 5: Toma conciencia.");
            paso_5.setForeground(verde_menu);
            paso_5.setFont(new Font("Microsoft New Tai Lui",1,18));
            add(paso_5);
            
        paso_6=new JLabel("Paso 6: Actua y beneficiate.");
            paso_6.setForeground(verde_menu);
            paso_6.setFont(new Font("Microsoft New Tai Lui",1,18));
            add(paso_6);
        
        paso_02 = new JEditorPane();
            paso_02.setEditable(false);
            paso_02.setOpaque(false);
            paso_02.setContentType("text/html");
            paso_02.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\">Utiliza tu <b>camara o celular</b> para tomarle una foto al \n" +
            "lugar afectado por la contaminación, y que no se te olvide <b>anotar la dirección</b> del lugar.</FONT><br>");
            paso_02.setFont(new Font("Microsoft New Tai Lui",0,15));
            add(paso_02);
            
        paso_03 = new JEditorPane();
            paso_03.setEditable(false);
            paso_03.setOpaque(false);
            paso_03.setContentType("text/html");
            paso_03.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" dont size=\"5\">Accede a la <b>aplicación de ACGNS</b> sea en dispositivo móvil o en aplicación de escritorio. \n" +
                "Después debes ir a la esquina inferior derecha, donde <b>encontraras el submenú</b>, y le daremos en la opción de <b>varios</b>, \n" +
                "después en mejorar ciudad y <b>finalmente en foto.</b></FONT><br>");
            add(paso_03);
            
        paso_04 = new JEditorPane();
            paso_04.setEditable(false);
            paso_04.setOpaque(false);
            paso_04.setContentType("text/html");
            paso_04.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" dont size=\"5\">Después de acceder a nuestra sección, mejorar ciudad <b>sube la foto del lugar con su respectiva dirección</b>, \n" +
                "saldrá una ventana emergente que te preguntara <b>si tu mismo te harás cargo del lugar</b> o deseas que ACGNS se encarge.</FONT><br>");
            add(paso_04);
            
        paso_05=new JEditorPane();
            paso_05.setEditable(false);
            paso_05.setOpaque(false);
            paso_05.setContentType("text/html");
            paso_05.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\">Después de elegir una de las opciones ACGNS te enviara a una sección en la que encontraras varios <b>TIPS</b>\n" +
                "con los que podras aprender como <b>preservar y cuidar el medio ambiente</b> en nuestra ciudad y disminuir el índice alto de\n" +
                "contaminación que hay.</FONT><br>");
            paso_05.setFont(new Font("Microsoft New Tai Lue",0,15));
            add(paso_05);
            
        paso_06=new JEditorPane();
            paso_06.setEditable(false);
            paso_06.setOpaque(false);
            paso_06.setContentType("text/html");
            paso_06.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\">Al decidir contribuir con el cuidado del medio ambiente en nuestra ciudad, ACGNS te recompenza de\n" +
                "diversas formas tales como:<br>-Descuento en nuestros <b>servicios de programadores.</b>\n" +
                "<br>-Descuentos hasta del 20% en nuestra tienda.</FONT><br>");
            paso_06.setFont(new Font("Microsoft New Tai Lue",0,15));
            add(paso_06);
        
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
        diccionario.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/diccionario_seleccion.png")));
                diccionario.setBorder(BorderFactory.createLineBorder(verde_menu, 1, true));
                diccionario.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario.png")));
                diccionario.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
            }
        });
        
        ps2_foto=new JLabel();
            ps2_foto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Paso_02_foto.png")));
            add(ps2_foto);
            
        anotar=new JLabel();
            anotar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Anotar.png")));
            add(anotar);
            
        pc=new JLabel();
            pc.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Paso_03_pc.png")));
            add(pc);
            
        cel=new JLabel();
            cel.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Paso_03_cel.png")));
            add(cel);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        diccionario.setBounds(770, 5, 30, 30);
        
        paso_2.setBounds(20,10,400,25);
        paso_02.setBounds(20,40,775,50);
        anotar.setBounds(50,115,150,150);
        ps2_foto.setBounds(50+200,115,150,150);
        
        paso_3.setBounds(415,85,350,25);
        paso_03.setBounds(415,115,390,160);
        
        pc.setBounds(485,270,150,150);
        cel.setBounds(685,270,150,150);
        
        paso_4.setBounds(20, 285, 300, 25);
        paso_04.setBounds(20, 310, 450, 120);
        
        paso_5.setBounds(20,440,300,25);
        paso_05.setBounds(20,465,775,75);
        
        paso_6.setBounds(20,540,300,25);
        paso_06.setBounds(20,565,675,100);
        
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlPantallas_Ciudad(1);
        }
    }
}
