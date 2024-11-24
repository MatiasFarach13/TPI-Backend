package utn.frc.bda.grupo_154.AgenciaVehiculos.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Interesados")
public class Interesado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @OneToMany(mappedBy = "interesado", cascade = CascadeType.ALL)
    private Set<Prueba> pruebas = new HashSet<>();
    @Column(name = "TIPO_DOCUMENTO", nullable = false)
    private String tipoDocumento;
    @Column(name = "DOCUMENTO", nullable = false)
    private Integer documento;
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
    @Column(name = "APELLIDO", nullable = false)
    private String apellido;
    @Column(name = "RESTRINGIDO", nullable = false)
    private Boolean restringido;
    @Column(name = "NRO_LICENCIA", nullable = false)
    private Integer nroLicencia;
    @Column(name = "FECHA_VENCIMIENTO_LICENCIA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaVencimientoLicencia;

    public Interesado(){}
    public Interesado(Integer id, String tipoDocumento, Integer documento, String nombre, String apellido, Boolean restringido, Integer nroLicencia, Date fechaVencimientoLicencia) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.restringido = restringido;
        this.nroLicencia = nroLicencia;
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
    }

    public Integer getId() {
        return id;
    }

    public Set<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(Set<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
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

    public Boolean getRestringido() {
        return restringido;
    }

    public void setRestringido(Boolean restringido) {
        this.restringido = restringido;
    }

    public Integer getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(Integer nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

    public Date getFechaVencimientoLicencia() {
        return fechaVencimientoLicencia;
    }

    public void setFechaVencimientoLicencia(Date fechaVencimientoLicencia) {
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
    }
}
