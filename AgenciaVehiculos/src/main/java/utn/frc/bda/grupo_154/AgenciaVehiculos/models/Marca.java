package utn.frc.bda.grupo_154.AgenciaVehiculos.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOMBRE", nullable = false)
    private String name;
    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private Set<Modelo> modelos = new HashSet<>();

    public Marca(){}
    public Marca(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(Set<Modelo> modelos) {
        this.modelos = modelos;
    }
}
