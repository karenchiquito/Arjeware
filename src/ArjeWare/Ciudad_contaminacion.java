package ArjeWare;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
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

public class Ciudad_contaminacion extends JPanel implements ActionListener{
    //Fundamentales-------------------------
    protected int width,height;
    protected Control_instancias pp;
    //Titulos-------------------------------
    private JLabel title,ayudar,comencemos,paso_1;
    //Imagenes-----------------------------
    private JLabel multi_icon,fondo_diccionario;
    //Argumentos-----------------------------
    private JEditorPane introduccion,compromiso,paso_01,co2_definicion;
    //Botones----------------------------
    private JButton adelante,btn_diccionario;
    //Definiciones---------------------------
    private JPanel co2;
    private JLabel titulo_co2;
    //CONTROLES BOOLEANOS y BANDERAS----------------------
    private int bandera_diccionario=0;
    //-----------COORDENADAS------------------
    private final int fx=700,fy=605,fs=50;
    //CHAR---------------------------------
    char comillas='"';
    //Colores-------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    
    public Ciudad_contaminacion(Control_instancias instancias,int width,int hegiht){
        this.width=width;
        this.height=hegiht;
        
        pp=instancias;
        
        co2=new JPanel();
            co2.setBackground(Color.white);
            co2.setBorder(BorderFactory.createLineBorder(verde_menu, 1, true));
            co2.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
            co2.setVisible(false);
            co2.setOpaque(true);
            add(co2);
            
        co2_definicion=new JEditorPane();
            co2_definicion.setOpaque(true);
            co2_definicion.setBackground(Color.white);
            co2_definicion.setBorder(BorderFactory.createLineBorder(verde_menu, 1, true));
            co2_definicion.setContentType("text/html");
            co2_definicion.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\">"
                +"El <b>dióxido de carbono</b> (CO2) es un gas altamente contaminación y tóxico. El CO2 también es el responsable de la tercera parte del <b>efecto invernadero</b> natural. su concentración en la atmósfera puede provocar grandes impactos en el medio ambiente causando "
                +"el <b>aumento de la temperatura</b> en la tierra hasta en 5°C, siendo una de las causas del cambio climatico.</FONT><br>");
            co2_definicion.setEditable(false);
            co2_definicion.setFont(new Font("Microsoft New Tai Lue",0,15));
            co2.add(co2_definicion);
        
        btn_diccionario=new JButton();
            btn_diccionario.setContentAreaFilled(false);
            btn_diccionario.setFocusable(false);
            btn_diccionario.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
            btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario.png")));
            add(btn_diccionario);
            
        fondo_diccionario=new JLabel();
            fondo_diccionario.setVisible(false);
            fondo_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo_diccionario.png")));
            add(fondo_diccionario);
            
        titulo_co2=new JLabel("EMICIÓN DE CO2");
            titulo_co2.setForeground(verde_menu);
            titulo_co2.setFont(new Font("Microsoft New Tai Lui",1,18));
            co2.add(titulo_co2);
        
        title=new JLabel("CONTAMINACIÓN");
            title.setForeground(verde_menu);
            title.setFont(new Font("Microsoft New Tai Lui",1,18));
            add(title);
            
        ayudar=new JLabel("Ayudemos a nuestra ciudad");
            ayudar.setFont(new Font("Microsoft New Tai Lui",1,18));
            ayudar.setForeground(verde_seleccionar);
            add(ayudar);
            
        comencemos=new JLabel("¡COMENCEMOS!");
            comencemos.setFont(new Font("Microsoft New Tai Lui",1,18));
            comencemos.setForeground(verde_seleccionar);
            add(comencemos);
            
        paso_1=new JLabel("Paso 1: Reconoce el lugar.");
            paso_1.setFont(new Font("Microsoft New Tai Lui",1,18));
            paso_1.setForeground(verde_menu);
            add(paso_1);
        
        introduccion=new JEditorPane();
            introduccion.setEditable(false);
            introduccion.setOpaque(false);
            introduccion.setContentType("text/html");
            introduccion.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\">La ciudad de Medellín cuenta con un nivel <b>alto de contaminación</b>\n" +
                "debido a diferentes tipos de causas contaminantes, sea la emición de gases CO2 a la capa de ozono,\n" +
                "el mal cuidado de las zonas verdes ,el <b>uso desmedido de los servicios,</b> el mal uso y abuso de los recursos hídricos, etc... Es un reto bajar los niveles\n"+
                "de contaminación de nuestra ciudad. ACGNS se propuso la <b>tarea de solucionar</b> algunas de estas dificultades\n" +
                "de una manera práctica y eficaz. en la que todos podamos participar y hacer parte del futuro de nuestro pais.</FONT><br>");
            //introduccion.setFont(new Font("Microsoft New Tai Lue",0,15));
            add(introduccion);
            
        compromiso=new JEditorPane();
            compromiso.setEditable(false);
            compromiso.setOpaque(false);
            compromiso.setBackground(verde_menu);
            compromiso.setContentType("text/html");
            compromiso.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\">Medellín un lugar donde se apuesta por la <b>educación y la innovación</b>\n" +
                "formando ciudadanos cultos y respetuosos. En ACGNS pensamos que el <b>avance tecnológico</b> y conocimientos del medio ambiente pueden mejorar nuestro futuro\n" +
                ""+comillas+"Porque la tecnología y el medio ambiente no son tan distantes"+comillas+"-ACGNS</FONT><br>");
            compromiso.setFont(new Font("Microsoft New Tai Lue",0,15));
            add(compromiso);
            
        paso_01=new JEditorPane();
            paso_01.setOpaque(false);
            paso_01.setContentType("text/html");
            paso_01.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\"><b>Busca un lugar en la ciudad</b> que cumpla con algunas de las siguientes condiciones:\n" +
            "<br>-Este rodeado de basura.<br>-Se <b>despirfarré</b> el agua. <br>-Emición alta de <b>CO2.</b><br><b>-Deterioro</b> de el espacio."
            +"<br>-Otros lugares <b>contaminados.</b></FONT><br>");
            paso_01.setEditable(false);
            paso_01.setFont(new Font("Microsoft New Tai Lue",0,15));
            add(paso_01);
            
        
            
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
        btn_diccionario.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/diccionario_seleccion.png")));
                btn_diccionario.setBorder(BorderFactory.createLineBorder(verde_menu, 1, true));
                btn_diccionario.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(bandera_diccionario==1){
                    btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario_seleccion.png")));
                    btn_diccionario.setBorder(BorderFactory.createLineBorder(verde_menu, 1, true));
                    fondo_diccionario.setVisible(true);
                    co2.setVisible(true);
                }else if(bandera_diccionario>1){
                    bandera_diccionario=0;
                    btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario.png")));
                    btn_diccionario.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
                    fondo_diccionario.setVisible(false);
                    co2.setVisible(false);
                }else{
                    btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario.png")));
                    btn_diccionario.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
                    fondo_diccionario.setVisible(false);
                    co2.setVisible(false);
                }
            }
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt){
                bandera_diccionario++;
                if(bandera_diccionario==1){
                    btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario_seleccion.png")));
                    btn_diccionario.setBorder(BorderFactory.createLineBorder(verde_menu, 1, true));
                    fondo_diccionario.setVisible(true);
                    co2.setVisible(true);
                }else if(bandera_diccionario>1){
                    bandera_diccionario=0;
                    btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario.png")));
                    btn_diccionario.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
                    fondo_diccionario.setVisible(false);
                    co2.setVisible(false);
                }
            }
        });
            
  
        multi_icon=new JLabel();
            multi_icon.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Multi_icon.png")));
            add(multi_icon);
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        btn_diccionario.setBounds(730, 5, 30, 30);
        co2.setBounds(100, 100, 300, 350);
        titulo_co2.setBounds(75, 0, 150, 25);
        co2_definicion.setBounds(0,25,300,325);
        
        fondo_diccionario.setBounds(0, 0, 825, 700);
        
        title.setBounds(20, 10, 200, 25);
        
        introduccion.setBounds(20,45,770,125);
        
        ayudar.setBounds(20,175,300,25);
        compromiso.setBounds(20,210,350,200);
        
        comencemos.setBounds(20,410,150,25);
        paso_1.setBounds(20,445,350,25);
        paso_01.setBounds(20,480,350,175);
        
        multi_icon.setBounds(380, 225, 400, 350);
        
        adelante.setBounds(fx+fs+5,fy,35,35);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==adelante){
            pp.getContenedor().controlPantallas_Ciudad(2);
        }
    }
}
