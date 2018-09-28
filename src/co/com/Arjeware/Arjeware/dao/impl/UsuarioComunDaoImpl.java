/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.dao.impl;

import co.com.Arjeware.Arjeware.dao.UsuarioDAO;
import co.com.Arjeware.Arjeware.dao.sql.UsuarioSQL;
import co.com.Arjeware.Arjeware.models.entity.UsuarioEntity;
import co.com.Arjeware.Arjeware.presentacion.interfaceGrafica.BDConexion;
import co.com.Arjeware.Arjeware.sql.Sql_help;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Sebas
 */
public class UsuarioComunDaoImpl implements UsuarioDAO {
    /*idUsuario,idTipoUsuario;nombre;apellido;clave;idTipoDocumento;numeroDocumento;
            idCiudad;idEmpresaPS;idEstrato;idTipoPropiedad;idNivelResidencial;
            correo;direccion;telefonoResidencial;telefonoCelular;estado;*/

    @Override
    public boolean registrarUsuario(UsuarioEntity u) {
        boolean validacion = false;
        BDConexion c = new BDConexion();
        String resultado = "";
        try (Connection con = c.getCon();
                PreparedStatement pst = c.getCon().prepareStatement("INSERT INTO `usuarios` "
                        + "(`idUsuario`, `idTipoUsuario`, `nombre`, `apellido`, `clave`, "
                        + "`idTipoDocumento`, `numeroDocumento`, `idCiudad`, "
                        + "`idEmpresaPS`, `idEstrato`, `idTipoPropiedad`, `idNivelResidencial`, "
                        + "`monoBino`, `correo`, `direccion`, `telefono`, `celular`, `estado`) "
                        + " VALUES ('?', '?', '?', '?', '?', '?', '?', '?', '?', '?', "
                        + "'?', '?', '?', '?', '?', '?', '?', '?')");) {

            pst.setInt(1, u.getIdUsuario());
            pst.setInt(2, u.getIdTipoUsuario());
            pst.setString(3, u.getNombre());
            pst.setString(4, u.getApellido());
            pst.setString(5, u.getClave());
            pst.setInt(6, u.getIdTipoDocumento());
            pst.setString(7, u.getNumeroDocumento());
            pst.setInt(8, u.getIdCiudad());
            pst.setInt(9, u.getIdEmpresaPS());
            pst.setInt(10, u.getIdEstrato());
            pst.setInt(11, u.getIdTipoPropiedad());
            pst.setInt(12, u.getIdNivelResidencial());
            pst.setString(13,u.getMonoBino());
            pst.setString(14, u.getCorreo());
            pst.setString(15, u.getDireccion());
            pst.setString(16, u.getTelefonoResidencial());
            pst.setString(17, u.getTelefonoCelular());
            pst.setString(18, u.getEstado());
            pst.execute();

            if (pst.getUpdateCount() >= 1) {
                resultado = "Usuario Almacenado";
                System.out.println(resultado);
                validacion = true;
            } else {
                resultado = "Error al guardar";
                System.out.println(resultado);
                validacion = false;
            }

        } catch (Exception ex) {

            resultado += "Error en clase: Dao\n" + "Tipo de error:\n" + "Tonto el que lo lea: " + ex.getMessage();
            System.out.println(resultado);
        }
        return validacion;
    }

}
