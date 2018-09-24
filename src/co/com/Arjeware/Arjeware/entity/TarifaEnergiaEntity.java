/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.entity;

/**
 *
 * @author Sebas
 */
public class TarifaEnergiaEntity {
    public int idTarifaEnergia;/*Tamaño BD: 15*/
    public int idTarifa;
    public int idMunicipio;/*Tamaño BD: 4*/
    public int idEstrato;/*Tamaño BD: 4*/
    public String ano;/*Tamaño BD: 4*/
    public String mes;/*Tamaño BD: 2*/
    public double subsidio;/*Tamaño BD: (5,2)*/
    public double costoCompra;/*Tamaño BD: (8,2)*/
    public double cargoTransporte_STN;/*Tamaño BD: (8,2)*/
    public double cargoTransporte_SDL;/*Tamaño BD: (8,2)*/
    public double margenComercializacion;/*Tamaño BD: (8,2)*/
    public double costro_G_T_perdidas;/*Tamaño BD: (8,2)*/
    public double restricciones;/*Tamaño BD: (8,2)*/
    public double limiteMasMil;/*Tamaño BD: (8,2)*/
    public double limiteMenosMil;/*Tamaño BD: (8,2)*/
    public String tipoPropiedad;/*Tamaño BD: 20*/
    public int nivelResidencia;/*Tamaño BD: 1*/
    public String puntaOFuera;/*Tamaño BD: 15*/
    public double cfm;/*Tamaño BD: (8,2)*/
    public double monomio;/*Tamaño BD: (8,2)*/
    public double otroSubsidio;/*Tamaño BD: (8,2)*/
    public double otroCostoMas;/*Tamaño BD: (8,2)*/
    public String vigente;/*Char Tamaño BD: 1*/

    public int getIdTarifaEnergia() {
        return idTarifaEnergia;
    }

    public void setIdTarifaEnergia(int idTarifaEnergia) {
        this.idTarifaEnergia = idTarifaEnergia;
    }

    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public int getIdEstrato() {
        return idEstrato;
    }

    public void setIdEstrato(int idEstrato) {
        this.idEstrato = idEstrato;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(double subsidio) {
        this.subsidio = subsidio;
    }

    public double getCostoCompra() {
        return costoCompra;
    }

    public void setCostoCompra(double costoCompra) {
        this.costoCompra = costoCompra;
    }

    public double getCargoTransporte_STN() {
        return cargoTransporte_STN;
    }

    public void setCargoTransporte_STN(double cargoTransporte_STN) {
        this.cargoTransporte_STN = cargoTransporte_STN;
    }

    public double getCargoTransporte_SDL() {
        return cargoTransporte_SDL;
    }

    public void setCargoTransporte_SDL(double cargoTransporte_SDL) {
        this.cargoTransporte_SDL = cargoTransporte_SDL;
    }

    public double getMargenComercializacion() {
        return margenComercializacion;
    }

    public void setMargenComercializacion(double margenComercializacion) {
        this.margenComercializacion = margenComercializacion;
    }

    public double getCostro_G_T_perdidas() {
        return costro_G_T_perdidas;
    }

    public void setCostro_G_T_perdidas(double costro_G_T_perdidas) {
        this.costro_G_T_perdidas = costro_G_T_perdidas;
    }

    public double getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(double restricciones) {
        this.restricciones = restricciones;
    }

    public double getLimiteMasMil() {
        return limiteMasMil;
    }

    public void setLimiteMasMil(double limiteMasMil) {
        this.limiteMasMil = limiteMasMil;
    }

    public double getLimiteMenosMil() {
        return limiteMenosMil;
    }

    public void setLimiteMenosMil(double limiteMenosMil) {
        this.limiteMenosMil = limiteMenosMil;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public int getNivelResidencia() {
        return nivelResidencia;
    }

    public void setNivelResidencia(int nivelResidencia) {
        this.nivelResidencia = nivelResidencia;
    }

    public String getPuntaOFuera() {
        return puntaOFuera;
    }

    public void setPuntaOFuera(String puntaOFuera) {
        this.puntaOFuera = puntaOFuera;
    }

    public double getCfm() {
        return cfm;
    }

    public void setCfm(double cfm) {
        this.cfm = cfm;
    }

    public double getMonomio() {
        return monomio;
    }

    public void setMonomio(double monomio) {
        this.monomio = monomio;
    }

    public double getOtroSubsidio() {
        return otroSubsidio;
    }

    public void setOtroSubsidio(double otroSubsidio) {
        this.otroSubsidio = otroSubsidio;
    }

    public double getOtroCostoMas() {
        return otroCostoMas;
    }

    public void setOtroCostoMas(double otroCostoMas) {
        this.otroCostoMas = otroCostoMas;
    }

    public String getVigente() {
        return vigente;
    }

    public void setVigente(String vigente) {
        this.vigente = vigente;
    }
    
    
    
}
