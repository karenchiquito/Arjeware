/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.models.entity.Entidades;

import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Tiempo;

/**
 *
 * @author Sebas
 */
public class ValorTarifas {
    public static int Consecutivo=0,ConsecutivoAgua=0,ConsecutivoEnergia=0,ConsecutivoGas=0,ConsecutivoAlcantarillado=0;
    
    public static String ano="0", mes="0", estrato="0",consecutivo="0",
        valorServicio="0", valor_cargoFijo="0",valor_exceso="0",subsidio="0",servicio="0",medidaLimite="0",vigente="0";
    
    public static String valorServicioAgua="0", valor_cargoFijoAgua="0",valor_excesoAgua="0",
        subsidioAgua="0",servicioAgua="0",medidaLimiteAgua="0",vigenteAgua="0",valorAlcantarillado="0",valorAcueducto="0";
    
    public static String valorServicioAlcantarillado="0", valor_cargoFijoAlcantarillado="0"
        ,valor_excesoAlcantarillado="0",subsidioAlcantarillado="0",servicioAlcantarillado="0"
        ,medidaLimiteAlcantarillado="0",vigenteAlcantarillado="0";
    
    public static String valorServicioEnergia="", valor_cargoFijoEnergia="",valor_excesoEnergia="",
        subsidioEnergia="",servicioEnergia="",medidaLimiteEnergia="",vigenteEnergia="";
    
    public static String valorServicioGas="", valor_cargoFijoGas="",valor_excesoGas="",
        subsidioGas="",servicioGas="",medidaLimiteGas="",vigenteGas="";

    public ValorTarifas() {
        
    }
    
    
    
    public static String getValorAcueducto() {
        return valorAcueducto;
    }

    public static void setValorAcueducto(String valorAcueducto) {
        ValorTarifas.valorAcueducto = valorAcueducto;
    }
    
    public static String getValorAlcantarillado() {
        return valorAlcantarillado;
    }

    public static void setValorAlcantarillado(String valorAlcantarillado) {
        ValorTarifas.valorAlcantarillado = valorAlcantarillado;
    }
    
    public static int getConsecutivo() {
        return ConsecutivoAlcantarillado;
    }

    public static void setConsecutivoAlcantarillado(int ConsecutivoAlcantarillado) {
        ValorTarifas.ConsecutivoAlcantarillado = ConsecutivoAlcantarillado;
    }        
            
    public static int ConsecutivoAlcantarillado() {
        return Consecutivo;
    }

    public static void setConsecutivo(int Consecutivo) {
        ValorTarifas.Consecutivo = Consecutivo;
    }
    
    public static int getConsecutivoAgua() {
        return ConsecutivoAgua;
    }

    public static void setConsecutivoAgua(int ConsecutivoAgua) {
        ValorTarifas.ConsecutivoAgua = ConsecutivoAgua;
    }
    
    public static int getConsecutivoEnergia() {
        return ConsecutivoEnergia;
    }

    public static void setConsecutivoEnergia(int ConsecutivoEnergia) {
        ValorTarifas.ConsecutivoEnergia = ConsecutivoEnergia;
    }
    
    public static int getConsecutivoGas() {
        return ConsecutivoGas;
    }

    public static void setConsecutivoGas(int ConsecutivoGas) {
        ValorTarifas.ConsecutivoGas = ConsecutivoGas;
    }

    public static String getAno() {
        return ano;
    }

    public static void setAno(String ano) {
        ValorTarifas.ano = ano;
    }

    public static String getMes() {
        return mes;
    }

    public static void setMes(String mes) {
        ValorTarifas.mes = mes;
    }

    public static String getEstrato() {
        return estrato;
    }

    public static void setEstrato(String estrato) {
        ValorTarifas.estrato = estrato;
    }

    public static String getValorServicio() {
        return valorServicio;
    }

    public static void setValorServicio(String valorServicio) {
        ValorTarifas.valorServicio = valorServicio;
    }

    public static String getValor_cargoFijo() {
        return valor_cargoFijo;
    }

    public static void setValor_cargoFijo(String valor_cargoFijo) {
        ValorTarifas.valor_cargoFijo = valor_cargoFijo;
    }

    public static String getValor_exceso() {
        return valor_exceso;
    }

    public static void setValor_exceso(String valor_exceso) {
        ValorTarifas.valor_exceso = valor_exceso;
    }

    public static String getSubsidio() {
        return subsidio;
    }

    public static void setSubsidio(String subsidio) {
        ValorTarifas.subsidio = subsidio;
    }

    public static String getServicio() {
        return servicio;
    }

    public static void setServicio(String servicio) {
        ValorTarifas.servicio = servicio;
    }

    public static String getMedidaLimite() {
        return medidaLimite;
    }

    public static void setMedidaLimite(String medidaLimite) {
        ValorTarifas.medidaLimite = medidaLimite;
    }

    public static String getVigente() {
        return vigente;
    }

    public static void setVigente(String vigente) {
        ValorTarifas.vigente = vigente;
    }

    public static String getValorServicioAgua() {
        return valorServicioAgua;
    }

    public static void setValorServicioAgua(String valorServicioAgua) {
        ValorTarifas.valorServicioAgua = valorServicioAgua;
    }

    public static String getValor_cargoFijoAgua() {
        return valor_cargoFijoAgua;
    }

    public static void setValor_cargoFijoAgua(String valor_cargoFijoAgua) {
        ValorTarifas.valor_cargoFijoAgua = valor_cargoFijoAgua;
    }

    public static String getValor_excesoAgua() {
        return valor_excesoAgua;
    }

    public static void setValor_excesoAgua(String valor_excesoAgua) {
        ValorTarifas.valor_excesoAgua = valor_excesoAgua;
    }

    public static String getSubsidioAgua() {
        return subsidioAgua;
    }

    public static void setSubsidioAgua(String subsidioAgua) {
        ValorTarifas.subsidioAgua = subsidioAgua;
    }

    public static String getServicioAgua() {
        return servicioAgua;
    }

    public static void setServicioAgua(String servicioAgua) {
        ValorTarifas.servicioAgua = servicioAgua;
    }

    public static String getMedidaLimiteAgua() {
        return medidaLimiteAgua;
    }

    public static void setMedidaLimiteAgua(String medidaLimiteAgua) {
        ValorTarifas.medidaLimiteAgua = medidaLimiteAgua;
    }

    public static String getVigenteAgua() {
        return vigenteAgua;
    }

    public static void setVigenteAgua(String vigenteAgua) {
        ValorTarifas.vigenteAgua = vigenteAgua;
    }

    public static String getValorServicioEnergia() {
        return valorServicioEnergia;
    }

    public static void setValorServicioEnergia(String valorServicioEnergia) {
        ValorTarifas.valorServicioEnergia = valorServicioEnergia;
    }

    public static String getValor_cargoFijoEnergia() {
        return valor_cargoFijoEnergia;
    }

    public static void setValor_cargoFijoEnergia(String valor_cargoFijoEnergia) {
        ValorTarifas.valor_cargoFijoEnergia = valor_cargoFijoEnergia;
    }

    public static String getValor_excesoEnergia() {
        return valor_excesoEnergia;
    }

    public static void setValor_excesoEnergia(String valor_excesoEnergia) {
        ValorTarifas.valor_excesoEnergia = valor_excesoEnergia;
    }

    public static String getSubsidioEnergia() {
        return subsidioEnergia;
    }

    public static void setSubsidioEnergia(String subsidioEnergia) {
        ValorTarifas.subsidioEnergia = subsidioEnergia;
    }

    public static String getServicioEnergia() {
        return servicioEnergia;
    }

    public static void setServicioEnergia(String servicioEnergia) {
        ValorTarifas.servicioEnergia = servicioEnergia;
    }

    public static String getMedidaLimiteEnergia() {
        return medidaLimiteEnergia;
    }

    public static void setMedidaLimiteEnergia(String medidaLimiteEnergia) {
        ValorTarifas.medidaLimiteEnergia = medidaLimiteEnergia;
    }

    public static String getVigenteEnergia() {
        return vigenteEnergia;
    }

    public static void setVigenteEnergia(String vigenteEnergia) {
        ValorTarifas.vigenteEnergia = vigenteEnergia;
    }

    public static String getValorServicioGas() {
        return valorServicioGas;
    }

    public static void setValorServicioGas(String valorServicioGas) {
        ValorTarifas.valorServicioGas = valorServicioGas;
    }

    public static String getValor_cargoFijoGas() {
        return valor_cargoFijoGas;
    }

    public static void setValor_cargoFijoGas(String valor_cargoFijoGas) {
        ValorTarifas.valor_cargoFijoGas = valor_cargoFijoGas;
    }

    public static String getValor_excesoGas() {
        return valor_excesoGas;
    }

    public static void setValor_excesoGas(String valor_excesoGas) {
        ValorTarifas.valor_excesoGas = valor_excesoGas;
    }

    public static String getSubsidioGas() {
        return subsidioGas;
    }

    public static void setSubsidioGas(String subsidioGas) {
        ValorTarifas.subsidioGas = subsidioGas;
    }

    public static String getServicioGas() {
        return servicioGas;
    }

    public static void setServicioGas(String servicioGas) {
        ValorTarifas.servicioGas = servicioGas;
    }

    public static String getMedidaLimiteGas() {
        return medidaLimiteGas;
    }

    public static void setMedidaLimiteGas(String medidaLimiteGas) {
        ValorTarifas.medidaLimiteGas = medidaLimiteGas;
    }

    public static String getVigenteGas() {
        return vigenteGas;
    }

    public static void setVigenteGas(String vigenteGas) {
        ValorTarifas.vigenteGas = vigenteGas;
    }
    
    public static String getValorServicioAlcantarillado() {
        return valorServicioAlcantarillado;
    }

    public static void setValorServicioAlcantarillado(String valorServicioAlcantarillado) {
        ValorTarifas.valorServicioAlcantarillado = valorServicioAlcantarillado;
    }

    public static String getValor_cargoFijoAlcantarillado() {
        return valor_cargoFijoAlcantarillado;
    }

    public static void setValor_cargoFijoAlcantarillado(String valor_cargoFijoAlcantarillado) {
        ValorTarifas.valor_cargoFijoAlcantarillado = valor_cargoFijoAlcantarillado;
    }

    public static String getValor_excesoAlcantarillado() {
        return valor_excesoAlcantarillado;
    }

    public static void setValor_excesoAlcantarillado(String valor_excesoAlcantarillado) {
        ValorTarifas.valor_excesoAlcantarillado = valor_excesoAlcantarillado;
    }

    public static String getSubsidioAlcantarillado() {
        return subsidioAlcantarillado;
    }

    public static void setSubsidioAlcantarillado(String subsidioAlcantarillado) {
        ValorTarifas.subsidioAlcantarillado = subsidioAlcantarillado;
    }

    public static String getServicioAlcantarillado() {
        return servicioAlcantarillado;
    }

    public static void setServicioAlcantarillado(String servicioAlcantarillado) {
        ValorTarifas.servicioAlcantarillado = servicioAlcantarillado;
    }

    public static String getMedidaLimiteAlcantarillado() {
        return medidaLimiteAlcantarillado;
    }

    public static void setMedidaLimiteAlcantarillado(String medidaLimiteAlcantarillado) {
        ValorTarifas.medidaLimiteAlcantarillado = medidaLimiteAlcantarillado;
    }

    public static String getVigenteAlcantarillado() {
        return vigenteAlcantarillado;
    }

    public static void setVigenteAlcantarillado(String vigenteAlcantarillado) {
        ValorTarifas.vigenteAlcantarillado = vigenteAlcantarillado;
    }
    
}
