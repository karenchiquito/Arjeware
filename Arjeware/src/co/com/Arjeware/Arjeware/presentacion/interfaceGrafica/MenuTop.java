/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import static co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Inicio.bandera_1;
import static co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Inicio.bandera_2;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JButtonArje;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;

/**
 *
 * @author Sebas
 */
public class MenuTop extends JPanel implements ActionListener{
    //Fundamentales----------------------
    protected Control_instancias pp;
    protected int width,height;
    //Botones-----------------------------
    private JButtonArje btn_perfil;
    private JButton btn_menu,btn_tips,btn_manual,btn_ajustes,btn_ayudanos,btn_arjeware;
    //Panel menu----------------------------
    private JPanel pnl_menu;
    private JScrollPane scp_scroll;
    //Banedras_----------------------
    public int bandera_menu=0;
    private boolean visibilidad=false;
    //Colores-------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    //IConos---------------------------------
    public ImageIcon icon_menu,icon_tips,icon_manual,icon_ajustes,icon_soporte,
            icon_perfil;
    
    public MenuTop(Control_instancias instancias,int width,int hegiht){
        this.height=hegiht;
        this.width=width;
        pp=instancias;
        
        this.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
        //this.setBorder(border);
        //this.add(new JScrollPane());
        
        icon_menu=new ImageIcon(getClass().getResource("/Imagenes/Btn_menu.png"));
        icon_tips=new ImageIcon(getClass().getResource("/Imagenes/Btn_tipsMenu.png"));
        icon_manual=new ImageIcon(getClass().getResource("/Imagenes/Btn_manualMenu.png"));
        icon_ajustes=new ImageIcon(getClass().getResource("/Imagenes/Btn_ajustesMenu.png"));
        icon_soporte=new ImageIcon(getClass().getResource("/Imagenes/Btn_soporte.png"));
        icon_perfil=new ImageIcon(getClass().getResource("/Imagenes/Btn_perfilMenu.png"));
        
        scp_scroll= new JScrollPane();
        
        btn_menu = new JButton();
            btn_menu.setIcon(icon_menu);
            btn_menu.setBorderPainted(false);
            btn_menu.setFocusPainted(false);
            btn_menu.addActionListener(this);
            add(btn_menu);
            
        pnl_menu = new JPanel();
            pnl_menu.setBackground(Color.white);
            
            pnl_menu.add(scp_scroll);
            add(pnl_menu);
            
        btn_tips = new JButton();
            btn_tips.setIcon(icon_tips);
            btn_tips.addActionListener(this);
            btn_tips.setBorderPainted(false);
            pnl_menu.add(btn_tips);
            
        btn_manual = new JButton();
            btn_manual.setIcon(icon_manual);
            btn_manual.addActionListener(this);
            btn_manual.setBorderPainted(false);
            pnl_menu.add(btn_manual);
            
        btn_ajustes = new JButton();
            btn_ajustes.setIcon(icon_ajustes);
            btn_ajustes.addActionListener(this);
            btn_ajustes.setBorderPainted(false);
            pnl_menu.add(btn_ajustes);
        
        btn_perfil = new JButtonArje("Btn_perfilMenu","Btn_perfilMenuSeleccion","png","png");
            btn_perfil.addActionListener(this);
            pnl_menu.add(btn_perfil);
            
        btn_ayudanos = new JButton();
            btn_ayudanos.setIcon(icon_soporte);
            btn_ayudanos.addActionListener(this);
            btn_ayudanos.setBorderPainted(false);
            pnl_menu.add(btn_ayudanos);
            
        btn_arjeware = new JButton("Metas");
            //btn_ayudanos.setIcon(icon_ajustes);
            btn_arjeware.addActionListener(this);
            btn_arjeware.setBorderPainted(false);
            pnl_menu.add(btn_arjeware);
            
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        super.setOpaque(false);
        
        setSize(width,height);
        btn_menu.setLocation(0,0);
        btn_menu.setBounds(306,0,35,29);
        
        scp_scroll.setBounds(320, 0, 20, 317-105);
        pnl_menu.setBounds(0, 31, 340, 317-105);
            btn_tips.setBounds(1,1,106,105);
            btn_manual.setBounds(1+106,1,106,105);
            btn_ajustes.setBounds(1+106*2 , 1 , 106 , 105);
            
            btn_perfil.setBounds(1, 105, 106, 105);
            btn_ayudanos.setBounds(1+106, 105, 106, 105);
            btn_arjeware.setBounds(1+106*2, 105, 106, 105);
            
            //VISIBILIDAD
            btn_ajustes.setVisible(visibilidad);
            btn_manual.setVisible(visibilidad);
            btn_tips.setVisible(visibilidad);
            
            btn_perfil.setVisible(visibilidad);
            btn_ayudanos.setVisible(visibilidad);
            btn_arjeware.setVisible(visibilidad);
            
            pnl_menu.setOpaque(visibilidad);
            pnl_menu.setEnabled(visibilidad);
            scp_scroll.setVisible(visibilidad);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_menu && bandera_menu>=1){
                pnl_menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
                visibilidad=false;
                bandera_menu++;
        }
        if(e.getSource()==btn_menu && bandera_menu==0){
                pnl_menu.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
                
                visibilidad=true;
                bandera_menu++;
        }
        if(e.getSource()==btn_menu && bandera_menu>=2){
                bandera_menu=0;
        }
        
        if(e.getSource()==btn_ajustes){
            pp.getContenedor().controlPantallasPerfil(0);
            visibilidad=false;
            pnl_menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
            bandera_menu=0;
            btn_menu.setBorderPainted(false);
        }
        
        if (e.getSource()==btn_tips) {
            pp.getContenedor().controlPantallas_Servicios(5);
            visibilidad=false;
            pnl_menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
            bandera_menu=0;
            btn_menu.setBorderPainted(false);
        }
        if(e.getSource()==btn_manual){
            pp.getContenedor().controlSubpantallas(8);
            visibilidad=false;
            pnl_menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
            bandera_menu=0;
            btn_menu.setBorderPainted(false);
        }
        if(e.getSource()==btn_perfil){
            pp.getContenedor().controlPantallas_topMenu(3);
            visibilidad=false;
            pnl_menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
            bandera_menu=0;
            btn_menu.setBorderPainted(false);
        }
        if(e.getSource()==btn_ayudanos){
            pp.getContenedor().controlPantallas_topMenu(0);
            visibilidad=false;
            pnl_menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
            bandera_menu=0;
            btn_menu.setBorderPainted(false);
        }
    }
}
