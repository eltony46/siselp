package edu.elp.SISELP.service.impl;

import edu.elp.SISELP.Entity.Persona;
import edu.elp.SISELP.dao.IPersonaDao;
import edu.elp.SISELP.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonaServiceImpl implements IPersonaService {


    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersonas() {

        List<Persona> personaList = this.personaDao.findAll();

        for (Persona persona:personaList){
            System.out.println(persona.toString());
        }
        return personaList;
    }

    @Override
    public Persona obtenerPersonaByDni(String dni) {
        return this.personaDao.buscarPersona(dni);
    }
}
