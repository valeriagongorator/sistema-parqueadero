package com.parqueadero.Parqueadero.dto.request;

import java.util.UUID;

public record CrearMotocicletaRequest(
        String placa,
        String marca,
        String modelo,
        double tarifaPorHora,
        UUID conductorId,
        int cilindraje,
        boolean necesitaCasilleroCasco) {
}
