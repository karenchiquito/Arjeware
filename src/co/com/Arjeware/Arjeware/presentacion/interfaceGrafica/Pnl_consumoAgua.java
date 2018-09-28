
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.models.entity.Entidades.ConsumoManual;
import co.com.Arjeware.Arjeware.models.entity.Entidades.Dao;
import co.com.Arjeware.Arjeware.models.entity.Entidades.Sesion;
import co.com.Arjeware.Arjeware.models.entity.Entidades.Usuarios;
import co.com.Arjeware.Arjeware.models.entity.Entidades.ValorTarifas;
import co.com.Arjeware.Arjeware.presentacion.metodos.calculos.Calculos;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Colores;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Fonts;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.BordeRedondo;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Tiempo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
public class Pnl_consumoAgua extends JPanel implements ActionListener{
    //FUNDAMENTALES---------------------------
    protected Control_instancias pp;
    protected int width,height;
    //LABELS--------------------------------
    private JLabel lbl_titulo,lbl_tituloConsumos,lbl_tituloValorConsumos,lbl_tituloDatos,lbl_valorConsumosAlcantarillado,
        lbl_gastoAgua,lbl_gastoExceso,lbl_gastoTotal,//REGISTROS "" lo que se consume en CM2 txt
            
        lbl_valorServicio,lbl_Subsidio,lbl_Exceso,lbl_valorCargoFijo,//LO QUE COBRA EPM txt
            
        lbl_tituloValorAlcantarillado,lbl_valorServicioAlcantarillado,
        lbl_ExcesoAlcantarillado,lbl_SubsidioAlcantarillado,lbl_valorCargoFijoAlcantarillado,//LO QUE COBRA EPM txt}
        lbl_valorConsumoAlcantarillado,lbl_valorSubsidioAlcantarillado,lbl_valorExcesoAlcantarillado,lbl_totalPagarAlcantarillado,//VALORES DE GASTO txt
            
        lbl_valorConsumo,lbl_valorSubsidio,lbl_valorExceso,lbl_totalPagar,//VALORES DE GASTO txt
        lbl_imagenFondo,//IMAGEN DE FONDO
        lbl_registros,lbl_registro1,lbl_registro2,//REGISTROS
        lbl_meta,lbl_totalAcumulado,//META
        lbl_frase;//¿Sabias qué?
    
    private JLabel lb_gastoAgua,lb_gastoExceso,lb_gastoTotal,//CONSUMO EN CM2
        lb_valorServicio,lb_Subsidio,lb_Exceso,lb_valorCargoFijo,lb_valorAcueducto,//LO QUE COBRA EPM
        lb_valorServicioAlcantarillado,lb_ExcesoAlcantarillado,
        lb_valorCargoFijoAlcantarillado,lb_SubsidioAlcantarillado,//Lo que cobra EPM
        lb_valorConsumoAlcantarillado,lb_valorSubsidioAlcantarillado,lb_valorExcesoAlcantarillado,lb_totalPagarAlcantarillado,
        lb_valorConsumo,lb_valorSubsidio,lb_valorExceso,lb_totalPagar;
    
    private JLabel fondo_negro;
    //TXT-----------------------------
    private JTextField txt_registro1,txt_registro2;
    private JEditorPane txt_frase;
    //BOTONES-------------------------------------
    private JButton btn_enviarRegistros,btn_grafica,btn_cerrar;
    //BORDE
    //private BordeRedondo borde;
    //----------------------
    public String frasess= new A_Banderas_publicas().setFrase();
    Calculos c = new Calculos();
    //GRAFICA-------------------------------------------
    DefaultCategoryDataset data = new DefaultCategoryDataset();
    JFreeChart chart = ChartFactory.createBarChart3D("Gasto de agua","centimetros cúbicos (cm2)",
        "Cantidad gastada", data,PlotOrientation.VERTICAL,true,true,false);
    ChartPanel chartPanel = new ChartPanel(chart);
    CategoryPlot plot = chart.getCategoryPlot();
    BarRenderer render = (BarRenderer)plot.getRenderer();
    
    public Pnl_consumoAgua(Control_instancias instancias,int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        //Grafica-----------
        
        chart.setBackgroundPaint(Color.white);
            render.setSeriesPaint(0, Colores.color_verdeClaro);
            render.setSeriesPaint(1, Color.red);
        render.lookupLegendShape(2);
        render.lookupSeriesPaint(2);
        
        chartPanel.setBackground(Color.white);
        chartPanel.setOpaque(false);
        chartPanel.createToolTip();
        this.add(chartPanel);
        chartPanel.setVisible(false);
        //-------------------------------------
        btn_cerrar=new JButton("Cerrar X");
            btn_cerrar.addActionListener(this);
            //btn_cerrar.setContentAreaFilled(false);
            btn_cerrar.setBackground(Color.red);
            btn_cerrar.setForeground(Color.white);
            btn_cerrar.setVisible(false);
            this.add(btn_cerrar);
            
        fondo_negro=new JLabel();
            fondo_negro.setVisible(false);
            fondo_negro.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo_diccionario.png")));
            add(fondo_negro);
        
        lbl_titulo=new JLabel("Consumo manual");
            lbl_titulo.setFont(Fonts.font_titulos);
            lbl_titulo.setForeground(Colores.color_verdeOscuro);
            this.add(lbl_titulo);
            
        lbl_tituloConsumos=new JLabel("Consumo de servicio (M3):");
            lbl_tituloConsumos.setFont(Fonts.font_titulos);
            this.add(lbl_tituloConsumos);
            
        lbl_tituloDatos=new JLabel("Valores fijos Agua/Acueducto de ("+"EPM"+"): ");
            lbl_tituloDatos.setFont(Fonts.font_titulos);
            this.add(lbl_tituloDatos);
                
        lbl_tituloValorConsumos=new JLabel("Valor de consumo Agua/Acueducto ($ COP):");
            lbl_tituloValorConsumos.setFont(Fonts.font_titulos);
            this.add(lbl_tituloValorConsumos);
            
        lbl_valorConsumosAlcantarillado=new JLabel("Valor de consumo Alcantarillado ($ COP): ");
            lbl_valorConsumosAlcantarillado.setFont(Fonts.font_titulos);
            this.add(lbl_valorConsumosAlcantarillado);
            
        lbl_tituloValorAlcantarillado=new JLabel("Valores fijos Alcantarillado de ("+"EPM"+"):");
            lbl_tituloValorAlcantarillado.setFont(Fonts.font_titulos);
            this.add(lbl_tituloValorAlcantarillado);
            
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
            
        lbl_valorServicio=new JLabel("Valor por M3: ");
            lbl_valorServicio.setFont(Fonts.font_titulos);
            lbl_valorServicio.setForeground(Colores.color_verdeClaro);
            lbl_valorServicio.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorServicio);
            
        lbl_Exceso=new JLabel("Valor por M3 de exceso: ");
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
            
        lbl_totalPagar=new JLabel("Total a pagar: ");
            lbl_totalPagar.setFont(Fonts.font_titulos);
            lbl_totalPagar.setForeground(Colores.color_verdeClaro);
            lbl_totalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_totalPagar);
            
        lbl_valorServicioAlcantarillado=new JLabel("Valor por M3: ");
            lbl_valorServicioAlcantarillado.setFont(Fonts.font_titulos);
            lbl_valorServicioAlcantarillado.setForeground(Colores.color_verdeClaro);
            lbl_valorServicioAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorServicioAlcantarillado);
            
        lbl_ExcesoAlcantarillado =new JLabel("Valor por M3 de exceso: ");
            lbl_ExcesoAlcantarillado.setFont(Fonts.font_titulos);
            lbl_ExcesoAlcantarillado.setForeground(Colores.color_verdeClaro);
            lbl_ExcesoAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_ExcesoAlcantarillado);
            
        lbl_SubsidioAlcantarillado=new JLabel("Valor de subsidio: ");
            lbl_SubsidioAlcantarillado.setFont(Fonts.font_titulos);
            lbl_SubsidioAlcantarillado.setForeground(Colores.color_verdeClaro);
            lbl_SubsidioAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_SubsidioAlcantarillado);
            
        lbl_valorCargoFijoAlcantarillado=new JLabel("Valor de cargo fijo: ");
            lbl_valorCargoFijoAlcantarillado.setFont(Fonts.font_titulos);
            lbl_valorCargoFijoAlcantarillado.setForeground(Colores.color_verdeClaro);
            lbl_valorCargoFijoAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorCargoFijoAlcantarillado);
            
        lbl_valorConsumoAlcantarillado=new JLabel("Valor consumo: ");
            lbl_valorConsumoAlcantarillado.setFont(Fonts.font_titulos);
            lbl_valorConsumoAlcantarillado.setForeground(Colores.color_verdeClaro);
            lbl_valorConsumoAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorConsumoAlcantarillado);
            
        lbl_valorExcesoAlcantarillado=new JLabel("Valor exceso: ");
            lbl_valorExcesoAlcantarillado.setFont(Fonts.font_titulos);
            lbl_valorExcesoAlcantarillado.setForeground(Colores.color_verdeClaro);
            lbl_valorExcesoAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorExcesoAlcantarillado);
            
        lbl_valorSubsidioAlcantarillado=new JLabel("Valor de subsidio: ");
            lbl_valorSubsidioAlcantarillado.setFont(Fonts.font_titulos);
            lbl_valorSubsidioAlcantarillado.setForeground(Colores.color_verdeClaro);
            lbl_valorSubsidioAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorSubsidioAlcantarillado);
            
        lbl_totalPagarAlcantarillado=new JLabel("Total a pagar: ");
            lbl_totalPagarAlcantarillado.setFont(Fonts.font_titulos);
            lbl_totalPagarAlcantarillado.setForeground(Colores.color_verdeClaro);
            lbl_totalPagarAlcantarillado.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_totalPagarAlcantarillado);
            
        lbl_registros=new JLabel("Registros: Estrato "+Sesion.getEstrato());
            lbl_registros.setFont(Fonts.font_titulos);
            lbl_registros.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_registros);
            
        lbl_registro1=new JLabel("Registro 1: ");
            lbl_registro1.setFont(Fonts.font_titulos);
            lbl_registro1.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_registro1);
            
        lbl_registro2=new JLabel("Registro 2: ");
            lbl_registro2.setFont(Fonts.font_titulos);
            lbl_registro2.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_registro2);
            
        lbl_frase=new JLabel("Sabías que:");
            lbl_frase.setFont(new Font("Microsoft New Tai Lue",1, 18));
            lbl_frase.setForeground(Colores.color_verdeClaro);
            add(lbl_frase);
            
        txt_registro1=new JTextField();
            txt_registro1.setFont(Fonts.font_titulos);
            this.add(txt_registro1);
            
        txt_registro2=new JTextField();
            txt_registro2.setFont(Fonts.font_titulos);
            this.add(txt_registro2);
            
        btn_enviarRegistros=new JButton("Enviar");
            btn_enviarRegistros.addActionListener(this);
            btn_enviarRegistros.setFocusable(false);
           // btn_enviarRegistros.setBorder(new BordeRedondo(20)); 
            btn_enviarRegistros.setBackground(Colores.color_verdeClaro);
            this.add(btn_enviarRegistros);
            
        btn_grafica=new JButton("Gráfica");
            btn_grafica.addActionListener(this);
            btn_grafica.setBackground(Colores.color_verdeClaro);
            btn_grafica.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
            //btn_diccionario.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Diccionario.png")));
            add(btn_grafica);
            
        txt_frase=new JEditorPane();
            txt_frase.setEditable(false);
            txt_frase.setContentType("text/html");
            txt_frase.setBackground(Colores.verde_sabias);
            txt_frase.setOpaque(false);
            txt_frase.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#347A34\" font size=\"4\">"+frasess+"</FONT>");
            add(txt_frase);
            
        lb_gastoAgua =new JLabel();
            lb_gastoAgua.setText(""+Double.toString(c.getConsumo()));
            lb_gastoAgua.setFont(Fonts.font_titulos);
            lb_gastoAgua.setForeground(Colores.color_verdeOscuro);
            lb_gastoAgua.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_gastoAgua);
            
        lb_gastoExceso=new JLabel();
            lb_gastoExceso.setText(""+Double.toString(c.getConsumoExceso()));
            lb_gastoExceso.setFont(Fonts.font_titulos);
            lb_gastoExceso.setForeground(Colores.color_verdeOscuro);
            lb_gastoExceso.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_gastoExceso);
            
        lb_gastoTotal = new JLabel();
            lb_gastoTotal.setText(""+Double.toString(c.getConsumoTotal()));
            lb_gastoTotal.setFont(Fonts.font_titulos);
            lb_gastoTotal.setForeground(Colores.color_verdeOscuro);
            lb_gastoTotal.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_gastoTotal);
            
        lb_valorServicio= new JLabel();
            lb_valorServicio.setText(""+ValorTarifas.getValorServicioAgua());
            lb_valorServicio.setFont(Fonts.font_titulos);
            lb_valorServicio.setForeground(Colores.color_verdeOscuro);
            lb_valorServicio.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorServicio);
            
        lb_Subsidio= new JLabel();
            //lb_Subsidio.setText(""+ValorTarifas.getSubsidioAgua()+"");
            lb_Subsidio.setFont(Fonts.font_titulos);
            lb_Subsidio.setForeground(Colores.color_verdeOscuro);
            lb_Subsidio.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_Subsidio);
            
        lb_Exceso= new JLabel();
            lb_Exceso.setText(""+ValorTarifas.getValor_excesoAgua());
            lb_Exceso.setFont(Fonts.font_titulos);
            lb_Exceso.setForeground(Colores.color_verdeOscuro);
            lb_Exceso.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_Exceso);
            
        lb_valorCargoFijo= new JLabel();
            lb_valorCargoFijo.setText(""+ValorTarifas.getValor_cargoFijoAgua());
            lb_valorCargoFijo.setFont(Fonts.font_titulos);
            lb_valorCargoFijo.setForeground(Colores.color_verdeOscuro);
            lb_valorCargoFijo.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorCargoFijo);
            
        lb_valorServicioAlcantarillado= new JLabel();
            lb_valorServicioAlcantarillado.setText("$ "+ValorTarifas.getValorServicioAlcantarillado());
            lb_valorServicioAlcantarillado.setFont(Fonts.font_titulos);
            lb_valorServicioAlcantarillado.setForeground(Colores.color_verdeOscuro);
            lb_valorServicioAlcantarillado.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorServicioAlcantarillado);
            
        lb_ExcesoAlcantarillado= new JLabel();
            lb_ExcesoAlcantarillado.setText("$ "+ValorTarifas.getValor_excesoAlcantarillado());
            lb_ExcesoAlcantarillado.setFont(Fonts.font_titulos);
            lb_ExcesoAlcantarillado.setForeground(Colores.color_verdeOscuro);
            lb_ExcesoAlcantarillado.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_ExcesoAlcantarillado);
            
        lb_SubsidioAlcantarillado= new JLabel();
            lb_SubsidioAlcantarillado.setText("$ "+ValorTarifas.getSubsidioAlcantarillado());
            lb_SubsidioAlcantarillado.setFont(Fonts.font_titulos);
            lb_SubsidioAlcantarillado.setForeground(Colores.color_verdeOscuro);
            lb_SubsidioAlcantarillado.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_SubsidioAlcantarillado);
            
        lb_valorCargoFijoAlcantarillado= new JLabel();
            //lb_valorAlcantarillado.setText(""+Double.toString(c.getValorAlcantarillado()));
            lb_valorCargoFijoAlcantarillado.setFont(Fonts.font_titulos);
            lb_valorCargoFijoAlcantarillado.setForeground(Colores.color_verdeOscuro);
            lb_valorCargoFijoAlcantarillado.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorCargoFijoAlcantarillado);
            
        lb_valorConsumoAlcantarillado= new JLabel();
            lb_valorConsumoAlcantarillado.setText(""+Double.toString(c.getValorGastoAlcantarillado()));
            lb_valorConsumoAlcantarillado.setFont(Fonts.font_titulos);
            lb_valorConsumoAlcantarillado.setForeground(Colores.color_verdeOscuro);
            lb_valorConsumoAlcantarillado.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorConsumoAlcantarillado);
            
        lb_valorSubsidioAlcantarillado= new JLabel();
            lb_valorSubsidioAlcantarillado.setText(""+Double.toString(c.getValorSubsidioAlcantarillado()));
            lb_valorSubsidioAlcantarillado.setFont(Fonts.font_titulos);
            lb_valorSubsidioAlcantarillado.setForeground(Colores.color_verdeOscuro);
            lb_valorSubsidioAlcantarillado.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorSubsidioAlcantarillado);
            
        lb_valorExcesoAlcantarillado= new JLabel();
            lb_valorExcesoAlcantarillado.setText(""+Double.toString(c.getValorExcesoAlcantarillado()));
            lb_valorExcesoAlcantarillado.setFont(Fonts.font_titulos);
            lb_valorExcesoAlcantarillado.setForeground(Colores.color_verdeOscuro);
            lb_valorExcesoAlcantarillado.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorExcesoAlcantarillado);
            
        lb_totalPagarAlcantarillado= new JLabel();
            lb_totalPagarAlcantarillado.setText(""+Double.toString(c.getValorTotalAlcantarillado()));
            lb_totalPagarAlcantarillado.setFont(Fonts.font_titulos);
            lb_totalPagarAlcantarillado.setForeground(Colores.color_verdeOscuro);
            lb_totalPagarAlcantarillado.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_totalPagarAlcantarillado);
            
        lb_valorConsumo= new JLabel();
            lb_valorConsumo.setText(""+Double.toString(c.getValorGastoAgua()));
            lb_valorConsumo.setFont(Fonts.font_titulos);
            lb_valorConsumo.setForeground(Colores.color_verdeOscuro);
            lb_valorConsumo.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorConsumo);
            
        lb_valorSubsidio= new JLabel();
            lb_valorSubsidio.setText(""+Double.toString(c.getValorSubsidioAgua()));
            lb_valorSubsidio.setFont(Fonts.font_titulos);
            lb_valorSubsidio.setForeground(Colores.color_verdeOscuro);
            lb_valorSubsidio.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorSubsidio);
            
        lb_valorExceso= new JLabel();
            lb_valorExceso.setText(""+Double.toString(c.getValorExcesoAgua()));
            lb_valorExceso.setFont(Fonts.font_titulos);
            lb_valorExceso.setForeground(Colores.color_verdeOscuro);
            lb_valorExceso.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorExceso);
            
        lb_totalPagar= new JLabel();
            lb_totalPagar.setText(""+Double.toString(c.getValorTotalAgua()));
            lb_totalPagar.setFont(Fonts.font_titulos);
            lb_totalPagar.setForeground(Colores.color_verdeOscuro);
            lb_totalPagar.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_totalPagar);
            
        lbl_imagenFondo = new JLabel();
            lbl_imagenFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/grifo_fondo_1.png")));
            //imagenes.setBorder(BorderFactory.createLineBorder(Color.black, 1));
            add(lbl_imagenFondo);
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        this.setSize(width,height);
        int x=10,y=75;
        
        btn_cerrar.setBounds(5, 5, 150, 25);
        fondo_negro.setBounds(0, 0, 825, 700);
        
        lbl_titulo.setBounds(10, 5, 150, 25);
        
        lbl_tituloConsumos.setBounds(10+50, 50, 200, 25);
            lbl_gastoAgua.setBounds(x, y, 125, 25);
            lbl_gastoExceso.setBounds(x, y+30, 125, 25);
            lbl_gastoTotal.setBounds(x, y+30*2, 125, 25);
            
            lb_gastoAgua.setBounds(x+130, y, 125, 25);
            lb_gastoExceso.setBounds(x+130, y+30, 125, 25);
            lb_gastoTotal.setBounds(x+130, y+30*2, 125, 25);
        
        int x2=100;
        lbl_tituloDatos.setBounds(x2+375,50,275,25); //LO QUE COBRA EMP
            lbl_valorServicio.setBounds(x2+350,y,200,25);
            lbl_Exceso.setBounds(x2+350, y+30, 200, 25);
            lbl_Subsidio.setBounds(x2+350, y+30*2, 200, 25);
            lbl_valorCargoFijo.setBounds(x2+350, y+30*3, 200, 25);
            
            
            lb_valorServicio.setBounds(x2+350+210,y,200,25);
            lb_Exceso.setBounds(x2+350+210, y+30, 200, 25);
            lb_Subsidio.setBounds(x2+350+210, y+30*2, 200, 25);
            lb_valorCargoFijo.setBounds(x2+350+210, y+30*3, 200, 25);
            
            lb_valorServicio.setText("$ "+ValorTarifas.getValorServicioAgua());
                //lb_Subsidio.setText(""+ValorTarifas.getSubsidioAgua()+" * 100 %");
                lb_Subsidio.setText(""+Float.parseFloat(ValorTarifas.getSubsidioAgua())*100+"%");
                lb_Exceso.setText("$ "+ValorTarifas.getValor_excesoAgua());
                lb_valorCargoFijo.setText("$ "+ValorTarifas.getValor_cargoFijoAgua());
            
        lbl_tituloValorAlcantarillado.setBounds(x2+375, y+30*4, 275, 25);
            lbl_valorServicioAlcantarillado.setBounds(x2+350, y+30*5, 200, 25);
            lbl_ExcesoAlcantarillado.setBounds(x2+350, y+30*6, 200, 25);
            lbl_SubsidioAlcantarillado.setBounds(x2+350, y+30*7, 200, 25);
            lbl_valorCargoFijoAlcantarillado.setBounds(x2+350, y+30*8, 200, 25);
            
            lb_valorServicioAlcantarillado.setBounds(x2+350+210, y+30*5, 200, 25);
            lb_ExcesoAlcantarillado.setBounds(x2+350+210, y+30*6, 200, 25);
            lb_SubsidioAlcantarillado.setBounds(x2+350+210, y+30*7, 200, 25);
            lb_valorCargoFijoAlcantarillado.setBounds(x2+350+210, y+30*8, 200, 25);
            
            lb_valorServicioAlcantarillado.setText("$ " + ValorTarifas.getValorServicioAlcantarillado());
                lb_ExcesoAlcantarillado.setText("$ " + ValorTarifas.getValor_excesoAlcantarillado());
                lb_SubsidioAlcantarillado.setText("$ " + Double.parseDouble(ValorTarifas.getSubsidioAlcantarillado())*100+"%");
                lb_valorCargoFijoAlcantarillado.setText("$ "+ValorTarifas.getValor_cargoFijoAlcantarillado());
        
        lbl_tituloValorConsumos.setBounds(x+10, y+30*3, 300, 25); //Valores de agua acueducto
            lbl_valorConsumo.setBounds(x, y+30*4, 125, 25);
            lbl_valorExceso.setBounds(x, y+30*5, 125, 25);
            lbl_valorSubsidio.setBounds(x, y+30*6, 125, 25);
            lbl_totalPagar.setBounds(x, y+30*7, 125, 25);
            
            lb_valorConsumo.setBounds(x+130, y+30*4, 125, 25);
            lb_valorExceso.setBounds(x+130, y+30*5, 125, 25);
            lb_valorSubsidio.setBounds(x+130, y+30*6, 125, 25);
            lb_totalPagar.setBounds(x+130, y+30*7, 125, 25);
            
        lbl_valorConsumosAlcantarillado.setBounds(x+10, y+30*8, 300, 25); //Valor de alcantarillado
            lbl_valorConsumoAlcantarillado.setBounds(x, y+30*9, 125, 25);
            lbl_valorExcesoAlcantarillado.setBounds(x, y+30*10, 125, 25);
            lbl_valorSubsidioAlcantarillado.setBounds(x, y+30*11, 125, 25);
            lbl_totalPagarAlcantarillado.setBounds(x, y+30*12, 125, 25);
            
            lb_valorConsumoAlcantarillado.setBounds(x+130, y+30*9, 125, 25);
            lb_valorExcesoAlcantarillado.setBounds(x+130, y+30*10, 125, 25);
            lb_valorSubsidioAlcantarillado.setBounds(x+130, y+30*11, 125, 25);
            lb_totalPagarAlcantarillado.setBounds(x+130, y+30*12, 125, 25);
        
        lbl_registros.setBounds(x+500, y+30*10, 150, 25);
            lbl_registro1.setBounds(x+425, y+30*11, 150, 25);
            txt_registro1.setBounds(x+575, y+30*11, 150, 25);
            lbl_registro2.setBounds(x+425, y+30*12, 150, 25);
            txt_registro2.setBounds(x+575, y+30*12, 150, 25);
            btn_enviarRegistros.setBounds(x+575, y+30*13, 150, 25);
            btn_grafica.setBounds(x+575, y+30*14, 150, 25);
            
            lb_gastoAgua.setText(""+Double.toString(c.getConsumoAgua()));
                lb_gastoExceso.setText(""+Double.toString(c.getConsumoExcesoAgua()));
                lb_gastoTotal.setText(""+Double.toString(c.getConsumoTotalAgua()));
        
        lbl_frase.setBounds(10, 600, 150, 25);
            txt_frase.setBounds(10, 600+25, 775, 50);    
            
        chartPanel.setBounds(x+175, y+30*3, 500, 300);
        
        //lbl_imagenFondo.setBounds(150, 60, 700, 600);
        //Grafica-----------
        data.setValue(c.getConsumoAgua(), "Gasto", "");
        data.setValue(c.getConsumoExcesoAgua(), "Exceso", "");
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        /*
        DOCUMENTACIÓN
        Traer datos del consumo anterior. y cargar en el panel.
        O traer una entidad y toda su información
        estraemos el registro anterior,
        SELECMAX(Consecutivo, pasa a ser el registro anterior del actual registro)
        */
        if(e.getSource()==btn_enviarRegistros){
            try{
            Calculos calculos = new Calculos();
            
            calculos.setRegistro1Agua(Double.parseDouble(txt_registro1.getText()));
            calculos.setRegistro2Agua(Double.parseDouble(txt_registro2.getText()));
            
            ConsumoManual cm = new ConsumoManual();
            
            Dao dao = new Dao();
            
            Tiempo t = new Tiempo();
            /*consecutivo,id_cedula,consumo,"
        unidad,tipoServicio,mes,dia,hora,minuto,segundos,ano,ultimoRegistro,fecha)*/
            cm.setConsecutivo(1);
            cm.setId_cedula(Sesion.getIdCedula());
            cm.setConsumo(c.getConsumoTotalAgua());
            cm.setUnidad("M3");
            cm.setTipoServicio("Acueducto");
            cm.setMes(Integer.toString(t.getMes()));
            cm.setDia(Integer.toString(t.getDia()));
            cm.setHora(Integer.toString(t.getHora()));
            //falta
            
            
            calculos.calcularConsumo("Agua");
            
            Dao.getValoresTarifa("Agua");
            Dao.getValoresTarifa("Alcantarillado");
            Dao.getValoresTarifa("Acueducto");
            //ano, mes, estrato,consecutivo,
            //valorServicio, valor_cargoFijo,valor_exceso,subsidio,servicio,medidaLimite,vigente;s
            
            calculos.calcularPagar("Agua");
            calculos.calcularPagar("Alcantarillado");
            
            lb_gastoAgua.setText(""+Double.toString(c.getConsumoAgua()));
            lb_gastoExceso.setText(""+Double.toString(c.getConsumoExcesoAgua()));
            lb_gastoTotal.setText(""+Double.toString(c.getConsumoTotalAgua()));
            
            lb_valorConsumo.setText("$ "+Double.toString(c.getValorGastoAlcantarillado()));
            lb_valorSubsidio.setText("-$ "+Double.toString(c.getValorSubsidioAlcantarillado()));
            lb_valorExceso.setText("$ "+Double.toString(c.getValorExcesoAlcantarillado()));
            lb_totalPagar.setText("$ "+Double.toString(c.getValorTotalAlcantarillado()));
            
            lb_valorConsumoAlcantarillado.setText("$ "+Double.toString(c.getValorGastoAlcantarillado()));
            lb_valorSubsidioAlcantarillado.setText("-$ "+Double.toString(c.getValorSubsidioAlcantarillado()));
            lb_valorExcesoAlcantarillado.setText("$ "+Double.toString(c.getValorExcesoAlcantarillado()));
            lb_totalPagarAlcantarillado.setText("$ "+Double.toString(c.getValorTotalAlcantarillado()));
            
            //lb_valorServicio.setText(""+ValorTarifas.getValorServicioAgua());
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Error, en clase: servicio de agua, tipo de error: "+ex);
            }
        }
        if(e.getSource()==btn_grafica){
           fondo_negro.setVisible(true);
           chartPanel.setVisible(true);
           btn_cerrar.setVisible(true);
        }
        if(e.getSource()==btn_cerrar){
           fondo_negro.setVisible(false);
           chartPanel.setVisible(false);
           btn_cerrar.setVisible(false);
        }
        
    }
}
