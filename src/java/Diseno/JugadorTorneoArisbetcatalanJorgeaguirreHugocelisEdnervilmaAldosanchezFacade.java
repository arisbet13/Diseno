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
public class JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezFacade extends AbstractFacade<JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> {

    @PersistenceContext(unitName = "ProyectoDisenoV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezFacade() {
        super(JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.class);
    }
    
}
