package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Manual extends JPanel implements ActionListener{
    protected int width,heigth;
    protected Control_instancias pp;
//-------------TITULOS-----------------------------------------
    private JLabel lbl_titulo,lbl_elige;
//BOTONES-----------------------------------------------    
    private JButton btn_arjeware,btn_gasto,btn_ahorra,btn_ciudad
            ,btn_menu,sabias_que;
//-------------ARGUMENTOS--------------------------------------
    private JTextArea nuevo;
    private JEditorPane txt_arjeware,txt_informacion,txt_gasto,txt_ahorra,txt_ciudad,
            txt_menu;
//-------------IMAGENES----------------------------------------    
    private JLabel imagen1,imagen2,imagen3;
    private ImageIcon icon_gasto,icon_gastoSeleccion,icon_ahorra,icon_ahorraSeleccion,
            icon_ciudad,icon_ciudadSeleccion;
    //------------COLORES------------------------------------------  
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    public Manual(Control_instancias instancias,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
         
        icon_ahorra=new ImageIcon(getClass().getResource("/Imagenes/Btn_manualAhorro.png"));
        icon_ahorraSeleccion=new ImageIcon(getClass().getResource("/Imagenes/Btn_manualAhorroSeleccion.png"));
        icon_gasto=new ImageIcon(getClass().getResource("/Imagenes/Btn_manualGastos.png"));
        icon_gastoSeleccion=new ImageIcon(getClass().getResource("/Imagenes/Btn_manualGastosSeleccion.png"));
        icon_ciudad=new ImageIcon(getClass().getResource("/Imagenes/Btn_manualCiudad.png"));
        icon_ciudadSeleccion=new ImageIcon(getClass().getResource("/Imagenes/Btn_manualCiudadSeleccion.png"));
        
        lbl_titulo = new JLabel("Manual de ayuda: ARJEWARE");
            lbl_titulo.setFont(new Font("Microsoft New Tai Lue",1,16));
            lbl_titulo.setForeground(verde_menu);
            add(lbl_titulo);
            
        txt_informacion= new JEditorPane();
            txt_informacion.setEditable(false);
            txt_informacion.setContentType("text/html");
            txt_informacion.setOpaque(false);
            txt_informacion.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#464646\" font size=\"4\">"
                +"¿Eres nuevo por aquí? no te preocupes. En Arjeware te brindamos una guía completa donde "
                +"encontraras toda la información que puedas necesitar desde el funcionamiento hasta como usar "
                +"el conocimiento adquirido.</FONT>");
            this.add(txt_informacion);
            
        nuevo = new JTextArea();
            nuevo.setLineWrap(true);
            nuevo.setText("¿Eres nuevo por aquí? no te preocupes. En Arjeware te "
                +"brindamos una guía completa donde encontraras toda la información"
                +" que puedas necesitar desde el funcionamiento y el porque se creo, "
                +"hasta como usar el conocimiento adquirido. ");
            nuevo.setFont(new Font("Microsoft New Tai Lue",0,16));
            nuevo.setEditable(false);
            add(nuevo);
            
        lbl_elige = new JLabel("¿Sobre que deseas informarte?");
            lbl_elige.setFont(new Font("Microsoft New Tai Lue",1,16));
            lbl_elige.setForeground(verde_seleccion);
            add(lbl_elige);
            
        btn_gasto=new JButton(icon_gasto);
            btn_gasto.addActionListener(this);
            btn_gasto.setBorderPainted(false);
            btn_gasto.setContentAreaFilled(false);
            btn_gasto.setFocusable(false);
            add(btn_gasto);
            
        txt_gasto= new JEditorPane();
            txt_gasto.setEditable(false);
            txt_gasto.setContentType("text/html");
            txt_gasto.setOpaque(false);
            txt_gasto.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#464646\" font size=\"4\">"
                +"<b>GASTOS</b><br>"
                +"Información detallada de la sección gastos.</FONT>");
            this.add(txt_gasto);
            
        btn_ahorra=new JButton(icon_ahorra);
            btn_ahorra.addActionListener(this);
            btn_ahorra.setBorderPainted(false);
            btn_ahorra.setContentAreaFilled(false);
            btn_ahorra.setFocusable(false);
            add(btn_ahorra);
            
        txt_ahorra= new JEditorPane();
            txt_ahorra.setEditable(false);
            txt_ahorra.setContentType("text/html");
            txt_ahorra.setOpaque(false);
            txt_ahorra.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#464646\" font size=\"4\">"
                +"<b>AHORRA</b><br>"
                +"Información detallada de la sección ahorrar.</FONT>");
            this.add(txt_ahorra);
            
        btn_ciudad=new JButton(icon_ciudad);
            btn_ciudad.addActionListener(this);
            btn_ciudad.setBorderPainted(false);
            btn_ciudad.setContentAreaFilled(false);
            btn_ciudad.setFocusable(false);
            add(btn_ciudad);
            
        txt_ciudad= new JEditorPane();
            txt_ciudad.setEditable(false);
            txt_ciudad.setContentType("text/html");
            txt_ciudad.setOpaque(false);
            txt_ciudad.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#464646\" font size=\"4\">"
                +"<b>CIUDAD</b><br>"
                +"Información detallada de la sección ciudad.</FONT>");
            this.add(txt_ciudad);
            
        btn_arjeware=new JButton(icon_gasto);
            btn_arjeware.addActionListener(this);
            btn_arjeware.setBorderPainted(false);
            btn_arjeware.setContentAreaFilled(false);
            btn_arjeware.setFocusable(false);
            add(btn_arjeware);
            
        txt_arjeware= new JEditorPane();
            txt_arjeware.setEditable(false);
            txt_arjeware.setContentType("text/html");
            txt_arjeware.setOpaque(false);
            txt_arjeware.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#464646\" font size=\"4\">"
                +"<b>ARJEWARE</b><br>"
                +"Información detallada de Arjeware,<br> sus servicios e impactos.</FONT>");
            this.add(txt_arjeware);
            
        btn_menu=new JButton(icon_gasto);
            btn_menu.addActionListener(this);
            btn_menu.setBorderPainted(false);
            btn_menu.setContentAreaFilled(false);
            btn_menu.setFocusable(false);
            add(btn_menu);
            
        txt_menu= new JEditorPane();
            txt_menu.setEditable(false);
            txt_menu.setContentType("text/html");
            txt_menu.setOpaque(false);
            txt_menu.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#464646\" font size=\"4\">"
                +"<b>MENÚ PRINCIPAL</b><br>"
                +"Información detallada del menú principal.</FONT>");
            this.add(txt_menu);
                
        btn_ahorra.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_ahorra.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                btn_ahorra.setIcon(icon_ahorraSeleccion);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                      btn_ahorra.setIcon(icon_ahorra);          
            }
        });
        
        btn_gasto.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_gasto.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                btn_gasto.setIcon(icon_gastoSeleccion);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                      btn_gasto.setIcon(icon_gasto);          
            }
        });
        
        btn_ciudad.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_ciudad.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                btn_ciudad.setIcon(icon_ciudadSeleccion);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                      btn_ciudad.setIcon(icon_ciudad);          
            }
        });
           
        imagen1=new JLabel();
            imagen1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/fondo_servicios.png")));
            add(imagen1);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        int xa=20,ya=20,
             ye=175,s=30,
             fx=700,fy=615,fs=50;
        
        lbl_titulo.setBounds(xa,ya,300,25);
        txt_informacion.setBounds(xa,ya+35,750,50);
        
        lbl_elige.setBounds(xa,ya+35*2,750,75);
        
        int x=40, x2=430;
        int y=180;
        
        btn_gasto.setBounds(x, y, 103, 98);
        txt_gasto.setBounds(x+106,y,250,98);
        
        btn_ahorra.setBounds(x, y+120, 103, 98);
        txt_ahorra.setBounds(x+106,y+120,250,98);
        
        btn_ciudad.setBounds(x, y+120*2, 103, 98);
        txt_ciudad.setBounds(x+106,y+120*2,250,98);
        
        btn_arjeware.setBounds(x+x2, y, 103, 98);
        txt_arjeware.setBounds(x+x2+106,y,250,98);
        
        btn_menu.setBounds(x+x2, y+120, 103, 98);
        txt_menu.setBounds(x+x2+106,y+120,250,98);
        
        imagen1.setBounds(175,75,700,600);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_arjeware){
            pp.getContenedor().controlPantallas_Manual(2);
        }
        if(e.getSource()==btn_menu){
            pp.getContenedor().controlPantallas_Manual(0);
        }
        
    }

    
}
