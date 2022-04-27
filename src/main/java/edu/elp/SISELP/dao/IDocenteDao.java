package edu.elp.SISELP.dao;

import edu.elp.SISELP.Entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenteDao extends JpaRepository<Docente,Long> {
}
