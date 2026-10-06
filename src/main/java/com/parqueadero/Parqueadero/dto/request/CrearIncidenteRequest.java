package com.parqueadero.Parqueadero.dto.request;

import com.parqueadero.Parqueadero.domain.TipoIncidente;
import java.time.LocalDateTime;
import java.util.UUID;

public record CrearIncidenteRequest(
        UUID tiqueteId,
        TipoIncidente tipo,
        String descripcion,
        LocalDateTime fechaHora) {
}
