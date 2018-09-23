/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.entity.Entidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Validaciones {
    
    public static boolean ValidarCorreo(String correo){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-"
                + "z]{2,})$"
        );
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    
    public static boolean ValidarTelCel(String telCel){
        boolean validacion=false;
        while(telCel.equals("")){
            JOptionPane.showMessageDialog(null, "El teléfono o celular puede contener maximo 10 caracteres de tipo numerico");
            
            if(!telCel.matches("[0-9] {7,10}")){
                telCel="";
                System.out.println("Recuerda que los números de telefono solo aceptan números.");
            }else{
                validacion=true;
            }
            
        }
        
        return validacion;
    }
    
}
