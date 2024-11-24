package utn.frc.bda.grupo_154.AgenciaVehiculos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.frc.bda.grupo_154.AgenciaVehiculos.models.Vehiculo;
import utn.frc.bda.grupo_154.AgenciaVehiculos.repositories.VehiculoRepository;

import java.util.List;

@RestController
public class VehiculoController {
    private final VehiculoRepository vehiculoRepository;

    public VehiculoController(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @GetMapping("/vehiculos")
    public List<Vehiculo> getVehiculos() {
        return vehiculoRepository.findAll();
    }
}
