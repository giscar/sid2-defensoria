/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.dp.sid.registro.service;

import gob.dp.sid.registro.entity.GestionEtapa;

/**
 *
 * @author carlos
 */
public interface GestionEtapaService {
    
    public void gestionEtapaInsertar(GestionEtapa gestionEtapa);
    
    public void inactivarGestion(Long idGestion);
}
