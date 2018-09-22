package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Servicios_energia extends JPanel implements ActionListener{
	protected int width, heigth;
	private JLabel title,fras,titulo_ahs,titulo_sububsidio,reg1,reg2,est,res,imagen_fondo;
	private JButton volver,enviar,limpiar,ahorrar_agua;
        private JTextField gasto_area,gasto_area_fin,estracto;
	protected Control_instancias pp;
        private JScrollPane jScrollPane1;
        private JTable tabla_gastos;
        private JComboBox estrato_01;
        private JTextArea Ahs,frase,subsidio_texto;
        String costo1,suds,valor_gato,valor_cm,valor_carg;
        
        public Color verde_menu = new Color(122, 212, 52);
        public Color verde_seleccionar = new Color(52,121,52);
        public Color verde_sabias=new Color(215,230,215);
        
        //Int de posiciones
        public final int xa=500;
        public final int ya=150;
        //
        int estrato=0;

        double [] valor_energia={206.81, 258.51, 402.12, 473.08, 567.70, 567.70, 567.70, 520.39, 473.08};
        /*valor_energia[0]=206.81; valor_energia[1]=258.51; valor_energia[2]=402.12 ; valor_energia[3]=473.08;
        valor_energia[4]=567.70; valor_energia[5]=567.70;
        //Valor de cada estrato para este recurso: GAS (Comercio e industria ,ESPD y oficial)
        valor_energia[6]=567.70; valor_energia[7]=520.39; valor_energia[8]=473.08;*/
                
        double [] Valor_Cargo_fijo_agua={3426.37, 5139.55, 7495.17, 8565.91, 12848.87, 13705.46, 12848.87, 11135.69, 8565.91};
        
        public double Kwh_energia=0;
        public double valor_total=0,subsidio=0;
        int gasto_area_inicial_agua=0;
        int gasto_area_final_agua=0;
        
        
//------------------------------TABLA VALORES------------------------
        private JLabel gasto_total,subsi,cm,valor_gasto,valor_cargo;
        private JLabel paga,sut,valor_ag,gasto_cm,carg;
        
        
//----------------------------------------------------
        
	public Servicios_energia (Control_instancias instancias,int width, int heigth) {
                
		this.width = width;
                this.heigth = heigth;
                
                pp=instancias;
                    
//-----------------------TABLA----------------------------------------------
                
            gasto_total=new JLabel();
                gasto_total.setFont(new Font("Microsoft New Tai Lue",1, 16));
                gasto_total.setForeground(verde_menu);
                add(gasto_total);
                
            subsi=new JLabel();
                subsi.setFont(new Font("Microsoft New Tai Lue",1, 16));
                subsi.setForeground(verde_menu);
                add(subsi);
                
            valor_gasto=new JLabel();
                valor_gasto.setFont(new Font("Microsoft New Tai Lue",1, 16));
                valor_gasto.setForeground(verde_menu);
                add(valor_gasto);
                
            cm=new JLabel();
                cm.setFont(new Font("Microsoft New Tai Lue",1, 16));
                cm.setForeground(verde_menu);
                add(cm);
                
            valor_cargo=new JLabel();
                valor_cargo.setFont(new Font("Microsoft New Tai Lue",1, 16));
                valor_cargo.setForeground(verde_menu);
                add(valor_cargo);
                
            paga=new JLabel("total a pagar:");
                paga.setFont(new Font("Microsoft New Tai Lue",1, 16));
                paga.setForeground(verde_seleccionar);
                add(paga);
                
            sut=new JLabel("VSubsidio:");
                sut.setFont(new Font("Microsoft New Tai Lue",1, 16));
                sut.setForeground(verde_seleccionar);
                add(sut);
                
            valor_ag=new JLabel("Valor servicio:");
                valor_ag.setFont(new Font("Microsoft New Tai Lue",1, 16));
                valor_ag.setForeground(verde_seleccionar);
                add(valor_ag);
                
            gasto_cm=new JLabel("Gasto de Energía:");
                gasto_cm.setFont(new Font("Microsoft New Tai Lue",1, 16));
                gasto_cm.setForeground(verde_seleccionar);
                add(gasto_cm);
                
            carg=new JLabel("VCargo Fijo:");
                carg.setFont(new Font("Microsoft New Tai Lue",1, 16));
                carg.setForeground(verde_seleccionar);
                add(carg);
//-------------------------------------------------------------------------------------------    
            fras=new JLabel("Sabías que:");
                fras.setFont(new Font("Microsoft New Tai Lue",1, 18));
                fras.setForeground(verde_menu);
                add(fras);
                
            frase=new JTextArea();
                frase.setFont(new Font("Microsoft New Tai Lue",0, 16));
                frase.setForeground(verde_seleccionar);
                frase.setLineWrap(true);
                frase.setEditable(false);
                frase.setBackground(verde_sabias);
                frase.setText("Si no se contara con la energía hidroeléctrica, habría que quemar más de 400 "
                +"millones"+"\n"+"de toneladas extra de petróleo al año, en el mundo.");
                add(frase);
                       
		title=new JLabel("Aquí encontraras tu consumo horario de energía");
                    title.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                    title.setForeground(verde_seleccionar);
                    this.add(title);
                    
                titulo_ahs=new JLabel("Valor servicio:");
                    titulo_ahs.setForeground(verde_seleccionar);
                    add(titulo_ahs);
                    
                Ahs=new JTextArea();
                    Ahs.setOpaque(false);
                    Ahs.setText("Te indica cual es el valor del servicio para tú estrato por cada"+"\n"+"kilovatio-hora (Kwh) gastado.");
                    Ahs.setFont(new Font("Microsoft New Tai Lue",0,14));
                    Ahs.setEditable(false);
                    Ahs.setLineWrap(true);
                    add(Ahs);
                    
                titulo_sububsidio=new JLabel("VSubsidio:");
                    titulo_sububsidio.setForeground(verde_seleccionar);
                    add(titulo_sububsidio);
                
                subsidio_texto=new JTextArea();
                    subsidio_texto.setOpaque(false);
                    subsidio_texto.setText("Te indica cual es el valor de tú subsidio para estratos de 1 a 3, e indica"+"\n"+
                    "para estratos 5 y 6 cuanto deben de dar para la contribución a el"+"\n"+"subsidio de los otros estratos.");
                    subsidio_texto.setLineWrap(true);
                    subsidio_texto.setEditable(false);
                    add(subsidio_texto);
                    
                est = new JLabel("Estrato:");
                    est.setForeground(verde_seleccionar);
                    est.setFont(new Font("Microsoft New Tai Lue",0,14));
                    add(est);
                            
                estracto = new JTextField();
                    estracto.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
                    add(estracto);
                
                reg1=new JLabel("Registro 1:");
                    reg1.setForeground(verde_seleccionar);
                    reg1.setFont(new Font("Microsoft New Tai Lue",0,14));
                    add(reg1);
                            
                gasto_area=new JTextField();
                    gasto_area.setForeground(verde_seleccionar);
                    gasto_area.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
                    add(gasto_area);
                    
                reg2=new JLabel("Registro 2:");
                    reg2.setForeground(verde_seleccionar);
                    reg2.setFont(new Font("Microsoft New Tai Lue",0,14));
                    add(reg2);
                    
                gasto_area_fin=new JTextField();
                    gasto_area_fin.setForeground(verde_seleccionar);
                    gasto_area_fin.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
                    add(gasto_area_fin);
                    
                enviar= new JButton("Aceptar");
                    enviar.addActionListener(this);
                    enviar.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
                    enviar.setBackground(verde_menu);
                    enviar.setFocusPainted(false);
                    add(enviar);
                    
                ahorrar_agua= new JButton("¡Te invitamos a conocer un poco más este recurso!");
                    ahorrar_agua.setContentAreaFilled(false);
                    ahorrar_agua.setBorderPainted(false);
                    ahorrar_agua.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,14));
                    ahorrar_agua.addActionListener(this);
                    add(ahorrar_agua);
                    
                estrato_01=new JComboBox();
                    estrato_01.setFocusable(false);
                    estrato_01.setForeground(verde_menu);
                    estrato_01.setModel(new DefaultComboBoxModel(new String[]{"1","2","3","4","5","6","Comercial","Industrial","oficial"}));
                    estrato_01.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                    estrato_01.setBackground(Color.white);
                    add(estrato_01);
                    
                imagen_fondo=new JLabel();
                imagen_fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/energia_fondo.png")));
                //imagenes.setBorder(BorderFactory.createLineBorder(Color.black, 1));
                add(imagen_fondo);
                    
                    
                ahorrar_agua.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseEntered(java.awt.event.MouseEvent evt){
                                       ahorrar_agua.setForeground(verde_menu);
                                       ahorrar_agua.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                                    }
                                    @Override
                                    public void mouseExited(java.awt.event.MouseEvent evt){
                                        ahorrar_agua.setForeground(new Color(50,50,50));
                                    }
                                    
                                    
                            });
                
            
	}

	@Override
    public void paintComponent(Graphics g){
        setSize(width,heigth);
        super.paintComponent(g);
        super.setBackground(Color.white);
        
        title.setBounds(20, 25, 600, 25);
        ahorrar_agua.setBounds(10, 100, 400, 25);
        
        est.setBounds(xa,ya,150,25);
        estrato_01.setBounds(xa,ya+25,112,25);
        reg1.setBounds(xa,ya+25*2,100,25);
        gasto_area.setBounds(xa,ya+25*3, 100, 25);
        reg2.setBounds(xa,ya+25*4,100,25);
        gasto_area_fin.setBounds(xa,ya+25*5, 100, 25);
        
        int xt= 175;
        int yt=175;
        paga.setBounds(20,yt,150,25);                       gasto_total.setBounds(xt,yt, 150, 25);
        sut.setBounds(20,yt+25,150,25);                     subsi.setBounds(xt,yt+25, 150, 25);
        valor_ag.setBounds(20,yt+25*2, 150, 25);            valor_gasto.setBounds(xt,yt+25*2, 150, 25);
        gasto_cm.setBounds(20,yt+25*3, 150, 25);            cm.setBounds(xt,yt+25*3, 150, 25);
        carg.setBounds(20,yt+25*4, 150, 25);                valor_cargo.setBounds(xt,yt+25*4, 100, 25);
        
        
        enviar.setBounds(xa,ya+25*7, 100, 25);
        
        int xf=20;
        int yf=550;
        
        imagen_fondo.setBounds(175,20,700,600);
        
        fras.setBounds(xf, yf, 150, 25);
        frase.setBounds(xf, yf+35, 615, 50);
        
        titulo_ahs.setBounds(20, 370, 150, 25);
        Ahs.setBounds(20,400,400,35);
        
        titulo_sububsidio.setBounds(20, 450, 100, 25);
        subsidio_texto.setBounds(20, 450+35, 400, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       if(e.getSource()==enviar){
        String y = gasto_area_fin.getText();
        gasto_area_final_agua = Integer.parseInt(y);
        
        String x = gasto_area.getText();
        gasto_area_inicial_agua =Integer.parseInt(x);
        
        Kwh_energia=gasto_area_final_agua-gasto_area_inicial_agua;
        
        String ab = (String) estrato_01.getSelectedItem();
        if(estrato_01.getSelectedItem()=="Comercial"){
            estrato=7;
        }else if(estrato_01.getSelectedItem()=="Industrial"){
            estrato=8;
        }else if(estrato_01.getSelectedItem()=="oficial"){
            estrato=9;
        }else{
            estrato=Integer.parseInt(ab);
        }
        
         if(gasto_area_final_agua<gasto_area_inicial_agua){JOptionPane.showMessageDialog(null, "Registros Invalidos","ERROR",JOptionPane.ERROR_MESSAGE);}
        else {
        if(estrato==1){
           valor_total=(Kwh_energia*valor_energia[0])-subsidio;
           subsidio=valor_total*50.00/100;
           
           costo1=Double.toString(valor_total);
           suds=Double.toString(subsidio);
           valor_gato=Double.toString(valor_energia[0]);
           valor_cm=Double.toString(Kwh_energia);
           valor_carg=Double.toString(Valor_Cargo_fijo_agua[0]);
           
           gasto_total.setText("$"+costo1);
           subsi.setText("$"+suds);
           valor_gasto.setText("$"+valor_gato);
           cm.setText(valor_cm+" (Kwh)");
           valor_cargo.setText(valor_carg);
           
           System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        
        
        if(estrato==2){
           valor_total=(Kwh_energia*valor_energia[1])-subsidio;
           subsidio=valor_total*40.00/100;
           
           costo1=Double.toString(valor_total);
           suds=Double.toString(subsidio);
           valor_gato=Double.toString(valor_energia[1]);
           valor_cm=Double.toString(Kwh_energia);
           valor_carg=Double.toString(Valor_Cargo_fijo_agua[1]);
           
           gasto_total.setText("$"+costo1);
           subsi.setText("$"+suds);
           valor_gasto.setText("$"+valor_gato);
           cm.setText(valor_cm+" (Kwh)");
           valor_cargo.setText(valor_carg);
           
            System.out.println("Estrato 2");
        }
        
        if(estrato==3){
            valor_total=(Kwh_energia*valor_energia[2])-subsidio*15.00/100;
            subsidio=valor_total*60.00/100;
           
           costo1=Double.toString(valor_total);
           suds=Double.toString(subsidio);
           valor_gato=Double.toString(valor_energia[2]);
           valor_cm=Double.toString(Kwh_energia);
           valor_carg=Double.toString(Valor_Cargo_fijo_agua[2]);
           
           gasto_total.setText("$"+costo1);
           subsi.setText("$"+suds);
           valor_gasto.setText("$"+valor_gato);
           cm.setText(valor_cm+" (Kwh)");
           valor_cargo.setText(valor_carg);
           
            System.out.println("Estrato 3");
        }
        
        if(estrato==4){
            valor_total=(Kwh_energia*valor_energia[3]);
            subsidio=valor_total*60.00/100;
           
           costo1=Double.toString(valor_total);
           suds=Double.toString(subsidio);
           valor_gato=Double.toString(valor_energia[3]);
           valor_cm=Double.toString(Kwh_energia);
           valor_carg=Double.toString(Valor_Cargo_fijo_agua[3]);
           
           gasto_total.setText("$"+costo1);
           subsi.setText("$"+suds);
           valor_gasto.setText("$"+valor_gato);
           cm.setText(valor_cm+" (Kwh)");
           valor_cargo.setText(valor_carg);
           
            System.out.println("Estrato 4");
        }
        
        if(estrato==5){
            valor_total=(Kwh_energia*valor_energia[4])+subsidio*50.00/100;
            subsidio=valor_total*60.00/100;
           
           costo1=Double.toString(valor_total);
           suds=Double.toString(subsidio);
           valor_gato=Double.toString(valor_energia[4]);
           valor_cm=Double.toString(Kwh_energia);
           valor_carg=Double.toString(Valor_Cargo_fijo_agua[4]);
           
           gasto_total.setText("$"+costo1);
           subsi.setText("$"+suds);
           valor_gasto.setText("$"+valor_gato);
           cm.setText(valor_cm+" (Kwh)");
           valor_cargo.setText(valor_carg);
           
            System.out.println("Estrato 5");
        }
        if(estrato==6){
            valor_total=(Kwh_energia*valor_energia[5])+subsidio*60.00/100;
            subsidio=valor_total*60.00/100;
           
           costo1=Double.toString(valor_total);
           suds=Double.toString(subsidio);
           valor_gato=Double.toString(valor_energia[0]);
           valor_cm=Double.toString(Kwh_energia);
           valor_carg=Double.toString(Valor_Cargo_fijo_agua[4]);
           
           gasto_total.setText("$"+costo1);
           subsi.setText("$"+suds);
           valor_gasto.setText("$"+valor_gato);
           cm.setText(valor_cm+" (Kwh)");
           valor_cargo.setText(valor_carg);
           
            
            System.out.println("Estrato 6");
        }
        if(estrato==7){
            valor_total=(Kwh_energia*valor_energia[6])+subsidio*60.00/100;
            subsidio=valor_total*60.00/100;
           
           costo1=Double.toString(valor_total);
           suds=Double.toString(subsidio);
           valor_gato=Double.toString(valor_energia[6]);
           valor_cm=Double.toString(Kwh_energia);
           valor_carg=Double.toString(Valor_Cargo_fijo_agua[6]);
           
           gasto_total.setText("$"+costo1);
           subsi.setText("$"+suds);
           valor_gasto.setText("$"+valor_gato);
           cm.setText(valor_cm+" (Kwh)");
           valor_cargo.setText(valor_carg);
           
            
            System.out.println("Estrato Comercial");
        }
        if(estrato==8){
            valor_total=(Kwh_energia*valor_energia[7])+subsidio*60.00/100;
            subsidio=valor_total*60.00/100;
           
           costo1=Double.toString(valor_total);
           suds=Double.toString(subsidio);
           valor_gato=Double.toString(valor_energia[7]);
           valor_cm=Double.toString(Kwh_energia);
           valor_carg=Double.toString(Valor_Cargo_fijo_agua[7]);
           
           gasto_total.setText("$"+costo1);
           subsi.setText("$"+suds);
           valor_gasto.setText("$"+valor_gato);
           cm.setText(valor_cm+" (Kwh)");
           valor_cargo.setText(valor_carg);
           
            
            System.out.println("Estrato Industrial");
        }
        if(estrato==9){
            valor_total=(Kwh_energia*valor_energia[8])+subsidio*60.00/100;
            subsidio=valor_total*60.00/100;
           
           costo1=Double.toString(valor_total);
           suds=Double.toString(subsidio);
           valor_gato=Double.toString(valor_energia[8]);
           valor_cm=Double.toString(Kwh_energia);
           valor_carg=Double.toString(Valor_Cargo_fijo_agua[8]);
           
           gasto_total.setText("$"+costo1);
           subsi.setText("$"+suds);
           valor_gasto.setText("$"+valor_gato);
           cm.setText(valor_cm+" (Kwh)");
           valor_cargo.setText(valor_carg);
           
            
            System.out.println("Estrato Industrial");
        }
        }
        
       }
        
            //calculo_agua(int estrato,double valor_agua,double Valor_Cargo_fijo_agua, double cm_agua,double valor_total, double subsidio);
            
        if(e.getSource()==ahorrar_agua){
        pp.getContenedor().controlSubpantallas(6);
        }
        
    }
	
}
