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
public class ValorTarifa_Energia {
    public static int Consecutivo=0;
    public static String ano="0",mes="0",estrato="0";
    public static double subsidio=0,costoCompra=0,cargoTransporte_STN=0,cargoTransporte_SDL,
        margenComercializacion=0,costo_G_T_perdidas=0,restricciones=0,
        limiteMasMil=0,limiteMenosMil=0;
    public static String tipoPropiedad="0";
    public static int nivelResidencia=0;
    public static String puntaOFuera="";
    public static double cfm=0,monomio=0,otroSubsidio=0,otroCostoMas=0;
    public static String vigente="";
    
    public ValorTarifa_Energia(){
        
    }//FIN CONSTRUCTOR

    public static int getConsecutivo() {
        return Consecutivo;
    }

    public static void setConsecutivo(int Consecutivo) {
        ValorTarifa_Energia.Consecutivo = Consecutivo;
    }

    public static String getAno() {
        return ano;
    }

    public static void setAno(String ano) {
        ValorTarifa_Energia.ano = ano;
    }

    public static String getMes() {
        return mes;
    }

    public static void setMes(String mes) {
        ValorTarifa_Energia.mes = mes;
    }

    public static String getEstrato() {
        return estrato;
    }

    public static void setEstrato(String estrato) {
        ValorTarifa_Energia.estrato = estrato;
    }

    public static double getSubsidio() {
        return subsidio;
    }

    public static void setSubsidio(double subsidio) {
        ValorTarifa_Energia.subsidio = subsidio;
    }

    public static double getCostoCompra() {
        return costoCompra;
    }

    public static void setCostoCompra(double costoCompra) {
        ValorTarifa_Energia.costoCompra = costoCompra;
    }

    public static double getCargoTransporte_STN() {
        return cargoTransporte_STN;
    }

    public static void setCargoTransporte_STN(double cargoTransporte_STN) {
        ValorTarifa_Energia.cargoTransporte_STN = cargoTransporte_STN;
    }

    public static double getCargoTransporte_SDL() {
        return cargoTransporte_SDL;
    }

    public static void setCargoTransporte_SDL(double cargoTransporte_SDL) {
        ValorTarifa_Energia.cargoTransporte_SDL = cargoTransporte_SDL;
    }

    public static double getMargenComercializacion() {
        return margenComercializacion;
    }

    public static void setMargenComercializacion(double margenComercializacion) {
        ValorTarifa_Energia.margenComercializacion = margenComercializacion;
    }

    public static double getCosto_G_T_perdidas() {
        return costo_G_T_perdidas;
    }

    public static void setCosto_G_T_perdidas(double costo_G_T_perdidas) {
        ValorTarifa_Energia.costo_G_T_perdidas = costo_G_T_perdidas;
    }

    public static double getRestricciones() {
        return restricciones;
    }

    public static void setRestricciones(double restricciones) {
        ValorTarifa_Energia.restricciones = restricciones;
    }

    public static double getLimiteMasMil() {
        return limiteMasMil;
    }

    public static void setLimiteMasMil(double limiteMasMill) {
        ValorTarifa_Energia.limiteMasMil = limiteMasMill;
    }

    public static double getLimiteMenosMil() {
        return limiteMenosMil;
    }

    public static void setLimiteMenosMil(double limiteMenisMill) {
        ValorTarifa_Energia.limiteMenosMil = limiteMenisMill;
    }

    public static String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public static void setTipoPropiedad(String tipoPropiedad) {
        ValorTarifa_Energia.tipoPropiedad = tipoPropiedad;
    }

    public static int getNivelResidencia() {
        return nivelResidencia;
    }

    public static void setNivelResidencia(int nivelResidencia) {
        ValorTarifa_Energia.nivelResidencia = nivelResidencia;
    }

    public static String getPuntaOFuera() {
        return puntaOFuera;
    }

    public static void setPuntaOFuera(String puntaOFuera) {
        ValorTarifa_Energia.puntaOFuera = puntaOFuera;
    }

    public static double getCfm() {
        return cfm;
    }

    public static void setCfm(double cfm) {
        ValorTarifa_Energia.cfm = cfm;
    }

    public static double getMonomio() {
        return monomio;
    }

    public static void setMonomio(double monimio) {
        ValorTarifa_Energia.monomio = monimio;
    }

    public static double getOtroSubsidio() {
        return otroSubsidio;
    }

    public static void setOtroSubsidio(double otroSubsidio) {
        ValorTarifa_Energia.otroSubsidio = otroSubsidio;
    }

    public static double getOtroCostoMas() {
        return otroCostoMas;
    }

    public static void setOtroCostoMas(double otroCostoMas) {
        ValorTarifa_Energia.otroCostoMas = otroCostoMas;
    }

    public static String getVigente() {
        return vigente;
    }

    public static void setVigente(String vigente) {
        ValorTarifa_Energia.vigente = vigente;
    }
    
    
    
}//FIN CLASE
