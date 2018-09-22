/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.interfaceGrafica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sebas
 */
public class Conexion_base_datos {
    /*
    //Declaración de objeto que devulve la conección
    private Connection conectar = null;
    public Conexion_base_datos(){}
    
    public Connection Conexion_base_datos(){
    try{
             Class.forName("com.mysql.jdbc.Driver");
             conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_arjeware", "root","");
             System.out.println("¡Conexión exitosa con la base de datos!");
             //JOptionPane.showMessageDialog(null,"Conexion Establecida","AVISO",JOptionPane.INFORMATION_MESSAGE);
         } catch (ClassNotFoundException | SQLException e){
             //JOptionPane.showMessageDialog(null,"Error al conectarse","Mensaje Error",JOptionPane.ERROR_MESSAGE);
             System.out.println("Error al conectar con MySQL");
         }
        return conectar;
    }
    
     public Connection getCon(){
         setConexionDB();
         return conectar;
     }
     public void setCon(Connection c){
         conectar=c;
     }//Fin seCon
     
     public void setConexionDB(){
                String host="localhost";//127.0.0.1 o ip
                /*
                A nivel local:localhost
                Remoto //permisos en bd remota
                */
                /*
                String puerto="3306"; // o deacuerdo a la instancia
                String bd="bd arjeware";
                String user="root";
                String clave="";
                try{
                    setCon(DriverManager.getConnection("jdbc:mysql://localhost:"+puerto+
                       "/"+bd, user,clave));
                }catch(Exception ex){
                    
                }
            }
     
     static{//Metodos propios de una clase
         try{
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             }
         catch (ClassNotFoundException e){
             System.out.println("ClassNotFoundException" + e.getMessage());
          }//Si la clase no se encuentra 
         catch (InstantiationException e2){
             System.out.println("InstantiationException" + e2.getMessage()); 
          }//No se encontro la instancia       
         catch (IllegalAccessException e3){ 
             System.out.println("IllegalAccessException" + e3.getMessage() );
          }//si hay acceso a la base de datos   
         catch (Exception e4){
                 System.out.println("Exception" + e4.getMessage()  );
                 }//algo general diers
             }//fin static

     public static void setImprimirDatos(){
     //Crear objeto tipo conexion_base_datos
     Conexion_base_datos c = new Conexion_base_datos();
     try{
        ResultSet r = c.getCon().prepareStatement("SELECT idusuario,nombre FROM arje_tblusuarionorm")
            .executeQuery();
        if (r.next()) {
            while(r.next()){
                System.out.println(r.getString(1)+" "+r.getString(2));   
            }
        }else {
             System.out.println("No hay datos en el sistema");
        }
         
     }catch(SQLException ex){
         System.out.println("Error "+ex.getMessage()+" Causa "+ex.getErrorCode());
     }finally{
     try{
         c.getCon().close();
     }catch(Exception ex){
         
     }//FIN CATCH
     
     }//FIN FINALLY
     
     }//FIN METODO
     */
}


    
