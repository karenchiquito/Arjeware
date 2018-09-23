package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Control_instancias;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Sebas
 */
public class Ahorro_agua_casa extends JPanel implements ActionListener{
    //El protected int es son las variables que tienen el tamaño del Toolidk, 1100,700 -- Aca no se pondran las bouns, pero si el resto de propiedades
    protected int width,heigth;
    //Aquí se le da la propiedad de llamar a otros paneles en los eventos de los botones
    protected Control_instancias pp;
    //En el construcor le pasamos los parametros que tendra, que son: el pp, width, heigth
    
    //Boton ejemplo (Ver al final)
    private JButton prueba;
    //Colores de la aplicación
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion = new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    
    public Ahorro_agua_casa(Control_instancias instancias, int width, int heigth){
        this.width=width;
        this.heigth=heigth;
        //Le damos las propiedades al bóton
        prueba = new JButton("Holi");
            prueba.addActionListener(this);
            prueba.setFont(new Font("Microsoft New Tai Lue",1,18));
            add(prueba);
    }
    //En el paint component le damos las posisiones y los tamaños a los objetos
    @Override
    public void paintComponent(Graphics g){
        //OJO Component no Components, esto es para que se actualize y no se creen objetos dos veces
        super.paintComponent(g);
        //Aquí le damos un color a el JPanel
        super.setBackground(Color.white);
        //Le damos a el JPanel creado sus respectivos tamaños cabe aclarar que en este tendra el tamaño cuando tiene el menu al lado quedaria así (825,700) pero con las variables que ya tenemos
        setSize(width,heigth);
        
        //Le damos las posiciones al bóton
        //----    (Posicion X,Posición Y,Ancho,Alto)
        prueba.setBounds(20, 20, 150, 25);
    }
    //Aquí cuando creemes un bóton le daremos las acciones
    @Override
    public void actionPerformed(ActionEvent e){
        //Aquí le estamos diciendo al oyente que se prepara para hacer algo SI (if) se hace click en prueba
        if(e.getSource()==prueba){
            System.out.println("Holi");
        }
    }
}
