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

/**
 *
 * @author Sebas
 */
public class Ciudad_proyectos extends JPanel implements ActionListener{
    //Fundamentales-------------------------
    protected int width,height;
    protected Control_instancias pp;
    //Titulos-------------------------------
    private JLabel title;
    //Imagenes------------------------------
    private JLabel lateral_d,fondo_hodgar;
    //Botones-------------------------------
    private JButton hodgar;
    //Colores-------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    
    public Ciudad_proyectos(Control_instancias instancias,int width,int hegiht){
        this.width=width;
        this.height=hegiht;
        pp=instancias;
        
        
            
        hodgar=new JButton();
            hodgar.setFont(new Font("Microsoft New Tai Lue",1,20));
            hodgar.setToolTipText("Hodgar: hogares para los más necesitados.");
            hodgar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            hodgar.addActionListener(this);
            hodgar.setBorderPainted(false);
            hodgar.setContentAreaFilled(false);
            hodgar.setFocusPainted(false);
            hodgar.setBackground(verde_menu);
            hodgar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Hodgar.png")));
            add(hodgar);
            
        fondo_hodgar=new JLabel();
            fondo_hodgar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Hodgar_fondo.png")));
            fondo_hodgar.setVisible(false);
            add(fondo_hodgar);
            
        hodgar.addMouseListener(new java.awt.event.MouseAdapter(){
                
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt){
                    hodgar.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                    hodgar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Hodgar_seleccion.png")));
                    fondo_hodgar.setVisible(true);
                    //Animacion.Animacion.mover_derecha(0, 600, 10, 20, hodgar);
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt){
                    //Animacion.Animacion.mover_izquierda(600, 400, 10, 20, hodgar);
                    hodgar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Hodgar.png")));
                    fondo_hodgar.setVisible(false);
                }
                
            });
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        hodgar.setBounds(320, 50, 500, 100);
        fondo_hodgar.setBounds(0,0,825,700);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
    }
}
