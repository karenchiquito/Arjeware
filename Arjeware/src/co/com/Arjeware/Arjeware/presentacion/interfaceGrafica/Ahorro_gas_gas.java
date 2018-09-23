/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Control_instancias;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author IEJNF
 */
public class Ahorro_gas_gas extends JPanel implements ActionListener {
    protected int width,heigth;
    protected Control_instancias pp;
    private JTextArea area,frase;
    private JLabel titles,imagen_01,imagen_02,imagen_03,fras;
    private JButton atras, adelante;
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    private final int fx=700,fy=615,fs=50;

     public Ahorro_gas_gas(Control_instancias instancias,int width, int heigh){
        this.width = width;
        this.heigth = heigh;
        pp=instancias;
        
        titles=new JLabel("¿Que es el gas natural?");
            titles.setFont(new Font("Microsoft New Tai Lue",1,16));
            titles.setForeground(verde_seleccion);
            add(titles);
        
         area = new JTextArea();
            area.setOpaque(false);
            area.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area.setEditable(false);
            area.setBackground(Color.white);
            area.setVisible(true);
            area.setLineWrap(true);
            area.setText("El gas natural es una energía de origen fósil extraída del subsuelo y considerada como la más "
                    +"amigable con el medio ambiente. Es una mezcla de hidrocarburos livianos en estado gaseoso, que"
                    +"en su mayor parte está"+"\n"+"compuesta por metano y etano, y en menor proporción por"
                    +"propano, butanos, pentanos e hidrocarburos"+"\n"+"más pesados. El gas natural es una energía de "
                    +"origen fósil extraída del subsuelo y considerada como la más amigable con el medio ambiente.");
            add(area);
            
        fras=new JLabel("Sabías que:");
                fras.setFont(new Font("Microsoft New Tai Lue",1, 18));
                fras.setForeground(verde_menu);
                add(fras);
                
            frase=new JTextArea();
                frase.setFont(new Font("Microsoft New Tai Lue",0, 16));
                frase.setForeground(verde_seleccion);
                frase.setLineWrap(true);
                frase.setEditable(false);
                frase.setEditable(false);
                frase.setBackground(verde_sabias);
                frase.setText("El gas natural es una fuente de energía no renovable como son todos los combustibles"
                +"\n"+"fósiles y se utiliza principalmente para generar electricidad y calefacción.");
                add(frase);
            
        atras=new JButton();
            atras.setVisible(true);
            atras.addActionListener(this);
            atras.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
            atras.setContentAreaFilled(false);
            atras.setFocusPainted(false);
            atras.setBorderPainted(false);
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
                        adelante.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png")));
                        adelante.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                        }
                     @Override
                     public void mouseExited(java.awt.event.MouseEvent evt){
                        adelante.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png")));
                        }
                     });
         
        imagen_01=new JLabel();
            imagen_01.setIcon(new ImageIcon(getClass().getResource("/Imagenes/gas_01.png")));
            add(imagen_01);
            
        imagen_02=new JLabel();
            imagen_02.setIcon(new ImageIcon(getClass().getResource("/Imagenes/gas_02.png")));
            add(imagen_02);
            
        imagen_03=new JLabel();
            imagen_03.setIcon(new ImageIcon(getClass().getResource("/Imagenes/gas_03.png")));
            add(imagen_03);
}
@Override
    public void paintComponent(Graphics g){  
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        imagen_01.setBounds(337, 50, 150,150);
        imagen_02.setBounds(337-150-50, 50, 150,150);
        imagen_03.setBounds(337+150+50, 50, 150,150);

        titles.setBounds(20, 250, 300, 25);
        area.setBounds(20,285,750, 175);
        
        int xf=20;
        int yf=550;
        
        fras.setBounds(xf, yf, 150, 25);
        frase.setBounds(xf, yf+35, 600, 50);
        
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlSubpantallas(5);
        }
                if(e.getSource()==adelante){
            pp.getContenedor().controlPantallas_gas(3);
        }
}
}