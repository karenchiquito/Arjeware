package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class recuperar_contraseña extends JPanel implements ActionListener{
    protected int width, heigth;
    protected Control_instancias pp;
    private JLabel inf,gma,fondo,info;
    private JLabel ou,oi;
    private JButton volver,recuperar;
    protected JTextField pregunta_seguridad,gmail;
    
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    
    public recuperar_contraseña(Control_instancias instancia,int width,int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancia;
        
        inf=new JLabel("Pregunta de seguridad :");
            inf.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            inf.setForeground(verde_seleccionar);
            inf.setHorizontalAlignment(SwingConstants.LEFT);
            add(inf);
                            ou=new JLabel("*");
                               ou.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                               add(ou);
                               
        gma=new JLabel("Correo(@GMAIL) :");
            gma.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            gma.setForeground(verde_seleccionar);
            gma.setHorizontalAlignment(SwingConstants.LEFT);
            add(gma);
                            oi=new JLabel("*");
                            oi.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                            add(oi);
            
        volver=new JButton("Volver");
            volver.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            volver.addActionListener(this);
            volver.setBackground(verde_menu);
            add(volver);
            
        recuperar=new JButton("Recuperar");
            recuperar.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            recuperar.addActionListener(this);
            recuperar.setBackground(verde_menu);
            add(recuperar);
        
        
        pregunta_seguridad=new JTextField();
            pregunta_seguridad.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            add(pregunta_seguridad);
            
        gmail=new JTextField();
            gmail.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            add(gmail);
            
        info=new JLabel("Los campos marcados con asterisco (*) son obligatorios.");
            info.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            info.setHorizontalAlignment(SwingConstants.CENTER);
            add(info);
            
        fondo=new JLabel();
            fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/agua_fondo.png")));
            add(fondo);
            
       
        
    }
    
    @Override
    public void paintComponent(Graphics g){
            super.paintComponent(g);
            super.setBackground(new Color(220,255,220));
        setSize(width,heigth);
        int x=375;
        int y=175;
        
        volver.setBounds(20,600,150,35);
        info.setBounds(300, 625, 500, 25);
        inf.setBounds(x,y,350,35);
        pregunta_seguridad.setBounds(x, y+35, 350, 35);ou.setBounds(x+350+5, y+35, 20, 20);
        
        gma.setBounds(x,y+75,350,35);
        gmail.setBounds(x, y+75+35, 350, 35);oi.setBounds(x+350+5,y+75+35,20,20);
        
        
        recuperar.setBounds(x, y+75*2+35, 150, 35);
        
        
        fondo.setBounds(300, 20, 600, 650);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==volver){
            pp.getContenedor().ValidarCerrarSeccion();
        }
    }
    
    
}
