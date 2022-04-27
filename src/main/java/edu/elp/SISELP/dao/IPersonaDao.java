package edu.elp.SISELP.dao;

import edu.elp.SISELP.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IPersonaDao  extends JpaRepository<Persona,Long> {

    @Query("SELECT p FROM Persona p WHERE p.dni= ?1")
    Persona buscarPersona(String dni);

    //Persona findByDni(String dni);

   // @ Query ( "SELECT p FROM Persona p WHERE p.nombre = ?1 AND p.apellido = ?2" )
    //Persona  findByNombreAndApellido ( String  nombre , String  apellido );

    //@Query ( "SELECT p FROM Persona p DONDE p.nombre = :nombre AND p.apellido = :apellido" )
    //Persona  findByNombreAndApellidoByParam (@Param( "nombre" ) String  nombre , @Param ( "apellido" ) String  apellido ) ;

}
