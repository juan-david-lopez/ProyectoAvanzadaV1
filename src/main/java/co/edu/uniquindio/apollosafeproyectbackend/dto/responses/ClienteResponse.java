package co.edu.uniquindio.apollosafeproyectbackend.dto.responses;

import co.edu.uniquindio.apollosafeproyectbackend.models.Ubicacion;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ClienteResponse(
        @NotBlank(message = "El campo es requerido")
        String id,

        @NotBlank(message = "El campo es requerido")
        @Size(max = 100,message = "No debe exceder los 100 caracteres")
        String nombreCompleto,

        @NotBlank(message = "El campo es requerido")
        @Size(max = 50,message = "No debe exceder los 50 caracteres")
        String ciudadResidencia,

        @NotBlank(message = "El campo es requerido")
        @Size(min = 10, max = 10, message = "Debe ser un número de teléfono válido")
        String telefono,

        Ubicacion direccion,

        @NotBlank(message = "El campo es requerido")
        @Email(message = "Debe ser un email válido")
        String email) {
}
