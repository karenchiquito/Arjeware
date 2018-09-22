/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.awt.Component;

/**
 *
 * @author Sebas
 */
public class Hilos implements Runnable{
    
    private Tiempo tiempo;
    private Component lamina;
    
    public Hilos (Component lamina,Tiempo tiempo){
        this.tiempo=tiempo;
        this.lamina=lamina;
    }
    
    @Override
    public void run() {
        
    }
    
}
