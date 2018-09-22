/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArjeWare;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class A_Banderas_publicas {
    protected  static Control_instancias pp;
    protected static int width,height;
    
    public static int bandera_tipo_energia=0;
    public static int bandera_inicio;
    public static String frases[];
    public static int tamano,maximum=6,minimum=0;
    
   public static Inicio_Sesion ab= new Inicio_Sesion(pp,width, height);

    /**
     *
     */
    
    Random rn = new Random();
    int ramdomNum = minimum + (int)(Math.random() * maximum);
    int n = maximum - minimum + 1;
    int i = rn.nextInt() % n;
    int ramdomNum2 =minimum + i;
    
    public static String[] getNombres() {
        return frases;
    }
    
    public static void setNombres(String[] frases) {
        frases = frases;
    }
    public static int getTamano() {
        return tamano;
    }

    public static void setTamano(int t) {
        tamano = t;
        frases=new String[tamano];
    }
    
    public static void setCargarFrases(){
        setTamano(10);
        frases[0]="Más del 70% de la Tierra está cubierta por agua pero solo un 3% es apta para consumo humano.";
        frases[1]="El 85% del agua que se consume en la zona andina de Colombia proviene de los páramos.";
        frases[2]="En Colombia tenemos fábricas de agua por excelencia: los páramos. Cada metro cuadrado de páramo produce 1 litro de agua por día.";
        frases[3]="Los seres humanos no podemos sobrevivir sin agua más de siete días.";
        frases[4]="780 millones de personas alrededor del mundo no tienen acceso al agua potable.";
        frases[5]="El 60% de nuestro cuerpo está compuesto por agua. También el 70% del cerebro, el 25% de los huesos y el 83% de la sangre.";
        frases[6]="La falta de agua potable causa la muerte de 4500 niños al día. Además cada año mueren 3.500.000 personas a causa de enfermedades relacionadas con la calidad del agua.";
        frases[7]="a";
        frases[8]="b";
    }
    
    public static String setFrase(){
        setCargarFrases();
        Random rn = new Random();
        int ramdomNum = minimum + (int)(Math.random() * maximum);
        int n = maximum - minimum + 1;
        int i = rn.nextInt() % n;
        
        int ramdomNum2 =minimum + i;
        
        String frase=frases[ramdomNum];
        
        return frase;
    }
    
    public static String getDato(String cod){
        String frase="";
        for (int i = 0; i < frases.length; i++) {
            if(frases[i].equals(cod)){
                frase= frases[i];
                i=frases.length;
            }
        }
        if(frase.equals("")){
            frase="No hay codigo";
        }
        //System.out.println(dato);
        return frase;
    }
    
}
