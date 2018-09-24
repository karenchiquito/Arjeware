/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Control_instancias;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sebas
 */
public class Ahorro_agua_reduce extends JPanel implements ActionListener{
    //Fundamentales--------------------
    protected int width,height;
    protected Control_instancias pp;
    //Titulos--------------------------
    private JLabel title;
    
    public Ahorro_agua_reduce (Control_instancias instancias,int width,int height){
        this.width=width;
        this.height=height;
        
        pp= instancias;
        
        title = new JLabel("Holi");
            add(title);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
}
