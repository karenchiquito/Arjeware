/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Entidades.Sesion;
import Entidades.ValorTarifa_Energia;
import Entidades.ValorTarifas;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Calculos {
    public static String tipoServicio="0",ano="0",mes="0",hora="0",vigencia="0";
    
    public static double valorGastoAgua=0,valorExcesoAgua=0,valorSubsidioAgua=0,valorTotalAgua=0,
            valorGastoAlcantarillado=0,valorExcesoAlcantarillado=0,valorSubsidioAlcantarillado=0,valorTotalAlcantarillado=0,
            valorGastoEnergia=0,valorExcesoEnergia=0,valorSubsidioEnergia=0,valorTotalEnergia=0;
    
    public static double registro1=0,registro2=0,consumo=0,consumoExceso=0,consumoTotal=0, totalMes=0;
    
    public static double registro1Agua=0,registro2Agua=0,consumoAgua=0,consumoExcesoAgua=0
        ,consumoTotalAgua=0, totalMesAgua=0;
    
    public static double registro1Energia=0,registro2Energia=0,consumoEnergia=0,consumoExcesoEnergia=0
        ,consumoTotalEnergia=0, totalMesEnergia=0;
    

    /*double[] valor_agua = {710.25, 1065.37, 1553.66, 1775.61, 2663.42, 2840.98, 2663.42, 2308.30, 1775.61};
    double[] Valor_Cargo_fijo_agua = {3426.37, 5139.55, 7495.17, 8565.91, 12848.87, 13705.46, 12848.87, 11135.69, 8565.91};
    double[] Valor_agua_14cm = {1775.61, 1775.61, 1775.61, 1775.61, 2663.42, 2840.98, 2663.42, 2308.30, 1775.61};*/
    //GETTER-------------------------------------------
    public static void setValorTotalAlcantarillado(double valorTotalAlcantarillado) {
        Calculos.valorTotalAlcantarillado = valorTotalAlcantarillado;
    }
    public static double getValorGastoAlcantarillado() {
        return valorGastoAlcantarillado;
    }

    public static void setValorGastoAlcantarillado(double valorGastoAlcantarillado) {
        Calculos.valorGastoAlcantarillado = valorGastoAlcantarillado;
    }

    public static double getValorExcesoAlcantarillado() {
        return valorExcesoAlcantarillado;
    }

    public static void setValorExcesoAlcantarillado(double valorExcesoAlcantarillado) {
        Calculos.valorExcesoAlcantarillado = valorExcesoAlcantarillado;
    }

    public static double getValorSubsidioAlcantarillado() {
        return valorSubsidioAlcantarillado;
    }

    public static void setValorSubsidioAlcantarillado(double valorSubsidioAlcantarillado) {
        Calculos.valorSubsidioAlcantarillado = valorSubsidioAlcantarillado;
    }

    public static double getValorTotalAlcantarillado() {
        return valorTotalAlcantarillado;
    }

    public static String getTipoServicio() {
        return tipoServicio;
    }

    public static void setTipoServicio(String tipoServicio) {
        Calculos.tipoServicio = tipoServicio;
    }

    public static String getAno() {
        return ano;
    }

    public static void setAno(String ano) {
        Calculos.ano = ano;
    }

    public static String getMes() {
        return mes;
    }

    public static void setMes(String mes) {
        Calculos.mes = mes;
    }

    public static String getHora() {
        return hora;
    }

    public static void setHora(String hora) {
        Calculos.hora = hora;
    }

    public static String getVigencia() {
        return vigencia;
    }

    public static void setVigencia(String vigencia) {
        Calculos.vigencia = vigencia;
    }

    public static double getValorGastoAgua() {
        return valorGastoAgua;
    }

    public static void setValorGastoAgua(double valorGastoAgua) {
        Calculos.valorGastoAgua = valorGastoAgua;
    }

    public static double getValorExcesoAgua() {
        return valorExcesoAgua;
    }

    public static void setValorExcesoAgua(double valorExcesoAgua) {
        Calculos.valorExcesoAgua = valorExcesoAgua;
    }

    public static double getValorSubsidioAgua() {
        return valorSubsidioAgua;
    }

    public static void setValorSubsidioAgua(double valorSubsidioAgua) {
        Calculos.valorSubsidioAgua = valorSubsidioAgua;
    }

    public static double getValorTotalAgua() {
        return valorTotalAgua;
    }

    public static void setValorTotalAgua(double valorTotalAgua) {
        Calculos.valorTotalAgua = valorTotalAgua;
    }

    public static double getRegistro1() {
        return registro1;
    }

    public static void setRegistro1(double registro1) {
        Calculos.registro1 = registro1;
    }

    public static double getRegistro2() {
        return registro2;
    }

    public static void setRegistro2(double registro2) {
        Calculos.registro2 = registro2;
    }

    public static double getConsumo() {
        return consumo;
    }

    public static void setConsumo(double consumo) {
        Calculos.consumo = consumo;
    }

    public static double getConsumoExceso() {
        return consumoExceso;
    }

    public static void setConsumoExceso(double consumoExceso) {
        Calculos.consumoExceso = consumoExceso;
    }

    public static double getConsumoTotal() {
        return consumoTotal;
    }

    public static void setConsumoTotal(double consumoTotal) {
        Calculos.consumoTotal = consumoTotal;
    }

    public static double getTotalMes() {
        return totalMes;
    }

    public static void setTotalMes(double totalMes) {
        Calculos.totalMes = totalMes;
    }

    public static double getRegistro1Agua() {
        return registro1Agua;
    }

    public static void setRegistro1Agua(double registro1Agua) {
        Calculos.registro1Agua = registro1Agua;
    }

    public static double getRegistro2Agua() {
        return registro2Agua;
    }

    public static void setRegistro2Agua(double registro2Agua) {
        Calculos.registro2Agua = registro2Agua;
    }

    public static double getConsumoAgua() {
        return consumoAgua;
    }

    public static void setConsumoAgua(double consumoAgua) {
        Calculos.consumoAgua = consumoAgua;
    }

    public static double getConsumoExcesoAgua() {
        return consumoExcesoAgua;
    }

    public static void setConsumoExcesoAgua(double consumoExcesoAgua) {
        Calculos.consumoExcesoAgua = consumoExcesoAgua;
    }

    public static double getConsumoTotalAgua() {
        return consumoTotalAgua;
    }

    public static void setConsumoTotalAgua(double consumoTotalAgua) {
        Calculos.consumoTotalAgua = consumoTotalAgua;
    }

    public static double getTotalMesAgua() {
        return totalMesAgua;
    }

    public static void setTotalMesAgua(double totalMesAgua) {
        Calculos.totalMesAgua = totalMesAgua;
    }

    public static double getValorGastoEnergia() {
        return valorGastoEnergia;
    }

    public static void setValorGastoEnergia(double valorGastoEnergia) {
        Calculos.valorGastoEnergia = valorGastoEnergia;
    }

    public static double getValorExcesoEnergia() {
        return valorExcesoEnergia;
    }

    public static void setValorExcesoEnergia(double valorExcesoEnergia) {
        Calculos.valorExcesoEnergia = valorExcesoEnergia;
    }

    public static double getValorSubsidioEnergia() {
        return valorSubsidioEnergia;
    }

    public static void setValorSubsidioEnergia(double valorSubsidioEnergia) {
        Calculos.valorSubsidioEnergia = valorSubsidioEnergia;
    }

    public static double getValorTotalEnergia() {
        return valorTotalEnergia;
    }

    public static void setValorTotalEnergia(double valorTotalEnergia) {
        Calculos.valorTotalEnergia = valorTotalEnergia;
    }

    public static double getRegistro1Energia() {
        return registro1Energia;
    }

    public static void setRegistro1Energia(double registro1Energia) {
        Calculos.registro1Energia = registro1Energia;
    }

    public static double getRegistro2Energia() {
        return registro2Energia;
    }

    public static void setRegistro2Energia(double registro2Energia) {
        Calculos.registro2Energia = registro2Energia;
    }

    public static double getConsumoEnergia() {
        return consumoEnergia;
    }

    public static void setConsumoEnergia(double consumoEnergia) {
        Calculos.consumoEnergia = consumoEnergia;
    }

    public static double getConsumoExcesoEnergia() {
        return consumoExcesoEnergia;
    }

    public static void setConsumoExcesoEnergia(double consumoExcesoEnergia) {
        Calculos.consumoExcesoEnergia = consumoExcesoEnergia;
    }

    public static double getConsumoTotalEnergia() {
        return consumoTotalEnergia;
    }

    public static void setConsumoTotalEnergia(double consumoTotalEnergia) {
        Calculos.consumoTotalEnergia = consumoTotalEnergia;
    }

    public static double getTotalMesEnergia() {
        return totalMesEnergia;
    }

    public static void setTotalMesEnergia(double totalMesEnergia) {
        Calculos.totalMesEnergia = totalMesEnergia;
    }

   

    
    
    //METODOS--------------------------------
    
    public void calcularConsumo(String servicio){
        if(servicio.equals("Agua")){
            if(getRegistro1Agua()>getRegistro2Agua()){
                JOptionPane.showMessageDialog(null, "El registro 1 no puede ser mayor al registro 2.");
            }else{
                setConsumoAgua(registro2Agua-registro1Agua);
            }
        }
        if(servicio.equals("Alcantarillado")){
            if(getRegistro1Agua()>getRegistro2Agua()){
                JOptionPane.showMessageDialog(null, "El registro 1 no puede ser mayor al registro 2.");
            }else{
                setConsumoAgua(registro2Agua-registro1Agua);
            }
        }
        if(servicio.equals("Energía")){
            if(getRegistro1Energia()>getRegistro2Energia()){
                JOptionPane.showMessageDialog(null, "El registro 1 no puede ser mayor al registro 2.");
            }
            else{
                setConsumoEnergia(registro2Energia-registro1Energia);
            }
        }
    }
    
    public void calcularPagar(String servicio){
        try{
        if(servicio.equals("Agua")){
            if (getConsumoAgua() > Double.parseDouble(ValorTarifas.getMedidaLimiteAgua())) {
                valorGastoAgua = (Double.parseDouble(ValorTarifas
                    .getMedidaLimiteAgua())*Double.parseDouble(ValorTarifas.getValorServicioAgua()));
                
                valorExcesoAlcantarillado=((consumoAgua - Double.parseDouble(ValorTarifas
                    .getMedidaLimiteAlcantarillado()))*Double.parseDouble(ValorTarifas.getValor_excesoAlcantarillado()));
                
                valorExcesoAgua=((consumoAgua - Double.parseDouble(ValorTarifas
                    .getMedidaLimiteAgua()))*Double.parseDouble(ValorTarifas.getValor_excesoAgua())); // getExceso es el coste de exceso propuesto por la empresa prestadora del servicio
                
                valorSubsidioAgua=((valorGastoAgua+Double.parseDouble(ValorTarifas.getValor_cargoFijoAgua()))*Double.parseDouble(ValorTarifas.getSubsidioAgua())); // getSubsidio es el valor que tiene el subsidio fijado por la empresa prestadora de salud
                
                valorTotalAgua =(((valorGastoAgua+Double.parseDouble(ValorTarifas.getValor_cargoFijoAgua())
                    +valorExcesoAgua)-valorSubsidioAgua));

                setConsumoExcesoAgua(getConsumoAgua()-Double.parseDouble(ValorTarifas.getMedidaLimiteAgua()));//DAMOS El valor al consumo de exceso
                
                setConsumoAgua(Double.parseDouble(ValorTarifas.getMedidaLimiteAgua()));
                
                setConsumoTotalAgua(getConsumoAgua()+getConsumoExcesoAgua());
                //Se devuelve el consumo a 14 ya que aplica
                
                //_----------------------Alcantarillado
                
                valorGastoAlcantarillado = (Double.parseDouble(ValorTarifas
                    .getMedidaLimiteAlcantarillado())*Double.parseDouble(ValorTarifas.getValorServicioAlcantarillado()));

                // getExceso es el coste de exceso propuesto por la empresa prestadora del servicio
                
                valorSubsidioAlcantarillado=((valorGastoAlcantarillado
                    +Double.parseDouble(ValorTarifas.getValor_cargoFijoAlcantarillado()))
                     *Double.parseDouble(ValorTarifas.getSubsidioAlcantarillado())); // getSubsidio es el valor que tiene el subsidio fijado por la empresa prestadora de salud
                
                valorTotalAlcantarillado =(((valorGastoAlcantarillado+Double.parseDouble(ValorTarifas.getValor_cargoFijoAlcantarillado())
                    +valorExcesoAlcantarillado)-valorSubsidioAlcantarillado));
                
            }else{
                valorGastoAgua=(consumoAgua*Double.parseDouble(ValorTarifas.getValorServicioAgua()));
                
                valorSubsidioAgua=((valorGastoAgua+Double.parseDouble(ValorTarifas.getValor_cargoFijoAgua()))
                    *Double.parseDouble(ValorTarifas.getSubsidioAgua())); // getSubsidio es el valor que tiene el subsidio fijado por la empresa prestadora de salud
                
                valorExcesoAgua=0;
                
                valorTotalAgua=((valorGastoAgua+Double.parseDouble(ValorTarifas.getValor_cargoFijoAgua()))
                    -valorSubsidioAgua);
                //_------------------------ Alcantarillado
                valorGastoAlcantarillado=(consumoAgua*Double.parseDouble(ValorTarifas.getValorServicioAgua()));
                
                valorSubsidioAlcantarillado=((valorGastoAlcantarillado
                    +Double.parseDouble(ValorTarifas.getValor_cargoFijoAlcantarillado()))
                    *Double.parseDouble(ValorTarifas.getSubsidioAlcantarillado())); // getSubsidio es el valor que tiene el subsidio fijado por la empresa prestadora de salud
                
                valorExcesoAlcantarillado=0;
                
                valorTotalAlcantarillado=((valorGastoAlcantarillado+Double.parseDouble(ValorTarifas.getValor_cargoFijoAlcantarillado()))
                    -valorSubsidioAlcantarillado);

                setConsumoExcesoAgua(0);//DAMOS El valor al consumo de exceso
                setConsumoAgua(Double.parseDouble(ValorTarifas.getMedidaLimiteAgua()));
                
                setConsumoTotalAgua(getConsumoAgua());
            }

            totalMesAgua+=valorTotalAgua;
        
        }//Fin if agua
        
        if(servicio.equals("Alcantarillado")){
            if (getConsumoAgua() > Double.parseDouble(ValorTarifas.getMedidaLimiteAgua())) {
                
                valorGastoAlcantarillado = (Double.parseDouble(ValorTarifas
                    .getMedidaLimiteAlcantarillado())*Double.parseDouble(ValorTarifas.getValorServicioAlcantarillado()));

                // getExceso es el coste de exceso propuesto por la empresa prestadora del servicio
                
                valorSubsidioAlcantarillado=((valorGastoAlcantarillado
                    +Double.parseDouble(ValorTarifas.getValor_cargoFijoAlcantarillado()))
                     *Double.parseDouble(ValorTarifas.getSubsidioAlcantarillado())); // getSubsidio es el valor que tiene el subsidio fijado por la empresa prestadora de salud
                
                valorTotalAlcantarillado =(((valorGastoAlcantarillado+Double.parseDouble(ValorTarifas.getValor_cargoFijoAlcantarillado())
                    +valorExcesoAlcantarillado)-valorSubsidioAlcantarillado));
                
                valorTotalAlcantarillado =(((valorGastoAgua+Double.parseDouble(ValorTarifas.getValor_cargoFijoAlcantarillado())
                    +valorExcesoAlcantarillado)-valorSubsidioAlcantarillado));

                setConsumoExcesoAgua(getConsumoAgua()-Double.parseDouble(ValorTarifas.getMedidaLimiteAgua()));//DAMOS El valor al consumo de exceso
                
                setConsumoAgua(Double.parseDouble(ValorTarifas.getMedidaLimiteAgua()));
                
                setConsumoTotalAgua(getConsumoAgua()+getConsumoExcesoAgua());
                //Se devuelve el consumo a 14 ya que aplica
                
                //_----------------------Alcantarillado

                
            }else{
                valorGastoAlcantarillado=(consumoAgua*Double.parseDouble(ValorTarifas.getValorServicioAgua()));
                
                valorSubsidioAlcantarillado=((valorGastoAlcantarillado
                    +Double.parseDouble(ValorTarifas.getValor_cargoFijoAlcantarillado()))
                    *Double.parseDouble(ValorTarifas.getSubsidioAlcantarillado())); // getSubsidio es el valor que tiene el subsidio fijado por la empresa prestadora de salud
                
                valorExcesoAlcantarillado=0;
                
                valorTotalAlcantarillado=((valorGastoAlcantarillado+Double.parseDouble(ValorTarifas.getValor_cargoFijoAlcantarillado()))
                    -valorSubsidioAlcantarillado);
                //_------------------------ Alcantarillado


                setConsumoExcesoAgua(0);//DAMOS El valor al consumo de exceso
                setConsumoAgua(Double.parseDouble(ValorTarifas.getMedidaLimiteAgua()));
                
                setConsumoTotalAgua(getConsumoAgua());
            }

            totalMesAgua+=valorTotalAgua;
        
        }//Fin if ALCANTARIILLADO
        
        if(servicio.equals("Energía")){
            if (getConsumoEnergia() > Double.parseDouble(ValorTarifas.getMedidaLimiteEnergia())) {
                
                valorGastoEnergia = (Double.parseDouble(ValorTarifas
                    .getMedidaLimiteEnergia())*Double.parseDouble(ValorTarifas.getValorServicioEnergia()));
                
                valorExcesoEnergia=((consumoEnergia - Double.parseDouble(ValorTarifas
                    .getMedidaLimiteEnergia()))*Double.parseDouble(ValorTarifas.getValor_excesoEnergia())); // getExceso es el coste de exceso propuesto por la empresa prestadora del servicio
                
                valorSubsidioEnergia=((valorGastoEnergia+Double.parseDouble
                    (ValorTarifas.getValor_cargoFijoEnergia()))*
                    Double.parseDouble(ValorTarifas.getSubsidioEnergia())); // getSubsidio es el valor que tiene el subsidio fijado por la empresa prestadora de salud
                
                valorTotalEnergia =(((valorGastoEnergia+Double.parseDouble(ValorTarifas.getValor_cargoFijoEnergia())
                    +valorExcesoEnergia)-valorSubsidioEnergia));

                setConsumoExcesoEnergia(getConsumoEnergia()-Double.parseDouble
                    (ValorTarifas.getMedidaLimiteEnergia()));//DAMOS El valor al consumo de exceso
                
                setConsumoEnergia(Double.parseDouble(ValorTarifas.getMedidaLimiteEnergia()));
                
                setConsumoTotalEnergia(getConsumoEnergia()+getConsumoExcesoEnergia());
            }else{
                valorGastoEnergia=(consumoEnergia*Double.parseDouble(ValorTarifas.getValorServicioEnergia()));
                
                valorSubsidioEnergia =((valorGastoEnergia)
                    *Double.parseDouble(ValorTarifas.getSubsidioEnergia())); // getSubsidio es el valor que tiene el subsidio fijado por la empresa prestadora de salud
                
                valorExcesoEnergia=0;
                
                valorTotalEnergia=(valorGastoEnergia-valorSubsidioEnergia);
                
                setConsumoExcesoEnergia(0);//DAMOS El valor al consumo de exceso
                setConsumoEnergia(getConsumoEnergia());
                
                setConsumoTotalAgua(getConsumoEnergia());
            }

            totalMesEnergia+=valorTotalEnergia;
        
        }//Fin if Energía
        
        System.out.println("Estrato "+Sesion.getEstrato()+"\n "+ "valor final " + valorTotalAgua);
            System.out.println(toString());
            
        }catch(Exception ex){
            System.out.println("Error en clase: \t  Calculos"+"\n Metodo: \t calcularGasto"+"\n Error: "+ex);
        }
    }//Fin calcularPagar agua
    
    public String getValorCUEnergia(){
        String sumaResultado="0";
        double suma=0;
        
        ValorTarifa_Energia vt= new ValorTarifa_Energia();
        try{
            suma=vt.getCostoCompra()+
                vt.getCargoTransporte_STN()+
                vt.getCargoTransporte_SDL()+
                vt.getMargenComercializacion()+
                vt.getCosto_G_T_perdidas()+
                vt.getRestricciones();
            
            sumaResultado= Double.toString(suma);
            
        }catch(Exception ex){
            System.out.println("Error en clase Calcúlos, Metodo: getValor Servicio"
                +"+ tipo de error: "+ex.getMessage());
        }
        
        
        
        return sumaResultado;
    }//FIN getValorCUEnergia
    
    public String getValorCUSubsidiadoEnergia(){
        String sumaResultado="0";
        double suma=0;
        
        ValorTarifa_Energia vt= new ValorTarifa_Energia();
        try{
            suma=(vt.getCostoCompra()+
                vt.getCargoTransporte_STN()+
                vt.getCargoTransporte_SDL()+
                vt.getMargenComercializacion()+
                vt.getCosto_G_T_perdidas()+
                vt.getRestricciones())*(ValorTarifa_Energia.getSubsidio());
            
            sumaResultado= Double.toString(suma);
            
        }catch(Exception ex){
            System.out.println("Error en clase Calcúlos, Metodo: getValor Servicio"
                +"+ tipo de error: "+ex.getMessage());
        }
        
        
        
        return sumaResultado;
    }//FIN getValorCUEnergia
    
}//FIN CLASE
