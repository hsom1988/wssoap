/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.ws.ejb.controladores;

import ec.edu.uisrael.ws.ejb.interfaces.AdministadorBase;
import javax.ejb.Stateless;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Santi
 */
@Stateless
public class AdministradorCategProdBean implements AdministadorBase<Object>{

    @PersistenceContext(unitName = "compras-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    public void crear(Object entity, Object user) throws Exception {
        if (user == null) {
            throw new Exception("Usuario null");
        }
        try {
            getEntityManager().persist(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void modificar(Object entity, Object user) throws Exception {
        if (user == null) {
            throw new Exception("Usuario null");
        }
        try {
            getEntityManager().merge(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void eliminar(Object entity, Object user) throws Exception {
        if (user == null) {
            throw new Exception("Usuario null");
        }
        try {
            getEntityManager().remove(getEntityManager().merge(entity));
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Object> listar(Class clase) throws Exception {
        try {
            String sql = "select T from " + clase.getSimpleName() + " T";
            Query q = getEntityManager().createQuery(sql);
            List objs = q.getResultList();
            return objs;
        } catch (Exception e) {
            throw e;
        }
    }

}
