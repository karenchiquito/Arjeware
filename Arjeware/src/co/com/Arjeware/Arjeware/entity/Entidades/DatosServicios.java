package co.com.Arjeware.Arjeware.entity.Entidades;

public class DatosServicios {
    public static String ano="",estrato="",valorServicio="",valorCargoFijo=""
        ,valorExceso="",tipoServicio="",vigencia="",mes="";

    
    //GETTER-----------------------------
    public static String getTipoServicio() {
        return tipoServicio;
    }

    public static String getValorServicio() {
        return valorServicio;
    }

    public static String getValorExceso() {
        return valorExceso;
    }

    public static String getVigencia() {
        return vigencia;
    }
    
    //SETTER---------------------------------

    public static void setTipoServicio(String tipoServicio) {
        DatosServicios.tipoServicio = tipoServicio;
    }

    public static void setValorServicio(String valorServicio) {
        DatosServicios.valorServicio = valorServicio;
    }

    public static void setValorExceso(String valorExceso) {
        DatosServicios.valorExceso = valorExceso;
    }

    public static void setVigencia(String vigencia) {
        DatosServicios.vigencia = vigencia;
    }
            
}
