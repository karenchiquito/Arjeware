/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Sebas
 */
public class JButtonArje extends JButton implements MouseListener{
    String rutaImagen1="",rutaImagen2="",formatoImagen1="",formatoImagen2="";
    
    //Selección solo con letras.
    Color colorLetra1,colorLetra2;
    //INDEX DE CASOS
    int index=0;
    //ICONOS, IMAGEN ESCALADA y TAMAÑOS A ESCALAR-----------
    Icon iconoEscalado;
    Image imgEscalada;
    ImageIcon imgIcon;
    int width=0,height=0;
    
    public JButtonArje(){
        
    }
    
    public JButtonArje(String rutaImagen1, String rutaImagen2, String formatoImagen1,String formatoImagen2){
        this.rutaImagen1=rutaImagen1;
        this.rutaImagen2=rutaImagen2;
        this.formatoImagen1=formatoImagen1;
        this.formatoImagen2=formatoImagen2;
        
        this.addMouseListener(this);
        this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/"+rutaImagen1+"."+formatoImagen1+"")));
        
        this.setBorderPainted(false);
        this.setFocusable(false);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        
        index=0;
    }// Fin btn Imagen sin tamaño
    
    public JButtonArje(String rutaImagen1, String rutaImagen2, String formatoImagen1,String formatoImagen2,int width, int height){
        this.rutaImagen1=rutaImagen1;
        this.rutaImagen2=rutaImagen2;
        this.formatoImagen1=formatoImagen1;
        this.formatoImagen2=formatoImagen2;
        this.width=width;
        this.height=height;
        
        this.addMouseListener(this);
        this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/"+rutaImagen1+"."+formatoImagen1+"")));
        
        this.setBorderPainted(false);
        this.setFocusable(false);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        
        index=2;
        
        try{
        imgIcon = new ImageIcon(getClass().getResource("/"+rutaImagen1+"."+formatoImagen1+""));
        
        imgEscalada = imgIcon.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH);
        
        iconoEscalado = new ImageIcon(imgEscalada);
        this.setIcon(iconoEscalado);
        }catch(Exception ex){
            System.out.println("Error en clase JButtonArje; Constructor Imagen con tamaño escalado; Tipo de error: "
            +ex.getMessage());
        }
        
        
    }//FIN btn Imagen con tamaño
    
    public JButtonArje(Color colorLetra1, Color colorLetra2, Font tipoGrafia,String texto){
        this.colorLetra1=colorLetra1;
        this.colorLetra2=colorLetra2;
        
        this.setBorderPainted(false);
        this.setFocusable(false);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        
        this.setText(texto);
        
        this.addMouseListener(this);
        
        this.setForeground(colorLetra1);
        this.setFont(tipoGrafia);
        index=1;
    }
    
    public void setFonts(int propiedad,int tamanoLetra){
        this.setFont(new Font ("Microsoft New Tai Lue",propiedad,tamanoLetra));
    }
    

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        switch(index){
            case 0:
                this.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/"+rutaImagen2+"."+formatoImagen2+"")));
                break;
                
            case 1:
                this.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                this.setForeground(colorLetra2);
                break;
            case 2:
                this.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                imgIcon = new ImageIcon(getClass().getResource("/"+rutaImagen2+"."+formatoImagen2+""));
        
                imgEscalada = imgIcon.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH);
        
                iconoEscalado = new ImageIcon(imgEscalada);
                this.setIcon(iconoEscalado);
                
                this.repaint();
                
            break;
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        switch(index){
            case 0:
                this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/"+rutaImagen1+"."+formatoImagen1+"")));
                this.setBorderPainted(false);
                break;
                
            case 1:
                this.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                this.setForeground(colorLetra1);
                break;
            case 2:
                this.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                imgIcon = new ImageIcon(getClass().getResource("/"+rutaImagen1+"."+formatoImagen1+""));
        
                imgEscalada = imgIcon.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH);
        
                iconoEscalado = new ImageIcon(imgEscalada);
                this.setIcon(iconoEscalado);
                
                this.repaint();
                
            break;
        }
    }
    
}
