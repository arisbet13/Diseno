/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseno;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aRiS
 */
@Stateless
public class MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezFacade extends AbstractFacade<MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> {

    @PersistenceContext(unitName = "ProyectoDisenoV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezFacade() {
        super(MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.class);
    }
    
}
