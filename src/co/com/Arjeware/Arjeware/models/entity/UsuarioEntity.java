/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.models.entity;

/**
 *
 * @author Sebas
 */
public class UsuarioEntity {
    private int idUsuario;
    private int idTipoUsuario;
    private String nombre;
    private String apellido;
    private String clave;
    private int idTipoDocumento;
    private String numeroDocumento;
    private int idCiudad;
    private int idEmpresaPS;
    private int idEstrato;
    private int idTipoPropiedad;
    private int idNivelResidencial;
    private String monoBino;
    private String correo;
    private String direccion;
    private String telefonoResidencial;
    private String telefonoCelular;
    private String estado;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public int getIdEmpresaPS() {
        return idEmpresaPS;
    }

    public void setIdEmpresaPS(int idEmpresaPS) {
        this.idEmpresaPS = idEmpresaPS;
    }

    public int getIdEstrato() {
        return idEstrato;
    }

    public void setIdEstrato(int idEstrato) {
        this.idEstrato = idEstrato;
    }

    public int getIdTipoPropiedad() {
        return idTipoPropiedad;
    }

    public void setIdTipoPropiedad(int idTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
    }

    public int getIdNivelResidencial() {
        return idNivelResidencial;
    }

    public void setIdNivelResidencial(int idNivelResidencial) {
        this.idNivelResidencial = idNivelResidencial;
    }

    public String getMonoBino() {
        return monoBino;
    }

    public void setMonoBino(String monoBino) {
        this.monoBino = monoBino;
    }
    
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoResidencial() {
        return telefonoResidencial;
    }

    public void setTelefonoResidencial(String telefonoResidencial) {
        this.telefonoResidencial = telefonoResidencial;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
