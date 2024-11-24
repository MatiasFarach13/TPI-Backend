package utn.frc.bda.grupo_154.AgenciaVehiculos.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PATENTE", nullable = false)
    private String patente;
    @ManyToOne
    @JoinColumn(name = "ID_MODELO", nullable = false)
    private Modelo modelo;
    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
    private Set<Posicion> posiciones = new HashSet<>();
    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
    private Set<Prueba> pruebas = new HashSet<>();

    public Vehiculo(){}
    public Vehiculo(Integer id, String patente, Modelo modelo) {
        this.id = id;
        this.patente = patente;
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Set<Posicion> getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(Set<Posicion> posiciones) {
        this.posiciones = posiciones;
    }

    public Set<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(Set<Prueba> pruebas) {
        this.pruebas = pruebas;
    }
}
