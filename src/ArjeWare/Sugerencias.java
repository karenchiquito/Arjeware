package ArjeWare;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Sugerencias extends JPanel implements ActionListener{
    //Fundamentales------------------------------
    protected int width, height;
    protected Control_instancias pp;
    //Titulos------------------------------------
    private JLabel title;
    //JTextAreas-------------------------
    private JTextArea sugerencia,area;
    //Botones------------------------------------
    private JButton limpiar,enviar;
    //Imagenes-----------------------------------
    private JLabel imagen,imagen1,imagen2;
    //Colores------------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    public Sugerencias(Control_instancias instancias, int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        //Titulos-------------------------
        title=new JLabel("En Arjeware pensamos que el usuario es importante.");
            title.setFont(new Font("Microsoft New Tai Lue",1,18));
            title.setForeground(verde_menu);
            add(title);
        //Areas de texto------------------
        sugerencia=new JTextArea();
            sugerencia.setBorder(BorderFactory.createLineBorder(verde_menu, 1));
            sugerencia.setLayout(new FlowLayout(FlowLayout.LEFT,50,50)); 
            sugerencia.setForeground(verde_seleccion);
            sugerencia.setBackground(Color.white);
            sugerencia.setLineWrap(true);
            sugerencia.setFont(new Font("Microsoft New Tai Lue",0,16));
            add(sugerencia);
            
        area=new JTextArea();
            area.setText("Hemos visto que te interesa ayudarnos a mejorar nuestros servicios."+"\n"+"En ACGNS estamos a plena "
            +"disposición de los usuarios escuchandolos activamente para poder"+"\n"+"proporcionar el mejor de nuestros "
            +"servicios en todo momento, para nosotros eres importante,"+"\n"+"dejanos tu crítica constructiva a continuación:");
            area.setForeground(verde_seleccion);
            area.setLineWrap(true);
            area.setOpaque(true);
            area.setEditable(false);
            area.setFont(new Font("Microsoft New Tai Lue",0,16));
            add(area);
        //IMAGENES-------------------------------
        imagen = new JLabel();
            imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/sugerencia1.png")));
            add(imagen);
        imagen1 = new JLabel();
            imagen1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/sugerencia2.png")));
            add(imagen1);
        imagen2= new JLabel();
            imagen2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/sugerencia3.png")));
            add(imagen2);
        //Botones------------------------
        limpiar=new JButton("Limpiar");
            limpiar.addActionListener(this);
            limpiar.setFocusable(false);
            limpiar.setBackground(verde_seleccion);
            limpiar.setForeground(Color.white);
            limpiar.setFont(new Font("Microsoft New Tai Lue",0,16));
            add(limpiar);
        enviar=new JButton("Enviar");
            enviar.addActionListener(this);
            enviar.setFocusable(false);
            enviar.setBackground(verde_seleccion);
            enviar.setForeground(Color.white);
            enviar.setFont(new Font("Microsoft New Tai Lue",0,16));
            add(enviar);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        title.setBounds(10, 10, 700, 25);
        imagen.setBounds(50,100,200,200);
        imagen1.setBounds(50+250,100,200,200);
        imagen2.setBounds(50+500,100,200,200);
        
        area.setBounds(20,325,700,100);
        
        sugerencia.setBounds(50, 425, 710, 150);
        
        int x=400;
        int y=600;
        limpiar.setBounds(x, y, 150, 25);
        enviar.setBounds(x+175, y, 150, 25);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==limpiar){//43*7
           int reps=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea borrar todo?");
           if(JOptionPane.OK_OPTION==reps){
               sugerencia.setText("");
           }
        }
        if(e.getSource()==enviar){
            JOptionPane.showMessageDialog(null, "Su notificación fue enviada");
        }
    }
}
