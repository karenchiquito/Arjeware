package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;
import co.com.Arjeware.Arjeware.entity.Entidades.Sesion;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.IconAjustado;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import javax.management.NotificationBroadcasterSupport;
import javax.management.timer.TimerMBean;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;

/**
 *
 * @author wmuno
 */
public class Inicio extends JPanel implements ActionListener{
    //Fundamentales
    protected int width, heigth;
    protected Control_instancias pp;
    //Titulos, y textos tipo JLabel
    private JLabel lb,ideas,lbl_sabias,lbl_lema,somos;
    //Imagenes-----------------------------------
    private JLabel imagenes;
    IconAjustado iA;
    //Areas de texto-----------------------------
    private JEditorPane txt_informacion,txt_manual,txt_frase;
    //Banderas-----------------------------------
    public int bandera_3=0;
    public static int bandera_1=1,bandera_2=0;
    
    public String frases = new A_Banderas_publicas().setFrase();
    //Botónes------------------------------------
    private JButton dinero,btn_circulo1,dos,tres;
    //Temporizador-------------------------------
    private java.util.Timer timer = new java.util.Timer();
    //Colores------------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    //Caracteres---------------------------------
    char comilla='"';
                  
    
    public Inicio (Control_instancias instancias,int width, int heigth) {
        
        this.width = width;
        this.heigth = heigth;
        pp=instancias;
         
        lb = new JLabel("Bienvenido(a) a Arjeware  "+Sesion.getNombre()+" esperamos que tú experiencia sea acojedora.");
            lb.setForeground(verde_seleccion);
            lb.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,16));
            add(lb);
            
            
        lbl_sabias=new JLabel("Sabías que:");
            lbl_sabias.setFont(new Font("Microsoft New Tai Lue",1, 18));
            lbl_sabias.setForeground(verde_menu);
            add(lbl_sabias);
            
        txt_frase = new JEditorPane();
            txt_frase.setEditable(false);
            txt_frase.setContentType("text/html");
            txt_frase.setBackground(verde_sabias);
            txt_frase.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"#347A34\" font size=\"4\">"+frases+"</FONT>");
            this.add(txt_frase);
         
        txt_informacion= new JEditorPane();
            txt_informacion.setContentType("text/html");
            txt_informacion.setEditable(false);
            txt_informacion.setOpaque(false);
            txt_informacion.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"4\">Esta es una app que te permite ver tu gasto de servicios siempre que"
            +" lo desees de una<b>MISIÓN</b> y <b>VISIÓN</b> manera práctica, efícaz y entendible.<br><br>Además te permitirá conocer maneras"+
            " de <b>ahorrar</b> en el consumo de servicios del hogar de maneras sencillas y económicas; además"
            +" en el proceso de conocer el procedimiento por el cual pagas tus servicios básicos en el hogar"+
            " podras conocer tips para ahorrar en el consumo de tus servicios.<br><br>Esperamos sea de tu agrado <b>ARJEWARE</b>.</FONT><br>");
            this.add(txt_informacion);
            
        txt_manual = new JEditorPane();
            txt_manual.setContentType("text/html");
            txt_manual.setOpaque(false);
            txt_manual.setEditable(false);
            txt_manual.setText("<FONT FACE=\"Microsoft New Tai Lue\" color=\"464646\" font size=\"5\">Puedes acceder "
                +"a nuestro manual yendo al submenú ubicado en la esquina superior derecha"
            +" y después haciendo clic en manual.</FONT><br>");
            this.add(txt_manual);
        
        /*area = new JTextArea();
            area.setFont(new Font("Microsoft New Tai Lue",0, 16));
            area.setEditable(false);
            area.setBackground(Color.white);
            //area.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            area.setVisible(true);
            area.setLineWrap(true);
            area.setText("Esta es una app que te permite ver tu"+"\n"+"gasto de servicios siempre que"
            +" lo desees   de una manera práctica, efícaz y entendible."+"\n"+"\n"+"Además te permitirá conocer maneras"+
            " de  ahorrar en el consumo de servicios del "+"\n"+"hogar de maneras sencillas y económicas; además"
            +" en el proceso de conocer el"+"\n"+"procedimiento por el cual pagas tus"+"\n"+"servicios básicos en el hogar"+
            " podras"+"\n"+"conocer tu impacto en la huella hídrica y"+"\n"+"de carbono.");
            add(area);*/
        	
        ideas = new JLabel("¿Eres nuevo por aquí? Nuestro manual de usuarios te ayudara.");
                ideas.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16));
                ideas.setForeground(verde_seleccion);
                add(ideas);
                
        /*manual_informacion = new JTextArea();
            manual_informacion.setFont(new Font("Microsoft New Tai Lue",0, 16));
            manual_informacion.setEditable(false);
            manual_informacion.setBackground(Color.white);
            //manual_informacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            manual_informacion.setVisible(true);
            manual_informacion.setLineWrap(true);
            manual_informacion.setText("Puedes acceder a nuestro manual yendo al submenú ubicado en la esquina inferior"
            +" derecha selecionando el botón ayuda y después en manual.");
            add(manual_informacion);*/
                
        lbl_lema = new JLabel(comilla+"Porque la tecnología y el medio ambiente no son tan distantes"+comilla);
            lbl_lema.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18));
            lbl_lema.setForeground(verde_menu);
            add(lbl_lema);
        	
                
        btn_circulo1=new JButton();
            btn_circulo1.setVisible(true);
            btn_circulo1.addActionListener(this);
            btn_circulo1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
            btn_circulo1.setContentAreaFilled(false);
            btn_circulo1.setFocusPainted(false);
            btn_circulo1.setBorderPainted(false);
            //uno.setDefaultCapable(false);
            btn_circulo1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo_seleccion.png")));
            add(btn_circulo1);
                
        dos=new JButton();
                dos.setVisible(true);
        	dos.addActionListener(this);
                dos.setBorderPainted(false);
                dos.setContentAreaFilled(false);
        	dos.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
        	dos.setBackground(new Color(50, 205, 50));
        	dos.setFocusPainted(false);
                dos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
        	add(dos);
        
        tres=new JButton();
                tres.setVisible(true);
        	tres.addActionListener(this);
                tres.setBorderPainted(false);
                tres.setContentAreaFilled(false);
        	tres.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 8));
        	tres.setBackground(new Color(50, 205, 50));
        	tres.setFocusPainted(false);
                tres.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
        	add(tres);
                
        btn_circulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_circulo1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo_seleccion.png")));
                btn_circulo1.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                if(bandera_1 == 1){
                    btn_circulo1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo_seleccion.png")));
                    }
                                        else{
                                            btn_circulo1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_1=1;
                                        bandera_2=0;
                                        bandera_3=0;
                                        
                                        //uno.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                        dos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                        tres.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                    }
                            });
                
                dos.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                        dos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo_seleccion.png")));
                                        dos.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        if(bandera_2 == 1){
                                            dos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo_seleccion.png")));
                                        }
                                        else{
                                            dos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_1=0;
                                        bandera_2=1;
                                        bandera_3=0;
                                        
                                        btn_circulo1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                        //dos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                        tres.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                    }
                            });
                
                tres.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                        tres.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo_seleccion.png")));
                                        tres.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        if(bandera_3 == 1){
                                            tres.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo_seleccion.png")));
                                        }
                                        else{
                                            tres.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_1=0;
                                        bandera_2=0;
                                        bandera_3=1;
                                        
                                        btn_circulo1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                        dos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                        //tres.setIcon(new ImageIcon(getClass().getResource("/Imagenes/circulo.png")));
                                    }
                            });
                
        imagenes=new JLabel();
            this.add(imagenes);
    }
    
   
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,heigth);

        lb.setBounds(25, 5, 625, 50);
        txt_informacion.setBounds(25, 75, 300, 300);
        
        lbl_sabias.setBounds(50, 355, 150, 25);
        txt_frase.setBounds(50, 355+35, 300, 75);

        int ya=575;
        ideas.setBounds(20,500,600,25);
        txt_manual.setBounds(20, 525, 475, 75);
        
        lbl_lema.setBounds(125,610,700,25);
        
        int x = 550;
        int y=325;
        btn_circulo1.setBounds(x,y+150+25,35,35);
        dos.setBounds(x+75,y+150+25,35,35);
        tres.setBounds(x+75*2,y+150+25,35,35);
        
        imagenes.setBounds(375, 75, 400, 400);
        imagenes.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Lbl_inicioAhorra.jpg")));
        try{
            //iA.setTamano("Lbl_inicioAhorra","jpg",imagenes);
        }catch(Exception ex){
            //System.out.println("Clase: Inicio, Metodo: paintComponent, Error: "+ex.getMessage()+"\n"+
                //ex.getCause());
            //System.out.println(getClass().getResource("/Imagenes/Lbl_inicioAhorra.jpg"));
        }
        
    }
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
            if(e.getSource() == dinero){
                pp.getContenedor().controlSubpantallas(3);
            }
            if(e.getSource() == btn_circulo1){
                try{
                    iA.setTamano("mann", "png", imagenes);
                    System.out.println("IG GASGKASGMAPSLGMASÑLGAS");
                }catch(Exception ex){
                    System.out.println("Clase: Inicio, Metodo: paintComponent, Error: "+ex.getMessage());
                }
            }
            if(e.getSource() == dos){
                iA.setTamano("tierra", "png", imagenes);
            }
            if(e.getSource() == tres){
                iA.setTamano("hue", "png", imagenes);
            }
            
            /*tiempo.scheduleAtFixedRate(tarea ,velm ,velm);*/
	}
        
        public void timerS (){
            TimerTask tarea= new TimerTask() {
                
                int a = 0;

                @Override
                public void run() {
                    switch(a)
                    {
                        case 0:
                        imagenes.setIcon(new ImageIcon(getClass().getResource("/Imagenes/foco_1.png")));
                        break;
                        case 1: 
                        imagenes.setIcon(new ImageIcon(getClass().getResource("/Imagenes/agua_ini.png")));
                        break;
                        case 2:
                        imagenes.setIcon(new ImageIcon(getClass().getResource("/Imagenes/energia.png")));
                        break;
                            
                   };
                   a++;
                    if(a<=2){
                    a=0;
                    }
                    else if (a==1){
                    a++;
                    }
                    else{
                    a++;
                    }
                }
            };
                 
                  timer.scheduleAtFixedRate(tarea, 0, 5000);
        }
        
        
}
