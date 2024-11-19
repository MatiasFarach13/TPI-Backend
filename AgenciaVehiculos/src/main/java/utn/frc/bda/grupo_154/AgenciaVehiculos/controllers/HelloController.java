package utn.frc.bda.grupo_154.AgenciaVehiculos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/appAgenciaVehiculos/hello/{nombre}")
    public String hello(@PathVariable String nombre){
        String result = "Hola " + nombre + ", este es el tp mas largo del mundo";
        return result;
    }
}
