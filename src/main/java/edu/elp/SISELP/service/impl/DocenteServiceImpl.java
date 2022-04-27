package edu.elp.SISELP.service.impl;

import edu.elp.SISELP.Entity.Docente;
import edu.elp.SISELP.dao.IDocenteDao;
import edu.elp.SISELP.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DocenteServiceImpl implements IDocenteService {
    @Autowired
    private IDocenteDao docenteDao;

    @Override
    public List<Docente> listaDocente() {

        List<Docente> docenteList = this.docenteDao.findAll();

        for (Docente docente:docenteList){
            System.out.println(docente.toString());
        }
        return docenteList;
    }
}
