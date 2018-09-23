/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.metodos.arje;

import javax.swing.JEditorPane;

/**
 *
 * @author Sebas
 */
public class JEditorPaneArje extends JEditorPane{
    public static String txt_inicio="<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"4\">"
        ,txt_final="</FONT><br>";
    
    public JEditorPaneArje(){
        this.setContentType("text/html");
        this.setEditable(false);
        this.setOpaque(false);
    }
    
    public void setTexto(String texto){
        this.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"4\">"+texto+"</FONT><br>");
    }
    
    public void setTexto(String texto,int tamano){
        this.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\""+tamano+"\">"+texto+"</FONT><br>");
    }
    
    public void setTexto(String texto,int tamano,int colorHexadecimal){
        this.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\""+colorHexadecimal+"\" font size="
            +"\""+tamano+"\">"+texto+"</FONT><br>");
    }
}
