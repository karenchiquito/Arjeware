/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import Metodos.IconAjustado;
import Metodos.JLabelArje;
import Metodos.PruebaJFreeChart;
import Utilidades.Colores;
import Utilidades.Fonts;
import Utilidades.Tiempo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Sebas
 */
public class Pnl_resumenServicios extends JPanel implements ActionListener{
    //Datos enviados por el metodo------------
    protected int width,height;
    protected Control_instancias pp;
    //LABELS
    private JLabel lbl_titulo,lbl_titulo2,lbl_fecha,lbl_costosConsumo,
            lbl_acueducto,lbl_alcantarillado,lbl_energia,lbl_gas,lbl_total,
            
            lbl_consumoMes,lbl_consumoAcueducto,lbl_consumoAlcantarillado,
            lbl_consumoEnergia,lbl_consumoGas;
    
    private JLabelArje lbl_alumbrado,lbl_aseo,lbl_otro,
            
            lbl_consumoAlumbrado,lbl_consumoAseo,lbl_consumoOtro;
    
    private JLabel lbl_aguaIcono,lbl_alcantarilladoIcon,lbl_energiaIcon,lbl_alumbradoIcon,
            lbl_gasIcon;
    //Graficas----------------
    DefaultCategoryDataset data = new DefaultCategoryDataset();
    
    public XYSeries serie1= new XYSeries("Agua"),serie2 = new XYSeries("Acueducto"),
            serie3=new XYSeries("Energía"),serie4=new XYSeries("Gas");
    final XYSeriesCollection collection = new XYSeriesCollection();;
    
    PruebaJFreeChart prueba = new PruebaJFreeChart();
    JFreeChart chart = prueba.crearGrafica(collection);
    
    ChartPanel chartPanel = new ChartPanel(chart);
    
    private JLabel grafica;
    
    //Variables------------------------
    Tiempo t =new Tiempo();
    IconAjustado iA=new IconAjustado();
    
    public Pnl_resumenServicios(Control_instancias instancias,int width,int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        /*GRÁFICAS-----------------------------------*/
        
            serie1.add(1, 12000);
            serie1.add(2, 10000);
            serie1.add(3, 14000);
            serie1.add(4, 20000);
            serie1.add(5, 17000);
            serie1.add(6, 16000);
            serie1.add(7, 14000);
            serie1.add(8, 12000);
            serie1.add(9, 11000);
            serie1.add(10, 8000);
            serie1.add(11, 9000);
            serie1.add(12, 8500);
            
            serie2.add(1, 11000);
            serie2.add(2, 9000);
            serie2.add(3, 13000);
            serie2.add(4, 18000);
            serie2.add(5, 13000);
            serie2.add(6, 12000);
            serie2.add(7, 14000);
            serie2.add(8, 12000);
            serie2.add(9, 11000);
            serie2.add(10, 9009);
            serie2.add(11, 9000);
            serie2.add(12, 10000);
            
            serie3.add(1, 30000);
            serie3.add(2, 30000);
            serie3.add(3, 30000);
            serie3.add(4, 30000);
            serie3.add(5, 30000);
            
            serie4.add(1, 8500);
            serie4.add(2, 8500);
            serie4.add(3, 8500);
            serie4.add(4, 8500);
            serie4.add(5, 8500);
            
            collection.addSeries(serie1);
            collection.addSeries(serie2);
            collection.addSeries(serie3);
            collection.addSeries(serie4);
            
            chartPanel.setBackground(Color.white);
            chartPanel.setOpaque(false);
            chartPanel.createToolTip();
            this.add(chartPanel);
            chartPanel.setVisible(true);
            
            try {
                
		ChartUtilities.saveChartAsPNG(new File("tiempos-entrenamientos.png"), chart, 400, 200);
                
                
            } catch (Exception e) {
		e.printStackTrace();
            }
        
        /*---------------------------------------------*/
        
        lbl_titulo=new JLabel("Resumen de servicios");
            this.add(lbl_titulo);
           
        lbl_titulo2=new JLabel("Valor en pesos Colombianos (COP)");
            lbl_titulo2.setFont(Fonts.font_normal);
            this.add(lbl_titulo2);
            
        lbl_fecha=new JLabel("Fecha: "+t.fecha);
            lbl_fecha.setFont(Fonts.font_titulos);
            this.add(lbl_fecha);
            
        lbl_costosConsumo=new JLabel("Costos del mes: $");
            lbl_costosConsumo.setFont(Fonts.font_titulos);
            this.add(lbl_costosConsumo);
            
        lbl_acueducto=new JLabel("Agua/Acueducto: ");
            lbl_acueducto.setFont(Fonts.font_normal);
            lbl_acueducto.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_acueducto);
            
        lbl_alcantarillado=new JLabel("Alcantarillado: ");
            lbl_alcantarillado.setFont(Fonts.font_normal);
            lbl_alcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_alcantarillado);
            
        lbl_energia=new JLabel("Energía: ");
            lbl_energia.setFont(Fonts.font_normal);
            lbl_energia.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_energia);
            
        lbl_alumbrado=new JLabelArje();
            lbl_alumbrado.setTexto("Alumbrado: ",Fonts.microsoftNTL,0,14,Color.black,2);
            this.add(lbl_alumbrado);
            
        lbl_gas=new JLabel("Gas: ");
            lbl_gas.setFont(Fonts.font_normal);
            lbl_gas.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_gas);
            
        lbl_aseo=new JLabelArje();
            lbl_aseo.setTexto("Aseo: ", Fonts.microsoftNTL, 0, 14, Color.black, 2);
            this.add(lbl_aseo);
            
        lbl_otro=new JLabelArje();
            lbl_otro.setTexto("Otros: ", Fonts.microsoftNTL, 0, 14, Color.black, 2);
            this.add(lbl_otro);
            
        lbl_total=new JLabel("Total a pagar: ");
            lbl_total.setFont(Fonts.font_normal);
            lbl_total.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_total);
            
        lbl_consumoMes=new JLabel("Consumo del mes: mediciones");
            lbl_consumoMes.setFont(Fonts.font_titulos);
            this.add(lbl_consumoMes);
            
        lbl_consumoAcueducto=new JLabel("M3: ");
            lbl_consumoAcueducto.setFont(Fonts.font_normal);
            lbl_consumoAcueducto.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_consumoAcueducto);
            
        lbl_consumoAlcantarillado=new JLabel("M3: ");
            lbl_consumoAlcantarillado.setFont(Fonts.font_normal);
            lbl_consumoAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_consumoAlcantarillado);
            
        lbl_consumoEnergia=new JLabel("Kwh: ");
            lbl_consumoEnergia.setFont(Fonts.font_normal);
            lbl_consumoEnergia.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_consumoEnergia);
            
        lbl_consumoAlumbrado= new JLabelArje();
            lbl_consumoAlumbrado.setTexto("Kwh: ", Fonts.microsoftNTL, 0, 14, Color.black, 2);
            this.add(lbl_consumoAlumbrado);
            
        lbl_consumoGas=new JLabel("Cm2: ");
            lbl_consumoGas.setFont(Fonts.font_normal);
            lbl_consumoGas.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_consumoGas);
            
        lbl_consumoAseo=new JLabelArje();
            lbl_consumoAseo.setTexto("Kg: ", Fonts.microsoftNTL, 0, 14, Color.black, 2);
            this.add(lbl_consumoAseo);
            
        lbl_aguaIcono=new JLabel();
            this.add(lbl_aguaIcono);
            
        lbl_alcantarilladoIcon=new JLabel();
            this.add(lbl_alcantarilladoIcon);
            
        lbl_energiaIcon=new JLabel();
            this.add(lbl_energiaIcon);
            
        lbl_alumbradoIcon=new JLabel();
            this.add(lbl_alumbradoIcon);
            
        lbl_gasIcon=new JLabel();
            this.add(lbl_gasIcon);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        this.setSize(width,height);
        
        lbl_titulo.setBounds(10, 10, 150, 25);
            lbl_fecha.setBounds(10,50,150,25);
            lbl_titulo2.setBounds(lbl_fecha.getWidth()+0, 50, 250, 25);
            
            
            
        int x=30;
        lbl_consumoMes.setBounds(20, lbl_fecha.getY()+30, 225, 25);
            lbl_consumoAcueducto.setBounds(x, lbl_costosConsumo.getY()+30, 40, 25);
            lbl_consumoAlcantarillado.setBounds(x, lbl_acueducto.getY()+30, 40, 25);
            lbl_consumoEnergia.setBounds(x, lbl_alcantarillado.getY()+30, 40, 25);
            lbl_consumoAlumbrado.setBounds(x, lbl_energia.getY()+30, 40, 25);
            lbl_consumoGas.setBounds(x, lbl_alumbrado.getY()+30, 40, 25);
            lbl_consumoAseo.setBounds(x, lbl_gas.getY()+30, 40, 25);
            
        lbl_costosConsumo.setBounds(lbl_consumoMes.getWidth()+150, lbl_fecha.getY()+30, 150, 25);
            lbl_acueducto.setBounds(lbl_consumoMes.getWidth()+60, lbl_costosConsumo.getY()+30, 125, 25);
            lbl_alcantarillado.setBounds(lbl_consumoMes.getWidth()+60, lbl_consumoAcueducto.getY()+30, 125, 25);
            lbl_energia.setBounds(lbl_consumoMes.getWidth()+60, lbl_consumoAlcantarillado.getY()+30, 125, 25);
            lbl_alumbrado.setBounds(lbl_consumoMes.getWidth()+60, lbl_consumoEnergia.getY()+30, 125, 25);
            lbl_gas.setBounds(lbl_consumoMes.getWidth()+60, lbl_alumbrado.getY()+30, 125, 25);
            lbl_aseo.setBounds(lbl_consumoMes.getWidth()+60, lbl_gas.getY()+30, 125, 25);
            lbl_otro.setBounds(lbl_consumoMes.getWidth()+60, lbl_aseo.getY()+30, 125, 25);
            lbl_total.setBounds(lbl_consumoMes.getWidth()+60, lbl_otro.getY()+30, 125, 25);
        
        /*GRÁFICA-----------------------------------*/
        chartPanel.setBounds(x, 350, 700, 320);
            
        /*SE DAN LAS POSICIONES DE LAS IMAGENES PEQUEÑAS 
        Y SE LES AGREGA LA IMAGEN*/
        int xMenos=20;
        
        lbl_aguaIcono.setBounds(x-xMenos, lbl_costosConsumo.getY()+31, 20, 20);
            iA.setTamano("Btn_acueducto", "png", lbl_aguaIcono);
            
        lbl_alcantarilladoIcon.setBounds(x-xMenos, lbl_acueducto.getY()+31, 20, 20);
            iA.setTamano("Btn_alcantarillado", "png", lbl_alcantarilladoIcon);
            
        lbl_energiaIcon.setBounds(x-xMenos, lbl_alcantarillado.getY()+31, 20, 20);
            iA.setTamano("Btn_energia", "png", lbl_energiaIcon);
            
        lbl_alumbradoIcon.setBounds(x-xMenos, lbl_energia.getY()+31, 20, 20);
            iA.setTamano("Btn_alumbrado", "png", lbl_alumbradoIcon);
            
        lbl_gasIcon.setBounds(x-xMenos, lbl_alumbrado.getY()+31, 20, 20);
            iA.setTamano("Btn_gas", "png", lbl_gasIcon);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
