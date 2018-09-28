/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.models.entity.Entidades;

/**
 *
 * @author Sebas
 */
public class Consumos {
    private int Consecutivo;
    private String mes,ano,Unidad,Cantidad,id_sensor,id_usuario,fecha_sistema,hora;

    public Consumos(){
        
    }
    
    public Consumos(int Consecutivo, String mes, String ano, String Unidad, String Cantidad, String id_sensor, String id_usuario, String fecha_sistema, String hora) {
        this.Consecutivo = Consecutivo;
        this.mes = mes;
        this.ano = ano;
        this.Unidad = Unidad;
        this.Cantidad = Cantidad;
        this.id_sensor = id_sensor;
        this.id_usuario = id_usuario;
        this.fecha_sistema = fecha_sistema;
        this.hora = hora;
    }

    public int getConsecutivo() {
        return Consecutivo;
    }

    public void setConsecutivo(int Consecutivo) {
        this.Consecutivo = Consecutivo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getId_sensor() {
        return id_sensor;
    }

    public void setId_sensor(String id_sensor) {
        this.id_sensor = id_sensor;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getFecha_sistema() {
        return fecha_sistema;
    }

    public void setFecha_sistema(String fecha_sistema) {
        this.fecha_sistema = fecha_sistema;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
