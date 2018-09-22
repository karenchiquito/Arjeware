/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IA_ArjeWare;

/*import ArjeWare.Ahorro_agua;
import ArjeWare.Ahorro_agua;
import ArjeWare.Inicio_Sesion;
import ArjeWare.Inicio_Sesion;
import ArjeWare.contenedor;
import ArjeWare.contenedor;
import javax.speech.recognition.Recognizer;
import javax.speech.recognition.ResultAdapter;
import java.io.FileReader;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import javax.speech.Central;
import javax.speech.EngineModeDesc;
import javax.speech.recognition.Result;
import javax.speech.recognition.ResultEvent;
import javax.speech.recognition.ResultToken;
import javax.speech.recognition.RuleGrammar;

/**
 *
 * @author Sebas
 */
public class IA_ArjeWare /*extends ResultAdapter implements Runnable*/{
    //Declaramos el objeto/ Recognizer
    /*Recognizer recognizer;
    public String palabra_dicha;
    int bandera_comienzo=0;
    
    Inicio_Sesion inicio;
    contenedor contenedor;
    Ahorro_agua agua;
    
    public IA_ArjeWare(Inicio_Sesion inicio, Ahorro_agua agua){
        this.inicio = inicio;
        this.agua = agua;
    }
    
    //Metodo que recibe la cadena de texto del archivo gramatical
    @Override
    public void resultAccepted(ResultEvent e){
        try{
            Result res = (Result)(e.getSource());
            //Se optiene uno de los elementos de la cadena de texto
            ResultToken tokens[]= res.getBestTokens();
            //Cadena que guardara la palabra o frase concatenada
            String args[] = new String[1];
            args[0]="";
            //Ciclo que concatena un elemento y otro hasta formar una palabra o frase
            for (int i = 0; i < tokens.length; i++) {
                palabra_dicha = tokens[1].getSpokenText();
                args[0] += palabra_dicha;
                System.out.println(palabra_dicha+" ");
            }
            System.out.println("");
            if(palabra_dicha.equals("inicia sesion") || palabra_dicha.equals("adelante")){
                this.inicio.reconocimiento_voz=1;
                System.out.println("Iniciar sesion");
            }
            if(palabra_dicha.equals("salir") || palabra_dicha.equals("adios arji")){
                recognizer.deallocate();
                args[0]="Hasta luego";
                System.out.println(args[0]);
                System.exit(0);
            }else{
                recognizer.suspend();
                //Lee.main(args);
                recognizer.resume();
            }
            
        }catch(Exception ex){
            System.out.println("A ocurrido algo inesperado "+ ex);
        }
    }
    
    public void recognizer(){
        try{
        recognizer= Central.createRecognizer(new EngineModeDesc(Locale.ROOT));
        recognizer.allocate();
        
        FileReader gramatica = new FileReader("C:/SimpleGrammarES2.txt");
        RuleGrammar regla_gramatica=recognizer.loadJSGF(gramatica);
        regla_gramatica.setEnabled(true);
        
        recognizer.addResultListener(new IA_ArjeWare(inicio,agua));
        recognizer.commitChanges();
        recognizer.requestFocus();
        
        }catch(Exception ex){
            
        }
    }

    @Override
    public void run() {
        this.recognizer();
    }
*/
}
