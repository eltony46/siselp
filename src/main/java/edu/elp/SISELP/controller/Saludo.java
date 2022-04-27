package edu.elp.SISELP.controller;
import edu.elp.SISELP.Entity.Administrador;
import edu.elp.SISELP.Entity.Docente;
import edu.elp.SISELP.Entity.Estudiante;
import edu.elp.SISELP.Entity.Persona;
import edu.elp.SISELP.service.IAdministradorService;
import edu.elp.SISELP.service.IDocenteService;
import edu.elp.SISELP.service.IPersonaService;
import edu.elp.SISELP.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
public class Saludo {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listaPersonas")

    public List<Persona> listaPersona(){
        return this.personaService.listaPersonas();

    }

    @GetMapping("/buscarPersona")

    public Persona buscarPersona(@RequestParam ("dni") String dni){
        return this.personaService.obtenerPersonaByDni(dni);

    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "Hola Mundo desde Ayacucho!!!!!....... te saluda " + nombre;
    }
    @GetMapping("/bienvenida")
    public String bienvenida(){
        return "Hola amig@s al curso de Java";
    }

    @Autowired
    private IEstudianteService estudianteService ;

    @GetMapping("/listaEstudiante")

    public List<Estudiante> listaEstudiante(){
        return this.estudianteService.listaEstudiante();

    }
    @Autowired
    private IDocenteService docenteService ;

    @GetMapping("/listaDocente")

    public List<Docente> listaDocente(){
        return this.docenteService.listaDocente();

    }

    @Autowired
    private IAdministradorService administradorService ;

    @GetMapping("/listaAdministrador")

    public List<Administrador> listaAdministrador(){
        return this.administradorService.listaAdministrador();

    }
    @GetMapping("/buscarEstudiante")

    public Estudiante buscarEstudiante(@RequestParam ("codigo") String codigo){
        return (Estudiante) this.estudianteService.obtenerEstudianteByCodigo(codigo);

    }


}
