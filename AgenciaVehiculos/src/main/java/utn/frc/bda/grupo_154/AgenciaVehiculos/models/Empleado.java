package utn.frc.bda.grupo_154.AgenciaVehiculos.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LEGAJO")
    private Integer legajo;
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
    @Column(name = "APELLIDO", nullable = false)
    private String apellido;
    @Column(name = "TELEFONO_CONTACTO", nullable = false)
    private Integer telefono;
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private Set<Prueba> pruebas = new HashSet<>();

    public Empleado(){}
    public Empleado(Integer legajo, String nombre, String apellido, Integer telefono) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Integer getLegajo() {
        return legajo;
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

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Set<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(Set<Prueba> pruebas) {
        this.pruebas = pruebas;
    }
}
