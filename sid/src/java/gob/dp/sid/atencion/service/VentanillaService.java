/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.dp.sid.atencion.service;

import gob.dp.sid.atencion.entity.Ventanilla;
import java.util.List;

/**
 *
 * @author JCARRILLO
 */

public interface VentanillaService {
    
    public List<Ventanilla> listarVentanillas(Ventanilla ventanilla);
    
}