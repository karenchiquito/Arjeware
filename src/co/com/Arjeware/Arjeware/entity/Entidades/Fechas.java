/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.entity.Entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sebas
 */
public class Fechas implements Runnable{
    public Calendar calendario= new GregorianCalendar();
    public int hora,minutos;
    
    @Override
    public void run() {
        hora=calendario.get(Calendar.HOUR_OF_DAY);
        
    }
    
}
