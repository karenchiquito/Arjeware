/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.metodos.utilidades;

import java.awt.Color;

/**
 *
 * @author Sebas
 */
public class Colores {
    public static Color color_verdeClaro=new Color(122,212,52),
        color_verdeOscuro=new Color(52,122,52),
        verde_sabias=new Color(215,230,215);
    
    public Colores() {
        color_verdeClaro=new Color(122,212,52);
    }
    
    //GETTER
    public static Color getColor_verdeClaro() {
        return color_verdeClaro;
    }

    public static Color getColor_verdeOscuro() {
        return color_verdeOscuro;
    }
    
    
    
    //SETTER
    public static void setColor_verdeClaro(Color color_verdeClaro) {
        Colores.color_verdeClaro = color_verdeClaro;
    }

    public static void setColor_verdeOscuro(Color color_verdeOscuro) {
        Colores.color_verdeOscuro = color_verdeOscuro;
    }
    
    
    
    
    
    
}
