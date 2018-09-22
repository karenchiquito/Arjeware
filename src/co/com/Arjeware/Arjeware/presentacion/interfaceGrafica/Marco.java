/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Perfil;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoEnergia;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_resumenServicios;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicio_aguaSensores;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoAgua;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Registro;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicio_Programadores;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Perfil_editarDatos;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.recuperar_contraseña;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios_tips;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios_1;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Sugerencias;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios_acgns;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.menuprincipal;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Sub_menu_foto;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Tienda;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios_gas;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios_energia;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Sebas
 */
public class Marco extends JFrame{
    //FUNDAMENTALES PARA EL FUNCIONAMIENTO
    protected int width,height;
    private Control_instancias pp; 
    
    //Tamaños etc...
    protected int frameSize[] = new int[2];
    Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    int frame[] = {1100,700,pantalla.width,pantalla.height};
    //JPANELes......................
    private JPanel laminaPrincipal,laminaMenuP,laminaMenuTop;
    //CONTROLES
    private boolean controlMenu = false;
    private boolean control_MenuTop=false;
    private int DimencionesActual_x;
    
    public Marco(Control_instancias instancias,int width, int height){
        frameSize[0]=width;
        frameSize[1]=height;
        DimencionesActual_x = width;
        pp=instancias;
        //this.setIconImage(icono);
        
        this.add(laminaPrincipal=new Inicio_Sesion(pp,frameSize[0],frameSize[1]));
        this.add(laminaMenuP=new menuprincipal(pp,frameSize[0]/4,frameSize[1]));
        this.add(laminaMenuTop = new MenuTop(pp,width,height));
        System.out.println("Se construyo el marco");
        
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Arjeware");
        this.setLocation((frame[2]-frame[0])/2,(frame[3]-frame[1])/2);
        this.setSize(frame[0],frame[1]);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        laminaMenuP.setBounds(0, 0, frameSize[0] / 4, frameSize[1]);
        laminaMenuP.setBackground(new java.awt.Color(122, 212, 52));
        laminaMenuP.setSize(frameSize[0] / 4, frameSize[1]);
        laminaMenuP.setFocusable(false);
        laminaMenuP.setVisible(controlMenu);
        
        laminaMenuTop.setBounds(740, 5, frameSize[0]-275 -483, frameSize[1]-350);
        laminaMenuTop.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
        laminaMenuTop.setBackground(Color.white);
        laminaMenuTop.setVisible(control_MenuTop);
        laminaMenuTop.setOpaque(false);
        laminaMenuTop.setVisible(control_MenuTop);
        
        laminaPrincipal.setBounds((controlMenu)? laminaMenuP.getWidth():0, 0, frameSize[0], frameSize[1]);
        laminaPrincipal.setSize(DimencionesActual_x, frameSize[1]);
        laminaPrincipal.setBackground(Color.white);
        laminaPrincipal.setFocusable(false);
        laminaPrincipal.setDoubleBuffered(true);
    }
    
    public void validarInicioDeSeccion(){
        controlMenu=true;
        control_MenuTop=true;
        DimencionesActual_x = frameSize[0]+frameSize[1];
        controlPantallas(0);
    }
    
    public void ValidarCerrarSeccion(){
        controlMenu = false;
        control_MenuTop = false;
        DimencionesActual_x = frameSize[0];
        controlPantallas(4);
    }
    
    public void controlPantallas(int index){
        this.remove(laminaPrincipal);
        
        switch (index) {
            case 0:
                this.add(laminaPrincipal = new Inicio(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                //Contenido.add(ultJPanel = new Perfil(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                this.add(laminaPrincipal = new Pnl_resumenServicios(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;

            case 2:
                this.add(laminaPrincipal = new Servicios(frameSize[0] - laminaMenuP.getWidth(), frameSize[1], pp));
                break;

            case 3:
                this.add(laminaPrincipal = new Servicios_energia(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 4:
                this.add(laminaPrincipal = new Inicio_Sesion(pp, frameSize[0], frameSize[1]));
                break;
            case 5:
                this.add(laminaPrincipal = new Registro(pp,frameSize[0],frameSize[1]));
                break;
            case 6:
                this.add(laminaPrincipal = new Creditos(pp,frameSize[0] - laminaMenuP.getWidth(),frameSize[1]));
                break;
            case 7:
                this.add(laminaPrincipal = new Ciudad(pp,frameSize[0] - laminaMenuP.getWidth(),frameSize[1]));
                break;
            
            default:
                throw new IndexOutOfBoundsException("El indice ingresado no se encuentra declarado");
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallasPerfil(int Index) {
        this.remove(laminaPrincipal);

        switch (Index) {
            case 0:
                this.add(laminaPrincipal = new Perfil_editarDatos(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            
            default:
                throw new IndexOutOfBoundsException("El indice ingresado no se encuentra declarado");
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlSubpantallas(int Index) {
        this.remove(laminaPrincipal);

        switch (Index) {
            case 0:
                //Contenido.add(ultJPanel = new Servicios_agua(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                this.add(laminaPrincipal = new Pnl_consumoAgua(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                this.add(laminaPrincipal = new Servicios_energia(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 2:
                this.add(laminaPrincipal = new Servicios_gas(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 3:
                this.add(laminaPrincipal = new Ahorrar(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 4:
                this.add(laminaPrincipal = new recuperar_contraseña(pp,frameSize[0],frameSize[1]));
                break;
            //Pantalla ahorro de Inicio    
            case 5:
                this.add(laminaPrincipal = new Ahorro_gas(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 6:
                this.add(laminaPrincipal = new Ahorro_energia(frameSize[0] - laminaMenuP.getWidth(),frameSize[1]));
                break;
            //AGUA AGUA AGUA AGUA AGUA
            case 7:
                this.add(laminaPrincipal = new Ahorro_agua(pp,frameSize[0] - laminaMenuP.getWidth(),frameSize[1]));
                break;
            case 8:
                this.add(laminaPrincipal = new Manual(pp,frameSize[0] - laminaMenuP.getWidth(),frameSize[1]));
                break;
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallas_Servicios(int Index) {
        this.removeAll();
        
        switch (Index) {
            case 0:
                this.add(laminaPrincipal = new Servicios_1(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
                
           //OTROS SERVICIOS-------------------
            case 3:
               this.add(laminaPrincipal=new Servicios_acgns(pp,frameSize[0]-laminaMenuP.getWidth(),frameSize[1]));
               break;
           //TIENDA--------------
            case 4:
               this.add(laminaPrincipal=new Tienda(pp,frameSize[0]-laminaMenuP.getWidth(),frameSize[1]));
               break;
           //TIPS----------------
              case 5:
               this.add(laminaPrincipal=new Servicios_tips(pp,frameSize[0]-laminaMenuP.getWidth(),frameSize[1]));
               break; 
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallas_gastos(int Index) {
        this.removeAll();
        
        switch (Index) {
            case 0:
                this.add(laminaPrincipal = new Gastos(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                this.add(laminaPrincipal = new Servicio_aguaSensores(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallas_agua(int Index) {
        this.removeAll();
        
        switch (Index) {
            //Que es el agua
            case 0:
                this.add(laminaPrincipal = new Ahorro_agua_agua(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            //Cuida este recurso
            case 1:
                this.add(laminaPrincipal = new Ahorro_agua_cuida(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            //Huella hidríca
            case 2:
                this.add(laminaPrincipal = new Ahorro_agua_huella(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            //Ahorra en el hogar
            case 3:
                this.add(laminaPrincipal = new Ahorro_agua_casa(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallas_energia(int Index) {
        this.removeAll();
        
        switch (Index) {
            //Que es el agua
            case 0:
                this.add(laminaPrincipal = new Pnl_consumoEnergia(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallas_gas(int Index) {
        this.removeAll();
        
        switch (Index) {
             case 0:
                this.add(laminaPrincipal = new Ahorro_gas_gas(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break; 
            case 1:
                this.add(laminaPrincipal = new Ahorro_gas_huella(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;    
            case 2:
                this.add(laminaPrincipal = new Ahorro_gas_ahorra(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 3:
                this.add(laminaPrincipal = new Ahorro_gas_gas_1(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallas_Manual(int Index) {
        this.removeAll();
        
        switch (Index) {
            case 0:
                this.add(laminaPrincipal = new Manual_Menu(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                this.add(laminaPrincipal = new Manual_Menu_1(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 2:
                this.add(laminaPrincipal = new Manual_acgns(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 3:
                this.add(laminaPrincipal = new Manual_acgns_1(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallas_Creditos(int Index) {
        this.removeAll();
        
        switch (Index) {
            case 0:
                this.add(laminaPrincipal = new Creditos(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                this.add(laminaPrincipal = new Creditos_1(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallas_topMenu(int Index) {
        this.removeAll();
        
        switch (Index) {
            //SUGERENCIAS
            case 0:
                this.add(laminaPrincipal = new Sugerencias(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                this.add(laminaPrincipal = new Servicio_Programadores(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            //MEJORAR CIUDAD---------------------------
            case 2:
                this.add(laminaPrincipal = new Sub_menu_foto(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 3: 
                this.add(laminaPrincipal = new Perfil(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
            break;
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
    public void controlPantallas_Ciudad(int Index) {
        this.removeAll();
        
        switch (Index) {
            //PROYECTOS
            case 0:
                this.add(laminaPrincipal = new Ciudad_proyectos(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
                
            //CONTAMINACIÓN
            case 1:
                this.add(laminaPrincipal = new Ciudad_contaminacion(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            case 2:
                this.add(laminaPrincipal = new Ciudad_contaminacion_01(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
            //ARJEWARE------------
            case 3:
                this.add(laminaPrincipal = new Ciudad_arjeware(pp,frameSize[0] - laminaMenuP.getWidth(), frameSize[1]));
                break;
        }
        this.paintAll(this.getGraphics());
        this.repaint();
    }
    
}
