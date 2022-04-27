package edu.elp.SISELP.dao;

import edu.elp.SISELP.Entity.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
    @Query("SELECT p FROM Estudiante p WHERE p.codigo= ?1")
    Estudiante buscarEstudiante(String codigo);

}
