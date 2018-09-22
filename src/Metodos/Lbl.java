/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Utilidades.Colores;
import Utilidades.Fonts;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Sebas
 */
public class Lbl {
    
    public static void setPropiedadLbl(JLabel label){
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setFont(Fonts.font_titulos);
        label.setForeground(Colores.color_verdeClaro);
    }
    
    public static void setPropiedadLB(JLabel label){
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setFont(Fonts.font_titulos);
        label.setForeground(Colores.color_verdeOscuro);
    }
}
