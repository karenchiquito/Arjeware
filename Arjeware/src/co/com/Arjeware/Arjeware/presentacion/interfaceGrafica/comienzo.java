package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.metodos.facturacion.GenerarWord;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Timer;
import java.util.TimerTask;
//import javax.speech.recognition.ResultAdapter;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

public class comienzo{
    /*Buenas como me le va*/
	public static void main(String[] args) {
		 Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
                 Toolkit asareje=Toolkit.getDefaultToolkit();
                 Image icono=asareje.getImage("logo_final.PNG");
                 
	         int frame[] = {1100,700,pantalla.width,pantalla.height};
	        
                BDConexion conexion = new BDConexion();
                   conexion.getCon();
	        
                 
	        Control_instancias instancias = new Control_instancias();
                
	        contenedor Lateral = new contenedor(frame[0],frame[1],instancias);
	        instancias.update(Lateral);
                
                //GenerarWord gw= new GenerarWord();
                    //gw.generarWord();

                
	        
	        JFrame ventana = new JFrame();
                    instancias.update(ventana);
                    ventana.setResizable(false);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
                    ventana.setLocation((frame[2]-frame[0])/2,(frame[3]-frame[1])/2);
                    ventana.setSize(frame[0],frame[1]);
                    ventana.add(Lateral);
                    ventana.setVisible(true);
                    ventana.setTitle("ARJEWARE");
                    ventana.setIconImage(icono);
                    
                    
                    
                M_ventana oyente=new M_ventana();
                    ventana.addWindowListener(oyente);
                    ventana.addWindowStateListener(oyente);
                
	}

}

class M_ventana extends WindowAdapter {

    public void windowsStateChanged(WindowEvent e){
        System.out.println("La ventana a cambiado de estado");
    }
    
    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Ventana Cerrada");
        //JOptionPane.showMessageDialog(null,"Hasta luego, esperamos verte por aquí de nuevo","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        /*int reps=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar la ventana?");
           if(JOptionPane.OK_OPTION==reps){
               windowClosing(we);
           }
           else{
               windowClosing(null);
           }*/
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("La ventana ha sido cerrada");
           
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Se minimizo la ventana");
    }

    
}