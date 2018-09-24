/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sebas
 */
public class Ahorro_energia extends JPanel implements ActionListener{
    protected int width,heigth;
    private JLabel title;
    
    public Ahorro_energia(int width,int heigth){
        this.heigth=heigth;
        this.width=width;
        
        title= new JLabel("Sección: Aprende más sobre la energía.");
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            add(title);
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        title.setBounds(20, 20, 300, 25);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
