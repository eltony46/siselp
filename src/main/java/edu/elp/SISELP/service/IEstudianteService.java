package edu.elp.SISELP.service;

import edu.elp.SISELP.Entity.Estudiante;
import edu.elp.SISELP.Entity.Persona;

import java.util.List;

public interface IEstudianteService {

       // listar estudiante

    List<Estudiante> listaEstudiante();


    // buscar persoanj por su codigo
    Persona obtenerEstudianteByCodigo(String codigo);

}
