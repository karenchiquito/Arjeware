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

public class Servicios_gas extends JPanel implements ActionListener{
	protected int width, heigth;
	private JLabel title,fras,titulo_ahs,titulo_sububsidio,reg1,reg2,est,res,imagen_fondo,exce,exceso;
	private JButton volver,enviar,limpiar,ahorrar_agua;
        private JTextField gasto_area,gasto_area_fin,estracto;
	protected Control_instancias pp;
        private JScrollPane jScrollPane1;
        private JTable tabla_gastos;
        private JComboBox estrato_01;
        private JTextArea Ahs,frase,subsidio_texto;
        String costo1,suds,valor_gato,valor_cm,valor_carg,valor_exceso;
        
        public Color verde_menu = new Color(122, 212, 52);
        public Color verde_seleccionar = new Color(52,121,52);
        public Color verde_sabias=new Color(215,230,215);
        
        //Int de posiciones
        public final int xa=600;
        public final int ya=150;
        //
        int estrato=0;
        int reconexion=25299;
        int reintalacion=69515;
        double pagar_mas=0;

        double [] valor_gas={710.25, 1065.37, 1553.66, 1775.61, 2663.42, 2840.98, 2663.42, 2308.30, 1775.61};
        double [] Valor_Cargo_fijo_agua={3426.37, 5139.55, 7495.17, 8565.91, 12848.87, 13705.46, 12848.87, 11135.69, 8565.91};
        double [] Valor_gas_20M3={1237.32,1237.32,1237.32,1237.32,1484.78,1484.78,1347.44,1328.33,1237.32 };
        
        public double M3_gas=0;
        public double valor_total=0,subsidio=0;
        int gasto_area_inicial_agua=0;
        int gasto_area_final_agua=0;
        
        
//------------------------------TABLA VALORES------------------------
        private JLabel gasto_total,subsi,cm,valor_gasto,valor_cargo;
        private JLabel paga,sut,valor_ag,gasto_cm,carg;
        
//----------------------------------------------------
        
        
	public Servicios_gas (Control_instancias instancias,int width, int heigth) {
      
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
                
            exceso=new JLabel();
                exceso.setFont(new Font("Microsoft New Tai Lue",1, 16));
                exceso.setForeground(verde_menu);
                add(exceso);
                
            valor_cargo=new JLabel();
                valor_cargo.setFont(new Font("Microsoft New Tai Lue",1, 16));
                valor_cargo.setForeground(verde_menu);
                add(valor_cargo);
                
            paga=new JLabel("Total a pagar:");
                paga.setFont(new Font("Microsoft New Tai Lue",1, 16));
                paga.setForeground(verde_seleccionar);
                add(paga);
                
            sut=new JLabel("Valor de subsidio:");
                sut.setFont(new Font("Microsoft New Tai Lue",1, 16));
                sut.setForeground(verde_seleccionar);
                add(sut);
                
            valor_ag=new JLabel("Valor de servicio:");
                valor_ag.setFont(new Font("Microsoft New Tai Lue",1, 16));
                valor_ag.setForeground(verde_seleccionar);
                add(valor_ag);
                
            gasto_cm=new JLabel("Gasto de gas:");
                gasto_cm.setFont(new Font("Microsoft New Tai Lue",1, 16));
                gasto_cm.setForeground(verde_seleccionar);
                add(gasto_cm);
                
            exce=new JLabel("Valor de exceso:");
                exce.setFont(new Font("Microsoft New Tai Lue",1, 16));
                exce.setForeground(verde_seleccionar);
                add(exce);
                
            carg=new JLabel("Valor cargo fijo:");
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
                frase.setText("El gas no tiene olor pero se le añade una sustancia por seguridad que permite que la gente"
                +" lo reconozca y tome medidas necesarias en caso de percibirlo.");
                add(frase);
                       
		title=new JLabel("Aquí encontraras tu consumo horario del gas");
                    title.setFont(new Font("Microsoft New Tai Lue",Font.BOLD,18));
                    title.setForeground(verde_seleccionar);
                    this.add(title);
                    
                titulo_ahs=new JLabel("Valor servicio:");
                    titulo_ahs.setForeground(verde_seleccionar);
                    add(titulo_ahs);
                    
                Ahs=new JTextArea();
                    Ahs.setOpaque(false);
                    Ahs.setText("Te indica cual es el valor del servicio para tú estrato por cada"+"\n"+"metro cúbico (Cm3) gastado.");
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
                imagen_fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/gas_fondo.png")));
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
        carg.setBounds(20,yt, 150, 25);                     valor_cargo.setBounds(xt,yt, 100, 25);
        sut.setBounds(20,yt+25,150,25);                     subsi.setBounds(xt,yt+25, 100, 25);
        valor_ag.setBounds(20,yt+25*2, 150, 25);            valor_gasto.setBounds(xt,yt+25*2, 100, 25);
        gasto_cm.setBounds(20,yt+25*3, 150, 25);            cm.setBounds(xt,yt+25*3, 100, 25);
        exce.setBounds(20,yt+25*4,150,25);                  exceso.setBounds(xt,yt+25*4,150,25);
        paga.setBounds(20,yt+25*5,150,25);                  gasto_total.setBounds(xt,yt+25*5, 100, 25);
        
        imagen_fondo.setBounds(175,20,700,600);
        
        enviar.setBounds(xa,ya+25*7, 100, 25);
        
        int xf=20;
        int yf=550;
        
        fras.setBounds(xf, yf, 150, 25);
        frase.setBounds(xf, yf+35, 600, 50);
        
        titulo_ahs.setBounds(20, 370, 150, 25);
        Ahs.setBounds(20,400,400,35);
        
        titulo_sububsidio.setBounds(20, 450, 100, 25);
        subsidio_texto.setBounds(20, 450+35, 400, 50);
    }
    
    
        @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==enviar){
        String y = gasto_area_fin.getText();
        gasto_area_final_agua = Integer.parseInt(y);
        
        String x = gasto_area.getText();
        gasto_area_inicial_agua =Integer.parseInt(x);
        
        M3_gas=gasto_area_final_agua-gasto_area_inicial_agua;
        
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
        if(estrato==1 /*&& cm_agua<14 && cm_agua>0*/){
            if(M3_gas>20){
               pagar_mas=(M3_gas-20)*Valor_gas_20M3[0];
               valor_total=((M3_gas*valor_gas[0]+Valor_Cargo_fijo_agua[0])+subsidio)+pagar_mas;
               subsidio=valor_total*60.00/100;
            }else{
                valor_total=(M3_gas*valor_gas[0]+Valor_Cargo_fijo_agua[0])+subsidio;
                subsidio=valor_total*60.00/100;
            }
            costo1=Double.toString(valor_total);
            suds=Double.toString(subsidio);
            valor_exceso=Double.toString(pagar_mas);
            valor_gato=Double.toString(valor_gas[0]);
            valor_cm=Double.toString(M3_gas);
            valor_carg=Double.toString(Valor_Cargo_fijo_agua[0]);

            gasto_total.setText("$"+costo1);
            subsi.setText("$"+suds);
            valor_gasto.setText("$"+valor_gato);
            cm.setText(valor_cm+" (Cm3)");
            exceso.setText("$"+valor_exceso);
            valor_cargo.setText("$"+valor_carg);

            System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        
        if(estrato==2){
           if(M3_gas>20){
               pagar_mas=(M3_gas-20)*Valor_gas_20M3[1];
               valor_total=((M3_gas*valor_gas[1]+Valor_Cargo_fijo_agua[1])+subsidio)+pagar_mas;
               subsidio=valor_total*60.00/100;
            }else{
                valor_total=(M3_gas*valor_gas[1]+Valor_Cargo_fijo_agua[1])+subsidio;
                subsidio=valor_total*60.00/100;
            }
            costo1=Double.toString(valor_total);
            suds=Double.toString(subsidio);
            valor_exceso=Double.toString(pagar_mas);
            valor_gato=Double.toString(valor_gas[1]);
            valor_cm=Double.toString(M3_gas);
            valor_carg=Double.toString(Valor_Cargo_fijo_agua[1]);

            gasto_total.setText("$"+costo1);
            subsi.setText("$"+suds);
            valor_gasto.setText("$"+valor_gato);
            cm.setText(valor_cm+" (Cm3)");
            exceso.setText("$"+valor_exceso);
            valor_cargo.setText("$"+valor_carg);

            System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        
        if(estrato==3){
            if(M3_gas>20){
               pagar_mas=(M3_gas-20)*Valor_gas_20M3[2];
               valor_total=((M3_gas*valor_gas[2]+Valor_Cargo_fijo_agua[2])+subsidio)+pagar_mas;
               subsidio=valor_total*12.50/100;
            }else{
                valor_total=(M3_gas*valor_gas[2]+Valor_Cargo_fijo_agua[2])+subsidio;
                subsidio=valor_total*12.50/100;
            }
            costo1=Double.toString(valor_total);
            suds=Double.toString(subsidio);
            valor_exceso=Double.toString(pagar_mas);
            valor_gato=Double.toString(valor_gas[2]);
            valor_cm=Double.toString(M3_gas);
            valor_carg=Double.toString(Valor_Cargo_fijo_agua[2]);

            gasto_total.setText("$"+costo1);
            subsi.setText("$"+suds);
            valor_gasto.setText("$"+valor_gato);
            cm.setText(valor_cm+" (Cm3)");
            exceso.setText("$"+valor_exceso);
            valor_cargo.setText("$"+valor_carg);

            System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        
        if(estrato==4){
            if(M3_gas>20){
               pagar_mas=(M3_gas-20)*Valor_gas_20M3[3];
               valor_total=(M3_gas*valor_gas[3]+Valor_Cargo_fijo_agua[3])+pagar_mas;
            }else{
                valor_total=(M3_gas*valor_gas[3]+Valor_Cargo_fijo_agua[3]);
            }
            costo1=Double.toString(valor_total);
            suds=Double.toString(subsidio);
            valor_exceso=Double.toString(pagar_mas);
            valor_gato=Double.toString(valor_gas[3]);
            valor_cm=Double.toString(M3_gas);
            valor_carg=Double.toString(Valor_Cargo_fijo_agua[3]);

            gasto_total.setText("$"+costo1);
            subsi.setText("$"+suds);
            valor_gasto.setText("$"+valor_gato);
            cm.setText(valor_cm+" (Cm3)");
            exceso.setText("$"+valor_exceso);
            valor_cargo.setText("$"+valor_carg);

            System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        
        if(estrato==5){
            if(M3_gas>20){
               pagar_mas=(M3_gas-20)*Valor_gas_20M3[4];
               valor_total=((M3_gas*valor_gas[4]+Valor_Cargo_fijo_agua[4])+subsidio)+pagar_mas;
               subsidio=valor_total*50.00/100;
            }else{
                valor_total=(M3_gas*valor_gas[4]+Valor_Cargo_fijo_agua[4])+subsidio;
                subsidio=valor_total*50.00/100;
            }
            costo1=Double.toString(valor_total);
            suds=Double.toString(subsidio);
            valor_exceso=Double.toString(pagar_mas);
            valor_gato=Double.toString(valor_gas[4]);
            valor_cm=Double.toString(M3_gas);
            valor_carg=Double.toString(Valor_Cargo_fijo_agua[4]);

            gasto_total.setText("$"+costo1);
            subsi.setText("$"+suds);
            valor_gasto.setText("$"+valor_gato);
            cm.setText(valor_cm+" (Cm3)");
            exceso.setText("$"+valor_exceso);
            valor_cargo.setText("$"+valor_carg);

            System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        if(estrato==6){
            if(M3_gas>20){
               pagar_mas=(M3_gas-20)*Valor_gas_20M3[5];
               valor_total=((M3_gas*valor_gas[5]+Valor_Cargo_fijo_agua[5])+subsidio)+pagar_mas;
               subsidio=valor_total*60.00/100;
            }else{
                valor_total=(M3_gas*valor_gas[5]+Valor_Cargo_fijo_agua[5])+subsidio;
                subsidio=valor_total*60.00/100;
            }
            costo1=Double.toString(valor_total);
            suds=Double.toString(subsidio);
            valor_exceso=Double.toString(pagar_mas);
            valor_gato=Double.toString(valor_gas[5]);
            valor_cm=Double.toString(M3_gas);
            valor_carg=Double.toString(Valor_Cargo_fijo_agua[5]);

            gasto_total.setText("$"+costo1);
            subsi.setText("$"+suds);
            valor_gasto.setText("$"+valor_gato);
            cm.setText(valor_cm+" (Cm3)");
            exceso.setText("$"+valor_exceso);
            valor_cargo.setText("$"+valor_carg);

            System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        if(estrato==7 /*&& cm_agua<14 && cm_agua>0*/){
            if(M3_gas>20){
               pagar_mas=(M3_gas-20)*Valor_gas_20M3[6];
               valor_total=((M3_gas*valor_gas[6]+Valor_Cargo_fijo_agua[6])-subsidio)+pagar_mas;
               subsidio=valor_total*60.00/100;
            }else{
                valor_total=(M3_gas*valor_gas[6]+Valor_Cargo_fijo_agua[6])-subsidio;
                subsidio=valor_total*60.00/100;
            }
            costo1=Double.toString(valor_total);
            suds=Double.toString(subsidio);
            valor_exceso=Double.toString(pagar_mas);
            valor_gato=Double.toString(valor_gas[6]);
            valor_cm=Double.toString(M3_gas);
            valor_carg=Double.toString(Valor_Cargo_fijo_agua[6]);

            gasto_total.setText("$"+costo1);
            subsi.setText("$"+suds);
            valor_gasto.setText("$"+valor_gato);
            cm.setText(valor_cm+" (Cm3)");
            exceso.setText("$"+valor_exceso);
            valor_cargo.setText("$"+valor_carg);

            System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        if(estrato==8 /*&& cm_agua<14 && cm_agua>0*/){
            if(M3_gas>20){
               pagar_mas=(M3_gas-20)*Valor_gas_20M3[7];
               valor_total=((M3_gas*valor_gas[7]+Valor_Cargo_fijo_agua[7])-subsidio)+pagar_mas;
               subsidio=valor_total*60.00/100;
            }else{
                valor_total=(M3_gas*valor_gas[7]+Valor_Cargo_fijo_agua[7])-subsidio;
                subsidio=valor_total*60.00/100;
            }
            costo1=Double.toString(valor_total);
            suds=Double.toString(subsidio);
            valor_exceso=Double.toString(pagar_mas);
            valor_gato=Double.toString(valor_gas[7]);
            valor_cm=Double.toString(M3_gas);
            valor_carg=Double.toString(Valor_Cargo_fijo_agua[7]);

            gasto_total.setText("$"+costo1);
            subsi.setText("$"+suds);
            valor_gasto.setText("$"+valor_gato);
            cm.setText(valor_cm+" (Cm3)");
            exceso.setText("$"+valor_exceso);
            valor_cargo.setText("$"+valor_carg);

            System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        if(estrato==9 /*&& cm_agua<14 && cm_agua>0*/){
            if(M3_gas>20){
               pagar_mas=(M3_gas-20)*Valor_gas_20M3[8];
               valor_total=((M3_gas*valor_gas[8]+Valor_Cargo_fijo_agua[8])-subsidio)+pagar_mas;
               subsidio=valor_total*60.00/100;
            }else{
                valor_total=(M3_gas*valor_gas[8]+Valor_Cargo_fijo_agua[8])-subsidio;
                subsidio=valor_total*60.00/100;
            }
            costo1=Double.toString(valor_total);
            suds=Double.toString(subsidio);
            valor_exceso=Double.toString(pagar_mas);
            valor_gato=Double.toString(valor_gas[8]);
            valor_cm=Double.toString(M3_gas);
            valor_carg=Double.toString(Valor_Cargo_fijo_agua[8]);

            gasto_total.setText("$"+costo1);
            subsi.setText("$"+suds);
            valor_gasto.setText("$"+valor_gato);
            cm.setText(valor_cm+" (Cm3)");
            exceso.setText("$"+valor_exceso);
            valor_cargo.setText("$"+valor_carg);

            System.out.println("Estrato 1"+" "+"valor dinal "+ valor_total);
        }
        }
        }
        
            //calculo_agua(int estrato,double valor_agua,double Valor_Cargo_fijo_agua, double cm_agua,double valor_total, double subsidio);
            
        if(e.getSource()==ahorrar_agua){
        pp.getContenedor().controlSubpantallas(5);
        }
        
        }
}
