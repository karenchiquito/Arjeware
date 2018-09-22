/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Sebas
 */
public class Sub_menu extends JPanel implements ActionListener{
    //Fundamentales-----------------
    protected Control_instancias pp;
    protected final int width,height;
    //MENU---------------------------------------
    private JMenuBar submenu;
    private JMenu ayuda,soporte,contacto,ayudanos,servicio,varios,mejorar;
    private JMenuItem sugerencias,dudas,manu,progamadores,foto,tips;
    //private FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
    
    public Sub_menu (Control_instancias instancias,int width,int height){
        this.width=width;
        this.height=height;
        
        pp= instancias;
        
        this.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));       
        //submenu CREACIÓN---------------------
        submenu= new JMenuBar();
        submenu.setBackground(Color.white);
        //Principales-----------------------
        ayuda=new JMenu("Ayuda");
        //-
        manu=new JMenuItem("Manual");
        manu.addActionListener(this);
        //-----
        soporte=new JMenu("Soporte técnico");
        //-----
        contacto=new JMenu("Contactanos");
        //-
        ayudanos=new JMenu("Ayudanos a mejorar");
        //-
        servicio=new JMenu("Nuestros servicios");
        //-----
        varios=new JMenu("Varios");
        //-
        mejorar=new JMenu("Mejorar ciudad");
        varios.add(mejorar);
        //-
        foto=new JMenuItem("Foto");
        foto.addActionListener(this);
        mejorar.add(foto);
        //-
        tips=new JMenuItem("Tips");
        tips.addActionListener(this);
        mejorar.add(tips);
        //Secundarios-----------------------
        sugerencias=new JMenuItem("Sugerencias");
        sugerencias.addActionListener(this);
        dudas=new JMenuItem("Preguntas frecuentes");
        progamadores=new JMenuItem("Programadores");
        progamadores.addActionListener(this);
        //Añadir/Principales----------------
        ayuda.add(dudas);
        ayuda.addSeparator();
        ayuda.add(manu);
        //-
        contacto.add(servicio);
        contacto.addSeparator();
        contacto.add(ayudanos);
        //Añadir/Secundarios
        ayudanos.add(sugerencias);
        servicio.add(progamadores);
        //Añadir a submenu
        submenu.add(ayuda);
        submenu.add(soporte);
        submenu.add(contacto);
        submenu.add(varios);
        add(submenu);
        //-------------------------------------------
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        submenu.setLocation(0,0);
        submenu.setBounds(0,0,width,height-676);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==manu){
            pp.getContenedor().controlSubpantallas(8);
        }
        if(e.getSource()==sugerencias){
            pp.getContenedor().controlPantallas_topMenu(0);
        }
        if(e.getSource()==progamadores){
            pp.getContenedor().controlPantallas_topMenu(1);
        }
        if(e.getSource()==foto){
            pp.getContenedor().controlPantallas_topMenu(2);
        }
    }
    
}
