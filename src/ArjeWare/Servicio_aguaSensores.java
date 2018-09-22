/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import static ArjeWare.Perfil.gasto_aguaMonetario;
import static ArjeWare.Perfil.gasto_energiaMonetario;
import static ArjeWare.Perfil.gasto_gasMonetario;
import Utilidades.Colores;
import Utilidades.Fonts;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import sun.swing.SwingAccessor;

/**
 *
 * @author Sebas
 */
public class Servicio_aguaSensores extends JPanel implements ActionListener{
    //FUNDAMENTALES---------------------------
    protected Control_instancias pp;
    protected int width,height;
    //LABELS--------------------------------
    private JLabel lbl_titulo,lbl_tituloConsumos,lbl_tituloValorConsumos,lbl_tituloDatos,
        lbl_gastoAgua,lbl_gastoExceso,lbl_gastoTotal,//REGISTROS ""
        lbl_valorServicio,lbl_Subsidio,lbl_Exceso,lbl_valorCargoFijo,//LO QUE COBRA EPM txt
        lbl_valorAcueducto,lbl_valorAlcantarillado,//LO QUE COBRA EPM txt
        lbl_valorConsumo,lbl_valorSubsidio,lbl_valorExceso,//VALORES DE GASTO txt
        lbl_imagenFondo,//
        lbl_totalPagar;//EL TOTAL A PAGAR
    
    private JLabel estrato;
    
    //GRAFICO SCHARP
    // Fuente de Datos
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        // Creando el Grafico
         JFreeChart chart = ChartFactory.createBarChart3D("","Servicios",
                "Gasto (COP)", data,PlotOrientation.VERTICAL,true,true,false);
        
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        //PiePlot plot = (PiePlot) chart.getPlot();
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer render = (BarRenderer)plot.getRenderer();
        
        //BufferedImage img = ImageIO.read(new File("Imagenes/camaleon.jpg"));
    
    public Servicio_aguaSensores(Control_instancias instancias,int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        lbl_titulo=new JLabel("Consumo sensores");
            lbl_titulo.setFont(Fonts.font_titulos);
            lbl_titulo.setForeground(Colores.color_verdeOscuro);
            this.add(lbl_titulo);
            
        lbl_tituloConsumos=new JLabel("Consumo de servicio (Cm2):");
            lbl_tituloConsumos.setFont(Fonts.font_titulos);
            this.add(lbl_tituloConsumos);
            
        lbl_tituloDatos=new JLabel("Valores fijos de ("+"EPM"+"): ");
            lbl_tituloDatos.setFont(Fonts.font_titulos);
            this.add(lbl_tituloDatos);
                
        lbl_tituloValorConsumos=new JLabel("Valor de consumo($ COP):");
            lbl_tituloValorConsumos.setFont(Fonts.font_titulos);
            this.add(lbl_tituloValorConsumos);
            
        lbl_gastoAgua=new JLabel("Gasto de agua: ");
            lbl_gastoAgua.setFont(Fonts.font_titulos);
            lbl_gastoAgua.setForeground(Colores.color_verdeClaro);
            lbl_gastoAgua.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_gastoAgua);
            
        lbl_gastoExceso=new JLabel("Gasto en exceso: ");
            lbl_gastoExceso.setFont(Fonts.font_titulos);
            lbl_gastoExceso.setForeground(Colores.color_verdeClaro);
            lbl_gastoExceso.setHorizontalAlignment(SwingConstants.RIGHT);//SwingConstants.RIGHT
            this.add(lbl_gastoExceso);
            
        lbl_gastoTotal=new JLabel("Gasto total: ");
            lbl_gastoTotal.setFont(Fonts.font_titulos);
            lbl_gastoTotal.setForeground(Colores.color_verdeClaro);
            lbl_gastoTotal.setHorizontalAlignment(SwingConstants.RIGHT);//SwingConstants.RIGHT
            this.add(lbl_gastoTotal);
            
        lbl_valorServicio=new JLabel("Valor por cm2 de agua: ");
            lbl_valorServicio.setFont(Fonts.font_titulos);
            lbl_valorServicio.setForeground(Colores.color_verdeClaro);
            lbl_valorServicio.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorServicio);
            
        lbl_Exceso=new JLabel("Valor por cm2 de exceso: ");
            lbl_Exceso.setFont(Fonts.font_titulos);
            lbl_Exceso.setForeground(Colores.color_verdeClaro);
            lbl_Exceso.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_Exceso);
        
        lbl_Subsidio=new JLabel("Valor de subsidio: ");
            lbl_Subsidio.setFont(Fonts.font_titulos);
            lbl_Subsidio.setForeground(Colores.color_verdeClaro);
            lbl_Subsidio.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_Subsidio);
            
        lbl_valorCargoFijo=new JLabel("Valor de cargo fijo: ");
            lbl_valorCargoFijo.setFont(Fonts.font_titulos);
            lbl_valorCargoFijo.setForeground(Colores.color_verdeClaro);
            lbl_valorCargoFijo.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorCargoFijo);
            
        lbl_valorAcueducto=new JLabel("Valor acueducto: ");
            lbl_valorAcueducto.setFont(Fonts.font_titulos);
            lbl_valorAcueducto.setForeground(Colores.color_verdeClaro);
            lbl_valorAcueducto.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorAcueducto);
            
        lbl_valorAlcantarillado=new JLabel("Valor alcantarillado: ");
            lbl_valorAlcantarillado.setFont(Fonts.font_titulos);
            lbl_valorAlcantarillado.setForeground(Colores.color_verdeClaro);
            lbl_valorAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorAlcantarillado);
            
        lbl_valorConsumo=new JLabel("Valor consumo: ");
            lbl_valorConsumo.setFont(Fonts.font_titulos);
            lbl_valorConsumo.setForeground(Colores.color_verdeClaro);
            lbl_valorConsumo.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorConsumo);
            
        lbl_valorExceso=new JLabel("Valor exceso: ");
            lbl_valorExceso.setFont(Fonts.font_titulos);
            lbl_valorExceso.setForeground(Colores.color_verdeClaro);
            lbl_valorExceso.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorExceso);
            
        lbl_valorSubsidio=new JLabel("Valor de subsidio: ");
            lbl_valorSubsidio.setFont(Fonts.font_titulos);
            lbl_valorSubsidio.setForeground(Colores.color_verdeClaro);
            lbl_valorSubsidio.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorSubsidio);
            
        lbl_imagenFondo = new JLabel();
            lbl_imagenFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/grifo_fondo_1.png")));
            //imagenes.setBorder(BorderFactory.createLineBorder(Color.black, 1));
            add(lbl_imagenFondo);
            
        //Grafica-----------
        data.setValue(25000, "Agua", "");
        data.setValue(1000, "Ahorro(A)", "");
        data.setValue(14, "CM2", "");
        data.setValue(5, "CM2 Exceso", "");
        
        chart.setBackgroundPaint(Color.white);
        render.setSeriesPaint(0, Color.blue);
        render.setSeriesPaint(1, Color.orange);
        render.setSeriesPaint(2, Color.yellow);
        render.setSeriesPaint(3, Color.orange);
        render.setSeriesPaint(4, Color.red);
        render.setSeriesPaint(5, Color.orange);
        
        //render.lookupLegendShape(0);
        //render.lookupSeriesPaint(0);
        
        
        chartPanel.setBackground(Color.white);
        //chartPanel.createToolTip();
        //frame.pack();
        //frame.setVisible(true);
        this.add(chartPanel);
        
        /*plot.setSectionPaint("Agua", Color.blue);
        plot.setSectionPaint("Energía",Color.yellow);
        plot.setSectionPaint("Gas",Color.red);
        plot.setBackgroundPaint(verde_sabias);
        plot.setForegroundAlpha(0.5f);*/
        //-------------------------------------
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        this.setSize(width,height);
        
        lbl_titulo.setBounds(10, 5, 150, 25);
        lbl_tituloConsumos.setBounds(10+50, 50, 200, 25);
        
        int x=10,y=75;
        lbl_gastoAgua.setBounds(x, y, 125, 25);
        lbl_gastoExceso.setBounds(x, y+30, 125, 25);
        lbl_gastoTotal.setBounds(x, y+30*2, 125, 25);
        
        lbl_tituloDatos.setBounds(x+400,50,200,25);
        lbl_valorServicio.setBounds(x+350,y,200,25);
        lbl_Exceso.setBounds(x+350, y+30, 200, 25);
        lbl_Subsidio.setBounds(x+350, y+30*2, 200, 25);
        lbl_valorCargoFijo.setBounds(x+350, y+30*3, 200, 25);
        lbl_valorAcueducto.setBounds(x+350, y+30*4, 200, 25);
        lbl_valorAlcantarillado.setBounds(x+350, y+30*5, 200, 25);
        
        lbl_tituloValorConsumos.setBounds(x+50, y+30*3, 215, 25);
        lbl_valorConsumo.setBounds(x, y+30*4, 125, 25);
        lbl_valorExceso.setBounds(x, y+30*5, 125, 25);
        lbl_valorSubsidio.setBounds(x, y+30*6, 125, 25);
        
        chartPanel.setBounds(x, y+30*9, 225, 150);
        
        lbl_imagenFondo.setBounds(150, 60, 700, 600);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
}
