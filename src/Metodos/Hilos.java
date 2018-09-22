/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import ArjeWare.contenedor;

/**
 *
 * @author Sebas
 */
public class Hilos implements Runnable{

    private contenedor c;
    private Fechas f;

    public Hilos(contenedor c, Fechas f) {
        this.c = c;
        this.f = f;
    }
    
    @Override
    public void run() {
        
    }
    
}
