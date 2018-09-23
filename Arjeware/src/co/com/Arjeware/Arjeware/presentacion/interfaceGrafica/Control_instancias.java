package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.MenuTop;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Registro;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Sub_menu;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.menuprincipal;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Servicios;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.contenedor;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Control_instancias {
    protected menuprincipal menu;
    protected Servicios servis;
    protected Inicio_Sesion iniciar;
    protected Registro registro;
    //protected contenedor_verdadero contenedor;
    protected contenedor contenedor;
    protected JFrame frame;
    protected JPanel contenido;
    protected Inicio inicio;
    protected Ahorrar ahorrar;
    protected Ahorro_gas gas;
    protected Sub_menu sub_menu;
    protected MenuTop MenuTop;
            
        
    public Control_instancias() {
        menu = null;
        contenedor = null;
        frame = null;
        contenido = null;
        servis = null;
        inicio= null;
        iniciar=null;
        registro=null;
        ahorrar=null;
        gas=null;
        sub_menu=null;
        MenuTop=null;
    }
    
    /**
     * Guarda la instancia de los elementos
     * @param contenedor Object Contendor
     */
    public void update(contenedor contenedor){
        this.contenedor = contenedor;
    }
    
    public void update(Inicio_Sesion iniciar){
        this.iniciar=iniciar;
    }
    public void update(Sub_menu sub_menu){
        this.sub_menu=sub_menu;
    }
    public void update(Registro registro){
        this.registro=registro;
    }
    public void update(Ahorrar ahorrar){
        this.ahorrar=ahorrar;
    }
    
    public void update(Ahorro_gas gas){
        this.gas=gas;
    }
    
    /**
     * Guarda la instancia de los elementos
     * @param menu Object menu
     */
    public void update(menuprincipal menu){
        this.menu = menu;
    }
    public void update(Servicios servis) {
    	this.servis = servis;
    }
    public void update(Inicio inicio) {
    	this.inicio = inicio;
    }
    /**
     * Guarda instancias de un objecto
     * @param frame Object - JFrame
     */
    public void update(JFrame frame){
        this.frame = frame;
    }
    
    /**
     * Guarda instancias de un obejto
     * @param contenido
     */
    public void update(JPanel contenido){
        this.contenido = contenido;
    }
    
    public void update(MenuTop MenuTop){
        this.MenuTop = MenuTop;
    }

    public menuprincipal getMenu() {
        return menu;
    }

    public contenedor getContenedor() {
        return contenedor;
    }
    
    public Ahorro_gas getAhorro_gas(){
        return gas;
    }
    
    public Ahorrar getahorrar(){
        return ahorrar;
    }
    
    public Sub_menu getsub_menu(){
        return sub_menu;
    }
    
    public MenuTop getMenuTop(){
        return MenuTop;
    }

    public Inicio_Sesion getInicio_Sesion(){
        return iniciar;  
    }
    public Registro getRegistro(){
        return registro;
    }
    public JFrame getFrame() {
        return frame;
    }

    public JPanel getContenido() {
        return contenido;
    }
    
    
}
