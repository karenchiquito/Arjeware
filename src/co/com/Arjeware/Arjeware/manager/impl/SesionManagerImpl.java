/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.manager.impl;

import co.com.Arjeware.Arjeware.manager.SesionManager;
import co.com.Arjeware.Arjeware.models.dto.SesionDTO;
import co.com.Arjeware.Arjeware.models.entity.Entidades.Sesion;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.BDConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Sebas
 */
public class SesionManagerImpl implements SesionManager {

    @Override
    public boolean datosDeSesion(String numeroDocumento, String clave) {
        boolean validacion = false;
        String compClave = "";
        String compId = "";

        BDConexion conexion = new BDConexion();

        try (Connection conection = conexion.getCon();
                Statement st = conection.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM usuarios WHERE numeroDocumento ='" + numeroDocumento + "'");) {

            while (rs.next()) {
                compClave = rs.getString("clave");
                compId = rs.getString("numeroDocumento");

                SesionDTO.setIdUsuario(rs.getInt("idUsuario"));
                SesionDTO.setIdTipoUsuario(rs.getInt("idTipoUsuario"));
                SesionDTO.setNombre(rs.getString("nombre"));
                SesionDTO.setApellido(rs.getString("apellido"));
                //SesionDTO.setClave(rs.getString("clave"));
                SesionDTO.setIdTipoDocumento(rs.getInt("idTipoDocumento"));
                //SesionDTO.setEmpresaPS(rs.getString("numeroDocumento"));
                SesionDTO.setIdCiudad(rs.getInt("idCiudad"));
                SesionDTO.setIdEmpresaPS(rs.getInt("idEmpresaPS"));
                SesionDTO.setIdEstrato(rs.getInt("idEstrato"));
                SesionDTO.setIdTipoPropiedad(rs.getInt("idTipoPropiedad"));
                SesionDTO.setIdNivelResidencial(rs.getInt("idNivelResidencial"));
                SesionDTO.setMonoBino(rs.getString("monoBino"));
                SesionDTO.setCorreo(rs.getString("correo"));
                SesionDTO.setDireccion(rs.getString("direccion"));
                SesionDTO.setTelefonoResidencial(rs.getString("telefono"));
                SesionDTO.setTelefonoCelular(rs.getString("celular"));
                SesionDTO.setEstado(rs.getString("estado"));

            }

            if (compClave.equals(clave) && compId.equals(numeroDocumento) && !compClave.equals("") && !compId.equals("")) {
                validacion = true;
            } else {
                validacion = false;
            }

        } catch (Exception ex) {
            System.out.println("Error en la clase Usuarios." + ex.getMessage());
        }
        return validacion;
    }

}
