package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;
import co.com.Arjeware.Arjeware.models.entity.Entidades.Sesion;
import co.com.Arjeware.Arjeware.models.entity.Entidades.Usuarios;
import co.com.Arjeware.Arjeware.sql.Sql_help;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Colores;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author wmuno
 */
public class Perfil extends JPanel implements ActionListener{
    protected int width,height;
    protected Control_instancias pp;
    //JLABELS TITULOS----------------------
    private JLabel lbl_frase,lbl_tusDatos,lbl_mesAnterior,lbl_ahorroMes,lbl_fotoPerfil,
            lbl_meta;
    //JBUTTON BOTONES-------------------------
    private JButton cerrar,btn_enviarMeta,btn_editarDatos;
    //AREAS DE TEXTO-------------------------
    private JEditorPane txt_datos,txt_informacionMes,txt_metaMes,txt_frase;
    //TEXTO INGRESO ----------------------
    public JTextField txf_meta;
    //PANELES -------------------------
    private JPanel pnl_mes,pnl_metaMes;
    
    private String cedula=Inicio_Sesion.cedula;
    
    //ESTADISTICAS-------------
    double [] valor_agua={710.25, 1065.37, 1553.66, 1775.61, 2663.42, 2840.98, 2663.42, 2308.30, 1775.61};
    
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
        
    //String-----------------
    Sesion Sesion = new Sesion();
    
    public String nombre=Sesion.getNombre();
    public String frasess= new A_Banderas_publicas().setFrase();
    //--------------
    
    double meta = 0;
    double agua=0,energia=0,gas=0;
    
    public static double gasto_aguaMonetario=40000.26,gasto_energiaMonetario=65000.24,
            gasto_gasMonetario=9876.89;
    
    /*Conexion_base_datos conexion = new Conexion_base_datos();
        Connection conection = conexion.Conexion_base_datos();
        Statement st = conection.createStatement("");*/
    
    //COLORES.----------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    //
    
    public Perfil(Control_instancias instancia,int width, int height) {
        this.width = width;
        this.height = height;
        //Grafica-----------
        data.setValue(gasto_aguaMonetario, "Agua", "");
        data.setValue(10000, "Ahorro(A)", "");
        data.setValue(gasto_energiaMonetario, "Energía", "");
        data.setValue(5000, "Ahorro(E)", "");
        data.setValue(gasto_gasMonetario, "Gas", "");
        data.setValue(500, "Ahorro(G)", "");
        
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
        //frame.pack();
        //frame.setVisible(true);
        //this.add(chartPanel);
        
        /*plot.setSectionPaint("Agua", Color.blue);
        plot.setSectionPaint("Energía",Color.yellow);
        plot.setSectionPaint("Gas",Color.red);
        plot.setBackgroundPaint(verde_sabias);
        plot.setForegroundAlpha(0.5f);*/
        //-------------------------------------
        pp=instancia;
        
        lbl_fotoPerfil=new JLabel();
            lbl_fotoPerfil.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Perfil.png")));
            add(lbl_fotoPerfil);
            
        cerrar = new JButton("Cerrar Sesión");
            cerrar.addActionListener(this);
            cerrar.setBackground(verde_menu);
            cerrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16));
            add(cerrar);
            
        lbl_tusDatos=new JLabel("DATOS PERSONALES");
            this.add(lbl_tusDatos);
            
        txt_datos=new JEditorPane();
            txt_datos.setBackground(verde_sabias);
            txt_datos.setContentType("text/html");
            txt_datos.setOpaque(false);
            txt_datos.setEditable(false);
            txt_datos.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"4\">"
                +"<b>Nombre: </b>"+Sesion.getNombre()+"<br><b>Estrato: </b>"+Sesion.getEstrato()+"</FONT><br>");
            this.add(txt_datos);
            
        lbl_mesAnterior=new JLabel("GASTOS MES ANTERIOR");
            lbl_mesAnterior.setForeground(verde_menu);
            this.add(lbl_mesAnterior);
            
        txt_informacionMes=new JEditorPane();
            txt_informacionMes.setBackground(Color.white);
            txt_informacionMes.setContentType("text/html");
            txt_informacionMes.setEditable(false);
            txt_informacionMes.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"4\"><b>AGUA:</b>"
                +" $"+gasto_aguaMonetario+" (14cm3)<br>"
                +"<b>ENERGÍA:</b> $"+gasto_energiaMonetario+" (122 Kwh)<br>"
                +"<b>GAS:</b> $"+gasto_gasMonetario+" (13 m3)</FONT><br>");
            
        lbl_ahorroMes=new JLabel("ITEMS NECESARIOS PARA CUMPLIR LA META");
            this.add(lbl_ahorroMes);
            
        txt_metaMes=new JEditorPane();
            txt_metaMes.setBackground(Color.white);
            txt_metaMes.setContentType("text/html");
            txt_metaMes.setEditable(false);
            txt_metaMes.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"4\">"
                +"<b>AGUA: </b>"+agua+" ("+"3"+" CM2)<br>"
                +"<b>ENERGÍA: </b>"+energia+" ("+"100"+" Kwh)<br>"
                +"<b>GAS: </b>"+gas+" ("+"9"+" M3)</FONT><br>");
                
            
        lbl_meta=new JLabel("META DEL MES");
            this.add(lbl_meta);
            
        txf_meta = new JTextField();
            txf_meta.setText("");
            txf_meta.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            txf_meta.setFont(new Font("Microsoft New Tai Lue",0,14));
            this.add(txf_meta);
            
        btn_enviarMeta= new JButton("Enviar");
            btn_enviarMeta.addActionListener(this);
            this.add(btn_enviarMeta);
            
        btn_editarDatos = new JButton("Editar información");
            btn_editarDatos.addActionListener(this);
            this.add(btn_editarDatos);
            
        pnl_mes=new JPanel();
            pnl_mes.setBackground(Color.white);
            pnl_mes.setBorder(BorderFactory.createLineBorder(verde_menu, 1, true));
            pnl_mes.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
            pnl_mes.add(txt_informacionMes);
            pnl_mes.add(chartPanel);
            add(pnl_mes);
            
        pnl_metaMes=new JPanel();
            pnl_metaMes.setBackground(Color.white);
            pnl_metaMes.setBorder(BorderFactory.createLineBorder(verde_menu, 1, true));
            pnl_metaMes.setLayout(new FlowLayout(FlowLayout.LEFT,0,0)); 
            pnl_metaMes.add(txt_metaMes);
            add(pnl_metaMes);
            
        lbl_frase=new JLabel("Sabías que:");
            lbl_frase.setFont(new Font("Microsoft New Tai Lue",1, 18));
            lbl_frase.setForeground(verde_menu);
            add(lbl_frase);
            
        txt_frase=new JEditorPane();
            txt_frase.setEditable(false);
            txt_frase.setContentType("text/html");
            txt_frase.setBackground(Colores.verde_sabias);
            txt_frase.setOpaque(false);
            txt_frase.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#347A34\" font size=\"4\">"+frasess+"</FONT>");
            add(txt_frase);
            
        txf_meta.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                txf_meta.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, verde_menu));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                txf_meta.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            }
        });
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width, height);
        
        cerrar.setBounds(650, 610, 150, 25);
        
        lbl_fotoPerfil.setBounds(10, 5, 246, 246);
        
        lbl_tusDatos.setBounds(50, 300, 150, 25);
        txt_datos.setBounds(20, 335, 200, 150);
        
        lbl_meta.setBounds(280, 20, 150, 25);
        
        txf_meta.setBounds(280, 50, 100, 25);
        btn_enviarMeta.setBounds(280, 85, 100, 25);
        
        lbl_mesAnterior.setBounds(50+300, 300, 250, 25);
            pnl_mes.setBounds(50+225, 335, 500, 235);
                txt_informacionMes.setBounds(2, 2, 150, 150);
                chartPanel.setBounds(173, 2, 325, 231);
            
        lbl_ahorroMes.setBounds(450, 20, 300, 25);   
            pnl_metaMes.setBounds(450, 50, 300, 75);
                txt_metaMes.setBounds(2, 2, 296,71);
                
        btn_editarDatos.setBounds(20,335+150,150,25);
        
        lbl_frase.setBounds(10, 600, 150, 25);
        txt_frase.setBounds(10, 600+25, 600, 50); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       if(e.getSource()==cerrar){
           int reps=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar la sesión?");
           if(JOptionPane.OK_OPTION==reps){
               pp.getContenedor().ValidarCerrarSeccion();
               
                menuprincipal.setBandera_inicio(1);
                menuprincipal.setBandera_perfil(0);
                menuprincipal.setBandera_servis(0);
                menuprincipal.setBandera_mes(0);
                menuprincipal.setBandera_creditos(0);
                menuprincipal.setBandera_ahorra(0);
                menuprincipal.setBandera_ciudad(0);
           }
           else{
               
           }
           
       }
       
       if(e.getSource()==btn_editarDatos){
               pp.getContenedor().controlPantallasPerfil(0);
       }
       
       if(e.getSource()==btn_enviarMeta){
            meta = Double.parseDouble(txf_meta.getText());
            
            agua = (40/100)*meta;
            energia = meta*0.5;
            agua = meta*0.1;
            
            txt_metaMes.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"4\">"
                +"<b>AGUA: </b>"+agua+" ("+"3"+" CM2)<br>"
                +"<b>ENERGÍA: </b>"+energia+" ("+"100"+" Kwh)<br>"
                +"<b>GAS: </b>"+gas+" ("+"9"+" M3)</FONT><br>");
        }
       
    }
}
