package edu.elp.SISELP.service.impl;

import edu.elp.SISELP.Entity.Administrador;
import edu.elp.SISELP.dao.IAdministradorDao;
import edu.elp.SISELP.service.IAdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorServiceImpl implements IAdministradorService {

    @Autowired
    private IAdministradorDao AdministradorDao;

    @Override
    public List<Administrador> listaAdministrador() {

        List<Administrador> administradorList = this.AdministradorDao.findAll();

        for (Administrador administrador:administradorList){
            System.out.println(administrador.toString());
        }
        return administradorList;
    }
}
