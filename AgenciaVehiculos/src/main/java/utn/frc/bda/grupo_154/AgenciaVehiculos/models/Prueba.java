package utn.frc.bda.grupo_154.AgenciaVehiculos.models;

import jakarta.persistence.*;
import jdk.jfr.MemoryAddress;

import java.util.Date;

@Entity
@Table(name = "Pruebas")
public class Prueba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "ID_VEHICULO", nullable = false)
    private Vehiculo vehiculo;
    @ManyToOne
    @JoinColumn(name = "ID_EMPLEADO", nullable = false)
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name = "ID_INTERESADO", nullable = false)
    private Interesado interesado;
    @Column(name = "FECHA_HORA_INICIO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraInicio;
    @Column(name = "FECHA_HORA_FIN", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraFin;
    @Column(name = "COMENTARIOS", nullable = false)
    private String comentario;

    public Prueba(){}
    public Prueba(Integer id, Vehiculo vehiculo, Empleado empleado, Interesado interesado, Date fechaHoraInicio, Date fechaHoraFin, String comentario) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.interesado = interesado;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.comentario = comentario;
    }

    public Integer getId() {
        return id;
    }


    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Interesado getInteresado() {
        return interesado;
    }

    public void setInteresado(Interesado interesado) {
        this.interesado = interesado;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
