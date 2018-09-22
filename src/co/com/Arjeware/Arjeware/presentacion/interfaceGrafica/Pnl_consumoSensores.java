/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.entity.Entidades.Sesion;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.IconAjustado;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JLabelArje;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JTextFieldHint;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Colores;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Fonts;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Sebas
 */
public class Pnl_consumoSensores extends JPanel implements ActionListener{
    protected int width,height;
    protected Control_instancias pp;
    //JLabelArje----------------------
    private JLabelArje 
        /*Titulos*/
        lbl_titulo,lbl_tituloConsumos,lbl_tituloValorConsumos,lbl_tituloDatos
        /*Gasto m3*/
        ,lbl_gastoGas,lbl_gastoExceso,lbl_gastoTotal,
        /*EPM*/
        lbl_valorServicio,lbl_Subsidio,lbl_Exceso,lbl_valorCargoFijo,
        /*VALOR $$*/  
        lbl_valorConsumo,lbl_valorExceso,lbl_valorSubsidio,lbl_totalPagar,
        /*Registros*/
        lbl_registros,lbl_registro1,lbl_registro2;
    
    private JLabelArje
            /*Gasto m3 lb*/
            lb_gastoGas,lb_gastoExceso,lb_gastoTotal,
            /*EPM lb*/
            lb_valorServicio,lb_Subsidio,lb_Exceso,lb_valorCargoFijo,
            /*VALOR $$ lb*/
            lb_valorConsumo,lb_valorExceso,lb_valorSubsidio,lb_totalPagar;
    
    private JLabelArje lbl_fondo;
    IconAjustado iA=new IconAjustado();
    
    //JTextFieldHint-----------------------------
    private JTextFieldHint txt_registro1,txt_registro2;
    //JButton-------------------------------
    private JButton btn_enviarRegistros,btn_conoceMas,btn_grafica,btn_cerrar;

    public Pnl_consumoSensores (Control_instancias instancias,int width,int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        lbl_titulo=new JLabelArje();
            lbl_titulo.setTexto("Consumo manual gas.", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lbl_titulo);
            
        lbl_tituloConsumos=new JLabelArje();
            lbl_tituloConsumos.setTexto("Consumo de servicio (M3):", Fonts.microsoftNTL, 1, 14, Color.black);
            this.add(lbl_tituloConsumos);
            
        lbl_tituloValorConsumos=new JLabelArje();
            lbl_tituloValorConsumos.setTexto("Valor de consumo Gas ($ COP):", Fonts.microsoftNTL, 1, 14, Color.black);
            this.add(lbl_tituloValorConsumos);
            
        lbl_tituloDatos=new JLabelArje();
            lbl_tituloDatos.setTexto("Valores fijos Agua de ("+"EPM"+"): ", Fonts.microsoftNTL, 1, 14, Color.black);
            this.add(lbl_tituloDatos);
            
        lbl_gastoGas=new JLabelArje();
            lbl_gastoGas.setTexto("Gasto de gas: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_gastoGas);
            
        lbl_gastoExceso=new JLabelArje();
            lbl_gastoExceso.setTexto("Gasto en exceso: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_gastoExceso);
        
        lbl_gastoTotal=new JLabelArje();
            lbl_gastoTotal.setTexto("Gasto total: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_gastoTotal);
            
        lbl_valorServicio=new JLabelArje();
            lbl_valorServicio.setTexto("Valor por cm2: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_valorServicio);
            
        lbl_Subsidio=new JLabelArje();
            lbl_Subsidio.setTexto("Valor de subsidio: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_Subsidio);
            
        lbl_Exceso=new JLabelArje();
            lbl_Exceso.setTexto("Valor por cm2 de exceso: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_Exceso);
            
        lbl_valorCargoFijo=new JLabelArje();
            lbl_valorCargoFijo.setTexto("Valor de cargo fijo: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_valorCargoFijo);
            
        lbl_valorConsumo=new JLabelArje();
            lbl_valorConsumo.setTexto("Valor consumo: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_valorConsumo);
            
        lbl_valorExceso=new JLabelArje();
            lbl_valorExceso.setTexto("Valor exceso: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_valorExceso);
            
        lbl_valorSubsidio=new JLabelArje();
            lbl_valorSubsidio.setTexto("Valor de subsidio: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_valorSubsidio);
            
        lbl_totalPagar=new JLabelArje();
            lbl_totalPagar.setTexto("Total a pagar: ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeClaro,2);
            this.add(lbl_totalPagar);
        
        /*Gasto m3 lb*/
        lb_gastoGas=new JLabelArje();
            lb_gastoGas.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_gastoGas);
            
        lb_gastoExceso=new JLabelArje();
            lb_gastoExceso.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_gastoExceso);
            
        lb_gastoTotal =new JLabelArje();
            lb_gastoTotal.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_gastoTotal);
        /*EPM lb*/     
        lb_valorServicio=new JLabelArje();
            lb_valorServicio.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_valorServicio);
            
        lb_Subsidio=new JLabelArje();
            lb_Subsidio.setTexto("0,0 % ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_Subsidio);
            
        lb_Exceso=new JLabelArje();
            lb_Exceso.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_Exceso);
            
        lb_valorCargoFijo=new JLabelArje();
            lb_valorCargoFijo.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_valorCargoFijo);
        /*VALOR $$ lb*/
        lb_valorConsumo=new JLabelArje();
            lb_valorConsumo.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_valorConsumo);
            
        lb_valorExceso=new JLabelArje();
            lb_valorExceso.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_valorExceso);
            
        lb_valorSubsidio=new JLabelArje();
            lb_valorSubsidio.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_valorSubsidio);
            
        lb_totalPagar=new JLabelArje();
            lb_totalPagar.setTexto("$ 0,0 ", Fonts.microsoftNTL, 1, 14, Colores.color_verdeOscuro);
            this.add(lb_totalPagar);
            
        lbl_registros = new JLabelArje();
            lbl_registros.setTexto("Registros: Estrato "+Sesion.getEstrato(), Fonts.microsoftNTL, 1, 14, Color.black,2);
            this.add(lbl_registros);
            
        lbl_registro1=new JLabelArje();
            lbl_registro1.setTexto("Registro 1: ", Fonts.microsoftNTL, 1, 14, Color.black,2);
            this.add(lbl_registro1);
            
        lbl_registro2=new JLabelArje();
            lbl_registro2.setTexto("Registro 2: ", Fonts.microsoftNTL, 1, 14, Color.black,2);
            this.add(lbl_registro2);
            
        txt_registro1=new JTextFieldHint();
            txt_registro1.setFont(Fonts.font_titulos);
            txt_registro1.setHint("0");
            txt_registro1.setOpaque(false);
            txt_registro1.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(txt_registro1);
            
        txt_registro2=new JTextFieldHint();
            txt_registro2.setFont(Fonts.font_titulos);
            txt_registro2.setOpaque(false);
            txt_registro2.setHint("# > Registro 1");
            txt_registro2.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(txt_registro2);
            
        btn_enviarRegistros=new JButton("Enviar");
            btn_enviarRegistros.addActionListener(this);
            btn_enviarRegistros.setFocusable(false);
            //btn_enviarRegistros.setBorder(new BordeRedondo(20)); 
            btn_enviarRegistros.setBackground(Colores.color_verdeClaro);
            this.add(btn_enviarRegistros);
            
        btn_conoceMas=new JButton("Ver completo");    
            btn_conoceMas.addActionListener(this);
            btn_conoceMas.setFocusable(false);
            btn_conoceMas.setBackground(Colores.color_verdeClaro);
            btn_conoceMas.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
            //btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario.png")));
            add(btn_conoceMas);
            
        btn_grafica=new JButton("Gráfica");
            btn_grafica.addActionListener(this);
            btn_grafica.setFocusable(false);
            btn_grafica.setBackground(Colores.color_verdeClaro);
            btn_grafica.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
            //btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario.png")));
            add(btn_grafica);
            
        lbl_fondo=new JLabelArje();
            this.add(lbl_fondo);
    }
    
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    super.setBackground(Color.white);
    setSize(width, height);
    int x=10,y=75,x2=100;
      
    lbl_titulo.setBounds(10, 10, 150, 25);
    lbl_fondo.setBounds(150, 100, 489, 488);
    iA.setTamano("Btn_gasFondo", "png", lbl_fondo);
    
    /*Gastos m3*/
    lbl_tituloConsumos.setBounds(10+50, 50, 200, 25);
        lbl_gastoGas.setBounds(x, y, 125, 25);
        lbl_gastoExceso.setBounds(x, y+30, 125, 25);
        lbl_gastoTotal.setBounds(x, y+30*2, 125, 25);
        
        lb_gastoGas.setBounds(x+130, y, 125, 25);
        lb_gastoExceso.setBounds(x+130, y+30, 125, 25);
        lb_gastoTotal.setBounds(x+130, y+30*2, 125, 25);
      
    /*Valores $$ cobrados por EPM*/ 
    lbl_tituloDatos.setBounds(x2+375,50,275,25);
        lbl_valorServicio.setBounds(x2+350,y,200,25);
        lbl_Exceso.setBounds(x2+350, y+30, 200, 25);
        lbl_Subsidio.setBounds(x2+350, y+30*2, 200, 25);
        lbl_valorCargoFijo.setBounds(x2+350, y+30*3, 200, 25);
        
        lb_valorServicio.setBounds(x2+350+210,y,200,25);
        lb_Exceso.setBounds(x2+350+210, y+30, 200, 25);
        lb_Subsidio.setBounds(x2+350+210, y+30*2, 200, 25);
        lb_valorCargoFijo.setBounds(x2+350+210, y+30*3, 200, 25);
        
    /*Valores $$ por consumo*/
    lbl_tituloValorConsumos.setBounds(x+10, y+30*10, 300, 25);
            lbl_valorConsumo.setBounds(x, y+30*11, 125, 25);
            lbl_valorExceso.setBounds(x, y+30*12, 125, 25);
            lbl_valorSubsidio.setBounds(x, y+30*13, 125, 25);
            lbl_totalPagar.setBounds(x, y+30*14, 125, 25);
            
            lb_valorConsumo.setBounds(x+130, y+30*11, 125, 25);
            lb_valorExceso.setBounds(x+130, y+30*12, 125, 25);
            lb_valorSubsidio.setBounds(x+130, y+30*13, 125, 25);
            lb_totalPagar.setBounds(x+130, y+30*14, 125, 25);
            
    /*Registros y Graficas*/
        lbl_registros.setBounds(x+500, y+30*10, 150, 25);
            lbl_registros.setBounds(x+500, y+30*10, 150, 25);
            lbl_registro1.setBounds(x+425, y+30*11, 150, 25);
            
            txt_registro1.setBounds(x+575, y+30*11, 150, 25);
            lbl_registro2.setBounds(x+425, y+30*12, 150, 25);
            
            txt_registro2.setBounds(x+575, y+30*12, 150, 25);
            btn_enviarRegistros.setBounds(x+575, y+30*13, 150, 25);
            btn_grafica.setBounds(x+575, y+30*14, 150, 25);
  }
  
  public void actionPerformed (ActionEvent e){
  
  }
}
