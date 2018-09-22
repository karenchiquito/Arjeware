/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimerTask;
import javax.swing.ImageIcon;

/**
 *
 * @author Sebas
 */
public class Datos_fechas {
    private java.util.Timer timer = new java.util.Timer();
    private Calendar calendario = new GregorianCalendar();
    int hora = calendario.get(Calendar.HOUR_OF_DAY);
    int minutos = calendario.get(Calendar.MINUTE);
    int segundos= calendario.get(Calendar.SECOND);
    
    int dia = calendario.get(Calendar.DATE);
    int mes= calendario.get(Calendar.MONTH);
    int ano = calendario.get(Calendar.YEAR);
    
    public void timerS (){
            TimerTask tarea= new TimerTask() {
                
                int a = 0;

                @Override
                public void run() {
                    hora = calendario.get(Calendar.HOUR_OF_DAY);
                    minutos = calendario.get(Calendar.MINUTE);
                    segundos= calendario.get(Calendar.SECOND);
    
                    dia = calendario.get(Calendar.DATE);
                    mes= calendario.get(Calendar.MONTH);
                    ano = calendario.get(Calendar.YEAR);
                }
            };
            timer.scheduleAtFixedRate(tarea, 0, 1000);
        }
}
