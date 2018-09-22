/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.entity.Entidades;

/**
 *
 * @author Sebas
 */
public class Sesion {
    private static String idCedula="",nombre="",apellido="",clave="",correo="",ciudad="",
         empresaPS="",estrato="",telCel="",direccion="",estado="",tipoUsuario=""
         ,tipoPropiedad="",nivelResidencia="";
       
    //GETER----------

    public static String getIdCedula() {
        return idCedula;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getApellido() {
        return apellido;
    }
    
    public static String getClave() {
        return clave;
    }

    public static String getCorreo() {
        return correo;
    }

    public static String getCiudad() {
        return ciudad;
    }

    public static String getEmpresaPS() {
        return empresaPS;
    }

    

    public static String getEstrato() {
        return estrato;
    }

    public static String getTelCel() {
        return telCel;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static String getEstado() {
        return estado;
    }

    public static String getTipoUsuario() {
        return tipoUsuario;
    }

    public static String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public static String getNivelResidencia() {
        return nivelResidencia;
    }
    
    
       
    //SETER-----------------

    public static void setIdCedula(String idCedula) {
        Sesion.idCedula = idCedula;
    }

    public static void setNombre(String nombre) {
        Sesion.nombre = nombre;
    }

    public static void setApellido(String apellido) {
        Sesion.apellido = apellido;
    }

    public static void setClave(String clave) {
        Sesion.clave = clave;
    }

    public static void setCorreo(String correo) {
        Sesion.correo = correo;
    }

    public static void setCiudad(String ciudad) {
        Sesion.ciudad = ciudad;
    }

    public static void setEmpresaPS(String empresaPS) {
        Sesion.empresaPS = empresaPS;
    }

    

    public static void setEstrato(String estrato) {
        Sesion.estrato = estrato;
    }

    public static void setTelCel(String telCel) {
        Sesion.telCel = telCel;
    }

    public static void setDireccion(String direccion) {
        Sesion.direccion = direccion;
    }

    public static void setEstado(String estado) {
        Sesion.estado = estado;
    }

    public static void setTipoUsuario(String tipoUsuario) {
        Sesion.tipoUsuario = tipoUsuario;
    }

    public static void setTipoPropiedad(String tipoPropiedad) {
        Sesion.tipoPropiedad = tipoPropiedad;
    }

    public static void setNivelResidencia(String nivelResidencia) {
        Sesion.nivelResidencia = nivelResidencia;
    }
    
    
}
