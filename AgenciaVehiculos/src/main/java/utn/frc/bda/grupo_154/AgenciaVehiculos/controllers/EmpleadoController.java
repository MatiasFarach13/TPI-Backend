package utn.frc.bda.grupo_154.AgenciaVehiculos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.frc.bda.grupo_154.AgenciaVehiculos.models.Empleado;
import utn.frc.bda.grupo_154.AgenciaVehiculos.repositories.EmpleadoRepository;

import java.util.List;

@RestController
public class EmpleadoController {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados() {
        return empleadoRepository.findAll();
    }
}