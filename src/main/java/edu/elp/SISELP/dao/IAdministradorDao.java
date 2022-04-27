package edu.elp.SISELP.dao;

import edu.elp.SISELP.Entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdministradorDao extends JpaRepository<Administrador,Long> {
}
