package edu.elp.SISELP.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
@Inheritance( strategy = InheritanceType.JOINED )
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private long idpersona;

    @Column(name = "nombre", length = 50, nullable = false)
    private  String nombre;

    @Column(name = "apellido", length = 100, nullable = false)
    private  String apellido;

    @Column(name = "edad", length = 10, nullable = false)
    private  String edad;

    @Column(name = "sexo", length = 50, nullable = false)
    private  String sexo;

    @Column(name = "dni", length = 50, nullable = false)
    private  String dni;

    @Column(name = "direccion", length = 100, nullable = false)
    private  String direccion;

    @Column(name = "telefono", length = 50, nullable = false)
    private  String telefeno;

    @Column(name = "fecha_nacimiento", length = 50, nullable = false)
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(long idpersona) {
        this.idpersona = idpersona;
    }

    public Persona( String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefeno, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.direccion = direccion;
        this.telefeno = telefeno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(String telefeno) {
        this.telefeno = telefeno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad='" + edad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefeno='" + telefeno + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
