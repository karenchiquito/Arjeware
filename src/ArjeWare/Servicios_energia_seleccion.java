
package ArjeWare;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author JHON SEBASTIAN AGUDELO SIERRA
 * tel: 311 326 4747
 */
public class Servicios_energia_seleccion extends JPanel implements ActionListener{
    //Fundamentales-----------------------
    protected int width,height;
    protected Control_instancias pp;
    //titulos------------------------------
    
    //Botones------------------------------
    private JButton normal,paneles,manual,automatico;
    
    public Servicios_energia_seleccion(Control_instancias instancias, int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        normal=new JButton();
            normal.addActionListener(this);
            normal.setContentAreaFilled(false);
            normal.setFocusable(false);
            normal.setFocusPainted(false);
            normal.setBorderPainted(false);
            normal.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_energia_normal.png")));
            add(normal);
            
        paneles=new JButton();
            paneles.addActionListener(this);
            paneles.setContentAreaFilled(false);
            paneles.setFocusable(false);
            paneles.setFocusPainted(false);
            paneles.setBorderPainted(false);
            paneles.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_energia_paneles.png")));
            add(paneles);
            
        /*eolica=new JButton();
            eolica.addActionListener(this);
            add(eolica);*/
            
        /*tesla=new JButton();
            tesla.addActionListener(this);
            add(tesla);*/
        
        normal.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                normal.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_energia_normal_seleccion.png")));
                normal.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                normal.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_energia_normal.png")));
            }
        });
        paneles.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                paneles.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_energia_paneles_seleccion.png")));
                paneles.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                paneles.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Boton_energia_paneles.png")));
            }
        });
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        normal.setBounds(42, 375, 352, 102);
        paneles.setBounds(30+400, 375, 352, 102);
        //eolica.setBounds(30+400, 500, 350, 100);
        //tesla.setBounds(42, 500, 350, 100);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==normal){
            pp.getContenedor().controlSubpantallas(1);
        }
    }
}
