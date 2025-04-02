package co.edu.uniquindio.apollosafeproyectbackend.dto.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

public record UsuarioDeleteRequest(
        @NotBlank(message = "El campo es requerido")
        @NonNull
        String id,
        @Email(message = " el correo es necesario")
        String Email

) {
}
