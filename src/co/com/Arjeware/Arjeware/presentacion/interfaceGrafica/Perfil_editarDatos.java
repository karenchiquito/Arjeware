/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import static co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Inicio_Sesion.cedula;
import static co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Inicio_Sesion.clave;
import co.com.Arjeware.Arjeware.entity.Entidades.Dao;
import co.com.Arjeware.Arjeware.entity.Entidades.Sesion;
import co.com.Arjeware.Arjeware.entity.Entidades.Usuarios;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JTextFieldArje;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Colores;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import static javax.swing.text.StyleConstants.Foreground;

/**
 *
 * @author Sebas
 */
public class Perfil_editarDatos extends JPanel implements ActionListener{
    protected int width,height;
    protected Control_instancias pp;
    //BOTONES---------------------------
    private JButton btn_editarNombre;
    private JButton btn_enviarNombre;
    //JTEXTFIELD---------------------
    private JTextFieldArje txt_nombre;
    //LABELS--------------------
    private JLabel lbl_general;
    private JLabel lbl_nombre;
    //SROLl--------------------
    private JScrollPane scroll;
    //FONT--------------------------
    private Font font_titulo,font_txt;
    //BOOLEAN----------------------------------
    private boolean editarNombre=false,enviarNombre=false;
    //COLORES.----------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    public Perfil_editarDatos(Control_instancias instancia,int width,int height){
        this.width=width;
        this.height=height;
        pp=instancia;
        
        font_titulo= new Font("Microsoft New Tai Lue",1,16);
        font_txt= new Font("Microsoft New Tai Lue",0,15);
        
        lbl_general=new JLabel("Configuración general de la cuenta");
            lbl_general.setFont(font_titulo);
            this.add(lbl_general);
            
        lbl_nombre=new JLabel("Nombre");
            lbl_nombre.setFont(font_txt);
            this.add(lbl_nombre);
            
        txt_nombre=new JTextFieldArje(Colores.color_verdeOscuro);
            txt_nombre.setFonts(0,15);
            txt_nombre.setText(Sesion.getNombre());
            txt_nombre.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
            this.add(txt_nombre);
            
        btn_editarNombre=new JButton("Editar");
            btn_editarNombre.addActionListener(this);
            this.add(btn_editarNombre);
            
        btn_enviarNombre=new JButton("Enviar");
            btn_enviarNombre.addActionListener(this);
            this.add(btn_enviarNombre);
            
            
        scroll = new JScrollPane(this);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        lbl_general.setBounds(20, 20, 400, 25);
        
        lbl_nombre.setBounds(20, 75, 150, 25);
        
        scroll.setBounds(50, 30, 300, 50);
        
        txt_nombre.setBounds(250, 75, 150, 25);
        
        btn_editarNombre.setBounds(500,75,75,25);
        btn_enviarNombre.setBounds(600, 75, 75, 25);
        
        txt_nombre.setEditable(editarNombre);
        btn_enviarNombre.setVisible(enviarNombre);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_editarNombre){
            editarNombre=true;
            enviarNombre=true;
            txt_nombre.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            System.out.println("Se presiono el botón editar nombre");
        }
        if(e.getSource()==btn_enviarNombre){
            Usuarios us= new Usuarios();
            
            us.setNombre(txt_nombre.getText());
            
            if(us.validacionSesion()){
                System.out.println("¡Ingreso de usuario! 2.5");
                Dao.UpdateUsuario(us);
            }
            
            else{
                System.out.println("Error");
                JOptionPane.showMessageDialog(null, "Ingreso de sesión no valido");
            }
        }
    }
}

