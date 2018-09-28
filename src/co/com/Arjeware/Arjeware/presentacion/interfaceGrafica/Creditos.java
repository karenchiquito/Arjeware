
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JButtonArje;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JEditorPaneArje;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author wmuno
 */
public class Creditos extends JPanel implements ActionListener{
    protected int width, heigth;
    private JLabel title;
    
    private JEditorPaneArje txt_autores,txt_colaboraciones,txt_profesores,
        txt_mentor;
    
    private JButtonArje btn_atras,btn_adelante;
    private final int fx=700,fy=605,fs=50;
    protected Control_instancias pp;
    
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    
    public Creditos (Control_instancias instancias,int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
        
        pp=instancias;
            
        txt_autores= new JEditorPaneArje();
            txt_autores.setTexto("<b>Autores de la aplicación:</b><br>"
                +"Jhon Sebastian Agude Sierra.<br>"
                +"Leidy Johana Pamplona Cortes.<br>"
                +"Juan José Navarro Saldarriaga<br>"
                +"Leidy Stephania Castaño Gomez.");
            this.add(txt_autores);
            
        txt_colaboraciones= new JEditorPaneArje();
            txt_colaboraciones.setTexto("<b>Colaboraciones:</b><br>"
                +"Lina Marcela Vasquez.<br>"
                +"John Faber Florez.<br>"
                +"Juan Pérez Pérez.<br>"
                +"Willinton Muñoz Espinal.<br>"
                +"Luis Giraldo.<br>");
            this.add(txt_colaboraciones);
            
        txt_profesores= new JEditorPaneArje();
            txt_profesores.setTexto("<b>Profesores:</b><br>"
                +"Lina Marcela Vasquez.&emsp; Docente de pensamiento lógico analítico sistémico.<br>"
                +"John Faber Florez.&emsp; Docente de requisitos y aplicaciones Android.<br>"
                +"Juan Pérez Pérez.&emsp; Docente de bases de datos y aplicaciones web.<br>"
                +"Marta Duque &emsp; Asesora de proyecto.<br>"
                +"Javier Saldarriaga Profesor de ciencias de 9°, promotor de la idea promaria.");
            this.add(txt_profesores);
            
        txt_mentor=new JEditorPaneArje();
            txt_mentor.setTexto("<b>Mentor:</b><br>"
                +"Jon Faber Flórez Vasco<br>"
                +"Ingeniero Informático - PCJIC<br>" 
                +"Maestría en Ingeniería de Software - EAFIT");
            this.add(txt_mentor);
            
        title = new JLabel("Creditos y agradecimientos.");
            title.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 20));
            title.setForeground(verde_seleccion);
            add(title);
            
        btn_atras=new JButtonArje("flecha_izquierda", "flecha_izquierda_seleccion", "png", "png");
            btn_atras.addActionListener(this);
          //uno.setDefaultCapable(false);
            add(btn_atras);
            
        btn_adelante=new JButtonArje("flecha_derecha", "flecha_derecha_seleccion", "png", "png");
            btn_adelante.addActionListener(this);
            add(btn_adelante);
    		
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);

        int x =60;
        int y =65;
        
        title.setBounds(250,10,350,25);
        
        txt_autores.setBounds(20, y,250, 150);
        
        txt_colaboraciones.setBounds(20,txt_autores.getHeight()+30,300,300);
        
        txt_profesores.setBounds(20,txt_colaboraciones.getHeight()+30,750,100);
        txt_mentor.setBounds(20,460,300,100);
        
        btn_atras.setBounds(fx,fy,35,35); btn_adelante.setBounds(fx+fs+5,fy,35,35); 

    }


	@Override
	public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn_adelante){
                pp.getContenedor().controlPantallas_Creditos(1);
            }
	}
}
