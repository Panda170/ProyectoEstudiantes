/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoManager;

import entity.Estudiante;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DaoEstudiante {

    @PersistenceContext
    private EntityManager em;
    
    public List<Estudiante> getListaEstudiante() {
        String query = "Select e from Estudiante e";
        return em.createQuery(query).getResultList();
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        em.persist(estudiante);
        return estudiante;
    }

}
