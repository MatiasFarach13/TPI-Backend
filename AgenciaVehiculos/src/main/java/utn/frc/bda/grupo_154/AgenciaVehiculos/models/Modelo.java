package utn.frc.bda.grupo_154.AgenciaVehiculos.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Modelos")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;
    @OneToMany(mappedBy = "modelo", cascade = CascadeType.ALL)
    private Set<Vehiculo> vehiculos = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "ID_MARCA", nullable = false)
    private Marca marca;

    public Modelo(){}
    public Modelo(Integer id, String descripcion,  Marca marca) {
        this.id = id;
        this.descripcion = descripcion;
        this.marca = marca;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Set<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
