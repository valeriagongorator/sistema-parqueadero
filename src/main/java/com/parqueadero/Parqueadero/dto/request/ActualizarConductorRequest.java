package com.parqueadero.Parqueadero.dto.request;

public record ActualizarConductorRequest(
        String nombre,
        String telefono,
        String email) {
}
