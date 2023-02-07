/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.gm.sga.domain.Gruposancion;

@Stateless
public class GruposancionDaoImpl implements GruposancionDao {
    
    @PersistenceContext(unitName = "PersonaPU")
    EntityManager em;

    public List<Gruposancion> findAllGruposancions() {
        return em.createNamedQuery("Gruposancion.findAll").getResultList();
    }

    public Gruposancion findGruposancionById(Gruposancion gruposancion) {
        return em.find(Gruposancion.class, gruposancion.getIdgrupo());
    }

    /*@Override
    public Gruposancion findGruposancionByEmail(Gruposancion persona) {
        Query query = em.createQuery("from Gruposancion g where g.id =: id");
        query.setParameter("email", persona.getEmail());
        return (Gruposancion) query.getSingleResult();
    }*/

    @Override
    public void create(Gruposancion gruposancion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void edit(Gruposancion gruposancion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Gruposancion gruposancion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Gruposancion find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Gruposancion> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Gruposancion> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
