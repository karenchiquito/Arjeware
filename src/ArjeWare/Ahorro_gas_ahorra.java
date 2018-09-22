/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

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
 * @author Martha
 */
public class Ahorro_gas_ahorra extends JPanel implements ActionListener{
    protected int width, heigth;
    protected Control_instancias pp;
    private JLabel titles1,fras;
    private JTextArea infos,frase;
    private JButton atras, adelante;
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    private final int fx=700,fy=615,fs=50;
    
    public Ahorro_gas_ahorra(Control_instancias instancias,int width, int heigth){
        this.width=width;
        this.heigth=heigth;
        pp=instancias;
   
            
        titles1=new JLabel("Formas de ahorrar el gas");
            titles1.setFont(new Font("Microsoft New Tai Lue",1,16));
            titles1.setForeground(verde_seleccion);
            add(titles1);
            
        infos=new JTextArea();
            infos.setOpaque(false);
            infos.setFont(new Font("Microsoft New Tai Lue",0, 16));
            infos.setEditable(false);
            infos.setBackground(Color.white);
            infos.setVisible(true);
            infos.setLineWrap(true);
            infos.setText("-Tratar de utilizar utensilios de presión ya que estos cocinan los alimentos mucho mas rápido y" +"\n"+
                    "ahorran hasta un 50% de gas."+"\n"+"\n"+
                    "-Cuando cocinamos en el horno, tratar de abrirlo lo menos posible, cada vez que se abre el horno "+"\n"+
                    "aunque sea por unos segundos, se pierde un 20% de calor.\n"+"\n"+
                    "-Cuando se cocina en el horno, apagarlo unos momentos antes de que se termine la cocción y así "+"\n"+
                    "aprovechamos el calor residual para terminar de cocinar.\n" +"\n"+
                    "-Revisa que las tuberías de agua caliente no tengan fugas de agua, ya que éstas incrementan el "+"\n"+
                    "consumo de gas natural.");
            add(infos);
            
        fras=new JLabel("Sabías que:");
                fras.setFont(new Font("Microsoft New Tai Lue",1, 18));
                fras.setForeground(verde_menu);
                add(fras);
                
            frase=new JTextArea();
                frase.setFont(new Font("Microsoft New Tai Lue",0, 16));
                frase.setForeground(verde_seleccion);
                frase.setLineWrap(true);
                frase.setEditable(false);
                frase.setBackground(verde_sabias);
                frase.setText("El gas natural se utiliza comúnmente en los hogares para cocinar, para la calefacción y "
                +"el calentamiento del agua");
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
           
    }
    
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        int xf=20;
        int yf=550;
        
        fras.setBounds(xf, yf, 150, 25);
        frase.setBounds(xf, yf+35, 600, 50);
        
        
        titles1.setBounds(20, 200, 300, 25);
        infos.setBounds(20, 250, 775, 300);
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlSubpantallas(5);
        }
    }
}