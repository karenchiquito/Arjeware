package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Control_instancias;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author IEJNF
 */
public class Ahorro_gas_gas_1 extends JPanel implements ActionListener {
    protected int width,heigth;
     protected Control_instancias pp;
private JTextArea area;
private JLabel titles,titles1,titles2,titles3,titles4,titles5,titles6;
private JButton atras, adelante;
public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    private final int fx=700,fy=615,fs=50;

     public Ahorro_gas_gas_1(Control_instancias instancias,int width, int heigh){
        this.width = width;
        this.heigth = heigh;
        pp=instancias;
        
        titles=new JLabel("¿Tipos de gas?");
            titles.setFont(new Font("Microsoft New Tai Lue",1,16));
            titles.setForeground(verde_seleccion);
            add(titles);
            
            titles1=new JLabel("Gases inertes:");
            titles1.setFont(new Font("Microsoft New Tai Lue",1,16));
            titles1.setForeground(verde_seleccion);
            add(titles1);
            
            titles2=new JLabel("Gases comburentes:");
            titles2.setFont(new Font("Microsoft New Tai Lue",1,16));
            titles2.setForeground(verde_seleccion);
            add(titles2);
            
            titles3=new JLabel("Gases toxicos:");
            titles3.setFont(new Font("Microsoft New Tai Lue",1,16));
            titles3.setForeground(verde_seleccion);
            add(titles3);
            
            titles4=new JLabel("Gases corrosivos:");
            titles4.setFont(new Font("Microsoft New Tai Lue",1,16));
            titles4.setForeground(verde_seleccion);
            add(titles4);
            
            titles5=new JLabel("Gases licuados:");
            titles5.setFont(new Font("Microsoft New Tai Lue",1,16));
            titles5.setForeground(verde_seleccion);
            add(titles5);
            
            titles6=new JLabel("Gases oxidantes:");
            titles6.setFont(new Font("Microsoft New Tai Lue",1,16));
            titles6.setForeground(verde_seleccion);
            add(titles6);
            
        
         area = new JTextArea();
            area.setOpaque(false);
            area.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area.setEditable(false);
            area.setBackground(Color.white);
            area.setVisible(true);
            area.setLineWrap(true);
            area.setText("Como su nombre lo da a entender, este tipo de gases se caracterizan por ser muy"
                    + " estables y"+"\n"+"por no causar respuestas violentas a ciertos contextos. Esto quiere decir que son gases"
                    + " que no arden ni son"+"\n"+"combustibles."+"\n"+"\n"+
                      "Evidentemente, este tipo de gases son todos aquellos que producen cierta liberación de energía si se ven sujetos a algún estímulo. Esto"
                    + " quiere decir que dichos gases producen reacciones violentas,generalmente explosiones, que liberan"
                    + " energía. Los gases combustibles se utilizan entonces para generar o mantener energía. Por ejemplo,"
                    + " el gas que usamos diariamente en nuestras casas en la estufa o para"+"\n"+"calentar el agua con la que nos bañamos."+"\n"+"\n"+
                      "como su nombre lo indica, este tipo de gases son todos aquellos que contienen sustancias"+"\n"+"nocivas"
                    + " para la salud de los seres vivos. La exposición a este tipo de gases puede tener entonces efectos fatales,"
                    + " principalmente si se hace de forma prolongada."+"\n"+"\n"+
                      "Este tipo de gases producen o ayudan a la corrosión, el cual es un proceso químico que"+"\n"+
                      "altera las condiciones de ciertos elementos. De esta manera, los gases corrosivos pueden resultar peligrosos"+"\n"+
                      ", ya que desgastan al material que afecten."+"\n"+"\n"+
                      "Este tipo de gases tienen ciertas características específicas, las cuales se ven afectadas"+"\n"+
                      " cuando el gas supera alguna temperatura límite. Suelen ser gases que se envasan para ser utilizados en"+"\n"+ "lugares."+"\n"+"\n"+
                      "Tal y como sucede con los corrosivos, este tipo de gases producen oxidación en los elementos "
                    + "o materiales a"+"\n"+"los cuales se les exponga. Son por tanto agentes que producen una alteración química."


);
            add(area);
            
            atras=new JButton();
            atras.setVisible(true);
            atras.addActionListener(this);
            atras.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
            atras.setContentAreaFilled(false);
            atras.setFocusPainted(false);
            atras.setBorderPainted(false);
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
                        adelante.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png")));
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
        area.setBounds(20,80,750, 525);
        titles.setBounds(20,20,300,25);
        titles1.setBounds(20,60,300,25);
        titles2.setBounds(20,150,300,25);
        titles3.setBounds(20,280,300,25);
        titles4.setBounds(20,370,300,25);
        titles5.setBounds(20,455,300,25);
        titles6.setBounds(20,545,300,25);
        atras.setBounds(fx,fy,35,35); adelante.setBounds(fx+fs+5,fy,35,35);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==atras){
            pp.getContenedor().controlPantallas_gas(0);
        }
}
}