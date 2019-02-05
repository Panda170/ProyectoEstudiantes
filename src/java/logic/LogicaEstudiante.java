/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import daoManager.DaoEstudiante;
import entity.Estudiante;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class LogicaEstudiante {

    @EJB
    public DaoEstudiante estudianteDao;

    public List<Estudiante> consultarEstudiantes() {
        return estudianteDao.getListaEstudiante();
    }

    public Estudiante agregarEstudiante(Estudiante estudiante) {
        return estudianteDao.guardarEstudiante(estudiante);
    }
}