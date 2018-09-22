/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.border.BevelBorder.LOWERED;
import static javax.swing.border.BevelBorder.RAISED;

/**
 *
 * @author Sebas
 */
public class Sub_menu_foto extends JPanel implements ActionListener{
    //Fundamentales------------------
    protected int width,height;
    protected Control_instancias pp;
    //Radio Boton------------------------
    private JRadioButton zona_basuras,empresa_contaminante,aguas_contaminadas;
    //BOTONES------------------------------------------------------
    private JButton subir_foto;
    //Titulos-------------------------
    private JLabel title,foto_subida,direc,tipo,desc;
    //USUARIO_INSERTAR----------------------
    private JTextArea descripcion;
    private JTextField direccion_zona_contaminada;
    //CONTROLES BOOLEAN------------------------
    private boolean control_descripcion = true;
    //BANDERAS---------------------------------
    private int bandera_direccion=0;
    //Colores-------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    
    public Sub_menu_foto(Control_instancias instancias,int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        title=new JLabel("MEJORAR CIUDAD: Foto");
            title.setForeground(verde_menu);
            title.setFont(new Font("Microsoft New Tai Lue",1,16));
            this.add(title);
            
        direc=new JLabel("Dirección:");
            direc.setForeground(verde_seleccionar);
            direc.setFont(new Font("Microsoft New Tai Lue",1,16));
            this.add(direc);
            
        tipo=new JLabel("Tipo de contaminación:");
            tipo.setForeground(verde_seleccionar);
            tipo.setFont(new Font("Microsoft New Tai Lue",1,16));
            this.add(tipo);
        
        desc=new JLabel("Descripción (Opcional): ");
            desc.setForeground(verde_seleccionar);
            desc.setFont(new Font("Microsoft New Tai Lue",1,16));
            this.add(desc);
            
        foto_subida=new JLabel();
            foto_subida.setForeground(verde_menu);
            foto_subida.setBorder(BorderFactory.createMatteBorder(1, 1, 2, 1, verde_menu));
            foto_subida.setFont(new Font("Microsoft New Tai Lue",1,16));
            this.add(foto_subida);
            
        direccion_zona_contaminada=new JTextField();
            direccion_zona_contaminada.setFont(new Font("Microsoft New Tai Lue",1,16));
            direccion_zona_contaminada.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            add(direccion_zona_contaminada);
            
        descripcion=new JTextArea();
            descripcion.setLineWrap(true);
            descripcion.setFont(new Font("Microsoft New Tai Lue",1,16));
            descripcion.setVisible(control_descripcion);
            descripcion.setBackground(verde_sabias);
            descripcion.setBorder(BorderFactory.createLineBorder(verde_sabias));
            add(descripcion);
            
        zona_basuras=new JRadioButton("Zona llena de basura");
            zona_basuras.setContentAreaFilled(false);
            zona_basuras.setFont(new Font("Microsoft New Tai Lue",1,13));
            zona_basuras.setFocusable(false);
            add(zona_basuras);
            
        empresa_contaminante=new JRadioButton("Empresa contaminante");
            empresa_contaminante.setContentAreaFilled(false);
            empresa_contaminante.setFont(new Font("Microsoft New Tai Lue",1,13));
            empresa_contaminante.setFocusable(false);
            add(empresa_contaminante);
            
        aguas_contaminadas=new JRadioButton("Aguas llenas de basura");
            aguas_contaminadas.setContentAreaFilled(false);
            aguas_contaminadas.setFont(new Font("Microsoft New Tai Lue",1,13));
            aguas_contaminadas.setFocusable(false);
            add(aguas_contaminadas);
            
        subir_foto=new JButton();
            subir_foto.setContentAreaFilled(false);
            subir_foto.setBorderPainted(false);
            subir_foto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Subir.png")));
            subir_foto.setFont(new Font("Microsoft New Tai Lue",1,13));
            subir_foto.setFocusable(false);
            add(subir_foto);
            
        direccion_zona_contaminada.addMouseListener(new java.awt.event.MouseAdapter(){
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt){
                    direccion_zona_contaminada.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, verde_menu));
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt){
                    if(bandera_direccion==1){
                        direccion_zona_contaminada.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, verde_menu));
                    }else{
                        direccion_zona_contaminada.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
                    }
                }
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt){
                    bandera_direccion=1;
                    
                }
            });
        subir_foto.addMouseListener(new java.awt.event.MouseAdapter(){
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt){
                    subir_foto.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    subir_foto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Subir_seleccion.png")));
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt){
                    subir_foto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Subir.png")));
                }
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt){
                    
                }
            });
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        title.setBounds(10,10,300,25);
        foto_subida.setBounds(20, 40, 300, 300);
        
        direc.setBounds(340, 40, 300, 25);
        direccion_zona_contaminada.setBounds(340,65,300,25);
        
        tipo.setBounds(340,100,300,25);
        //Radio Button hubicación-----------------------------
        zona_basuras.setBounds(340,130,155,25);
        empresa_contaminante.setBounds(340+155+50,130,170,25);
        aguas_contaminadas.setBounds(340,160,170,25);
        
        subir_foto.setBounds(20, 355, 35, 35);
        
        desc.setBounds(20,400,300,25);
        descripcion.setBounds(20,425,775,200);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
}
