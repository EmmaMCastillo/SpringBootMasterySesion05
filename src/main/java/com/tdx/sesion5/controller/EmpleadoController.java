package com.tdx.sesion5.controller;

import com.tdx.sesion5.model.Empleado;
import com.tdx.sesion5.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> obtenerEmpleado(
            @PathVariable Long id,
            @RequestHeader(value = "X-User-Id", defaultValue = "unknown") String userId) {
        Empleado empleado = empleadoService.buscarEmpleado(id, userId);
        return ResponseEntity.ok(empleado);
    }
}