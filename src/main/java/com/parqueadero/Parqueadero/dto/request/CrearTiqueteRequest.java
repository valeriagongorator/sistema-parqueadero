package com.parqueadero.Parqueadero.dto.request;

import java.time.LocalDateTime;
import java.util.UUID;

public record CrearTiqueteRequest(
        UUID conductorId,
        UUID vehiculoId,
        LocalDateTime fechaIngreso) {
}
