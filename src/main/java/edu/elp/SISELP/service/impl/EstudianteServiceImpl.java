package edu.elp.SISELP.service.impl;

import edu.elp.SISELP.Entity.Estudiante;
import edu.elp.SISELP.dao.IEstudianteDao;
import edu.elp.SISELP.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listaEstudiante() {

        List<Estudiante> estudianteList = this.estudianteDao.findAll();

        for (Estudiante estudiante:estudianteList){
            System.out.println(estudiante.toString());
        }
        return estudianteList;
    }
    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {return this.estudianteDao.buscarEstudiante(codigo);}



}
