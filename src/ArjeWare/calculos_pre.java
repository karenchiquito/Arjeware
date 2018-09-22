/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class calculos_pre {

    
    int calculo_servicio_agua = calculo_agua();
    int calculo_servicio_gas = calculo_gas();
    int calculo_servicio_energia = calculo_energia();
    
    //          AGUA            AGUA            AGUA                AGUA        AGUA    AGUA
    //          AGUA            AGUA            AGUA                AGUA        AGUA    AGUA
    //          AGUA            AGUA            AGUA                AGUA        AGUA    AGUA
    //          AGUA            AGUA            AGUA                AGUA        AGUA    AGUA
    //          AGUA            AGUA            AGUA                AGUA        AGUA    AGUA
    //          AGUA            AGUA            AGUA                AGUA        AGUA    AGUA
    //          AGUA            AGUA            AGUA                AGUA        AGUA    AGUA
    //          AGUA            AGUA            AGUA                AGUA        AGUA    AGUA
    
     public int calculo_agua(){
        Scanner j = new Scanner(System.in);
        String pagar="$COP";
        
        System.out.println("Ingrese el estrato");
        int estrato=j.nextInt();
            if(estrato==0 || estrato>=9){
                System.out.println("Ingrese de nuevo el estrato");
                estrato=j.nextInt();
            }
            System.out.println("Datos del agua:"+"\n");
        //          AGUA            AGUA            AGUA                AGUA        AGUA    AGUA
        double [] valor_agua=new double[9];
        // Valor de cada estrato para este recurso (Estos son de Hogares)
        // Para saber el estrate al valor del indice [valor_indice] sumale 1
        valor_agua[0]=710.25; valor_agua[1]=1065.37; valor_agua[2]=1553.66; valor_agua[3]=1775.61; valor_agua[4]=2663.42;
        valor_agua[5]=2840.98;
        //Valor de cada estrato para este recurso (Comercio, Industria, oficial EYenta)
        valor_agua[6]=2663.42; valor_agua[7]=2308.30; valor_agua[8]=1775.61;
        
        double [] Valor_Cargo_fijo_agua=new double[9];
        // Valor de cargo fijo de cada estrato para este recurso: AGUA (Estos son de Hogares)
        // Para saber el estrate al valor del indice [valor_indice] sumale 1
        Valor_Cargo_fijo_agua[0]=3426.37; Valor_Cargo_fijo_agua[1]=5139.55; Valor_Cargo_fijo_agua[2]=7495.17;
        Valor_Cargo_fijo_agua[3]=8565.91; Valor_Cargo_fijo_agua[4]=12848.87; Valor_Cargo_fijo_agua[5]=13705.46; 
        //Valor de cargo fijo de cada estrato para este recurso: AGUA(Comercio, Industria, oficial EYenta)
        Valor_Cargo_fijo_agua[6]= 12848.87; Valor_Cargo_fijo_agua[7]=11135.69; Valor_Cargo_fijo_agua[8]= 8565.91;
        
        System.out.println("Ingrese registro uno");
        int gasto_area_inicial_agua=j.nextInt();
        System.out.println("ingrese registro dos");
        int gasto_area_final_agua=j.nextInt();
        String gasto_agua="Cm3";
        double cm_agua=gasto_area_final_agua-gasto_area_inicial_agua;
        double valor_total=0;
        
        //GASTO DE AGUA EN LOS SERVICIOS
        if(estrato==1 && cm_agua<14 && cm_agua>0){
            valor_total=(cm_agua*valor_agua[0]+Valor_Cargo_fijo_agua[0])-valor_total*60.00/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de agua fue : "+cm_agua+" "+gasto_agua);
        }
        
        if(estrato==2 && cm_agua<14 && cm_agua>0){
            valor_total=(cm_agua*valor_agua[1]+Valor_Cargo_fijo_agua[1])-valor_total*40.00/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de agua fue : "+cm_agua+" "+gasto_agua);
        }
        
        if(estrato==3 && cm_agua<14 && cm_agua>0){
            valor_total=(cm_agua*valor_agua[2]+Valor_Cargo_fijo_agua[2])-valor_total*12.50/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de agua fue : "+cm_agua+" "+gasto_agua);
        }
        
        if(estrato==4 && cm_agua<14 && cm_agua>0){
            valor_total=(cm_agua*valor_agua[3]+Valor_Cargo_fijo_agua[3]);
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de agua fue : "+cm_agua+" "+gasto_agua);
        }
        
        if(estrato==5 && cm_agua<14 && cm_agua>0){
            valor_total=(cm_agua*valor_agua[4]+Valor_Cargo_fijo_agua[4])+valor_total*50.00/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de agua fue : "+cm_agua+" "+gasto_agua);
        }
        if(estrato==6 && cm_agua<14 && cm_agua>0){
            valor_total=(cm_agua*valor_agua[5]+Valor_Cargo_fijo_agua[5])+valor_total*60.00/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de agua fue : "+cm_agua+" "+gasto_agua);
        }
         return calculo_servicio_agua;
     }
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     //GAS  GAS     GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS GAS
     
     public int calculo_gas(){
     Scanner j = new Scanner(System.in);
        String pagar="$COP";
        
        System.out.println("Ingrese el estrato");
        int estrato=j.nextInt();
            if(estrato==0 || estrato>=9){
                System.out.println("Ingrese de nuevo el estrato");
                estrato=j.nextInt();
            }
            System.out.println("Datos del agua:"+"\n");
            
             //GAS       GAS     GAS     GAS     GAS     GAS     GAS     GAS     GAS
        
        // Valor de cada estrato para este recurso: GAS (Estos son de Hogares)
        // Para saber el estrate al valor del indice [valor_indice] sumale 1
        double[] valor_gas=new double[9];
        valor_gas[0]=684.02; valor_gas[1]=851.44; valor_gas[2]=1289.94; valor_gas[3]=1289.94; valor_gas[4]=1547.93;
        valor_gas[5]=1547.93;
        
        //Valor de cada estrato para este recurso: GAS (Comercio e industria rango 1, rango 2 y oficial)
        valor_gas[6]=1404.74; valor_gas[7]=1385.21; valor_gas[8]= 1289.94;
        
        // Valor de cargo fijo de cada estrato para este recurso: GAS (Estos son de Hogares)
        // Para saber el estrate al valor del indice [valor_indice] sumale 1
        double [] Valor_Cargo_fijo_gas=new double[9];
        Valor_Cargo_fijo_gas[0]=0.00; Valor_Cargo_fijo_gas[1]=0.00; Valor_Cargo_fijo_gas[2]=3021.73;
        Valor_Cargo_fijo_gas[3]=3021.73; Valor_Cargo_fijo_gas[4]=3626.08; Valor_Cargo_fijo_gas[5]=3626.08;
        
        //Valor cargo fijo de cada estrato para este recurso: GAS (Comercio e industria rango 1, rango 2 y oficial)
        Valor_Cargo_fijo_gas[6]=3290.66; Valor_Cargo_fijo_gas[7]=3290.66; Valor_Cargo_fijo_gas[8] =3021.73;
        
        // El rango 1 comprende consumos desde 0 y 100.000 m3/mes
        // El rango 2 comprende consumos desde 100.000 y 400.000 m3/mes
        
        System.out.println("\n"+"Valores gas:"+"\n");
        System.out.println("Ingrese registro uno");
        int gasto_area_inicial_gas=j.nextInt();
        System.out.println("ingrese registro dos");
        int gasto_area_final_gas=j.nextInt();
        String gasto_gas="M3";
        double valor_total=0;
        
        double m_gas = gasto_area_final_gas-gasto_area_inicial_gas;
        	
        double valor_reconexion=25299; double valor_reinstalacion=69515;
        
        if(estrato==1 && m_gas>0 && m_gas<20){
            valor_total=(m_gas*valor_gas[0]+Valor_Cargo_fijo_gas[0]);
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de gas fue : "+m_gas+" "+gasto_gas);
        }
        
        if(estrato==2 && m_gas>0 && m_gas<20){
            valor_total=(m_gas*valor_gas[1]+Valor_Cargo_fijo_gas[1]);
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de gas fue : "+m_gas+" "+gasto_gas);
        }
        
        if(estrato==3 && m_gas>0 && m_gas<20){
            valor_total=(m_gas*valor_gas[2]+Valor_Cargo_fijo_gas[2]);
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de gas fue : "+m_gas+" "+gasto_gas);
        }
        
        if(estrato==4 && m_gas>0 && m_gas<20){
            valor_total=(m_gas*valor_gas[3]+Valor_Cargo_fijo_gas[3]);
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de gas fue : "+m_gas+" "+gasto_gas);
        }
        
        if(estrato==5 && m_gas>0 && m_gas<20){
            valor_total=(m_gas*valor_gas[4]+Valor_Cargo_fijo_gas[4]);
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de gas fue : "+m_gas+" "+gasto_gas);
        }
        
        if(estrato==6 && m_gas>0 && m_gas<20){
            valor_total=(m_gas*valor_gas[5]+Valor_Cargo_fijo_gas[5]);
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado de gas fue : "+m_gas+" "+gasto_gas);
        }
         return calculo_servicio_gas;
        
            
     }
     
     
     //ENERGIA       ENERGIA         ENERGIA     ENERGIA     ENERGIA         ENERGIA     ENERGIA
     //ENERGIA       ENERGIA         ENERGIA     ENERGIA     ENERGIA         ENERGIA     ENERGIA
     //ENERGIA       ENERGIA         ENERGIA     ENERGIA     ENERGIA         ENERGIA     ENERGIA
     //ENERGIA       ENERGIA         ENERGIA     ENERGIA     ENERGIA         ENERGIA     ENERGIA
     //ENERGIA       ENERGIA         ENERGIA     ENERGIA     ENERGIA         ENERGIA     ENERGIA
     //ENERGIA       ENERGIA         ENERGIA     ENERGIA     ENERGIA         ENERGIA     ENERGIA
     //ENERGIA       ENERGIA         ENERGIA     ENERGIA     ENERGIA         ENERGIA     ENERGIA
     //ENERGIA       ENERGIA         ENERGIA     ENERGIA     ENERGIA         ENERGIA     ENERGIA
     
     public int calculo_energia(){
     Scanner j = new Scanner(System.in);
        String pagar="$COP";
        
        System.out.println("Ingrese el estrato");
        int estrato=j.nextInt();
            if(estrato==0 || estrato>=9){
                System.out.println("Ingrese de nuevo el estrato");
                estrato=j.nextInt();
            }
            System.out.println("Datos del agua:"+"\n");
      //ENERGIA       ENERGIA         ENERGIA     ENERGIA     ENERGIA         ENERGIA     ENERGIA
    
        // Valor de cada estrato para este recurso: ENERGIA (Estos son de Hogares)
        // Para saber el estrate al valor del indice [valor_indice] sumale 1
        double[] valor_energia =new double[9];
        valor_energia[0]=206.81; valor_energia[1]=258.51; valor_energia[2]=402.12 ; valor_energia[3]=473.08;
        valor_energia[4]=567.70; valor_energia[5]=567.70;
        //Valor de cada estrato para este recurso: GAS (Comercio e industria ,ESPD y oficial)
        valor_energia[6]=567.70; valor_energia[7]=520.39; valor_energia[8]=473.08;
                
        String gasto_energia="Kwh";
        System.out.println("\n"+"Valores Energia:"+"\n");
        
        System.out.println("Ingrese registro uno");
        int gasto_area_inicial_energia=j.nextInt();
        System.out.println("ingrese registro dos");
        int gasto_area_final_energia=j.nextInt();
        double valor_total=0;
        
        int kwh_energia= gasto_area_final_energia - gasto_area_inicial_energia;
        
        if(estrato==1){
            valor_total=(valor_energia[0]*kwh_energia)-valor_total*50.00/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado en energía fue : "+kwh_energia+" "+gasto_energia);
        }
        
        if(estrato==2){
            valor_total=(valor_energia[1]*kwh_energia)-valor_total*40.00/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado en energía fue : "+kwh_energia+" "+gasto_energia);
        }
        
        if(estrato==3){
            valor_total=(valor_energia[2]*kwh_energia)-valor_total*15.00/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado en energía fue : "+kwh_energia+" "+gasto_energia);
        }
        
        if(estrato==4){
            valor_total=(valor_energia[3]*kwh_energia);
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado en energía fue : "+kwh_energia+" "+gasto_energia);
        }
        
        if(estrato==5){
            valor_total=(valor_energia[4]*kwh_energia)+20.00/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado en energía fue : "+kwh_energia+" "+gasto_energia);
        }
        
        if(estrato==6){
            valor_total=(valor_energia[5]*kwh_energia)+20.00/100;
            
            System.out.println("Su gasto fue de :"+valor_total+" "+pagar+
            "  Lo gastado en energía fue : "+kwh_energia+" "+gasto_energia);
        }
         return calculo_servicio_energia;
     }
     
     
}
    
