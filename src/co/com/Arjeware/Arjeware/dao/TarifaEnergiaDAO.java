/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.dao;

import co.com.Arjeware.Arjeware.models.entity.TarifaEnergiaEntity;
import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public interface TarifaEnergiaDAO {
    
    public ArrayList<TarifaEnergiaEntity> obtenerTarifas();
    
}
