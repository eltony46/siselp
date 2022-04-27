package edu.elp.SISELP.service;
import edu.elp.SISELP.Entity.Estudiante;
import edu.elp.SISELP.Entity.Persona;

import java.util.List;

public interface IPersonaService {
    // listar personasa

    List<Persona> listaPersonas();


    // buscar persoanj por su dni
    Persona obtenerPersonaByDni(String dni);



}
