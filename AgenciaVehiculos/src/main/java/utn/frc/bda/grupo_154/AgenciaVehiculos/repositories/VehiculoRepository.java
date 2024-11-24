package utn.frc.bda.grupo_154.AgenciaVehiculos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.frc.bda.grupo_154.AgenciaVehiculos.models.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
}
