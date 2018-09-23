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
    
}
