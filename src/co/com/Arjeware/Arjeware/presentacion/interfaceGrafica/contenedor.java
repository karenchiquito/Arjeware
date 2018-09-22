package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicio_aguaSensores;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios_energia;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios_1;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicio_Programadores;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoAlcantarillado;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoAgua;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoOtro;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoEnergia;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Registro;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoGas;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoSensores;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoAseo;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Perfil;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_resumenServicios;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Pnl_consumoAlumbrado;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Perfil_editarDatos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.lang.InstantiationException;
import java.util.Locale;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author wmuno
 */
public class contenedor extends JPanel {
    //PANEL (MENU PRINCIPAL Y PRINCIPAL)---
    public JPanel Contenido = new JPanel();
    private JPanel MenuP = new JPanel();
    //PANEL (SUBMENUS)----------------------
    private JPanel MenuTop = new JPanel();
    
    protected int frameSize[] = new int[2];
    private JPanel ultJPanel;
    private Control_instancias pp;
    private boolean controlMenu = false;
    private boolean control_submenu= false;
    private boolean control_Jpanel = false;
    private boolean control_MenuTop=false;
    private int DimencionesActual_x;
    private int DimencionesActual_y;
    
    public boolean ignorarPintar=true;
    

    public contenedor(int width, int height, Control_instancias a) {
        frameSize[0] = width;
        frameSize[1] = height;
        DimencionesActual_x = width;
        DimencionesActual_y = height;
        this.pp = a;
        
        /*submenu.add(new Sub_menu(a,width,height));
        add(submenu); */

        MenuP.add(new menuprincipal(a, width, height));
        this.add(MenuP);
        
        MenuTop.add(new MenuTop(a,width,height));
        add(MenuTop);
        
        Contenido.setLayout(new FlowLayout(FlowLayout.LEFT,0,0)); 
        Contenido.add(ultJPanel = new Inicio_Sesion(pp, width, height));
        //Contenido.add(ultJPanel.add(barra));
        add(Contenido);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        super.setBackground(Color.BLACK);
        
        Dimension d = getSize();
        

        MenuP.setBounds(0, 0, frameSize[0] / 4, frameSize[1]);
        MenuP.setBackground(new java.awt.Color(122, 212, 52));
        MenuP.setSize(frameSize[0] / 4, frameSize[1]);
        MenuP.setFocusable(false);
        MenuP.setVisible(controlMenu);
       // MenuP.paintComponents(g);
        
        //MenuTop.setBounds(1050, 0, frameSize[0]-275 - 700, frameSize[1]-670); // 533
        MenuTop.setBounds(740, 5, frameSize[0]-275 -483, frameSize[1]-350);
        MenuTop.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
        MenuTop.setBackground(Color.white);
        MenuTop.setVisible(control_MenuTop);
        MenuTop.setOpaque(false);
        MenuTop.setVisible(controlMenu);

        Contenido.setBounds((controlMenu)? MenuP.getWidth():0, 0, frameSize[0], frameSize[1]);
        Contenido.setSize(DimencionesActual_x, frameSize[1]);
        Contenido.setBackground(Color.white);
        Contenido.setFocusable(false);
        Contenido.setDoubleBuffered(true);
        //barra.setBounds(0, DimencionesActual_y-45,DimencionesActual_x , 20);
    }
        
    /**
     * Metodo temporal
     */
    public void validarInicioDeSeccion() {
        controlMenu = true;
        control_submenu=true;
        control_MenuTop=true;
        DimencionesActual_x = frameSize[0]+frameSize[1];
        controlPantallas(0);
    }
    
    
    public void ValidarCerrarSeccion(){
        controlMenu = false;
        control_submenu = false;
        DimencionesActual_x = frameSize[0];
        DimencionesActual_y= frameSize[1];
        controlPantallas(4);
    }
    
    public void controlPantallasServicios(int Index){
        Contenido.remove(ultJPanel);

        switch (Index) {
            case 0:/*CONSUMO MANUAL AGUA*/
                Contenido.add(ultJPanel = new Pnl_consumoAgua(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 1:/*CONSUMO MANUAL ENERGÍA*/
                Contenido.add(ultJPanel = new Pnl_consumoEnergia(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 2:/*CONSUMO MANUAL GAS*/
                Contenido.add(ultJPanel = new Pnl_consumoGas(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 3:/*CONSUMO MANUAL ALCANTARILLADO*/
               Contenido.add(ultJPanel=new Pnl_consumoAlcantarillado(pp,frameSize[0]-MenuP.getWidth(),frameSize[1]));
               break;
            case 4:/*CONSUMO MANUAL ALUMBRADO*/
                Contenido.add(ultJPanel=new Pnl_consumoAlumbrado(pp,frameSize[0]-MenuP.getWidth(),frameSize[1]));
                break;
            case 5:/*CONSUMO ASEO*/
                Contenido.add(ultJPanel=new Pnl_consumoAseo(pp,frameSize[0]-MenuP.getWidth(),frameSize[1]));
                break;
            case 6:/*CONSUMO OTROS*/
                Contenido.add(ultJPanel=new Pnl_consumoOtro(pp,frameSize[0]-MenuP.getWidth(),frameSize[1]));
                break;
            case 7:/*CONSUMO SENSORES*/
                Contenido.add(ultJPanel=new Pnl_consumoSensores(pp,frameSize[0]-MenuP.getWidth(),frameSize[1]));
                break;
            
            default:
                throw new IndexOutOfBoundsException("El indice ingresado no se encuentra declarado");
        }
        Contenido.updateUI();
        Contenido.repaint();
    }
    
    
    public void controlPantallas(int Index) {
        Contenido.remove(ultJPanel);
        

        switch (Index) {
            case 0:
                Contenido.add(ultJPanel = new Inicio(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                //Contenido.add(ultJPanel = new Perfil(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                Contenido.add(ultJPanel = new Pnl_resumenServicios(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;

            case 2:
                Contenido.add(ultJPanel = new Servicios(frameSize[0] - MenuP.getWidth(), frameSize[1], pp));
                break;

            case 3:
                Contenido.add(ultJPanel = new Servicios_energia(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 4:
                Contenido.add(ultJPanel = new Inicio_Sesion(pp, frameSize[0], frameSize[1]));
                break;
            case 5:
                Contenido.add(ultJPanel = new Registro(pp,frameSize[0],frameSize[1]));
                break;
            case 6:
                Contenido.add(ultJPanel = new Creditos(pp,frameSize[0] - MenuP.getWidth(),frameSize[1]));
                break;
            case 7:
                Contenido.add(ultJPanel = new Ciudad(pp,frameSize[0] - MenuP.getWidth(),frameSize[1]));
                break;
            
            default:
                throw new IndexOutOfBoundsException("El indice ingresado no se encuentra declarado");
        }
        Contenido.updateUI();
        Contenido.repaint();
        /*Intento #6 de eliminar el parpadeo ajajajaja bitacora bushlayear*/
        //SwingUtilities.updateTreeUI(Contenido); 
        //Contenido.validateTree(); 
        
    }
    
    public void controlPantallasPerfil(int Index) {
        Contenido.remove(ultJPanel);

        switch (Index) {
            case 0:
                Contenido.add(ultJPanel = new Perfil_editarDatos(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            
            default:
                throw new IndexOutOfBoundsException("El indice ingresado no se encuentra declarado");
        }
        Contenido.updateUI();
        Contenido.repaint();
    }

    public void controlSubpantallas(int Index) {
        Contenido.remove(ultJPanel);

        switch (Index) {
            case 0:
                //Contenido.add(ultJPanel = new Servicios_agua(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                Contenido.add(ultJPanel = new Pnl_consumoAgua(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                Contenido.add(ultJPanel = new Servicios_energia(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 2:
                Contenido.add(ultJPanel = new Pnl_consumoGas(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 3:
                Contenido.add(ultJPanel = new Ahorrar(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 4:
                Contenido.add(ultJPanel = new recuperar_contraseña(pp,frameSize[0],frameSize[1]));
                break;
                
                
            //Pantalla ahorro de Inicio    
            case 5:
                Contenido.add(ultJPanel = new Ahorro_gas(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 6:
                Contenido.add(ultJPanel = new Ahorro_energia(frameSize[0] - MenuP.getWidth(),frameSize[1]));
                break;
            //AGUA AGUA AGUA AGUA AGUA
            case 7:
                Contenido.add(ultJPanel = new Ahorro_agua(pp,frameSize[0] - MenuP.getWidth(),frameSize[1]));
                break;
            case 8:
                Contenido.add(ultJPanel = new Manual(pp,frameSize[0] - MenuP.getWidth(),frameSize[1]));
                break;
        }

        Contenido.updateUI();
        Contenido.repaint();
    }
    
    public void controlPantallas_Servicios(int Index) {
        Contenido.removeAll();
        
        switch (Index) {
            case 0:
                Contenido.add(ultJPanel = new Servicios_1(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
                
           //OTROS SERVICIOS-------------------
            case 3:
               Contenido.add(ultJPanel=new Pnl_consumoAlcantarillado(pp,frameSize[0]-MenuP.getWidth(),frameSize[1]));
               break;
           //TIENDA--------------
            case 4:
               Contenido.add(ultJPanel=new Tienda(pp,frameSize[0]-MenuP.getWidth(),frameSize[1]));
               break;
           //TIPS----------------
              case 5:
               Contenido.add(ultJPanel=new Servicios_tips(pp,frameSize[0]-MenuP.getWidth(),frameSize[1]));
               break;
        }
        Contenido.updateUI();
        Contenido.repaint();
    }
    
    public void controlPantallas_gastos(int Index) {
        Contenido.removeAll();
        
        switch (Index) {
            case 0:
                Contenido.add(ultJPanel = new Gastos(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                Contenido.add(ultJPanel = new Servicio_aguaSensores(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 2:
                Contenido.add(ultJPanel = new Gastos2(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
        }
        Contenido.updateUI();
        Contenido.repaint();
    }
    
    public void controlPantallas_agua(int Index) {
        Contenido.removeAll();
        
        switch (Index) {
            //Que es el agua
            case 0:
                Contenido.add(ultJPanel = new Ahorro_agua_agua(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            //Cuida este recurso
            case 1:
                Contenido.add(ultJPanel = new Ahorro_agua_cuida(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            //Huella hidríca
            case 2:
                Contenido.add(ultJPanel = new Ahorro_agua_huella(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            //Ahorra en el hogar
            case 3:
                Contenido.add(ultJPanel = new Ahorro_agua_casa(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
        }
        Contenido.updateUI();
        Contenido.repaint();
    }
    
    public void controlPantallas_gas(int Index) {
        Contenido.removeAll();
        
        switch (Index) {
             case 0:
                Contenido.add(ultJPanel = new Ahorro_gas_gas(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break; 
            case 1:
                Contenido.add(ultJPanel = new Ahorro_gas_huella(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;    
            case 2:
                Contenido.add(ultJPanel = new Ahorro_gas_ahorra(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 3:
                Contenido.add(ultJPanel = new Ahorro_gas_gas_1(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
        }
        Contenido.updateUI();
        Contenido.repaint();
    }
    
    public void controlPantallas_Manual(int Index) {
        Contenido.removeAll();
        
        switch (Index) {
            case 0:
                Contenido.add(ultJPanel = new Manual_Menu(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                Contenido.add(ultJPanel = new Manual_Menu_1(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 2:
                Contenido.add(ultJPanel = new Manual_acgns(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 3:
                Contenido.add(ultJPanel = new Manual_acgns_1(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
        }
        Contenido.updateUI();
        Contenido.repaint();
    }
     public void controlPantallas_Creditos(int Index) {
        Contenido.removeAll();
        
        switch (Index) {
            case 0:
                Contenido.add(ultJPanel = new Creditos(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                Contenido.add(ultJPanel = new Creditos_1(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
        }
        Contenido.updateUI();
        Contenido.repaint();
    }
     
     public void controlPantallas_topMenu(int Index) {
        Contenido.removeAll();
        
        switch (Index) {
            //SUGERENCIAS
            case 0:
                Contenido.add(ultJPanel = new Sugerencias(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 1:
                Contenido.add(ultJPanel = new Servicio_Programadores(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            //MEJORAR CIUDAD---------------------------
            case 2:
                Contenido.add(ultJPanel = new Sub_menu_foto(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 3: 
                Contenido.add(ultJPanel = new Perfil(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
            break;
        }
        Contenido.updateUI();
        Contenido.repaint();
    }
     
    public void controlPantallas_Ciudad(int Index) {
        Contenido.removeAll();
        
        switch (Index) {
            //PROYECTOS
            case 0:
                Contenido.add(ultJPanel = new Ciudad_proyectos(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
                
            //CONTAMINACIÓN
            case 1:
                Contenido.add(ultJPanel = new Ciudad_contaminacion(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            case 2:
                Contenido.add(ultJPanel = new Ciudad_contaminacion_01(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
            //ARJEWARE------------
            case 3:
                Contenido.add(ultJPanel = new Ciudad_arjeware(pp,frameSize[0] - MenuP.getWidth(), frameSize[1]));
                break;
        }
        Contenido.updateUI();
        Contenido.repaint();
    }
    

    /**
     * Maneja la instancia del contenido
     *
     * @param Nombre_Pantalla Nombre de la pantalla que se debe cargar
     */
    
}
