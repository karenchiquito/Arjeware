/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import Entidades.Dao;
import Entidades.Usuarios;
import Entidades.Validaciones;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.IconAjustado;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JPasswordFieldHint;
import co.com.Arjeware.Arjeware.presentacion.metodos.arje.JTextFieldHint;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Colores;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Fonts;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;

/**
 *
 * @author Sebas
 */
public class Registro extends JPanel implements ActionListener{
    protected final int width,height;
    protected Control_instancias pp;
    private JComboBox estrato_01,cbx_tipoPropiedad,cbx_nivel;
    //LABELS(TITULOS)----------------------------------
    private JLabel lbl_cedula,lbl_usuario,lbl_contraseña,lbl_repetirContraseña,
        lbl_gmail,lbl_informacionAsteriscos,lbl_estrato,lbl_ciudad,lbl_empresaPS,
        lbl_tipoPropiedad,lbl_nivel,lbl_telefonoCelular,lbl_direccion,fondo;
    
    private JLabel lbl_asterisco0,lbl_asterisco1,lbl_asterisco2,lbl_asterisco3,lbl_asterisco4,
        lbl_asterisco5,lbl_asterisco6,lbl_asterisco7,lbl_asterisco8,lbl_asterisco9,lbl_asterisco10;
    
    //TEXTFIELD Y PASSWORDFIELD(CAJAS DE TEXTO)--------------------------
    public JTextFieldHint txt_cedula,txt_nombre,txt_apellido,txt_gmail,txt_preguntaSeguridad,txt_telefonoCelular,
        txt_direccion;
    protected JPasswordFieldHint txt_clave,txt_claveRepetir;
    
    //BANDERAS--------------------------------
    public int bandera_cedula=0,bandera_usuario_registro=0,bandera_gmail=0,bandera_contraseña=0,Bandera_repetir_contraseña=0,
        bandera_pregunta=0,bandera_estrato=0,bandera_telefono=0,bandera_direccion=0,bandera_apellido=0;
    
    //--------------------------------------------
    String estrato;
    
    String ciudad,empresaPS;
    
    IconAjustado ai=new IconAjustado();
    
    public String dato_estrato, stg_nombreCompleto, idUsuario;
    public String stg_usuarioNormal="Normal";
    int enviar=0;
    //BOTONES----------------------------
    private JButton enviar_registro,volver;
    public JComboBox cbx_empresaPS,cbx_ciudad;
    private JScrollPane barra;
    
    //COLORES--------------------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccionar = new Color(52,121,52);
    public Color negro_texto = new Color(70,70,70);
        
    public Registro(Control_instancias instancia,int width,int height){
        this.height=height;
        this.width=width;
        
        pp=instancia;
        
        //barra=new JScrollPane();
         //   add(barra);
        
        enviar_registro=new JButton("Registrarse");
            enviar_registro.addActionListener(this);
            enviar_registro.setFont(new Font("Microsoft New Tai Lue",Font.PLAIN,18));
            enviar_registro.setBackground(Colores.color_verdeClaro);
            enviar_registro.setForeground(Color.black);
            add(enviar_registro);
            
        volver=new JButton("Volver");
            volver.setFont(new Font("Microsoft New Tai Lue",Font.PLAIN,18));
            volver.addActionListener(this);
            volver.setBackground(Colores.color_verdeClaro);
            volver.setForeground(Color.black);
            add(volver);
        
        txt_cedula=new JTextFieldHint();
            txt_cedula.setHint("Cédula o NIT");
            txt_cedula.setOpaque(false);
            txt_cedula.setHorizontalAlignment(CENTER);
            txt_cedula.setSelectionColor(verde_menu);
            txt_cedula.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            add(txt_cedula);  
        
        txt_nombre=new JTextFieldHint();
            txt_nombre.setHint("Nombres");
            txt_nombre.setOpaque(false);
            txt_nombre.setHorizontalAlignment(CENTER);
            txt_nombre.setSelectionColor(verde_menu);
            txt_nombre.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            add(txt_nombre);
            
        txt_apellido=new JTextFieldHint();
            txt_apellido.setHint("Apellidos");
            txt_apellido.setHorizontalAlignment(CENTER);
            txt_apellido.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            add(txt_apellido);
            
        txt_telefonoCelular=new JTextFieldHint();
            txt_telefonoCelular.setHint("3553264709");
            txt_telefonoCelular.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            add(txt_telefonoCelular);
            
        txt_direccion=new JTextFieldHint();
            txt_direccion.setHint("Carrera ** A 60 #**, bloque * apartamento ***");
            txt_direccion.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            add(txt_direccion);    
            
            lbl_informacionAsteriscos=new JLabel("Los campos marcados con asterisco (*) son obligatorios.");
                lbl_informacionAsteriscos.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                lbl_informacionAsteriscos.setForeground(Colores.color_verdeClaro);
                lbl_informacionAsteriscos.setHorizontalAlignment(SwingConstants.CENTER);
                add(lbl_informacionAsteriscos);
            
                            lbl_asterisco0=new JLabel("*");
                                lbl_asterisco0.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco0);

                            lbl_asterisco2=new JLabel("*");
                                lbl_asterisco2.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco2);
                                
                            lbl_asterisco3=new JLabel("*");
                                lbl_asterisco3.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco3);
                                
                            lbl_asterisco4=new JLabel("*");
                                lbl_asterisco4.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco4);
                                
                            lbl_asterisco5=new JLabel("*");
                                lbl_asterisco5.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco5);
                            lbl_asterisco6=new JLabel("*");
                                lbl_asterisco6.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco6);
                            lbl_asterisco7=new JLabel("*");
                                lbl_asterisco7.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco7);
                                    
                            lbl_asterisco8=new JLabel("*");
                                lbl_asterisco8.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco8);
                                
                            lbl_asterisco9=new JLabel("*");
                                lbl_asterisco9.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco9);
                                
                            lbl_asterisco10=new JLabel("*");
                                lbl_asterisco10.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                                add(lbl_asterisco10);
        
        txt_gmail=new JTextFieldHint();
            txt_gmail.setHint("ejemplo@gmail.com");
            txt_gmail.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            add(txt_gmail);
            
        txt_preguntaSeguridad=new JTextFieldHint();
            txt_preguntaSeguridad.setHint("El tío");
            txt_preguntaSeguridad.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            add(txt_preguntaSeguridad);
            
        lbl_cedula=new JLabel("Cédula o NIT:");
            lbl_cedula.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_cedula.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_cedula);
        
        lbl_usuario=new JLabel("Nombres y Apellidos :");
            lbl_usuario.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_usuario.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_usuario);
            
        lbl_contraseña=new JLabel("Contraseña :");
            lbl_contraseña.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_contraseña.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_contraseña);
            
        lbl_repetirContraseña=new JLabel("Repetir contraseña :");
            lbl_repetirContraseña.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_repetirContraseña.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_repetirContraseña);
            
        lbl_gmail=new JLabel("Correo electrónico :");
            lbl_gmail.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_gmail.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_gmail);
            
        lbl_estrato=new JLabel("Estrato :");
            lbl_estrato.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_estrato.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_estrato);
            
        estrato_01=new JComboBox();
            estrato_01.setFocusable(false);
            estrato_01.setForeground(verde_menu);
            estrato_01.setModel(new DefaultComboBoxModel(new String[]{"1","2","3","4","5","6","Comercial","Industrial","Oficial","Exento"}));
            estrato_01.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            estrato_01.setBackground(Color.white);
            estrato_01.setForeground(negro_texto);
            this.add(estrato_01);
            
        cbx_tipoPropiedad=new JComboBox();
            cbx_tipoPropiedad.setFocusable(false);
            cbx_tipoPropiedad.setForeground(verde_menu);
            cbx_tipoPropiedad.setModel(new DefaultComboBoxModel(new String[]{"Propiedad EPM","Compartido","Propiedad Cliente","Sensores Arjeware"}));
            cbx_tipoPropiedad.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            cbx_tipoPropiedad.setBackground(Color.white);
            cbx_tipoPropiedad.setForeground(negro_texto);
            this.add(cbx_tipoPropiedad);
            
        cbx_nivel=new JComboBox();
            cbx_nivel.setFocusable(false);
            cbx_nivel.setForeground(Colores.color_verdeClaro);
            cbx_nivel.setModel(new DefaultComboBoxModel(new String[]{"1","2","3","4"}));
            cbx_nivel.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            cbx_nivel.setBackground(Color.white);
            cbx_nivel.setForeground(negro_texto);
            this.add(cbx_nivel);
        
        cbx_empresaPS=new JComboBox();
            cbx_empresaPS.setFocusable(false);
            cbx_empresaPS.setForeground(verde_menu);
            cbx_empresaPS.setModel(new DefaultComboBoxModel(new String[]{"EPM"}));
            cbx_empresaPS.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            cbx_empresaPS.setBackground(Color.white);
            cbx_empresaPS.setForeground(negro_texto);
            this.add(cbx_empresaPS);
            
        cbx_ciudad=new JComboBox();
            cbx_ciudad.setFocusable(false);
            cbx_ciudad.setForeground(verde_menu);
            cbx_ciudad.setModel(new DefaultComboBoxModel(new String[]{"Medellín","Estrella"}));
            cbx_ciudad.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            cbx_ciudad.setBackground(Color.white);
            cbx_ciudad.setForeground(negro_texto);
            this.add(cbx_ciudad);
            
        lbl_ciudad=new JLabel("Ciudad :");
            lbl_ciudad.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_ciudad.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_ciudad);
            
        lbl_empresaPS=new JLabel("Empresa prestadora de servicio :");
            lbl_empresaPS.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_empresaPS.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_empresaPS);
            
        lbl_tipoPropiedad=new JLabel("Propietario contador :");
            lbl_tipoPropiedad.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_tipoPropiedad.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_tipoPropiedad);
            
        lbl_nivel=new JLabel("Nivel Residencia: ");
            lbl_nivel.setHorizontalAlignment(SwingConstants.RIGHT);
            lbl_nivel.setFont(Fonts.font_titulos);
            this.add(lbl_nivel);
            
        lbl_telefonoCelular=new JLabel("Teléfono o Celular:");
            lbl_telefonoCelular.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_telefonoCelular.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_telefonoCelular);
            
        lbl_direccion=new JLabel("Dirección :");
            lbl_direccion.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
            lbl_direccion.setHorizontalAlignment(SwingConstants.RIGHT);
            add(lbl_direccion);
            
        txt_clave=new JPasswordFieldHint();
            txt_clave.setHint("Contraseña456");
            txt_clave.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            txt_clave.setForeground(new Color(200,200,200));
            add(txt_clave);
            
        txt_claveRepetir=new JPasswordFieldHint();
            txt_claveRepetir.setHint("Contraseña123");
            txt_claveRepetir.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, verde_menu));
            txt_claveRepetir.setForeground(new Color(200,200,200));
            add(txt_claveRepetir);
            
            
        fondo=new JLabel();
            //fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo_registro.png")));
            add(fondo);
    }
    
    @Override
    public void paintComponent(Graphics g){
        setSize(width,height);
        super.paintComponent(g);
        //super.setBackground(new Color(250,250,250));
        super.setBackground(Color.white);
        
        int x = 150;
        int y = 10;
        int yS=50; //Separación de y
        int i= 2; //Incremento
        
        lbl_cedula.setBounds(x, y+yS, 200, 25);
        txt_cedula.setBounds(x+225,y+yS,350,35); lbl_asterisco10.setBounds(x+225+355,y+yS,20,20);
        
        txt_nombre.setBounds(x+225,y+yS*i,160,35);lbl_asterisco0.setBounds(x+225+350+5, y+yS*i, 20, 20);
        txt_apellido.setBounds(x+225+160+20,y+yS*i,151+20,35);
        lbl_usuario.setBounds(x, y+yS*i, 200, 25);
        
        i++;
        txt_clave.setBounds(x+225,y+yS*i,350,35);lbl_asterisco2.setBounds(x+225+350+5, y+yS*i, 20, 20);
        lbl_contraseña.setBounds(x, y+yS*i, 200, 25);
        i++;
        
        txt_claveRepetir.setBounds(x+225, y+yS*i, 350, 35);lbl_asterisco3.setBounds(x+225+350+5, y+yS*i, 20, 20);
        lbl_repetirContraseña.setBounds(x, y+yS*i, 200, 25);
        
        i++;
        lbl_gmail.setBounds(x, y+yS*i, 200, 25);
        txt_gmail.setBounds(x+225, y+yS*i, 350, 35);lbl_asterisco4.setBounds(x+225+350+5, y+yS*i, 20, 20);
        
        i++;
        //cbx_empresaPS.setBounds(x+195 ,y+yS*i,405,33);
        lbl_ciudad.setBounds(x ,y+yS*i,200,33);
        cbx_ciudad.setBounds(x+225,y+yS*i,121,33);lbl_asterisco9.setBounds(x+225+122, y+yS*i, 20, 20);
        
        lbl_tipoPropiedad.setBounds(x+225+150 ,y+yS*i,200,33);
        i++;//------------------------------------
        cbx_tipoPropiedad.setLocation(x+225+168,y+yS*i);
        
        lbl_empresaPS.setBounds(x-75,y+yS*i, 200+75,35);
        cbx_empresaPS.setBounds(x+225,y+yS*i,66,33); lbl_asterisco6.setBounds(x+225+70, y+yS*i, 20, 20);
        
        //txt_preguntaSeguridad.setBounds(x+225,y+yS*i,350,35);
        
        i++;
        lbl_estrato.setBounds(x,y+yS*i,200,35);
        estrato_01.setBounds(x+225, y+yS*i, 112, 33);lbl_asterisco5.setBounds(x+225+112+5, y+yS*i, 20, 20);
        
        lbl_nivel.setBounds(x+225+150,y+yS*i, 150,35);
        cbx_nivel.setLocation(x+225+300,y+yS*i);
        
        i++;
        lbl_telefonoCelular.setBounds(x, y+yS*i, 200, 35);
        txt_telefonoCelular.setBounds(x+225, y+yS*i, 350, 35);lbl_asterisco7.setBounds(x+225+350+5, y+yS*i, 20, 20);
        
        i++;
        lbl_direccion.setBounds(x, y+yS*i, 200, 35);
        txt_direccion.setBounds(x+225, y+yS*i, 350, 35);lbl_asterisco8.setBounds(x+225+350+5, y+yS*i, 20, 20);
        
        i++;
        enviar_registro.setBounds(x+225, y+yS*i, 150, 35);
        lbl_informacionAsteriscos.setBounds(300, 625, 500, 25);
        
        volver.setBounds(x+225+150+50, y+yS*i, 150, 35);
        
        //fondo.setBounds(650, 20, 600, 650);
        fondo.setBounds(0+15, 0, width-30, height-35);
        ai.setTamano("Imagenes/Fondo_registro","png", fondo);
        
        
        
    }
    
   
    
    @Override
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==enviar_registro){
            estrato = (String) estrato_01.getSelectedItem();
            
        /*if(estrato_01.getSelectedItem()=="Comercial"){
            estrato=7;
        }else if(estrato_01.getSelectedItem()=="Industrial"){
            estrato=8;
        }else if(estrato_01.getSelectedItem()=="oficial"){
            estrato=9;
        }else{
            estrato=Integer.parseInt(dato_estrato);
        }*/
        stg_nombreCompleto=txt_nombre.getText()+" "+txt_apellido.getText();
        
        ciudad= (String) cbx_ciudad.getSelectedItem();
        empresaPS=(String) cbx_empresaPS.getSelectedItem();
        
        idUsuario = txt_cedula.getText();
        int conteoEnvio=0;
        
        Dao dao= new Dao();
        Usuarios us = new Usuarios();
        
            us.setIdCedula(idUsuario);
            conteoEnvio++;
            us.setNombre(txt_nombre.getText());
            us.setApellido(txt_apellido.getText());
            conteoEnvio++;
            if(txt_claveRepetir.getText().equals(txt_clave.getText())){
                us.setClave(txt_clave.getText());
                conteoEnvio++;
            }
            if(Validaciones.ValidarCorreo(txt_gmail.getText())){
                us.setCorreo(txt_gmail.getText());
                conteoEnvio++;
            }
            us.setCiudad(ciudad);
            us.setEmpresaPS(empresaPS);
            us.setEstrato(estrato);
            us.setTelCel(txt_telefonoCelular.getText());
            us.setDireccion(txt_direccion.getText());
            us.setEstado("1");
            us.setTipoUsuario(stg_usuarioNormal);
            us.setTipoPropiedad(cbx_tipoPropiedad.getSelectedItem().toString());
            us.setNivelResidencia(cbx_nivel.getSelectedItem().toString());
            
            if(Dao.getInsertar(us)){
                pp.getContenedor().controlPantallas(4);
            }else{
                JOptionPane.showMessageDialog(null, "Datos incorrectos, revise la información de nuevo por favor","Mensaje Error",JOptionPane.ERROR_MESSAGE);    
            }
            
            
        
            /*BDConexion conexion= new BDConexion();
                Connection registro = conexion.getCon();
                String sql = "INSERT INTO tbl_usuarios (id_cedula,nombre,"
                    + "clave,correo,pregunta_seguridad,estrato,tel_cel,direccion,estado,tipo_usuario) VALUES(?,?,?,?,?,?,?,?,?,?)";
                
                try{
                PreparedStatement pst= (PreparedStatement) registro.prepareStatement(sql);
                pst.setString(1,this.txt_cedula.getText());
                pst.setString(2,this.stg_nombreCompleto);
                pst.setString(3,this.txt_clave.getText());
                pst.setString(4,this.txt_gmail.getText());
                pst.setString(5,this.txt_preguntaSeguridad.getText());
                pst.setInt(6,this.estrato);
                pst.setString(7,this.txt_telefonoCelular.getText());
                pst.setString(8,this.txt_direccion.getText());
                pst.setInt(9,1);
                pst.setString(10,this.stg_usuarioNormal);
                
                if(txt_claveRepetir.getText().equals(txt_clave.getText())){
                        JOptionPane.showMessageDialog(null, "Se ingresaron correctamente los datos","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                        pst.executeUpdate();
                        pp.getContenedor().controlPantallas(4);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Datos incorrectos, revise la información de nuevo por favor","Mensaje Error",JOptionPane.ERROR_MESSAGE);
                    pst.close();
                }
                
                }
                catch(SQLException ex){
                    System.out.println(ex.getMessage());
                }*/
                
        }
        
        if(e.getSource()==volver){
            pp.getContenedor().ValidarCerrarSeccion();
        }
        
    }
    
}
