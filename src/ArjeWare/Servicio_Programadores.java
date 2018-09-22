/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Sebas
 */
public class Servicio_Programadores extends JPanel implements ActionListener{
    //FUNDAMENTALES-----------------------
    protected int width, height;
    protected Control_instancias pp;
    //TITULOS-----------------------------
    private JLabel lbl_title,lbl_equipos,lbl_terminos,lbl_frase;
    //ARGUMENTOS-----------------------------
    private JEditorPane txt_servicio,txt_equipos,txt_terminos;
    private JTextArea txt_frase;
    //BOTONES--------------------------------
    private JButton btn_equipos,btn_terminos;
    //COLORES-----------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    public Servicio_Programadores(Control_instancias instancias, int width,int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        A_Banderas_publicas.setCargarFrases();
        
        lbl_title=new JLabel("PROGRAMACIÓN");
            lbl_title.setForeground(verde_menu);
            lbl_title.setFont(new Font("Microsoft New Tai Lue",1,16));
            add(lbl_title);
            
        txt_servicio=new JEditorPane();
            txt_servicio.setContentType("text/html");
            txt_servicio.setEditable(false);
            txt_servicio.setOpaque(false);
            txt_servicio.setFont(new Font("Microsoft New Tai Lue",0,15));
            txt_servicio.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"000000\" font size=\"5\">En Arjeware"
                +" contamos con un servicio para la ceación de software de calidad que podrá ayudarte a digitalizar tu negocio, empresa u hogar.</FONT><br>");
            add(txt_servicio);
            
        lbl_equipos=new JLabel("EQUIPOS DE TRABAJO");
            lbl_equipos.setForeground(verde_menu);
            lbl_equipos.setFont(new Font("Microsoft New Tai Lue",1,16));
            add(lbl_equipos);
            
        txt_equipos=new JEditorPane();
            txt_equipos.setContentType("text/html");
            txt_equipos.setEditable(false);
            txt_equipos.setOpaque(false);
            txt_equipos.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"000000\" font size=\"5\">Contamos con equipos de programadores"
                + " especializados en el desarrollo de softwares de calidad.</FONT><br>");
            add(txt_equipos);
            
        btn_equipos=new JButton();
            btn_equipos.setBackground(verde_seleccion);
            btn_equipos.addActionListener(this);
            add(btn_equipos);
            
        lbl_terminos=new JLabel("TERMINOS Y CONDICIONES");
            lbl_terminos.setForeground(verde_menu);
            lbl_terminos.setFont(new Font("Microsoft New Tai Lue",1,16));
            add(lbl_terminos);
            
        txt_terminos=new JEditorPane();
            txt_terminos.setContentType("text/html");
            txt_terminos.setEditable(false);
            txt_terminos.setOpaque(false);
            txt_terminos.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"000000\" font size=\"5\">Conoce nuestros terminos y condiciones"
                +" para trabajos de software de calidad.</FONT><br>");
            add(txt_terminos);
            
        lbl_frase=new JLabel("Sabías que:");
            lbl_frase.setFont(new Font("Microsoft New Tai Lue",1, 18));
            lbl_frase.setForeground(verde_menu);
            add(lbl_frase);
            
        txt_frase=new JTextArea();
            txt_frase.setFont(new Font("Microsoft New Tai Lue",0, 16));
            txt_frase.setForeground(verde_seleccion);
            txt_frase.setLineWrap(true);
            txt_frase.setEditable(false);
            txt_frase.setBackground(verde_sabias);
            txt_frase.setText("Con solo cuatro litros de gasolina se puede contaminar hasta 2.8 millones de litros de agua.");
            add(txt_frase);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        lbl_title.setBounds(20, 10, 150, 25);
        txt_servicio.setBounds(20, 35, 400, 150);
        
        lbl_equipos.setBounds(500, 250, 200, 25);
        txt_equipos.setBounds(400, 275, 400, 300);
        btn_equipos.setBounds(20, 190, 325, 225);
        
        lbl_terminos.setBounds(100, 450, 300, 25);
        txt_terminos.setBounds(20, 475, 400, 200);
        
        int xf=20;
        int yf=550;
        lbl_frase.setBounds(xf, yf, 150, 25);
        txt_frase.setBounds(xf, yf+35, 600, 50);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
