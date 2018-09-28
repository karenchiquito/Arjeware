/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.models.entity.Entidades.Dao;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JButtonArje;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Fonts;
import static co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Fonts.setFonts;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Sebas
 */
public class Gastos extends JPanel implements ActionListener{
    //Fundamentales------------
    protected int width,height;
    protected Control_instancias pp;
    //Titulos------------------
    private JLabel lbl_acueducto,lbl_energia,lbl_gas,lbl_alcantarillado,lbl_alumbrado;
    //Botones_Imagen-----------
    private JButtonArje btn_agua,btn_corriente,btn_gas,btn_alcantarillado,btn_alumbrado,btn_siguiente;
    //Colores------------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    //Banderas y Booleanos-----------------------
    
    
    
    //-------------------------------------------
    public Gastos(Control_instancias instancias, int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        lbl_acueducto=new JLabel("Acueducto");
            setFonts(lbl_acueducto,1,24);
            lbl_acueducto.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(lbl_acueducto);
            
        lbl_energia=new JLabel("Energía");
            setFonts(lbl_energia,1,24);
            lbl_energia.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(lbl_energia);
            
        lbl_gas=new JLabel("Gas");
            setFonts(lbl_gas,1,24);
            lbl_gas.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(lbl_gas);
            
        lbl_alcantarillado=new JLabel("Alcantarillado");
            setFonts(lbl_alcantarillado,1,24);
            lbl_alcantarillado.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(lbl_alcantarillado);
            
        lbl_alumbrado=new JLabel("Alumbrado");
            setFonts(lbl_alumbrado,1,24);
            lbl_alumbrado.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(lbl_alumbrado);
        
        btn_agua=new JButtonArje("Btn_acueducto","Btn_acueductoSeleccion","png","png");
            btn_agua.addActionListener(this);
            add(btn_agua);
            
        btn_corriente=new JButtonArje("Btn_energia","Btn_energiaSeleccion","png","png");
            btn_corriente.addActionListener(this);
            add(btn_corriente);
            
        btn_gas=new JButtonArje("Btn_gas","Btn_gasSeleccion","png","png");
            btn_gas.addActionListener(this);
            add(btn_gas);
            
        btn_alcantarillado=new JButtonArje("Btn_alcantarillado","Btn_alcantarilladoSeleccion","png","png");
            btn_alcantarillado.addActionListener(this);
            add(btn_alcantarillado);
            
        btn_alumbrado=new JButtonArje("btn_alumbrado","btn_alumbradoSeleccion","png","png");
            btn_alumbrado.addActionListener(this);
            add(btn_alumbrado);
            
        btn_siguiente=new JButtonArje("flecha_derecha","flecha_derecha_seleccion","png","png");
            btn_siguiente.addActionListener(this);
            add(btn_siguiente);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        //tamaño de alto 671
        btn_agua.setBounds(22, 40, 230, 230);
        lbl_acueducto.setBounds(0, 315, 270, 25);
        
        btn_corriente.setBounds(270+4+22, 40, 230, 230);
        lbl_energia.setBounds(270+4, 315, 270, 25);
        
        btn_gas.setBounds(270*2+9+22, 40, 230, 230);
        lbl_gas.setBounds(270*2+9, 315, 270, 25);
        
        btn_alcantarillado.setBounds(130+22, 335+30, 230, 230);
        lbl_alcantarillado.setBounds(130+0, 335+30+175+85, 270, 25);
        
        btn_alumbrado.setBounds(130+270+4+22, 335+30, 230, 230);
        lbl_alumbrado.setBounds(130+270+4, 335+30+175+85, 270, 25);
        
        btn_siguiente.setBounds(700+50+5,605,35,35);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_agua){
            //pp.getContenedor().controlSubpantallas(0);
            int reps=JOptionPane.showConfirmDialog(null, "Si: consumo manual. No: consumo sensores");
           if(JOptionPane.OK_OPTION==reps){
               pp.getContenedor().controlPantallasServicios(0);
               Dao.getValoresTarifa("Agua");
               Dao.getValoresTarifa("Alcantarillado");
           }
           else{
               pp.getContenedor().controlPantallas_gastos(1);
           }
        }
        if(e.getSource()==btn_corriente){
            //pp.getContenedor().controlSubpantallas(1);
            int reps=JOptionPane.showConfirmDialog(null, "Si: consumo manual. No: consumo sensores");
           if(JOptionPane.OK_OPTION==reps){
               pp.getContenedor().controlPantallasServicios(1);
               Dao.getValoresTarifa("Energía");
               Dao.getTarifaEnergia();
           }
           else{
               pp.getContenedor().controlPantallas_gastos(1);
           }
        }
        if(e.getSource()==btn_gas){
            pp.getContenedor().controlPantallasServicios(2);
        }
        if(e.getSource()== btn_alcantarillado){
            pp.getContenedor().controlPantallasServicios(3);
               Dao.getValoresTarifa("Alcantarillado");
            
        }
        if(e.getSource()==btn_alumbrado){
            pp.getContenedor().controlPantallasServicios(4);
        }
        
        if(e.getSource()==btn_siguiente){
           pp.getContenedor().controlPantallas_gastos(2);
        }
    }
}
