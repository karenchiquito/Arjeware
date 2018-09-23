/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sebas
 */
public class Servicios_tips extends JPanel implements ActionListener{
    //FUNDAMENTALES-----------------------------
    protected int width,height;
    protected Control_instancias pp;
    //Titulos-----------------------------------
    private JLabel lbl_titulo,lbl_fondoVideos,lbl_fondoFotos;
    //BOTONES---------------------------------
    private JButton btn_buscar;
    private JButton btn_adelanteVideos,btn_atrasVideos,btn_atrasFotos,btn_adelanteFotos;
    //Paneles botones------------
    private JButton btn_energia1;
    //TEXTOS-----------------------------------
    private JEditorPane txt_informacion;
    //PANELES------------------------------
    private JPanel pnl_tipsTodoVideos,pnl_tipsAguaVideos,pnl_tipsEnergiaVideos;
    private JPanel pnl_tipsTodoFotos;
    //ComboBox----------------------
    public JComboBox cbx_recurso;
    //ICONOS--------------------------------------------
    private ImageIcon icon_energia1,icon_atras,icon_atrasSeleccion,icon_adelante,icon_adelanteSeleccion
        ,icon_fondoVideos,icon_fondoFotos,icon_btnBuscar;
    //Colores------------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    public Servicios_tips(Control_instancias instancias, int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        icon_energia1=new ImageIcon(getClass().getResource("/Imagenes/Btn_ahorroEnergia1.gif"));
        icon_atras=new ImageIcon(getClass().getResource("/Imagenes/Btn_atrasTips.png"));
        icon_atrasSeleccion=new ImageIcon(getClass().getResource("/Imagenes/Btn_atrasTipsseleccion.png"));
        icon_adelante=new ImageIcon(getClass().getResource("/Imagenes/Btn_adelanteTips.png"));
        icon_adelanteSeleccion=new ImageIcon(getClass().getResource("/Imagenes/Btn_adelanteTipsseleccion.png"));
        icon_fondoVideos=new ImageIcon(getClass().getResource("/Imagenes/Lbl_cubiertaVideos.png"));
        icon_fondoFotos=new ImageIcon(getClass().getResource("/Imagenes/Lbl_cubiertaFotos.png"));
        icon_btnBuscar=new ImageIcon(getClass().getResource("/Imagenes/btn_buscarTips.png"));
        
        lbl_fondoVideos = new JLabel();
            lbl_fondoVideos.setIcon(icon_fondoVideos);
            //pnl_tipsTodoVideos.add(lbl_fondoVideos);   
        
        lbl_fondoFotos=new JLabel();
            lbl_fondoFotos.setIcon(icon_fondoFotos);
            
        cbx_recurso=new JComboBox();
            cbx_recurso.setFocusable(false);
            cbx_recurso.setForeground(verde_menu);
            cbx_recurso.setModel(new DefaultComboBoxModel(new String[]{"Todo","Agua","Energía","Gas","Varios"}));
            cbx_recurso.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            cbx_recurso.setBackground(Color.white);
            cbx_recurso.setForeground(new Color(50,50,50));
            add(cbx_recurso);
            
        pnl_tipsTodoVideos=new JPanel();
            pnl_tipsTodoVideos.setBackground(Color.white);
            pnl_tipsTodoVideos.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, verde_menu));
            this.add(pnl_tipsTodoVideos);
            pnl_tipsTodoVideos.add(lbl_fondoVideos);   
            
        pnl_tipsTodoFotos=new JPanel();
            pnl_tipsTodoFotos.setBackground(Color.white);
            pnl_tipsTodoFotos.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, verde_menu));
            this.add(pnl_tipsTodoFotos);
            pnl_tipsTodoFotos.add(lbl_fondoFotos);
        
        pnl_tipsAguaVideos=new JPanel();
            pnl_tipsAguaVideos.setBackground(Color.white);
            pnl_tipsAguaVideos.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, verde_menu));
            this.add(pnl_tipsAguaVideos);
            pnl_tipsAguaVideos.setVisible(false);
            
        pnl_tipsEnergiaVideos=new JPanel();
            pnl_tipsEnergiaVideos.setBackground(Color.white);
            pnl_tipsEnergiaVideos.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, verde_menu));
            this.add(pnl_tipsEnergiaVideos);
            pnl_tipsEnergiaVideos.setVisible(false);
        
        lbl_titulo = new JLabel("ARJEWARE TIPS");
            lbl_titulo.setForeground(verde_seleccion);
            lbl_titulo.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            add(lbl_titulo);
            
        txt_informacion=new JEditorPane();
            txt_informacion.setEditable(false);
            txt_informacion.setContentType("text/html");
            txt_informacion.setOpaque(false);
            txt_informacion.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#464646\" font size=\"4\">Aquí encontraras"
                +" maneras de ahorrar en los servicios de tu hogar de una manera práctica, sencilla y entendible, solo"
                    + " tienes que <b>seleccionar en que recurso deseas ahorrar</b> y ya te apareceran gif con un enlace"
                    + " directo a la página de Youtube con un <b>video instructivo</b> de como ahorrar en el recurso selecionado, "
                    + " o puedes elegir ver una sucesión de <b>fotos con instrucciones</b> paso a paso que te"
                    + " indicarán como ahorrar de diversas maneras en los servicios de tu hogar.</FONT>");
            this.add(txt_informacion);
            
        btn_buscar=new JButton(icon_btnBuscar);
            btn_buscar.setContentAreaFilled(false);
            btn_buscar.setBorderPainted(false);
            btn_buscar.setFocusPainted(false);
            btn_buscar.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            btn_buscar.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
            btn_buscar.addActionListener(this);
            add(btn_buscar);
            
        btn_energia1=new JButton();
            btn_energia1.setIcon(icon_energia1);
            btn_energia1.setContentAreaFilled(false);
            btn_energia1.setBorderPainted(false);
            btn_energia1.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
            btn_energia1.addActionListener(this);
            pnl_tipsTodoVideos.add(btn_energia1);
            
        btn_adelanteVideos=new JButton();
            btn_adelanteVideos.setIcon(icon_adelante);
            btn_adelanteVideos.setContentAreaFilled(false);
            btn_adelanteVideos.setBorderPainted(false);
            btn_adelanteVideos.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
            btn_adelanteVideos.addActionListener(this);
            add(btn_adelanteVideos);
        
        btn_adelanteFotos=new JButton();
            btn_adelanteFotos.setIcon(icon_adelante);
            btn_adelanteFotos.setContentAreaFilled(false);
            btn_adelanteFotos.setBorderPainted(false);
            btn_adelanteFotos.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
            btn_adelanteFotos.addActionListener(this);
            add(btn_adelanteFotos);
            
        btn_atrasVideos=new JButton();
            btn_atrasVideos.setIcon(icon_atras);
            btn_atrasVideos.setContentAreaFilled(false);
            btn_atrasVideos.setBorderPainted(false);
            btn_atrasVideos.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
            btn_atrasVideos.addActionListener(this);
            add(btn_atrasVideos);
            
        btn_atrasFotos=new JButton();
            btn_atrasFotos.setIcon(icon_atras);
            btn_atrasFotos.setContentAreaFilled(false);
            btn_atrasFotos.setBorderPainted(false);
            btn_atrasFotos.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
            btn_atrasFotos.addActionListener(this);
            add(btn_atrasFotos); 
            
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_buscar.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                btn_buscar.setBorderPainted(true);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btn_adelanteVideos.setIcon(icon_adelante);
                 lbl_fondoVideos.setIcon(icon_fondoVideos);
                 btn_buscar.setBorderPainted(false);
            }
        });
        
        btn_atrasVideos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_atrasVideos.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                btn_atrasVideos.setIcon(icon_atrasSeleccion);
                lbl_fondoVideos.setIcon(null);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btn_atrasVideos.setIcon(icon_atras);
                lbl_fondoVideos.setIcon(icon_fondoVideos);
            }
        });
        
        btn_adelanteVideos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_adelanteVideos.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                btn_adelanteVideos.setIcon(icon_adelanteSeleccion);
                lbl_fondoVideos.setIcon(null);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btn_adelanteVideos.setIcon(icon_adelante);
                 lbl_fondoVideos.setIcon(icon_fondoVideos);
            }
        });
        
        
        btn_energia1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_energia1.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                lbl_fondoVideos.setIcon(null);
                btn_energia1.setBorderPainted(true);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btn_adelanteFotos.setIcon(icon_adelante);
                lbl_fondoVideos.setIcon(icon_fondoVideos);
                btn_energia1.setBorderPainted(false);
            }
        });
        
        pnl_tipsTodoVideos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                lbl_fondoVideos.setIcon(null);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                lbl_fondoVideos.setIcon(icon_fondoVideos);
            }
        });
        
        //FOTOS------------------------FOTOS---------------------------FOTOS-----
        
        pnl_tipsTodoFotos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                lbl_fondoFotos.setIcon(null);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                lbl_fondoFotos.setIcon(icon_fondoFotos);
            }
        });
        
        btn_adelanteFotos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_adelanteFotos.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                btn_adelanteFotos.setIcon(icon_adelanteSeleccion);
                lbl_fondoFotos.setIcon(null);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btn_adelanteFotos.setIcon(icon_adelante);
                lbl_fondoFotos.setIcon(icon_fondoFotos);
            }
        });
        
        btn_atrasFotos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_atrasFotos.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                btn_atrasFotos.setIcon(icon_atrasSeleccion);
                lbl_fondoFotos.setIcon(null);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                btn_atrasFotos.setIcon(icon_atras);
                lbl_fondoFotos.setIcon(icon_fondoFotos);
            }
        });
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        lbl_titulo.setBounds(20, 5, 350, 25);
        txt_informacion.setBounds(20, 35, 750, 80);
        
        cbx_recurso.setBounds(40, 130, 100, 33);
        btn_buscar.setBounds(20+120, 130, 35, 35);
        
        btn_adelanteVideos.setBounds(775, 200, 40, 215);
        btn_atrasVideos.setBounds(5, 200, 40, 215);
        
        lbl_fondoVideos.setBounds(0, 0, 730, 215);
            lbl_fondoVideos.setVisible(true);
            
        lbl_fondoFotos.setBounds(0, 0, 730, 215);
            lbl_fondoFotos.setVisible(true);
        
        pnl_tipsTodoVideos.setBounds(45, 200, 730, 215);
        
        pnl_tipsAguaVideos.setBounds(45, 200, 730, 215);
        
        pnl_tipsEnergiaVideos.setBounds(45, 200, 730, 215);
            btn_energia1.setBounds(0, 1, 243, 213);
        
        pnl_tipsTodoFotos.setBounds(45, 430, 730, 215);
        
        btn_atrasFotos.setBounds(5, 430, 40, 215);
        btn_adelanteFotos.setBounds(775, 430, 40, 215);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_buscar && cbx_recurso.getSelectedItem()=="Todo"){
            pnl_tipsTodoVideos.setVisible(true);
            pnl_tipsTodoVideos.add(btn_energia1);
            
            pnl_tipsAguaVideos.setVisible(false);
            pnl_tipsEnergiaVideos.setVisible(false);
        }
        if(e.getSource()==btn_buscar && cbx_recurso.getSelectedItem()=="Agua"){
            pnl_tipsTodoVideos.setVisible(false);
            pnl_tipsAguaVideos.setVisible(true);
            pnl_tipsEnergiaVideos.setVisible(false);
        }
        if(e.getSource()==btn_buscar && cbx_recurso.getSelectedItem()=="Energía"){
            pnl_tipsTodoVideos.setVisible(false);
            pnl_tipsAguaVideos.setVisible(false);
            
            pnl_tipsEnergiaVideos.setVisible(true);
            pnl_tipsEnergiaVideos.add(btn_energia1);
        }
        if(e.getSource()==btn_energia1){
            if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = Desktop.getDesktop();
                
                if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try{
                        java.net.URI uri=new java.net.URI("https://www.youtube.com/watch?v=MdMeK_Yr0DM");
                        desktop.browse(uri);
                    }catch (URISyntaxException | IOException ex) {
                        Logger.getLogger(Servicios_tips.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        }
    }
}
