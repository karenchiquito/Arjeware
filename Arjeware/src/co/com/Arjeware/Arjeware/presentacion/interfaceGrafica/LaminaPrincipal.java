/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import javax.swing.JPanel;

/**
 *
 * @author Sebas
 */
public class LaminaPrincipal extends JPanel{
    protected int width,height;
    protected Control_instancias pp;
    
    public LaminaPrincipal(Control_instancias instancias,int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
    }
    
}
