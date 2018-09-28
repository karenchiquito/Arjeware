/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.models.entity.Entidades;

import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.BDConexion;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.Conexion_base_datos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */

/*representa los datos de una tabla
 tbl_usuarios */
public class Usuarios {
    private String idCedula="",nombre="",apellido="",clave="",correo="",ciudad="",empresaPS="",estrato="",
    telCel="",direccion="",estado="",tipoUsuario="",tipoPropiedad="",nivelResidencia="";
    
    public Usuarios(){}
    
    public Usuarios(String id_cedula, String nombre,String apellido,String clave,String correo,
        String ciudad,String empresaPS,String estrato,String tel_cel,String direccion,
        String estado,String tipo_usuario){
    
        this.idCedula=id_cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.clave=clave;
        this.correo=correo;
        this.ciudad=ciudad;
        this.empresaPS=empresaPS;
        this.estrato=estrato;
        this.telCel=tel_cel;
        this.direccion=direccion;
        this.estado=estado;
        this.tipoUsuario=tipo_usuario;
    }
    
    //METODOS SET--------------------------
    public void setIdCedula(String idCedula) {
        this.idCedula = idCedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEmpresaPS(String empresaPS) {
        this.empresaPS = empresaPS;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public void setNivelResidencia(String nivelResidencia) {
        this.nivelResidencia = nivelResidencia;
    }
    
    
    
    //METODOS GET-------------------------------------

    public String getIdCedula() {
        return idCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getClave() {
        return clave;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEmpresaPS() {
        return empresaPS;
    }

    public String getEstrato() {
        return estrato;
    }

    public String getTelCel() {
        return telCel;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public String getNivelResidencia() {
        return nivelResidencia;
    }
    
    
    
    
    //OPERACIONES Y CONSULTAS
    
        public boolean validacionSesion(){
            boolean validacion=false;
            
            String compClave="";
            String compId="";
            
            BDConexion conexion = new BDConexion();
            
            try{
            
            Connection conection = conexion.getCon();
            Statement st = conection.createStatement();
                
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_usuarios WHERE id_cedula ='"+idCedula+"'");
                while(rs.next()){
                compClave = rs.getString("clave");
                compId = rs.getString("id_cedula");
                
                Sesion.setIdCedula(rs.getString("id_cedula"));
                Sesion.setNombre(rs.getString("nombre"));
                Sesion.setApellido(rs.getString("apellido"));
                Sesion.setClave(rs.getString("clave"));
                Sesion.setCorreo(rs.getString("correo"));
                Sesion.setCiudad(rs.getString("Ciudad"));
                Sesion.setEmpresaPS(rs.getString("empresaPS"));
                Sesion.setEstrato(rs.getString("estrato"));
                Sesion.setTelCel(rs.getString("tel_cel"));
                Sesion.setDireccion(rs.getString("direccion"));
                Sesion.setEstado(rs.getString("estado"));
                Sesion.setTipoUsuario(rs.getString("tipo_usuario"));
                Sesion.setTipoPropiedad(rs.getString("tipoPropiedad"));
                Sesion.setNivelResidencia(rs.getString("nivelResidencia"));
                
                }
            
            if(compClave.equals(clave) && compId.equals(idCedula) && !compClave.equals("") && !compId.equals("")){
                validacion=true;
            }else{
                validacion=false;
            }
                
            }catch(Exception ex){
                System.out.println("Error en la clase Usuarios."+ex.getMessage());
            }
            finally{
                
                try{
                conexion.getCon().close();
                    System.out.println("Se cerro la conexión");
                }catch(Exception ex){
         
                }//FIN CATCH
     
            }//FIN FINALLY
            
            return validacion;
        }
        
        /*public void ConsultaBD(){
            String nombre="";
            String correo="";
            String estrato="";
            
            BDConexion conexion = new BDConexion();
            
            try{
            
            Connection conection = conexion.getCon();
            Statement st = conection.createStatement();
                
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_usuarios WHERE id_cedula ='"+idCedula+"'");
            
                while(rs.next()){
                setNombre(rs.getString("nombre"));
                correo = rs.getString("correo");
                estrato= rs.getString("estrato");
                }
                
                
                setNombre(correo);
                setNombre(estrato);
                
                System.out.println("Se tomo el nombre");
                
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            finally{
                
                try{
                conexion.getCon().close();
                    System.out.println("Se cerro la conexión");
                }catch(Exception ex){
         
                }//FIN CATCH
     
            }//FIN FINALLY
        }*/
        
}
    
    
    /*public static void tomarDatos(String id_cedula) throws SQLException{
        try{
        Conexion_base_datos conexion = new Conexion_base_datos();
            Connection conection = conexion.Conexion_base_datos();
            Statement st = conection.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_usuarios WHERE id_cedula ='"+id_cedula+"'");
            
            while(rs.next()){
            nombre = rs.getString("nombre");
            clave = rs.getString("clave");
            correo = rs.getString("correo");
            pregunta_seguridad = rs.getString("pregunta_seguridad");
            estrato = rs.getString("estrato");
            tel_cel = rs.getString("tel_cel");
            direccion = rs.getString("direccion");
            estado = rs.getString("estado");
            tipo_usuario = rs.getString("tipo_usuario");
            }
            
        }catch(Exception ex){
            System.out.println("Error en la linea:   ");
        }
    }*/
    
