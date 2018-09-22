/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Sebas
 */
public class GenerarWord {
    
    //String tituloDocumento = titulo.getText();
    String tituloDocumento = "Titulo";
    String contenidoParrafo = "Aquí se guardaran las facturas que la persona decida imprimir.";
    
    //metodos canonicos complejos
    
    public void generarWord(){
        this.tituloDocumento=tituloDocumento;
        this.contenidoParrafo=contenidoParrafo;
        
        //Creamos el documento
        XWPFDocument documento = new XWPFDocument();

        //Declaramos el titulo y le asignamos algunas propiedades
        XWPFParagraph titulo_doc = documento.createParagraph();
        titulo_doc.setAlignment(ParagraphAlignment.CENTER);
        titulo_doc.setVerticalAlignment(TextAlignment.TOP);

        //Declaramos el parrafo y le asignamos algunas propiedades
        XWPFParagraph parrafo = documento.createParagraph();
        parrafo.setAlignment(ParagraphAlignment.BOTH);
        
        //Para el titulo
        XWPFRun r1 = titulo_doc.createRun();
        r1.setBold(true);
        r1.setText(this.tituloDocumento);
        r1.setFontFamily("Microsoft New Tai Lue");
        r1.setFontSize(15);
        r1.setTextPosition(10);
        r1.setUnderline(UnderlinePatterns.SINGLE);

        //Para el parrafo
        XWPFRun r2 = parrafo.createRun();
        r2.setText(contenidoParrafo);
        r2.setFontSize(12);
        r2.addCarriageReturn();
        
        try {
            FileOutputStream word = new FileOutputStream(tituloDocumento+".docx");
            documento.write(word);
            word.close();
            
            
            final File file = new File(tituloDocumento+".docx");
            Desktop.getDesktop().open(file);
            
            System.out.println("Se creo el documento");
            
        }catch(FileNotFoundException ex){
            Logger.getLogger(GenerarWord.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(GenerarWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void generarWord(String tituloDocumento,String contenidoParrafo){
        this.tituloDocumento=tituloDocumento;
        this.contenidoParrafo=contenidoParrafo;
        
        //Creamos el documento
        XWPFDocument documento = new XWPFDocument();

        //Declaramos el titulo y le asignamos algunas propiedades
        XWPFParagraph titulo_doc = documento.createParagraph();
        titulo_doc.setAlignment(ParagraphAlignment.CENTER);
        titulo_doc.setVerticalAlignment(TextAlignment.TOP);

        //Declaramos el parrafo y le asignamos algunas propiedades
        XWPFParagraph parrafo = documento.createParagraph();
        parrafo.setAlignment(ParagraphAlignment.BOTH);
        
        //Para el titulo
        XWPFRun r1 = titulo_doc.createRun();
        r1.setBold(true);
        r1.setText(this.tituloDocumento);
        r1.setFontFamily("Microsoft New Tai Lue");
        r1.setFontSize(15);
        r1.setTextPosition(10);
        r1.setUnderline(UnderlinePatterns.NONE);

        //Para el parrafo
        XWPFRun r2 = parrafo.createRun();
        r2.setText(contenidoParrafo);
        r2.setFontSize(12);
        r2.addCarriageReturn();
        
        try {
            FileOutputStream word = new FileOutputStream(tituloDocumento+".docx");
            documento.write(word);
            word.close();
            
            
            final File file = new File(tituloDocumento+".docx");
            Desktop.getDesktop().open(file);
            
            System.out.println("Se creo el documento");
            
        }catch(FileNotFoundException ex){
            Logger.getLogger(GenerarWord.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(GenerarWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
