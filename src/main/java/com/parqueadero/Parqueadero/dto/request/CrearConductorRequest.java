package com.parqueadero.Parqueadero.dto.request;

public record CrearConductorRequest(
        String nombre,
        String identificacion,
        String telefono,
        String email) {
}
