package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Creditos_1 extends JPanel implements ActionListener{
    protected int width, heigth;
    private JButton atras,adelante;
    private final int fx=700,fy=605,fs=50;
    protected Control_instancias pp;
    private JLabel test;
    private JTextArea tester;
        
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    
    public Creditos_1(Control_instancias instancias,int width, int heigth){
        this.width=width;
        this.heigth=heigth;
        
        pp=instancias;
        
        test = new JLabel("Tester(s):");
            test.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16));
            test.setForeground(verde_seleccion);
            add(test);
            
        tester= new JTextArea();
            tester.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16));
            tester.setEditable(false);
            tester.setOpaque(false);
            tester.setBackground(Color.white);
            tester.setVisible(true);
            tester.setLineWrap(true);
            tester.setText("Jhon Sebastian Agudelo Sierra y Juan Diego Sierra Escobar dieron todo de si para ver que la aplicación"
            +" no"+"\n"+"tuviera ningún tipo de fallos ni estuviera falta de algún código, calculo, control, etc...");
            add(tester);
    
        atras=new JButton();
            atras.setVisible(true);
            atras.addActionListener(this);
            atras.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
            atras.setContentAreaFilled(false);
            atras.setFocusPainted(false);
            atras.setBorderPainted(false);
          //uno.setDefaultCapable(false);
            atras.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_izquierda.png")));
            add(atras);
            
        adelante=new JButton();
            adelante.setVisible(true);
            adelante.addActionListener(this);
            adelante.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
            adelante.setContentAreaFilled(false);
            adelante.setFocusPainted(false);
            adelante.setBorderPainted(false);
          //uno.setDefaultCapable(false);
            adelante.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png")));
            add(adelante);
            
                atras.addMouseListener(new java.awt.event.MouseAdapter() {
                             @Override
                             public void mouseEntered(java.awt.event.MouseEvent evt){
                                atras.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_izquierda_seleccion.png")));
                                atras.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                                }
                             @Override
                             public void mouseExited(java.awt.event.MouseEvent evt){
                                atras.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_izquierda.png")));
                                }
                             });
                adelante.addMouseListener(new java.awt.event.MouseAdapter() {
                             @Override
                             public void mouseEntered(java.awt.event.MouseEvent evt){
                                adelante.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_derecha_seleccion.png")));
                                adelante.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                                }
                             @Override
                             public void mouseExited(java.awt.event.MouseEvent evt){
                                adelante.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png")));
                                }
                             });
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);
        
        test.setBounds(20, 20, 150, 25);
        tester.setBounds(20,50,750,50);
        
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35); 
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlPantallas_Creditos(0);
        }
    }
}
