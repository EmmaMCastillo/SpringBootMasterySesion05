package com.tdx.sesion5.service;

import com.tdx.sesion5.exception.NotFoundException;
import com.tdx.sesion5.model.Empleado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
    private static final Logger logger = LoggerFactory.getLogger(EmpleadoService.class);

    public Empleado buscarEmpleado(Long id, String userId) {
        MDC.put("userId", userId);
        logger.info("Buscando empleado con ID: {}", id);

        if (id == null || id <= 0) {
            logger.error("ID de empleado inválido: {}", id);
            throw new NotFoundException("Empleado no encontrado");
        }

        Empleado empleado = new Empleado();
        empleado.setId(id);
        empleado.setNombre("Juan Pérez");
        empleado.setDepartamento("TI");
        logger.info("Empleado encontrado: {}", empleado.getNombre());
        MDC.clear();
        return empleado;
    }
}
