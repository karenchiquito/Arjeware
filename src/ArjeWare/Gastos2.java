/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import Metodos.JButtonArje;
import static Utilidades.Fonts.setFonts;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Sebas
 */
public class Gastos2 extends JPanel implements ActionListener{
    /*Creamamos el alto y el ancho*/
    protected int width, height;
    /*Creamos un control de instancias*/
    protected Control_instancias actualizar;
    /*BOTONES*/
    private JButtonArje btn_aseo,btn_atras,btn_otro,btn_sensores;
    /*LABELS*/
    private JLabel lbl_aseo,lbl_energia,lbl_gas;
    
    
    /*Creamos un constructor con parametros*/
    public Gastos2(Control_instancias instancias, int width, int height){
        this.actualizar=instancias;
        this.width=width;
        this.height=height;
        
        lbl_aseo=new JLabel("Aseo");
            setFonts(lbl_aseo,1,24);
            lbl_aseo.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(lbl_aseo);
        
        lbl_energia=new JLabel("Otros");
            setFonts(lbl_energia,1,24);
            lbl_energia.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(lbl_energia);
            
        lbl_gas=new JLabel("Sensores");
            setFonts(lbl_gas,1,24);
            lbl_gas.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(lbl_gas);
        
        btn_aseo=new JButtonArje("Btn_aseo","Btn_aseoSeleccion","png","png");
            btn_aseo.addActionListener(this);
            add(btn_aseo);
            
        btn_otro=new JButtonArje("Btn_energia","Btn_energiaSeleccion","png","png");
            btn_otro.addActionListener(this);
            add(btn_otro);
            
        btn_sensores=new JButtonArje("Btn_gas","Btn_gasSeleccion","png","png");
            btn_sensores.addActionListener(this);
            add(btn_sensores);
        
        btn_atras=new JButtonArje("flecha_izquierda","flecha_izquierda_seleccion","png","png");
            btn_atras.addActionListener(this);
            add(btn_atras);
        
    }/*Fin constructor*/
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        this.setSize(width, height);
        
        btn_aseo.setBounds(22, 40, 230, 230);
        lbl_aseo.setBounds(0, 315, 270, 25);
        
        btn_otro.setBounds(270+4+22, 40, 230, 230);
        lbl_energia.setBounds(270+4, 315, 270, 25);
        
        btn_sensores.setBounds(270*2+9+22, 40, 230, 230);
        lbl_gas.setBounds(270*2+9, 315, 270, 25);
        
        btn_atras.setBounds(700+50+5,605,35,35);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_atras){
            actualizar.getContenedor().controlPantallas_gastos(0);
        }
        if(e.getSource()==btn_aseo){
            actualizar.getContenedor().controlPantallasServicios(5);
        }
        if(e.getSource()==btn_otro){
            actualizar.getContenedor().controlPantallasServicios(6);
        }
        if(e.getSource()==btn_sensores){
            actualizar.getContenedor().controlPantallasServicios(7);
        }
    }
    
}
