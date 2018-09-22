/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Utilidades.Colores;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Jhon Sebastian Agudelo Sierra
 * Correo: Sebastamriel@gmail.com
 */
public class JComboboxArje extends JComboBox<Object>{
    
    public JComboboxArje(){
        
    }
    
    public JComboboxArje(String[] datos){
        this.setForeground(Colores.color_verdeClaro);
        this.setModel(new DefaultComboBoxModel(datos));
        this.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
        this.setBackground(Color.white);
    }
    
}
