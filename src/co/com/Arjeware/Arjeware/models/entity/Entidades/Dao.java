/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.models.entity.Entidades;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.BDConexion;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Conexion_base_datos;
import co.com.Arjeware.Arjeware.sql.Sql_help;
import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Tiempo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Dao {
    
    public Dao(){}//Constructor de la clase
    //Metodo para buscar un dato
    //Retorna un tipo de dato definido por el usuario
    //En este caso la entidad Usuario(tbl_usuarios)
    
    public Usuarios getBuscarUsuarios(String id){
        // Crear Objetos en java
        Usuarios objU= new Usuarios();
        BDConexion c = new BDConexion();
        //Excepciones
        
        try{
            PreparedStatement stm = c.getCon().prepareStatement
                (Sql_help.getUsuario(id));
            
            ResultSet rs= stm.executeQuery();
                objU.setIdCedula("NE");
                
            while(rs.next()){
                //id_cedula,nombre,clave,correo,estado,estrat o
                objU.setIdCedula(rs.getString("id_cedula"));
                objU.setNombre(rs.getString(2));
                objU.setClave(rs.getString(3));
                objU.setCorreo(rs.getString(4));
                objU.setEstado(rs.getString(5));
                objU.setEstrato(rs.getString(6));
                
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage());
        }finally{
            try{
                c.getCon().close();
            }catch(Exception e){
                
            }
            
        }// Finaliza un bloque de excepciones
        
        return objU;
    }
    
    //ArrayList<?>
    public ArrayList<Usuarios> getListaUsuarios(){
        // Crear Objetos en java
        ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
        BDConexion c = new BDConexion();
        //Excepciones
        
        try{
            PreparedStatement stm= c.getCon().prepareStatement
                (Sql_help.getUsuario());
            
            ResultSet rs= stm.executeQuery();
            
            while(rs.next()){
                //id_cedula,nombre,clave,correo,estado,estrato
                Usuarios objU= new Usuarios();
                objU.setIdCedula(rs.getString("id_cedula"));
                objU.setNombre(rs.getString(2));
                objU.setClave(rs.getString(3));
                objU.setCorreo(rs.getString(4));
                objU.setEstado(rs.getString(5));
                objU.setEstrato(rs.getString(6));
                
                lista.add(objU);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ ex.getMessage());
        }finally{
            try{
                c.getCon().close();
            }catch(Exception e){
                
            }
            
        }// Finaliza un bloque de excepciones
        
        return lista;
    }
    
    public static boolean getInsertar(Usuarios u){
        boolean validacion =false;
        BDConexion c = new BDConexion();
        String resultado = "";
        
        //"INSERTNTO tbl_usuarios (id_cedula,nombre,"
        //"clave,corre Io,pregunta_seguridad,estrato,tel_cel,direccion,estado,tipo_usuario) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pst= c.getCon().prepareStatement(Sql_help.getInsertarUsuario());
            
           /*1*/pst.setString(1,u.getIdCedula());
           /*2*/pst.setString(2,u.getNombre());
                pst.setString(3,u.getApellido());
           /*3*/pst.setString(4,u.getClave());
           /*4*/pst.setString(5,u.getCorreo());
           /*5*/pst.setString(6,u.getCiudad());
                pst.setString(7,u.getEmpresaPS());
                pst.setString(8,u.getEstrato());
                pst.setString(9,u.getTelCel());
                pst.setString(10,u.getDireccion());
                pst.setString(11,u.getEstado());
                pst.setString(12,u.getTipoUsuario());
                pst.setString(13,u.getTipoPropiedad());
                pst.setString(14,u.getNivelResidencia());
                pst.execute();
                
            if(pst.getUpdateCount()>=1){
                resultado = "Usuario Almacenado";
                System.out.println(resultado);
                validacion =true;
            }else{
                resultado = "Error al guardar";
                System.out.println(resultado);
                validacion =false;
            }
            
        }catch(Exception ex){
            
         resultado+= "Error en clase: Dao\n"+"Tipo de error:\n"+"Tonto el que lo lea: "+ex.getMessage();
            System.out.println(resultado);
        }
        
        finally{
            try{
                c.getCon().close();
            }catch(Exception ex){
                
            }
        }
        
        return validacion;
    }
    
    public static boolean UpdateUsuario(Usuarios u){
        boolean validacion =false;
        BDConexion c = new BDConexion();
        String resultado = "";
        
        //"INSERTNTO tbl_usuarios (id_cedula,nombre,"
        //"clave,corre Io,pregunta_seguridad,estrato,tel_cel,direccion,estado,tipo_usuario) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pst= c.getCon().prepareStatement(Sql_help.updateUsuario());
            
           /*2*/pst.setString(1,u.getNombre());
                pst.setString(2,u.getApellido());
           /*3*/pst.setString(3,u.getClave());
           /*4*/pst.setString(4,u.getCorreo());
           /*5*/pst.setString(5,u.getCiudad());
                pst.setString(6,u.getEmpresaPS());
                pst.setString(7,u.getEstrato());
                pst.setString(8,u.getTelCel());
                pst.setString(9,u.getDireccion());
                pst.setString(10,u.getEstado());
                pst.setString(11,u.getTipoUsuario());
                pst.executeUpdate();
                
            if(pst.getUpdateCount()>=1){
                resultado = "Usuario Actualizado";
                System.out.println(resultado);
                validacion =true;
            }else{
                resultado = "Error al actualizar registro";
                System.out.println(resultado);
                validacion =false;
            }
            
        }catch(Exception ex){
            
         resultado+= "Error en clase: Dao\n"+"Tipo de error:\n"+"Tonto el que lo lea: "+ex.getMessage();
            System.out.println(resultado);
        }
        
        finally{
            try{
                c.getCon().close();
            }catch(Exception ex){
                
            }
        }
        
        return validacion;
    }
    
    public static ArrayList<Consumos> getConsumos(String id,String idSensor){
        ArrayList<Consumos> lista=new ArrayList<>();
        BDConexion c = new BDConexion();
        try{
            PreparedStatement stm= c.getCon().prepareStatement(co.com.Arjeware.Arjeware.sql.Sql_help.getConsumos(id, idSensor));
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Consumos consumo = new Consumos();
                //Consecutivo,mes,ano,Unidad,Cantidad,id_sensor,id_usuario,fecha_sistema,hora
                consumo.setConsecutivo(rs.getInt(1));
                consumo.setMes(rs.getString(2));
                consumo.setAno(rs.getString(3));
                consumo.setUnidad(rs.getString(4)); // Tipo en como se mide la magnitud m3  cm2
                consumo.setCantidad(rs.getString(5));
                consumo.setId_sensor(rs.getString(6));
                consumo.setId_usuario(rs.getString(7));
                consumo.setFecha_sistema(rs.getString(8));
                consumo.setHora(rs.getString(9));
                
                
                
              lista.add(consumo);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                c.getCon().close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        //Agregar en el <Entidad.Consumos>
        
        return lista;
    }
    
    public static String getTablaConsumos(String id,String idSensor){
        ArrayList<Consumos> LC=getConsumos(id, idSensor);
        String cadena="<html><body><table>";
        for(Consumos c: LC){
           cadena+="<tr><td>"+c.getCantidad()+"</td><td>"+c.getUnidad()+"</td></tr>";
        }
           
        //Agregar en el <Entidad.Consumos>
        cadena+="</table></body></html>";
        return cadena;
    }
    
    //getValoresServicios
    //ano, mes, estrato,
    //valorServicio, valor_cargoFijo,valor_exceso,subsidio,servicio,medidaLimite,vigente;
    
    public static void getValoresTarifa(String servicio){
        BDConexion c = new BDConexion();
        
        try{
            Connection conection = c.getCon();
            //PreparedStatement pst = c.getCon().prepareStatement(Sql_help.getValoresServicios(servicio));
            Statement st = conection.createStatement();
            ResultSet rs = st.executeQuery(Sql_help.getValoresServicios(servicio));
                //ano, mes, estrato,
                //valorServicio, valor_cargoFijo,valor_exceso,subsidio,servicio,medidaLimite,Vigente;
            while(rs.next()){
                
            if(servicio.equals("Agua")){
                ValorTarifas.setConsecutivoAgua(rs.getInt("Consecutivo"));
                ValorTarifas.setAno(rs.getString("ano"));
                ValorTarifas.setMes(rs.getString("mes"));
                ValorTarifas.setEstrato(rs.getString("estrato"));
                ValorTarifas.setValorServicioAgua(rs.getString("valorServicio"));
                ValorTarifas.setValor_cargoFijoAgua(rs.getString("valor_cargoFijo"));
                ValorTarifas.setValor_excesoAgua(rs.getString("valor_exceso"));
                ValorTarifas.setSubsidioAgua(rs.getString("subsidio"));
                ValorTarifas.setServicioAgua(rs.getString("servicio"));
                ValorTarifas.setMedidaLimiteAgua(rs.getString("medidaLimite"));
                ValorTarifas.setVigenteAgua(rs.getString("Vigente"));
                
                System.out.println("Se entro a Agua");
                System.out.println("Valor: "+ValorTarifas.getValorServicioAgua());
            }
            
            if(servicio.equals("Energía")){
                ValorTarifas.setConsecutivoEnergia(rs.getInt(1));
                ValorTarifas.setAno(rs.getString(2));
                ValorTarifas.setMes(rs.getString(3));
                ValorTarifas.setEstrato(rs.getString(4));
                ValorTarifas.setValorServicioEnergia(rs.getString(5));
                ValorTarifas.setValor_cargoFijoEnergia(rs.getString(6));
                ValorTarifas.setValor_excesoEnergia(rs.getString(7));
                ValorTarifas.setSubsidioEnergia(rs.getString(8));
                ValorTarifas.setServicioEnergia(rs.getString(9));
                ValorTarifas.setMedidaLimiteEnergia(rs.getString(10));
                ValorTarifas.setVigenteEnergia(rs.getString(11));
            }
            
            if(servicio.equals("Alcantarillado")){
                ValorTarifas.setConsecutivoAlcantarillado(rs.getInt(1));
                ValorTarifas.setAno(rs.getString(2));
                ValorTarifas.setMes(rs.getString(3));
                ValorTarifas.setEstrato(rs.getString(4));
                ValorTarifas.setValorServicioAlcantarillado(rs.getString(5));
                ValorTarifas.setValor_cargoFijoAlcantarillado(rs.getString(6));
                ValorTarifas.setValor_excesoAlcantarillado(rs.getString(7));
                ValorTarifas.setSubsidioAlcantarillado(rs.getString(8));
                ValorTarifas.setServicioAlcantarillado(rs.getString(9));
                ValorTarifas.setMedidaLimiteAlcantarillado(rs.getString(10));
                System.out.println("Esto que es"+rs.getString(10));
                ValorTarifas.setVigenteAlcantarillado(rs.getString(11));
                
                System.out.println("Se entro a Alcantarillado");
                System.out.println("Valor: "+ValorTarifas.getValorServicioAlcantarillado());
            }
            
            if(servicio.equals("Gas")){
                ValorTarifas.setConsecutivoGas(rs.getInt(1));
                ValorTarifas.setAno(rs.getString(2));
                ValorTarifas.setMes(rs.getString(3));
                ValorTarifas.setEstrato(rs.getString(4));
                ValorTarifas.setValorServicioGas(rs.getString(5));
                ValorTarifas.setValor_cargoFijoGas(rs.getString(6));
                ValorTarifas.setValor_excesoGas(rs.getString(7));
                ValorTarifas.setSubsidioGas(rs.getString(8));
                ValorTarifas.setServicioGas(rs.getString(9));
                ValorTarifas.setMedidaLimiteGas(rs.getString(10));
                ValorTarifas.setVigenteGas(rs.getString(11));
            }
            
            }
            
        }catch(Exception ex){
            System.out.println("Error Dao, getValoresTarifa : "+ex);
            ex.printStackTrace();
        }
        
        finally{
            try{
                c.getCon().close();
            }catch(Exception ex){
                System.out.println("Error Dao, getValoresTarifa al cerrar conección: "+ex);
                ex.printStackTrace();
            }
        }
    }
    
    //TOMAR LAS TARIFAS DE ENERGÍA
    public static void getTarifaEnergia(){
        BDConexion c = new BDConexion();
        
        try{
            Connection connection = c.getCon();
            Statement stm = connection.createStatement();
            ResultSet rs=stm.executeQuery(Sql_help.getTarifaEnergia());
            
            while(rs.next()){
                /*
                int     Consecutivo;
                String  ano,mes,estrato;
                Double  subsidio,costoCompra,cargoTransporte_STN,cargoTransporte_SDL,
                        margenComercializacion,costo_G_T_perdidas,restricciones,
                        limiteMasMil,limiteMenisMil;
                String  tipoPropiedad;
                int     nivelResidencia;
                String  puntaOFuera;
                double  cfm,monomio,otroSubsidio,otroCostoMas;
                char    vigente
                */
                ValorTarifa_Energia.setConsecutivo(rs.getInt("Consecutivo"));
                ValorTarifa_Energia.setAno(rs.getString("ano"));
                ValorTarifa_Energia.setMes(rs.getString("mes"));
                ValorTarifa_Energia.setEstrato(rs.getString("estrato"));
                ValorTarifa_Energia.setSubsidio(rs.getDouble("subsidio"));
                ValorTarifa_Energia.setCostoCompra(rs.getDouble("costoCompra"));
                ValorTarifa_Energia.setCargoTransporte_STN(rs.getDouble("cargoTransporte_STN"));
                ValorTarifa_Energia.setCargoTransporte_SDL(rs.getDouble("cargoTransporte_SDL"));
                ValorTarifa_Energia.setMargenComercializacion(rs.getDouble("margenComercializacion"));
                ValorTarifa_Energia.setCosto_G_T_perdidas(rs.getDouble("costo_G_T_perdidas"));
                ValorTarifa_Energia.setRestricciones(rs.getDouble("restricciones"));
                ValorTarifa_Energia.setLimiteMasMil(rs.getDouble("limiteMasMil"));
                ValorTarifa_Energia.setLimiteMenosMil(rs.getDouble("limiteMenosMil"));
                ValorTarifa_Energia.setTipoPropiedad(rs.getString("tipoPropiedad"));
                ValorTarifa_Energia.setNivelResidencia(rs.getInt("nivelResidencia"));
                ValorTarifa_Energia.setPuntaOFuera(rs.getString("puntaOFuera"));
                ValorTarifa_Energia.setCfm(rs.getDouble("cfm"));
                ValorTarifa_Energia.setMonomio(rs.getDouble("monomio"));
                ValorTarifa_Energia.setOtroSubsidio(rs.getDouble("otroSubsidio"));
                ValorTarifa_Energia.setOtroCostoMas(rs.getDouble("otroCostoMas"));
                ValorTarifa_Energia.setVigente(rs.getString("vigente"));
            }
            System.out.println("Se tomaron los datos Valor tarifas");
            
        }catch(Exception ex){
            System.out.println("Error, en clase DAO, en metodo: TarifaEnergía, tipo de error: "+ex.getMessage());
        }
        
        finally{
            try{
                c.getCon().close();
            }catch(Exception ex){
                System.out.println("Error al cerrar la conexión, tarifa energía. Tipo error: "+ex.getMessage());
            }
        }
        
    }
    
    public static String getConsumo(ConsumoManual cm){
        String resultado="";
        BDConexion c = new BDConexion();
        try {
            PreparedStatement stm = c.getCon().prepareStatement(Sql_help.getConsumoManual());
            //consumo,unidad ,tipoServicio,id_cedula,mes,dia,hora,minuto,segundos,ano,ultimoRegistro,fecha
            stm.setDouble(1, cm.getConsumo());
            stm.setString(2, cm.getUnidad());
            stm.setString(3,cm.getTipoServicio());
            stm.setString(4,cm.getId_cedula());
            stm.setString(5, cm.getMes());
            stm.setString(6,cm.getDia());
            stm.setString(7, cm.getHora());
            stm.setString(8,cm.getMinuto());
            stm.setString(9,cm.getSegundos());
            stm.setString(10,cm.getAno());
            stm.setInt(11,cm.getUltimoRegistro());
            stm.setString(12,cm.getFecha());
            stm.execute();
            
        } catch (Exception ex) {
            resultado+=ex.getMessage();
        }//Final try
        finally{
            try {
                c.getCon().close();
            } catch (Exception ex) {
                resultado+=ex.getMessage();
            }
            
        }
        
        return resultado;
    }
    
    public static boolean insertarConsumo(ConsumoManual cm){
        boolean validacion =false;
        BDConexion c = new BDConexion();
        String resultado = "";
        Tiempo t = new Tiempo();
        
        /*consecutivo,id_cedula,consumo,"
        unidad,tipoServicio,mes,dia,hora,minuto,segundos,ano,ultimoRegistro,fecha)*/
        try{
            PreparedStatement pst= c.getCon().prepareStatement(Sql_help.InsertarConsumo());
            
           /*1*/pst.setInt(1,cm.getConsecutivo());
           /*2*/pst.setString(2,cm.getId_cedula());
                pst.setDouble(3,cm.getConsumo());
                pst.setString(4,cm.getUnidad());
                pst.setString(5,cm.getTipoServicio());
                pst.setString(6,cm.getMes());
                pst.setString(7,cm.getDia());
                pst.setString(8,cm.getHora());
                pst.setString(9,cm.getMinuto());
                pst.setString(10,cm.getSegundos());
                pst.setString(11,cm.getAno());
                pst.setInt(12,cm.getUltimoRegistro());
                pst.setString(13,cm.getFecha());
                pst.execute();
                
            if(pst.getUpdateCount()>=1){
                resultado = "Usuario Almacenado";
                System.out.println(resultado);
                validacion =true;
            }else{
                resultado = "Error al guardar";
                System.out.println(resultado);
                validacion =false;
            }
            
        }catch(Exception ex){
            
         resultado+= "¡Error! clase: Dao, Metodo: getInsertarGrado() Tipo de error:\n"+ex.getMessage()+"\n Line: \n";
         ex.printStackTrace();
            System.out.println(resultado);
        }
        
        finally{
            try{
                c.getCon().close();
            }catch(Exception ex){
                
            }
        }
        
        return validacion;
    }
    
}//FIN CLASE DAO no tocar se llama respetar
