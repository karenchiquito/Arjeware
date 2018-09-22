package ArjeWare;

import Metodos.IconAjustado;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author wmuno
 */
public class menuprincipal extends JPanel implements ActionListener{
    protected final int width,height;
    protected Control_instancias pp;
    
    private JButton btn_inicio,btn_resumen,btn_servicios,ahorra,ciudad,btn_gastos,creditos;
    
    private JLabel Title;
    int []bandera_matriz=new int[2];
    public static int bandera_inicio=1,bandera_perfil=0,bandera_servis=0,bandera_mes=0,bandera_creditos=0,
    bandera_ahorra=0,bandera_ciudad=0;
    
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    
    //IMAGENES
    ImageIcon imagen = new ImageIcon();
    ImageIcon icono = new ImageIcon();
    
    IconAjustado iA=new IconAjustado();
        
    public menuprincipal(Control_instancias instancias, int width, int height) {
        this.width = width;
        this.height = height;
        pp = instancias;
        
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Logo_final.png"));
        icono = new ImageIcon(imagen.getImage());
        
        Title = new JLabel();
            Title.setFont(new Font("Arial", Font.BOLD, 30));
            Title.setIcon(icono);
            Title.setForeground(Color.white);
            add(Title);
        

        btn_inicio = new JButton("     Inicio");
            btn_inicio.setToolTipText("Aquí encontraras la información y las funcionalidades de ACGNS");
            btn_inicio.addActionListener(this);
            btn_inicio.setFocusPainted(false);
            btn_inicio.setBackground(verde_seleccionar);
            btn_inicio.setBorderPainted(false);
            btn_inicio.setHorizontalAlignment(SwingConstants.LEFT);
            btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa_blanca.png")));
            btn_inicio.setForeground(new Color(255, 255, 255));
            add(btn_inicio);
        
        btn_resumen = new JButton("     Resumen");
            btn_resumen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            btn_resumen.addActionListener(this);
            btn_resumen.setBorderPainted(false);
            btn_resumen.setFocusPainted(false);
            btn_resumen.setBackground(verde_menu);
            btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
            btn_resumen.setToolTipText("Resumen del consumo de todos los servicios.");
            add(btn_resumen);
        
        btn_servicios = new JButton("     Servicios");
            btn_servicios.addActionListener(this);
            btn_servicios.setFocusPainted(false);
            btn_servicios.setBorderPainted(false);
            btn_servicios.setBackground(verde_menu);
            btn_servicios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/servi.png")));
            btn_servicios.setToolTipText("Información sobre los servicios que te brinda la app.");
            add(btn_servicios);
            
        ahorra = new JButton("     Ahorra");
            ahorra.addActionListener(this);
            ahorra.setFocusPainted(false);
            ahorra.setBorderPainted(false);
            ahorra.setBackground(verde_menu);
            ahorra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu.png")));
            ahorra.setToolTipText("Aquí encontraras todo tipo de información de como ahorrar en los servicios");
            add(ahorra);
            
        ciudad = new JButton("      Ciudad");
            ciudad.addActionListener(this);
            ciudad.setFocusPainted(false);
            ciudad.setBorderPainted(false);
            ciudad.setBackground(verde_menu);
            ciudad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu.png")));
            ciudad.setToolTipText("Proyectos y formas de ayudar a nuestra la ciudad de MEdellín.");
            ciudad.setVisible(false);
            add(ciudad);
            
        btn_gastos= new JButton("      Gastos");
            btn_gastos.addActionListener(this);
            btn_gastos.setFocusPainted(false);
            btn_gastos.setBackground(verde_menu);
            btn_gastos.setBorderPainted(false);
            btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja.png")));
            btn_gastos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            add(btn_gastos);
         
        creditos=new JButton("Créditos");
            creditos.addActionListener(this);
            creditos.setFocusPainted(false);
            creditos.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,13));
            creditos.setBorderPainted(false);
            creditos.setBackground(verde_menu);
            creditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            add(creditos);
            
            
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                btn_inicio.setBackground(verde_seleccionar);
                btn_inicio.setForeground(new Color(255, 255, 255));
                btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa_blanca.png")));
            }
            @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        if(bandera_inicio==1){
                                        btn_inicio.setBackground(verde_seleccionar);
                                            btn_inicio.setForeground(new Color(255, 255, 255));
                                            btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa_blanca.png")));
                                        }
                                        else{
                                            btn_inicio.setBackground(verde_menu);
                                                btn_inicio.setForeground(new Color(45, 45, 45));
                                                btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa.png")));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_inicio=1;
                                        bandera_perfil=0;
                                        bandera_servis=0;
                                        bandera_ahorra=0;
                                        bandera_ciudad=0;
                                        bandera_mes=0;

                                        //button1.setBackground(verde_menu);
                                            //button1.setForeground(new Color(45, 45, 45));
                                            //button1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa.png")));
                                        btn_resumen.setBackground(verde_menu);
                                            btn_resumen.setForeground(new Color(45, 45, 45));
                                            btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        btn_servicios.setBackground(verde_menu);
                                            btn_servicios.setForeground(new Color(45, 45, 45));
                                            btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/servi.png")));
                                        ahorra.setBackground(verde_menu);
                                            ahorra.setForeground(new Color(45, 45, 45));
                                            ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu.png")));
                                        ciudad.setBackground(verde_menu);
                                            ciudad.setForeground(new Color(45, 45, 45));
                                            ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu.png")));
                                            //ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        btn_gastos.setBackground(verde_menu);
                                            btn_gastos.setForeground(new Color(45, 45, 45));
                                            btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja.png")));
                                        creditos.setBackground(verde_menu);
                                            creditos.setForeground(new Color(45, 45, 45));
                                    }
                            });

                            btn_resumen.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                        btn_resumen.setBackground(verde_seleccionar );
                                            btn_resumen.setForeground(new Color(255, 255, 255));
                                            btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi_blanca.png")));
                                    }
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        if(bandera_perfil==1){
                                        btn_resumen.setBackground(verde_seleccionar );
                                            btn_resumen.setForeground(new Color(255, 255, 255));
                                            btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi_blanca.png")));
                                        }
                                        else{
                                            btn_resumen.setBackground(verde_menu);
                                                btn_resumen.setForeground(new Color(45, 45, 45));
                                                btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_inicio=0;
                                        bandera_perfil=1;
                                        bandera_servis=0;
                                        bandera_ahorra=0;
                                        bandera_ciudad=0;
                                        bandera_mes=0;

                                        btn_inicio.setBackground(verde_menu);
                                            btn_inicio.setForeground(new Color(10, 10, 10));
                                            btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa.png")));
                                        //button2.setBackground(new Color(50, 205, 50));
                                        ahorra.setBackground(verde_menu);
                                            ahorra.setForeground(new Color(45, 45, 45));
                                            ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu.png")));
                                        ciudad.setBackground(verde_menu);
                                            ciudad.setForeground(new Color(45, 45, 45));
                                            ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu.png")));
                                            //ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        btn_servicios.setBackground(verde_menu);
                                            btn_servicios.setForeground(new Color(45, 45, 45));
                                            btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/servi.png")));
                                        btn_gastos.setBackground(verde_menu);
                                            btn_gastos.setForeground(new Color(45, 45, 45));
                                            btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja.png")));
                                        creditos.setBackground(verde_menu);
                                            creditos.setForeground(new Color(45, 45, 45));
                                    }
                            });

                            btn_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                        btn_servicios.setBackground(verde_seleccionar );
                                            btn_servicios.setForeground(new Color(255, 255, 255));
                                            btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/libro.png")));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        if(bandera_servis == 1){
                                            btn_servicios.setBackground(verde_seleccionar );
                                                btn_servicios.setForeground(new Color(255, 255, 255));
                                                btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/libro.png")));
                                        }
                                        else{
                                            btn_servicios.setBackground(verde_menu);
                                                btn_servicios.setForeground(new Color(45, 45, 45));
                                                btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/servi.png")));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_inicio=0;
                                        bandera_perfil=0;
                                        bandera_servis=1;
                                        bandera_ahorra=0;
                                        bandera_ciudad=0;
                                        bandera_mes=0;

                                        btn_inicio.setBackground(verde_menu);
                                            btn_inicio.setForeground(new Color(45, 45, 45));
                                            btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa.png")));
                                        btn_resumen.setBackground(verde_menu);
                                            btn_resumen.setForeground(new Color(45, 45, 45));
                                            btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        //button3.setBackground(new Color(50, 205, 50));
                                        ahorra.setBackground(verde_menu);
                                            ahorra.setForeground(new Color(45, 45, 45));
                                            ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu.png")));
                                        ciudad.setBackground(verde_menu);
                                            ciudad.setForeground(new Color(45, 45, 45));
                                            ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu.png")));
                                            //ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        btn_gastos.setBackground(verde_menu);
                                            btn_gastos.setForeground(new Color(45, 45, 45));
                                            btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja.png")));
                                        creditos.setBackground(verde_menu);
                                            creditos.setForeground(new Color(45, 45, 45));
                                    }
                            });
                            
                            ahorra.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                        ahorra.setBackground(verde_seleccionar );
                                            ahorra.setForeground(new Color(255, 255, 255));
                                            ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu_seleccion.png")));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        if(bandera_ahorra == 1){
                                            ahorra.setBackground(verde_seleccionar );
                                                ahorra.setForeground(new Color(255, 255, 255));
                                                ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu_seleccion.png")));
                                        }
                                        else{
                                            ahorra.setBackground(verde_menu);
                                                ahorra.setForeground(new Color(45, 45, 45));
                                                ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu.png")));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_inicio=0;
                                        bandera_perfil=0;
                                        bandera_servis=0;
                                        bandera_ahorra=1;
                                        bandera_ciudad=0;
                                        bandera_mes=0;

                                        btn_inicio.setBackground(verde_menu);
                                            btn_inicio.setForeground(new Color(45, 45, 45));
                                            btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa.png")));
                                        btn_resumen.setBackground(verde_menu);
                                            btn_resumen.setForeground(new Color(45, 45, 45));
                                            btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        btn_servicios.setBackground(verde_menu);
                                            btn_servicios.setForeground(new Color(45, 45, 45));
                                            btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/servi.png")));
                                        /*button4.setBackground(verde_menu);
                                            button4.setForeground(new Color(45, 45, 45));
                                            button4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));*/
                                        ciudad.setBackground(verde_menu);
                                            ciudad.setForeground(new Color(45, 45, 45));
                                            ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu.png")));
                                        btn_gastos.setBackground(verde_menu);
                                            btn_gastos.setForeground(new Color(45, 45, 45));
                                            btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja.png")));
                                        creditos.setBackground(verde_menu);
                                            creditos.setForeground(new Color(45, 45, 45));
                                    }
                            });
                            
                            ciudad.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                        ciudad.setBackground(verde_seleccionar );
                                            ciudad.setForeground(new Color(255, 255, 255));
                                            ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu_seleccion.png")));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        if(bandera_ciudad==1){
                                            ciudad.setBackground(verde_seleccionar );
                                                ciudad.setForeground(new Color(255, 255, 255));
                                                ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu_seleccion.png")));
                                        }
                                        else{
                                            ciudad.setBackground(verde_menu);
                                                ciudad.setForeground(new Color(45, 45, 45));
                                                ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu.png")));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_inicio=0;
                                        bandera_perfil=0;
                                        bandera_servis=0;
                                        bandera_ahorra=0;
                                        bandera_ciudad=1;
                                        bandera_mes=0;

                                        btn_inicio.setBackground(verde_menu);
                                            btn_inicio.setForeground(new Color(45, 45, 45));
                                            btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa.png")));
                                        btn_resumen.setBackground(verde_menu);
                                            btn_resumen.setForeground(new Color(45, 45, 45));
                                            btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        btn_servicios.setBackground(verde_menu);
                                            btn_servicios.setForeground(new Color(45, 45, 45));
                                            btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/servi.png")));
                                        ahorra.setBackground(verde_menu);
                                            ahorra.setForeground(new Color(45, 45, 45));
                                            ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu.png")));
                                            //button4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        //ciudad.setBackground(verde_menu);
                                            //ciudad.setForeground(new Color(45, 45, 45));
                                            //ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        btn_gastos.setBackground(verde_menu);
                                            btn_gastos.setForeground(new Color(45, 45, 45));
                                            btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja.png")));
                                        creditos.setBackground(verde_menu);
                                            creditos.setForeground(new Color(45, 45, 45));
                                    }
                            });
                            btn_gastos.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                        btn_gastos.setBackground(verde_seleccionar );
                                            btn_gastos.setForeground(new Color(255, 255, 255));
                                            btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja_blanca.png")));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        if(bandera_mes == 1){
                                            btn_gastos.setBackground(verde_seleccionar );
                                                btn_gastos.setForeground(new Color(255, 255, 255));
                                                btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja_blanca.png")));
                                        }
                                        else{
                                            btn_gastos.setBackground(verde_menu);
                                                btn_gastos.setForeground(new Color(45, 45, 45));
                                                btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja.png")));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_inicio=0;
                                        bandera_perfil=0;
                                        bandera_servis=0;
                                        bandera_ahorra=0;
                                        bandera_ciudad=0;
                                        bandera_mes=1;
                                        
                                        btn_inicio.setBackground(verde_menu);
                                            btn_inicio.setForeground(new Color(45, 45, 45));
                                            btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa.png")));
                                        btn_resumen.setBackground(verde_menu);
                                            btn_resumen.setForeground(new Color(45, 45, 45));
                                            btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        btn_servicios.setBackground(verde_menu);
                                            btn_servicios.setForeground(new Color(45, 45, 45));
                                            btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/servi.png")));
                                        ahorra.setBackground(verde_menu);
                                            ahorra.setForeground(new Color(45, 45, 45));
                                            ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu.png")));
                                        ciudad.setBackground(verde_menu);
                                            ciudad.setForeground(new Color(45, 45, 45));
                                            ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu.png")));
                                                //meses.setBackground(new Color(50, 205, 50));
                                                //meses.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja.png")));
                                        creditos.setBackground(verde_menu);
                                            creditos.setForeground(new Color(45, 45, 45));
                                    }
                            });
                            creditos.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                        //creditos.setBackground(new Color(10,170,10));
                                        creditos.setForeground(new Color(255, 255, 255));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        if(bandera_creditos == 1){
                                            //creditos.setBackground(new Color(10,170,10));
                                            creditos.setForeground(new Color(255, 255, 255));
                                        }
                                        else{
                                            creditos.setBackground(verde_menu);
                                                creditos.setForeground(new Color(45, 45, 45));
                                        }
                                    }
                                    @Override
                                    public void mousePressed(java.awt.event.MouseEvent evt){
                                        bandera_inicio=0;
                                        bandera_perfil=0;
                                        bandera_servis=0;
                                        bandera_ahorra=0;
                                        bandera_ciudad=0;
                                        bandera_mes=0;
                                        bandera_creditos=1;

                                        btn_inicio.setBackground(verde_menu);
                                            btn_inicio.setForeground(new Color(45, 45, 45));
                                            btn_inicio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/casa.png")));
                                        btn_resumen.setBackground(verde_menu);
                                            btn_resumen.setForeground(new Color(45, 45, 45));
                                            btn_resumen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/perfi.png")));
                                        btn_servicios.setBackground(verde_menu);
                                            btn_servicios.setForeground(new Color(45, 45, 45));
                                            btn_servicios.setIcon(new ImageIcon(getClass().getResource("/Imagenes/servi.png")));
                                        ahorra.setBackground(verde_menu);
                                            ahorra.setForeground(new Color(45, 45, 45));
                                            ahorra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ahorra_menu.png")));
                                        ciudad.setBackground(verde_menu);
                                            ciudad.setForeground(new Color(45, 45, 45));
                                            ciudad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Ciudad_menu.png")));
                                        btn_gastos.setBackground(verde_menu);
                                            btn_gastos.setForeground(new Color(45, 45, 45));
                                            btn_gastos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/hoja.png")));
                                        //creditos.setBackground(new Color(50, 205, 50));
                                    }
                            });
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(new java.awt.Color(122, 212, 52));
        
        setSize(width, height);
        
        int x = 40 ;
        int x2 = 60 ;
        int y = 275;
        
        
        
        Title.setBounds(8, 0, 250, 250);
        iA.setTamano("Logo_final","png", Title);
        //icono = new ImageIcon(imagen.getImage().getScaledInstance(Title.getWidth(), Title.getHeight(),Image.SCALE_DEFAULT));
        btn_inicio.setBounds(x, y, 175, 35);
        btn_gastos.setBounds(x, y+50, 175, 35);
        btn_resumen.setBounds(x, y+50*2, 175, 35);
        btn_servicios.setBounds(x, y+50*3, 175, 35);
        ahorra.setBounds(x,y+50*4,175,35);
        ciudad.setBounds(x, y+50*5, 175, 35);
        
        creditos.setBounds(60, 635, 150, 25);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_inicio){
            pp.getContenedor().controlPantallas(0);
        }
        if(e.getSource() == btn_resumen){
            pp.getContenedor().controlPantallas(1);
        }
        
        if(e.getSource() == btn_servicios){
            pp.getContenedor().controlPantallas(2);
        }
        if(e.getSource() == ahorra){
            pp.getContenedor().controlSubpantallas(3);
        }
        if(e.getSource() == ciudad){
            pp.getContenedor().controlPantallas(7);
        }
        if(e.getSource() == btn_gastos){
            pp.getContenedor().controlPantallas_gastos(0);
        }
        if(e.getSource() == creditos){
            pp.getContenedor().controlPantallas(6);
        }
    }

    public static int getBandera_inicio() {
        return bandera_inicio;
    }

    public static void setBandera_inicio(int bandera_inicio) {
        menuprincipal.bandera_inicio = bandera_inicio;
    }

    public static int getBandera_perfil() {
        return bandera_perfil;
    }

    public static void setBandera_perfil(int bandera_perfil) {
        menuprincipal.bandera_perfil = bandera_perfil;
    }

    public static int getBandera_servis() {
        return bandera_servis;
    }

    public static void setBandera_servis(int bandera_servis) {
        menuprincipal.bandera_servis = bandera_servis;
    }

    public static int getBandera_mes() {
        return bandera_mes;
    }

    public static void setBandera_mes(int bandera_mes) {
        menuprincipal.bandera_mes = bandera_mes;
    }

    public static int getBandera_creditos() {
        return bandera_creditos;
    }

    public static void setBandera_creditos(int bandera_creditos) {
        menuprincipal.bandera_creditos = bandera_creditos;
    }

    public static int getBandera_ahorra() {
        return bandera_ahorra;
    }

    public static void setBandera_ahorra(int bandera_ahorra) {
        menuprincipal.bandera_ahorra = bandera_ahorra;
    }

    public static int getBandera_ciudad() {
        return bandera_ciudad;
    }

    public static void setBandera_ciudad(int bandera_ciudad) {
        menuprincipal.bandera_ciudad = bandera_ciudad;
    }
    
    
    
}
