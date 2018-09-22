/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.BDConexion;
import Entidades.Sesion;
import Entidades.ValorTarifas;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Tiempo;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Sebas
 */
public class Sql_help {
    public static String getUsuario(){
        return"SELECT id_cedula,nombre,clave,correo,pregunta_seguridad,estrato"
            + ",tel_cel,direccion,estado,tipo_usuario"
            +" FROM tbl_usuarios";
    }
    
    public static String getUsuario(String id){
        return"SELECT id_cedula,nombre,clave,correo,estado,estrato"
            +" FROM tbl_usuarios"
            +" WHERE id_cedula = '"+id+"' ";
    }
    
    public static String getUsuario(String id, String cla){
        return"SELECT id_cedula,nombre,clave,correo "
            +" FROM tbl_usuarionormal "
            +"WHERE id_cedula = '"+id+"' AND clave='"+cla+"'";
    }
    
    public static String getInsertUsuario(){
        return"INSERT INTO (id_cedula,nombre,clave,correo,pregunta_seguridad,estrato"
            + ",tel_cel,direccion,estado,tipo_usuario)"
            +"Values(?,?,?,?,?,?,?,?,?,?)";
    }
    
    public static String getUpdateUsuario(){
        return"UPDATE tbl_usuarionormal"
            +"set nombre=?, clave=?,correo=?,tel_cel=?,direccion=?,tipo_usuario=?"
            +"WHERE id_cedula=?";
    }
    
    public static String getValorAgua(int estrato,String mes){
        String valorAgua="";
        if(estrato==1){
        valorAgua="SELECT estrato1 "+
                "FROM tbl_valoragua "+
                "WHERE mes = '"+mes+"' ";
        }
        return valorAgua;
    }
    
    public static String getValorAguaCargoFijo(int estrato,String mes){
        String valorAgua="";
        if(estrato==1){
        valorAgua="SELECT estrato1 "+
                "FROM tbl_valoraguacargofijo "+
                "WHERE mes = '"+mes+"' ";
        }
        return valorAgua;
    }
    
    public static String getValorAguaExceso(int estrato,String mes){
        String valorAgua="";
        if(estrato==1){
        valorAgua="SELECT estrato1 "+
                "FROM tbl_valoraguaexceso "+
                "WHERE mes = '"+mes+"' ";
        }
        return valorAgua;
    }
    
    public static String getValorRegistros(String mes,int ano,int registro1, int registro2){
        String valorAgua="";
        if(mes.equals("Abril")){
        valorAgua="INSERT INTO (registro1,registro2) Values(?,?)"+
                "FROM tbl_valoraguaexceso "+
                "WHERE mes = '"+mes+"' ";
        }
        return valorAgua;
    }
    
    public static String getDatosServicios(){
        return"SELECT ano,estrato,valorServicio,valor_cargoFijo,valor_exceso,"
            +"tipoServicio, Vigente,mes "
            +" FROM tbl_usuarionormal "
            +"WHERE estrato = '"+Sesion.getEstrato()+"' AND Vigencia ='"+1+"'";//+"' AND mes='"+mes+"' AND ano AND TipodeServicio";
    }
    
    public static String UpdateUsuario(){
        return "UPDATE tbl_usuarios SET estrato=\"3\", correo =\"Elyisus@gmail.com\" WHERE id_cedula=\"123\"";
    }
    
    //REGISTRAR USUARIO---------
    public static String getInsertarUsuario(){
        return "INSERT INTO tbl_usuarios (id_cedula,nombre,apellido,"
            +"clave,correo,ciudad,empresaPS,estrato,tel_cel,direccion,estado"
            +",tipo_usuario,tipoPropiedad,nivelResidencia) "
            +"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }//FIN REGISTRAR USUARIO----------------------------
    
    
    public static String updateUsuario(){
        return "UPDATE tbl_usuarios SET id_cedula,nombre,apellido,"
                +"clave,correo,ciudad,empresaPS,estrato,tel_cel,direccion,estado,tipo_usuario) ";
    }
    
    public static String getConsumos(){
        return "SELECT Consecutivo,mes,ano,Unidad,Cantidad,id_sensor"
            +",id_usuario,fecha_sistema,hora FROM tbl_gastoaguamanual";
    }
    
      public static String getConsumos(String id,String idSensor){
        return "SELECT Consecutivo,mes,ano,Unidad,Cantidad,id_sensor"
            +",id_usuario,fecha_sistema,hora FROM tbl_gastoaguamanual"
                + "  WHERE id_sensor='"+idSensor+"'  AND id_usuario='"+id+"'";
    }
      
    //TOMA LOS VALORES PARA LOS CALCULOS
    public static String getValoresServicios(String servicio){
        Tiempo t = new Tiempo();
        
        return"SELECT * FROM tbl_valortarifas "
            +"WHERE estrato = '"+Sesion.getEstrato()+"' AND Vigente ='"+1+"' AND "
            +"mes = '"+t.getMes()+"' AND servicio = '"+servicio+"'";
    }//----------------------------------------
      
   public static int consecutivo,consumo;
    public static String unidad,tipoServicio,id_cedula,mes,dia,hora,minuto,ano;
    public static int ultimoRegistro;
    
    public static String getConsumoManual(){
        return "INSERT INTO tbl_consumosmanuales (consumo,unidad,"
                +"tipoServicio,id_cedula,mes,dia,hora,minuto,segundos,ano,ultimoRegistro,fecha) "
                +"VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    }
    
    //TOMAR TARIFA ENEGÍA------------------
    public static String getTarifaEnergia(){
        Tiempo t = new Tiempo();
        return"SELECT * FROM tbl_valortarifaenergia "
            +"WHERE estrato = '"+Sesion.getEstrato()+"' AND Vigente ='"+1+"' AND "
            +"mes = '"+t.getMes()+"' AND nivelResidencia = '"+Sesion.getNivelResidencia()+"' "
            +"AND tipoPropiedad = '"+Sesion.getTipoPropiedad()+"' ";
    }
    
    /*Insertar datos al resumen*/
    public static String setConsumosManueales(){
        return "INSERT INTO tbl_";
    }/*Fin insertar datos al resumen*/
    
    public static String InsertarConsumo(){
        return "INSERT INTO tbl_consumosmanuales (consecutivo,id_cedula,consumo,"
                + "unidad,tipoServicio,mes,dia,hora,minuto,segundos,ano,ultimoRegistro,fecha) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
    
    
}/*FIN CLASE Sql_help*/