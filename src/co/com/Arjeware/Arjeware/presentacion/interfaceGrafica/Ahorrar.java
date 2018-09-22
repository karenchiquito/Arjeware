/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Control_instancias;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JButtonArje;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Colores;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Fonts;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Sebas
 */
public class Ahorrar extends JPanel implements ActionListener{
    protected int width,heigh;
    private JLabel title,ico,est;
    private JLabel imagen,agua_icono,gas_icono,energia_icono;
    private JTextArea introduccion,agua,energia,gas;
    private JButtonArje btn_agua,btn_energia,btn_gas;
    protected Control_instancias pp;
    
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    
    public Ahorrar (Control_instancias instancias,int width, int heigh){
        this.width = width;
        this.heigh = heigh;
        pp=instancias;
        
        introduccion= new JTextArea();
            introduccion.setLineWrap(true);
            introduccion.setEditable(false);
            introduccion.setFont(new Font("Microsoft New Tai Lue",0,14));
            introduccion.setText("En esta sección de ACGNS encontraras muchas maneras de economizar en tu hogar,"+
            " ayudandote a ahorrarte unos cuantospesos en tu bolsillo ayudamos al planeta"+
            " a estar más sano y vivo para con nosotros.");
            add(introduccion);
            
        agua = new JTextArea();
            agua.setLineWrap(true);
            agua.setEditable(false);
            agua.setFont(new Font("Microsoft New Tai Lue",0,14));
            agua.setText("Aquí encontraras formas de"+"\n"+"económizar este recurso, que va desde cerrar la llave cuando te"
            +"\n"+"cepilles hasta maneras de"+"\n"+"fabricar con tus propias manos"+"\n"+"instrumentos para economizar "
            +"más este recurso.");
            add(agua);
            
        energia=new JTextArea();
            energia.setText("Aquí encontraras formas de"+"\n"+"económizar la energía"+"\n"+"consumida en tu hogar, tendras varios tipos"+
            " de tips y concejos"+"\n"+"pacticos y efícaces para ahorrar un poco más en este servicio.");
            energia.setLineWrap(true);
            energia.setEditable(false);
            energia.setFont(new Font("Microsoft New Tai Lue",0,14));
            add(energia);
            
        gas=new JTextArea();
            gas.setLineWrap(true);
            gas.setEditable(false);
            gas.setFont(new Font("Microsoft New Tai Lue",0,14));
            gas.setText("Aquí encontraras información    sobre el gas, que va desde comoahorrar en el consumo de este"+
            "   recurso de una manera practica y efícas, hasta como afecta su    consumo desmedido a nuestro planeta.");
            add(gas);
        
        title=new JLabel("Bienvenido(a) a la sección: Aprender un poco de economizar.");
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            title.setForeground(verde_seleccionar);
            add(title);
            
        imagen=new JLabel();
        imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/prueba_1.jpg")));
            add(imagen);
            
        agua_icono=new JLabel();
            agua_icono.setIcon(new ImageIcon(getClass().getResource("/Imagenes/agua_icon_ahorra.png")));
            add(agua_icono);
            
        gas_icono=new JLabel();
            gas_icono.setIcon(new ImageIcon(getClass().getResource("/Imagenes/gas_icon.png")));
            add(gas_icono);
            
        energia_icono=new JLabel();
            energia_icono.setIcon(new ImageIcon(getClass().getResource("/Imagenes/energia_icon_ahorra.png")));
            add(energia_icono);
            
        btn_agua=new JButtonArje(Colores.color_verdeClaro, Colores.color_verdeOscuro, Fonts.font_titulos,"Agua");
            btn_agua.addActionListener(this);
            add(btn_agua);
            
        btn_energia=new JButtonArje(Colores.color_verdeClaro, Colores.color_verdeOscuro, Fonts.font_titulos,"Energía");
            btn_energia.addActionListener(this);
            add(btn_energia);
            
        btn_gas=new JButtonArje(Colores.color_verdeClaro, Colores.color_verdeOscuro, Fonts.font_titulos,"Gas");
            btn_gas.addActionListener(this);
            add(btn_gas);
            
            
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        
        setSize(width,heigh);
        
        imagen.setBounds(5, 0, width+50,heigh-550);
        
        agua_icono.setBounds(60, 275, 150, 200);
        btn_agua.setBounds(80, 450+20, 100, 25);
        
        energia_icono.setBounds(70+245, 275, 150, 200);
        btn_energia.setBounds(80+250,450+20,125,25);
        
        gas_icono.setBounds(80+245*2,275,150,200);
        btn_gas.setBounds(80+250*2,450+20,125,25);
                
        title.setBounds(20,175,500,25);
        
        introduccion.setBounds(20, 225, 750, 50);
        
        int x= 40;
        int y = 500;
        
        agua.setBounds(x, y, 200, 200);
        energia.setBounds(x+200+50,y,200,200);
        gas.setBounds(x+(200*2)+(50*2), y, 200, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_agua){
            pp.getContenedor().controlSubpantallas(7);
        }
        if(e.getSource()==btn_energia){
            pp.getContenedor().controlSubpantallas(6);
        }
        if(e.getSource()==btn_gas){
            pp.getContenedor().controlSubpantallas(5);
        }
       
    }
    
}
