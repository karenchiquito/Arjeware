/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import Entidades.Dao;
import Entidades.Sesion;
import Entidades.ValorTarifa_Energia;
import Entidades.ValorTarifas;
import Metodos.Calculos;
import Metodos.IconAjustado;
import Metodos.JEditorPaneArje;
import Metodos.JTextFieldHint;
import Metodos.Lbl;
import Utilidades.BordeRedondo;
import Utilidades.Colores;
import Utilidades.Fonts;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Pnl_consumoEnergia extends JPanel implements ActionListener{
 //FUNDAMENTALES---------------------------
    protected Control_instancias pp;
    protected int width,height;
    IconAjustado iA=new IconAjustado();
    //LABELS--------------------------------
    private JLabel lbl_titulo,lbl_tituloConsumos,lbl_tituloValorConsumos,lbl_tituloDatos
        ,lbl_tituloConoceMas,
        lbl_gastoEnergia,lbl_gastoExceso,lbl_gastoTotal,//REGISTROS "" lo que se consume en CM2 txt
        lbl_valorServicio,lbl_Subsidio,lbl_Exceso,lbl_valorCargoFijo,
        lbl_valorConsumo,lbl_valorSubsidio,lbl_valorExceso,lbl_totalPagar,//VALORES DE GASTO txt
        lbl_imagenFondo,//IMAGEN DE FONDO
        lbl_registros,lbl_registro1,lbl_registro2,//REGISTROS
        lbl_meta,lbl_totalAcumulado,//META
        lbl_frase;//¿Sabias qué?;//
    
    private JLabel lb_gastoEnergia,lb_gastoExceso,lb_gastoTotal,//CONSUMO EN CM2
        lb_valorServicio,lb_Subsidio,lb_Exceso,lb_valorCargoFijo,
        lb_valorConsumo,lb_valorSubsidio,lb_valorExceso,lb_totalPagar;//LO QUE COBRA EPM
    
    private JLabel lbl_costoCompra,lbl_cargoTransporte_STN,lbl_cargoTransporte_SDL,
        lbl_margenComercialización,lbl_Costo_G_T_pérdidas,lbl_restricciones,
        lbl_sumaCU,lbl_sumaCUSubsidiado;
    
    private JLabel lb_costoCompra,lb_cargoTransporte_STN,lb_cargoTransporte_SDL,
        lb_margenComercialización,lb_Costo_G_T_pérdidas,lb_restricciones,lb_sumaCU,
        lb_sumaCUSubsidiado;
    
    private JLabel fondo_negro;
    //TXT-----------------------------
    private JTextFieldHint txt_registro1,txt_registro2;
    private JEditorPane txt_frase;
    private JEditorPaneArje txt_infoConoceMas;
    //BOTONES-------------------------------------
    private JButton btn_enviarRegistros,btn_conoceMas,btn_grafica,btn_cerrar;
    //OTRAS COSAS--------------------------
    public String frasess= new A_Banderas_publicas().setFrase();
    Calculos c = new Calculos();
    ValorTarifa_Energia vt=new ValorTarifa_Energia();
    public boolean fondoVisible=false,bln_conoceMas=false;
    //PANELES------------------------
    private JPanel pnl_conoceMas;
    
    //GRAFICA--------------------------------
    DefaultCategoryDataset data = new DefaultCategoryDataset();
    JFreeChart chart = ChartFactory.createBarChart3D("Gasto de Energía","Kilo Watts Hora (Kwh)",
        "Cantidad gastada", data,PlotOrientation.VERTICAL,true,true,false);
    ChartPanel chartPanel = new ChartPanel(chart);
    CategoryPlot plot = chart.getCategoryPlot();
    BarRenderer render = (BarRenderer)plot.getRenderer();
    
    public Pnl_consumoEnergia(Control_instancias instancias,int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        //Grafica-----------
        chart.setBackgroundPaint(Color.white);
            render.setSeriesPaint(0, Colores.color_verdeClaro);
            render.setSeriesPaint(1, Color.orange);
        render.lookupLegendShape(2);
        render.lookupSeriesPaint(2);
        
        chartPanel.setBackground(Color.white);
        chartPanel.setOpaque(false);
        chartPanel.createToolTip();
        this.add(chartPanel);
        chartPanel.setVisible(false);
        //--------------------------------------------------
        lbl_tituloConoceMas=new JLabel("Coste Unitario de Energía (CU): ");
            lbl_tituloConoceMas.setFont(new Font("Microsoft New Tai Lue",1,25));
            lbl_tituloConoceMas.setForeground(Colores.color_verdeClaro);
            this.add(lbl_tituloConoceMas);
            
        pnl_conoceMas=new JPanel();
            pnl_conoceMas.setBackground(Color.white);
            this.add(pnl_conoceMas);
            
        txt_infoConoceMas= new JEditorPaneArje();
            txt_infoConoceMas.setTexto("<b>Inforamción:</b><br>"
                +"Las tarifas en (COP) que aparecen aquí es lo que cobra "+Sesion.getEmpresaPS()+""
                +" debido a los costos que puede tener la obtención y transporte de la energía.");
            pnl_conoceMas.add(txt_infoConoceMas);
            
        lbl_costoCompra=new JLabel("Costo compra(Gm,i): ");
            Lbl.setPropiedadLbl(lbl_costoCompra);
            pnl_conoceMas.add(lbl_costoCompra);
            
        lbl_cargoTransporte_STN=new JLabel("Cargo transporte STN(Tm): ");
            Lbl.setPropiedadLbl(lbl_cargoTransporte_STN);
            pnl_conoceMas.add(lbl_cargoTransporte_STN);
            
        lbl_cargoTransporte_SDL=new JLabel("Cargo transporte SDL(Dn,m): ");
            Lbl.setPropiedadLbl(lbl_cargoTransporte_SDL);
            pnl_conoceMas.add(lbl_cargoTransporte_SDL);
            
        lbl_margenComercialización=new JLabel("Margen comercialización(CVm,i,j): ");
            Lbl.setPropiedadLbl(lbl_margenComercialización);
            pnl_conoceMas.add(lbl_margenComercialización);
            
        lbl_Costo_G_T_pérdidas=new JLabel("Costo G, T, pérdidas(PRn,m): ");
            Lbl.setPropiedadLbl(lbl_Costo_G_T_pérdidas);
            pnl_conoceMas.add(lbl_Costo_G_T_pérdidas);
            
        lbl_restricciones=new JLabel("Restricciones(Rm): ");
            Lbl.setPropiedadLbl(lbl_restricciones);
            pnl_conoceMas.add(lbl_restricciones);
            
        lbl_sumaCU=new JLabel("Total CU: ");
            Lbl.setPropiedadLbl(lbl_sumaCU);
            lbl_sumaCU.setHorizontalAlignment(SwingConstants.CENTER);
            pnl_conoceMas.add(lbl_sumaCU);
            
        if(Integer.parseInt(Sesion.getEstrato())>4){
            lbl_sumaCUSubsidiado=new JLabel("Total CU con "+"Contribución"+": ");
            Lbl.setPropiedadLbl(lbl_sumaCUSubsidiado);
            lbl_sumaCUSubsidiado.setHorizontalAlignment(SwingConstants.CENTER);
            pnl_conoceMas.add(lbl_sumaCUSubsidiado);
        }else if(Integer.parseInt(Sesion.getEstrato())==4){
            //lbl_sumaCUSubsidiado=new JLabel("Total CU con "+"Subsidio"+": ");
                //Lbl.setPropiedadLbl(lbl_sumaCUSubsidiado);
                //pnl_conoceMas.add(lbl_sumaCUSubsidiado);
        }else if(Integer.parseInt(Sesion.getEstrato())<4){
            lbl_sumaCUSubsidiado=new JLabel("Total CU con "+"Subsidio"+": ");
                Lbl.setPropiedadLbl(lbl_sumaCUSubsidiado);
                lbl_sumaCUSubsidiado.setHorizontalAlignment(SwingConstants.CENTER);
                pnl_conoceMas.add(lbl_sumaCUSubsidiado);
        }

        //FIN JLABELS PANEL CONOCE MÁS
        
        lb_costoCompra=new JLabel("$ "+"0");
            Lbl.setPropiedadLB(lb_costoCompra);
            pnl_conoceMas.add(lb_costoCompra);
            
        lb_cargoTransporte_STN=new JLabel("$ "+"0");
            Lbl.setPropiedadLB(lb_cargoTransporte_STN);
            pnl_conoceMas.add(lb_cargoTransporte_STN);
            
        lb_cargoTransporte_SDL=new JLabel("$ "+"0");
            Lbl.setPropiedadLB(lb_cargoTransporte_SDL);
            pnl_conoceMas.add(lb_cargoTransporte_SDL);
            
        lb_margenComercialización=new JLabel("$ "+"0");
            Lbl.setPropiedadLB(lb_margenComercialización);
            pnl_conoceMas.add(lb_margenComercialización);
            
        lb_Costo_G_T_pérdidas=new JLabel("$ "+"0");
            Lbl.setPropiedadLB(lb_Costo_G_T_pérdidas);
            pnl_conoceMas.add(lb_Costo_G_T_pérdidas);
            
        lb_restricciones=new JLabel("$ "+c.getValorGastoEnergia());
            Lbl.setPropiedadLB(lb_restricciones);
            pnl_conoceMas.add(lb_restricciones);
            
        lb_sumaCU=new JLabel("$ "+c.getValorCUEnergia());
            Lbl.setPropiedadLB(lb_sumaCU);
            lb_sumaCU.setHorizontalAlignment(SwingConstants.CENTER);
            pnl_conoceMas.add(lb_sumaCU);
            
        if(Integer.parseInt(Sesion.getEstrato())>4){
            lb_sumaCUSubsidiado = new JLabel("$ "+"0");
                Lbl.setPropiedadLB(lb_sumaCUSubsidiado);
                lb_sumaCUSubsidiado.setHorizontalAlignment(SwingConstants.CENTER);
                pnl_conoceMas.add(lb_sumaCUSubsidiado);
        }else if(Integer.parseInt(Sesion.getEstrato())==4){
            //lbl_sumaCUSubsidiado=new JLabel("Total CU con "+"Subsidio"+": ");
                //Lbl.setPropiedadLbl(lbl_sumaCUSubsidiado);
                //pnl_conoceMas.add(lbl_sumaCUSubsidiado);
        }else if(Integer.parseInt(Sesion.getEstrato())<4){
            lb_sumaCUSubsidiado = new JLabel("$ "+"0");
                Lbl.setPropiedadLB(lb_sumaCUSubsidiado);
                lb_sumaCUSubsidiado.setHorizontalAlignment(SwingConstants.CENTER);
                pnl_conoceMas.add(lb_sumaCUSubsidiado);
        }
        //FIN LB CONOCE MÄS
        
        btn_cerrar=new JButton("Cerrar X");
            btn_cerrar.addActionListener(this);
            //btn_cerrar.setContentAreaFilled(false);
            btn_cerrar.setBackground(Color.red);
            btn_cerrar.setForeground(Color.white);
            btn_cerrar.setFocusable(false);
            btn_cerrar.setVisible(false);
            this.add(btn_cerrar);
            
        fondo_negro=new JLabel();
            fondo_negro.setVisible(false);
            fondo_negro.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo_diccionario.png")));
            add(fondo_negro);
        
        lbl_titulo=new JLabel("Consumo manual Energía");
            lbl_titulo.setFont(Fonts.font_titulos);
            lbl_titulo.setForeground(Colores.color_verdeOscuro);
            this.add(lbl_titulo);
            
        lbl_tituloConsumos=new JLabel("Consumo de servicio (Kwh):");
            lbl_tituloConsumos.setFont(Fonts.font_titulos);
            this.add(lbl_tituloConsumos);
            
        lbl_tituloDatos=new JLabel("Valores fijos Energía de ("+"EPM"+"): ");
            lbl_tituloDatos.setFont(Fonts.font_titulos);
            this.add(lbl_tituloDatos);
            
        lbl_tituloValorConsumos=new JLabel("Valor de consumo Energía ($ COP):");
            lbl_tituloValorConsumos.setFont(Fonts.font_titulos);
            this.add(lbl_tituloValorConsumos);
            
        lbl_gastoEnergia=new JLabel("Gasto de Energía: ");
            lbl_gastoEnergia.setFont(Fonts.font_titulos);
            lbl_gastoEnergia.setForeground(Colores.color_verdeClaro);
            lbl_gastoEnergia.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_gastoEnergia);
            
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
            
        lbl_valorServicio=new JLabel("Valor por Kwh: ");
            lbl_valorServicio.setFont(Fonts.font_titulos);
            lbl_valorServicio.setForeground(Colores.color_verdeClaro);
            lbl_valorServicio.setHorizontalAlignment(SwingConstants.RIGHT);
            this.add(lbl_valorServicio);
            
        lbl_Exceso=new JLabel("Valor por Kwh de exceso: ");
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
            
        lbl_frase=new JLabel("Sabías que:");
            lbl_frase.setFont(new Font("Microsoft New Tai Lue",1, 18));
            lbl_frase.setForeground(Colores.color_verdeClaro);
            add(lbl_frase);
            
        txt_frase=new JEditorPane();
            txt_frase.setEditable(false);
            txt_frase.setContentType("text/html");
            txt_frase.setBackground(Colores.verde_sabias);
            txt_frase.setOpaque(false);
            txt_frase.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#347A34\" font size=\"4\">"+frasess+"</FONT>");
            add(txt_frase);
            
        lb_gastoEnergia =new JLabel();
            lb_gastoEnergia.setText(""+Double.toString(c.getConsumo()));
            lb_gastoEnergia.setFont(Fonts.font_titulos);
            lb_gastoEnergia.setForeground(Colores.color_verdeOscuro);
            lb_gastoEnergia.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_gastoEnergia);
            
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
            lb_valorServicio.setText(""+ValorTarifas.getValorServicioEnergia());
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
            lb_Exceso.setText(""+ValorTarifas.getValor_excesoEnergia());
            lb_Exceso.setFont(Fonts.font_titulos);
            lb_Exceso.setForeground(Colores.color_verdeOscuro);
            lb_Exceso.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_Exceso);
            
        lb_valorCargoFijo= new JLabel();
            lb_valorCargoFijo.setText(""+ValorTarifas.getValor_cargoFijoEnergia());
            lb_valorCargoFijo.setFont(Fonts.font_titulos);
            lb_valorCargoFijo.setForeground(Colores.color_verdeOscuro);
            lb_valorCargoFijo.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorCargoFijo);
            
        lb_valorConsumo= new JLabel();
            lb_valorConsumo.setText(""+Double.toString(c.getValorGastoEnergia()));
            lb_valorConsumo.setFont(Fonts.font_titulos);
            lb_valorConsumo.setForeground(Colores.color_verdeOscuro);
            lb_valorConsumo.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorConsumo);
            
        lb_valorSubsidio= new JLabel();
            lb_valorSubsidio.setText(""+Double.toString(c.getValorSubsidioEnergia()));
            lb_valorSubsidio.setFont(Fonts.font_titulos);
            lb_valorSubsidio.setForeground(Colores.color_verdeOscuro);
            lb_valorSubsidio.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorSubsidio);
            
        lb_valorExceso= new JLabel();
            lb_valorExceso.setText(""+Double.toString(c.getValorExcesoEnergia()));
            lb_valorExceso.setFont(Fonts.font_titulos);
            lb_valorExceso.setForeground(Colores.color_verdeOscuro);
            lb_valorExceso.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_valorExceso);
            
        lb_totalPagar= new JLabel();
            lb_totalPagar.setText(""+Double.toString(c.getValorTotalEnergia()));
            lb_totalPagar.setFont(Fonts.font_titulos);
            lb_totalPagar.setForeground(Colores.color_verdeOscuro);
            lb_totalPagar.setHorizontalAlignment(SwingConstants.LEFT);
            this.add(lb_totalPagar);
            
        lbl_imagenFondo = new JLabel();
            //imagenes.setBorder(BorderFactory.createLineBorder(Color.black, 1));
            add(lbl_imagenFondo);
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        this.setSize(width, height);
        int x=10,y=75;
        
        btn_cerrar.setBounds(5, 5, 150, 25);
        fondo_negro.setBounds(0, 0, 825, 700);
        
        lbl_titulo.setBounds(10, 5, 200, 25);
        
        //CONSUMO DEL SERVICIO
        lbl_tituloConsumos.setBounds(10+50, 75, 200, 25);
            lbl_gastoEnergia.setBounds(x, y+30, 125, 25);
            lbl_gastoExceso.setBounds(x, y+30*2, 125, 25);
            lbl_gastoTotal.setBounds(x, y+30*3, 125, 25);
            
            lb_gastoEnergia.setBounds(x+130, y+30, 125, 25);
            lb_gastoExceso.setBounds(x+130, y+30*2, 125, 25);
            lb_gastoTotal.setBounds(x+130, y+30*3, 125, 25);
        //FIN CONSUMO DEL SERVICIO    
        
        int x2=100;
        
        //VALOR MONETARIO DEL CONSUMO
        lbl_tituloValorConsumos.setBounds(x+10, y+30*10, 300, 25);
            lbl_valorConsumo.setBounds(x, y+30*11, 125, 25);
            lbl_valorExceso.setBounds(x, y+30*12, 125, 25);
            lbl_valorSubsidio.setBounds(x, y+30*13, 125, 25);
            lbl_totalPagar.setBounds(x, y+30*14, 125, 25);
            
            lb_valorConsumo.setBounds(x+130, y+30*11, 125, 25);
            lb_valorExceso.setBounds(x+130, y+30*12, 125, 25);
            lb_valorSubsidio.setBounds(x+130, y+30*13, 125, 25);
            lb_totalPagar.setBounds(x+130, y+30*14, 125, 25);
            
            lb_valorServicio.setText("$ "+ValorTarifas.getValorServicioEnergia());
                lb_Subsidio.setText(""+ValorTarifa_Energia.getSubsidio()+" %");
                lb_Exceso.setText("$ "+ValorTarifas.getValor_excesoEnergia());
                lb_valorCargoFijo.setText("$ "+ValorTarifas.getValor_cargoFijoEnergia());
        //FIN VALOR MONETARIO DEL CONSUMO        
            
        //EPM VALORES FIJOS
        lbl_tituloDatos.setBounds(x2+375,y,275,25);
            lbl_valorServicio.setBounds(x2+350,y+30,200,25);
            lbl_Exceso.setBounds(x2+350, y+30*2, 200, 25);
            lbl_Subsidio.setBounds(x2+350, y+30*3, 200, 25);
            btn_conoceMas.setBounds(x2+425, y+30*4, 200, 25);
            
            lb_valorServicio.setBounds(x2+350+210,y+30,200,25);
            lb_Exceso.setBounds(x2+350+210, y+30*2, 200, 25);
            lb_Subsidio.setBounds(x2+350+210, y+30*3, 200, 25);
        //FIN EPM VALORES FIJOS
        
           
        //REGISTROS Y GRAFICAR
        lbl_registros.setBounds(x+500, y+30*10, 150, 25);
            lbl_registro1.setBounds(x+425, y+30*11, 150, 25);
            txt_registro1.setBounds(x+575, y+30*11, 150, 25);
            lbl_registro2.setBounds(x+425, y+30*12, 150, 25);
            txt_registro2.setBounds(x+575, y+30*12, 150, 25);
            btn_enviarRegistros.setBounds(x+575, y+30*13, 150, 25);
            btn_grafica.setBounds(x+575, y+30*14, 150, 25);
            
        lb_gastoEnergia.setText(""+Double.toString(c.getConsumoEnergia()));
            lb_gastoExceso.setText(""+Double.toString(c.getConsumoExcesoEnergia()));
            lb_gastoTotal.setText(""+Double.toString(c.getConsumoTotalEnergia()));
            
        //FIN REGISTROS Y GRAFICAR
            
        lbl_imagenFondo.setBounds(150, 100, 489, 490);
        iA.setTamano("Btn_energiaFondo", "png", lbl_imagenFondo);
        
        chartPanel.setBounds(x+175, y+30*3, 500, 300);
        
        //lbl_imagenFondo.setBounds(150, 60, 700, 600);
        //Grafica-----------
        data.setValue(c.getConsumoEnergia(), "Gasto", "");
        data.setValue(c.getConsumoExcesoEnergia(), "Exceso", "");
        
        fondo_negro.setVisible(fondoVisible);
        btn_cerrar.setVisible(fondoVisible);
        
        //PANEL CONOCE MÁS
        lbl_tituloConoceMas.setBounds(x+125, y+30*2, 500, 25);
        int separacionY=50,separacionX=255;
        pnl_conoceMas.setBounds(x+125, y+30*3, 575, 400);
            lbl_costoCompra.setBounds(0, 0, 250, 20);
            lbl_cargoTransporte_STN.setBounds(0, lbl_costoCompra.getY()+separacionY, 250, 20);
            lbl_cargoTransporte_SDL.setBounds(0, lbl_cargoTransporte_STN.getY()+separacionY, 250, 20);
            lbl_margenComercialización.setBounds(0, lbl_cargoTransporte_SDL.getY()+separacionY, 250, 20);
            lbl_Costo_G_T_pérdidas.setBounds(0, lbl_margenComercialización.getY()+separacionY, 250, 20);
            lbl_restricciones.setBounds(0, lbl_Costo_G_T_pérdidas.getY()+separacionY, 250, 20);
            
            lbl_sumaCU.setBounds(0, lbl_restricciones.getY()+separacionY, 250, 20);
            lbl_sumaCUSubsidiado.setBounds(lbl_sumaCU.getWidth()+30, lbl_restricciones.getY()+separacionY, 250, 20);
            
            txt_infoConoceMas.setBounds(separacionX+lb_costoCompra.getWidth(), 80, 200, 300);
            
                lb_costoCompra.setBounds(separacionX, 0, 100, 20);
                lb_cargoTransporte_STN.setBounds(separacionX, lb_costoCompra.getY()+separacionY, 100, 20);
                lb_cargoTransporte_SDL.setBounds(separacionX, lb_cargoTransporte_STN.getY()+separacionY, 100, 20);
                lb_margenComercialización.setBounds(separacionX, lb_cargoTransporte_SDL.getY()+separacionY, 100, 20);
                lb_Costo_G_T_pérdidas.setBounds(separacionX, lb_margenComercialización.getY()+separacionY, 100, 20);
                lb_restricciones.setBounds(separacionX, lb_Costo_G_T_pérdidas.getY()+separacionY, 100, 20);
                
                lb_sumaCU.setBounds(0, lbl_sumaCU.getY()+separacionY-10, 250, 20);
                lb_sumaCUSubsidiado.setBounds(lb_sumaCU.getWidth()+100, lbl_sumaCUSubsidiado.getY()+separacionY-10, 100, 20);
                
                    lb_costoCompra.setText("$ "+ValorTarifa_Energia.getCostoCompra());
                    lb_cargoTransporte_STN.setText("$ "+ValorTarifa_Energia.getCargoTransporte_STN());
                    lb_cargoTransporte_SDL.setText("$ "+ValorTarifa_Energia.getCargoTransporte_SDL());
                    lb_margenComercialización.setText("$ "+ValorTarifa_Energia.getMargenComercializacion());
                    lb_Costo_G_T_pérdidas.setText("$ "+ValorTarifa_Energia.getCosto_G_T_perdidas());
                    lb_restricciones.setText("$ "+ValorTarifa_Energia.getRestricciones());
                    
                    lb_sumaCU.setText("$ "+c.getValorCUEnergia());
                    lb_sumaCUSubsidiado.setText("S "+ValorTarifas.getValorServicioEnergia());
                    
        
            lbl_tituloConoceMas.setVisible(bln_conoceMas);
            pnl_conoceMas.setVisible(bln_conoceMas);
            lbl_costoCompra.setVisible(bln_conoceMas);
            lbl_cargoTransporte_STN.setVisible(bln_conoceMas);
            lbl_cargoTransporte_SDL.setVisible(bln_conoceMas);
            lbl_margenComercialización.setVisible(bln_conoceMas);
            lbl_Costo_G_T_pérdidas.setVisible(bln_conoceMas);
            lbl_restricciones.setVisible(bln_conoceMas);
        //FIN PANEL CONOCE MÁS
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn_enviarRegistros){
            try{
            Calculos calculos = new Calculos();
            
            calculos.setRegistro1Energia(Double.parseDouble(txt_registro1.getText()));
            calculos.setRegistro2Energia(Double.parseDouble(txt_registro2.getText()));
            
            Dao.getValoresTarifa("Energía");
            
            calculos.calcularConsumo("Energía");
            //ano, mes, estrato,consecutivo,
            //valorServicio, valor_cargoFijo,valor_exceso,subsidio,servicio,medidaLimite,vigente;s
            
            calculos.calcularPagar("Energía");
            
            lb_gastoEnergia.setText(""+Double.toString(+c.getConsumoEnergia()));
            lb_gastoExceso.setText(""+Double.toString(c.getConsumoExcesoEnergia()));
            lb_gastoTotal.setText(""+Double.toString(c.getConsumoTotalEnergia()));
            
            Math.round(c.getValorGastoEnergia()* 100d / 100d);
            lb_valorConsumo.setText("$ "+Double.toString(Math.round(c.getValorGastoEnergia()* 100d / 100d)));
            lb_valorSubsidio.setText("-$ "+Double.toString(c.getValorSubsidioEnergia()));
            lb_valorExceso.setText("$ "+Double.toString(c.getValorExcesoEnergia()));
            lb_totalPagar.setText("$ "+Double.toString(c.getValorTotalEnergia()));
            
            //lb_valorServicio.setText(""+ValorTarifas.getValorServicioAgua());
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Error, en clase: servicio de agua, tipo de error: "+ex);
            }
        }
        if(e.getSource()==btn_grafica){
            fondoVisible=true;
           chartPanel.setVisible(true);
        }
        if(e.getSource()==btn_cerrar){
            fondoVisible=false;
           chartPanel.setVisible(false);
           bln_conoceMas=false;
        }
        
        if(e.getSource()==btn_conoceMas){
            fondoVisible=true;
            bln_conoceMas=true;
        }
    }
}