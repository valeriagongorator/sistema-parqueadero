package com.parqueadero.Parqueadero.dto.request;

import java.util.UUID;

public record CrearAutomovilRequest(
        String placa,
        String marca,
        String modelo,
        double tarifaPorHora,
        UUID conductorId,
        int numeroPuertas,
        boolean esElectrico) {
}
