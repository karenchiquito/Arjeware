/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Utilidades.Colores;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Sebas
 */
public class JFreechartArje {
    DefaultCategoryDataset data = new DefaultCategoryDataset();
    JFreeChart chart = ChartFactory.createBarChart3D("Gasto de Energía","Kilo Watts Hora (Kwh)",
        "Cantidad gastada", data,PlotOrientation.VERTICAL,true,true,false);
    ChartPanel chartPanel = new ChartPanel(chart);
    CategoryPlot plot = chart.getCategoryPlot();
    BarRenderer render = (BarRenderer)plot.getRenderer();
    
    public JFreechartArje(){
        
    }
    
    public void setPropiedades(String[] datos,Double[] valores,Color[] colores){
        //Grafica-----------
        chart.setBackgroundPaint(Color.white);
        for (int i = 0; i < 10; i++) {
            render.setSeriesPaint(i, colores[i]);
            data.setValue(valores[i], datos[i], "");
        }
        render.lookupLegendShape(2);
        render.lookupSeriesPaint(2);
        
        chartPanel.setBackground(Color.white);
        chartPanel.setOpaque(false);
        chartPanel.createToolTip();
    }
    
    public JFreechartArje(String[] datos,Color[] colores,JPanel cual){
        //Grafica-----------
        chart.setBackgroundPaint(Color.white);
            render.setSeriesPaint(0, Colores.color_verdeClaro);
            render.setSeriesPaint(1, Color.orange);
        render.lookupLegendShape(2);
        render.lookupSeriesPaint(2);
        
        chartPanel.setBackground(Color.white);
        chartPanel.setOpaque(false);
        chartPanel.createToolTip();
        cual.add(chartPanel);
    }
    
}
