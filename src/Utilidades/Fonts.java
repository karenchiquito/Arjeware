/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Sebas
 */
public class Fonts {
    public static String txt_inicio="<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"4\">"
        ,txt_final="</FONT><br>";
    
    public static Font font_titulos=new Font("Microsoft New Tai Lue",Font.BOLD,14),
            font_normal=new Font("Microsoft New Tai Lue",0,14);
    
    public static String microsoftNTL="Microsoft New Tai Lue";
    
    public Fonts() {
        
    }
    
    public static void setFonts(JLabel lbl,int propiedad, int tamano){
        lbl.setFont(new Font("Microsoft New Tai Lue", propiedad, tamano));
    }
}
