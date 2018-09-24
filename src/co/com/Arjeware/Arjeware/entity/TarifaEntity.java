
package co.com.Arjeware.Arjeware.entity;


public class TarifaEntity {
    private int idTarifa; /*Primary Key (Clave primaria) No se repite por nada*/
    private int idEstatro;/*Forany Key (Clave foranea) Clave de otra tabla*/
    private int idCiudad;
    private String mes;

    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public int getIdEstatro() {
        return idEstatro;
    }

    public void setIdEstatro(int idEstatro) {
        this.idEstatro = idEstatro;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
}
