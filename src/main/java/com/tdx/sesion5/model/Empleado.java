package com.tdx.sesion5.model;

import jakarta.validation.constraints.NotBlank;

public class Empleado {
    private Long id;
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    private String departamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}