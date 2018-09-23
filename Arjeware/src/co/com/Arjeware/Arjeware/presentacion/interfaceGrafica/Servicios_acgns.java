/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Sebas
 */
public class Servicios_acgns extends JPanel implements ActionListener{
    //Fundamentales---------------------
    protected int width, height;
    protected Control_instancias pp;
    //Titulos---------------------------
    private JLabel title,senso,panel;
    //Datos-----------------------------
    private JLabel num_sensores,num_paneles;
    //Colores------------------------------------
    public Color verde_menu = new Color(122, 212, 52);
    public Color verde_seleccion= new Color(52,121,52);
    public Color verde_sabias=new Color(215,230,215);
    //INTS-STRINGS-BOOLEANS--------------------------
    int Conta_sensores=0,Conta_Paneles=0;
    String sensores=Integer.toString(Conta_sensores), Paneles=Integer.toString(Conta_Paneles);
    //Tabla-----------------------------------------
    private JTable tabla_paneles;
    
    private String[] nombre_columnas={"Imagen","Serie","W (Watt)","Equivale","N°Paneles"};
    private Object [] [] datos_fila={
        {null,"MK4","60","3(TV), 1(Nevera)","5"},
        {null,"MK4","60","3(TV), 1(Nevera)","5"},
        {null,"MK4","60","3(TV), 1(Nevera)","5"
            
        }
    };
    
    //Marco tabla-----------------------------------
    private JPanel marco_tabla=new JPanel();
    
    
    public Servicios_acgns(Control_instancias instancias, int width, int height){
        this.width=width;
        this.height=height;
        pp=instancias;
        
        this.tabla_paneles = new JTable(datos_fila,nombre_columnas);
        tabla_paneles.setEnabled(false);
        tabla_paneles.setBackground(verde_menu);
        tabla_paneles.setFont(new Font("Microsoft New Tai Lue",0,14));
        marco_tabla.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
        marco_tabla.add(new JScrollPane(tabla_paneles));
        this.add(marco_tabla);
        
        title= new JLabel("Aquí encontraras los servicios que te brinda ACGNS");
            title.setForeground(verde_menu);
            title.setFont(new Font("Microsoft New Tai Lue",1,18));
            add(title);
            
        senso= new JLabel("Sensores instalados: ");
            senso.setForeground(verde_seleccion);
            senso.setFont(new Font("Microsoft New Tai Lue",1,18));
            add(senso);
        
        num_sensores= new JLabel(sensores);
            num_sensores.setForeground(verde_menu);
            num_sensores.setFont(new Font("Microsoft New Tai Lue",1,18));
            add(num_sensores);
            
        panel=new JLabel("Paneles instalados: ");
            panel.setForeground(verde_seleccion);
            panel.setFont(new Font("Microsoft New Tai Lue",1,18));
            add(panel);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        super.setBackground(Color.white);
        setSize(width,height);
        
        marco_tabla.setBounds(10, 150, 500, 300);
        
        title.setBounds(10, 10, 500, 25);
        senso.setBounds(10, 50, 200, 25);
        num_sensores.setBounds(210, 50, 150, 25);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
