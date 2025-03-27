package co.edu.uniquindio.apollosafeproyectbackend.dto.requests;

import jakarta.validation.constraints.NotBlank;

public record UsuarioDeleteRequest(
        @NotBlank(message = "El campo es requerido")
        String id
) {
}
