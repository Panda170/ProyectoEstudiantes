/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entity.Estudiante;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import logic.LogicaEstudiante;

@Path("ServicioEstudiante")
@Stateless
public class ServicioEstudiante {
    @EJB
    private LogicaEstudiante logica;
    
    @GET
    public List<Estudiante> consultarEstudiantes(){
        return logica.consultarEstudiantes();
    }
    
    @POST
    public Estudiante guardarEstudiante(Estudiante estudiante){
        return logica.agregarEstudiante(estudiante);
    }
    
  
}
