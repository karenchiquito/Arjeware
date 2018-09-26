package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.entity.Entidades.Dao;
import co.com.Arjeware.Arjeware.entity.Entidades.Sesion;
import co.com.Arjeware.Arjeware.entity.Entidades.Usuarios;
import co.com.Arjeware.Arjeware.presentacion.metodos.facturacion.GenerarWord;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JPasswordFieldHint;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JTextFieldHint;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.speech.Central;
//import javax.speech.EngineModeDesc;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Inicio_Sesion extends JPanel implements ActionListener,KeyListener{
    protected int width,heigth;
    protected Control_instancias pp;
    //LABELS(TITULOS)----------------------
    private JLabel lbl_cedula, lbl_clave, logo,inf;
    private JLabel lbl_asterisco0,lbl_asterisco1;
    
    //TEXTFIELD Y PASSWORDFIELD(CAJAS DE TEXTO)-----------------
    private JTextFieldHint txt_cedula;
    private JPasswordFieldHint txt_contraseña;
    
    //----------------------------------------------------------
    private JButton iniciar,registrarse,btn_recuperarClave;
    public static String cedula,clave;
    
    public int bandera_olvido=0,bandera_usuario=0,bandera_contraseña=0;
    public evento_teclado tecla;
    //BANDERAS----------------
    public int reconocimiento_voz=0;
    public String inicio_voz;
    
    boolean validacion=false;
    //Imagenes-----------------------------------------
    private JLabel fondo;
    //Colores--------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    public Color seleccion_field = new Color(0,0,255);
    
    
    public Inicio_Sesion(Control_instancias instancia,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        pp= instancia;
        
        tecla = new evento_teclado();
        addKeyListener(tecla);
        
        txt_cedula=new JTextFieldHint();
            txt_cedula.setHint("Cédula");
            txt_cedula.setForeground(new Color(200,200,200));
            txt_cedula.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            txt_cedula.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            //usuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txt_cedula.addKeyListener(tecla);
            add(txt_cedula);
            
        txt_contraseña=new JPasswordFieldHint();
            txt_contraseña.setHint("xyhajfnea");
            txt_contraseña.setForeground(new Color(200,200,200));
            txt_contraseña.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            txt_contraseña.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            add(txt_contraseña);
        
        lbl_cedula=new JLabel("Cédula :");
            lbl_cedula.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_cedula.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_cedula);
            
        inf=new JLabel("Los campos marcados con asterisco (*) son obligatorios.");
            inf.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            inf.setForeground(verde_seleccionar);
            inf.setHorizontalAlignment(SwingConstants.CENTER);
            add(inf);
            
        lbl_asterisco0=new JLabel("*");
            lbl_asterisco0.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_asterisco0.setHorizontalAlignment(SwingConstants.LEFT);
            add(lbl_asterisco0);
            
        lbl_clave=new JLabel("Contraseña :");
            lbl_clave.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_clave.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_clave);
            
        lbl_asterisco1=new JLabel("*");
            lbl_asterisco1.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_asterisco1.setHorizontalAlignment(SwingConstants.LEFT);
            add(lbl_asterisco1);
        
        logo=new JLabel();
            logo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Nombre_app.png")));
            add(logo);
            
        iniciar =new JButton();
            iniciar.addActionListener(this);
            iniciar.setContentAreaFilled(false);
            iniciar.setFocusPainted(false);
            iniciar.setBorderPainted(false);
            iniciar.setBackground(verde_menu);
            iniciar.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            iniciar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_iniciar_sesion.png")));
            add(iniciar);
            
        registrarse =new JButton();
            registrarse.addActionListener(this);
            registrarse.setContentAreaFilled(false);
            registrarse.setFocusable(false);
            registrarse.setFocusPainted(false);
            registrarse.setBorderPainted(false);
            registrarse.setBackground(verde_menu);
            registrarse.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            registrarse.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_registrarse.png")));
            add(registrarse);
            
        btn_recuperarClave=new JButton("¿Olvidaste tu contraseña?");
            btn_recuperarClave.setContentAreaFilled(false);
            btn_recuperarClave.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
            btn_recuperarClave.setBorderPainted(false);
            btn_recuperarClave.addActionListener(this);
            btn_recuperarClave.setFocusable(false);
            add(btn_recuperarClave);
            
        btn_recuperarClave.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
               btn_recuperarClave.setForeground(verde_seleccionar);
               btn_recuperarClave.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btn_recuperarClave.setForeground(new Color(50,50,50));
            }

        });
            
            
            registrarse.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseEntered(MouseEvent e){
                    registrarse.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_registrarse_seleccion.png")));
                    registrarse.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                @Override
                public void mouseExited(MouseEvent e){
                    registrarse.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_registrarse.png")));
                }
            });
            
            iniciar.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseEntered(MouseEvent e){
                    iniciar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_iniciar_sesion_seleccion.png")));
                    iniciar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                @Override
                public void mouseExited(MouseEvent e){
                    iniciar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_iniciar_sesion.png")));
                }
            });
            
            fondo=new JLabel();
                fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Inicio_sesion_fondo_alineado.png")));
                add(fondo);
            
    }
    
    @Override
    public void paintComponent (Graphics g){
        setSize(width, heigth);
        super.paintComponent(g);
        super.setBackground(Color.white);
        
        fondo.setBounds(25,75,228,407);
        
        iniciar.setBounds(450, 480, 200, 35);
        registrarse.setBounds(20, 610, 200, 35);
        
        btn_recuperarClave.setBounds(425, 440, 250, 25);
        
        inf.setBounds(300, 625, 500, 25);
        
        lbl_cedula.setBounds(250, 350, 150, 25);
        txt_cedula.setBounds(250+175,350,250,35);
        lbl_asterisco0.setBounds(250+175+250+5, 349+10, 20, 20);
        
        lbl_clave.setBounds(250,400,150,25);
        txt_contraseña.setBounds(250+175,400,250,35);
        lbl_asterisco1.setBounds(250+175+250+5, 399+10, 20, 20);
        
        
        logo.setBounds(334, 85, 430, 159);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
            
        if(e.getSource()==iniciar || reconocimiento_voz==1){
            //pp.getContenedor().validarInicioDeSeccion();
            cedula=txt_cedula.getText();
            clave=txt_contraseña.getText();
            
            pp.getContenedor().validarInicioDeSeccion();
            Usuarios usuario= new Usuarios();
            
            usuario.setIdCedula(cedula);
            usuario.setClave(clave);
            
            if(usuario.validacionSesion()){
                System.out.println("¡Ingreso de usuario! 2.5");
                
                pp.getContenedor().validarInicioDeSeccion();
                Sesion.setIdCedula(cedula);
                System.out.println(Sesion.getNivelResidencia());
                
                /*GenerarWord gw= new GenerarWord();
                    gw.generarWord("Usuario Arje",""+Sesion.getNombre()+" "+
                        Sesion.getApellido());*/
            }
            
            else{
                System.out.println("Error");
                JOptionPane.showMessageDialog(null, "Ingreso de sesión no valido");
            }
        }
        if(e.getSource()==registrarse){
            pp.getContenedor().controlPantallas(5);
        }
        if(e.getSource()==btn_recuperarClave){
            pp.getContenedor().controlSubpantallas(4);
        }
    }
    
    public void actionPerfomed(KeyEvent ke){
        char letra=ke.getKeyChar();
        
        System.out.println(letra);
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //char letra=ke.getKeyChar();
        
        //System.out.println(letra);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
    public void setBanderas(int banderaUsuario, int banderaClave){
        this.bandera_usuario=banderaUsuario;
        this.bandera_contraseña=banderaClave;
    }
}

class evento_teclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        //int codigo=e.getKeyCode();
        //System.out.println(codigo);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char letra=e.getKeyChar();
        
        System.out.println(letra);
    }

}
