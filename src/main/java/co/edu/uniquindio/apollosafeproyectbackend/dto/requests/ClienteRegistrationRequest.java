package co.edu.uniquindio.apollosafeproyectbackend.dto.requests;

import co.edu.uniquindio.apollosafeproyectbackend.models.Ubicacion;
import jakarta.validation.constraints.*;


public record ClienteRegistrationRequest(
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
        String email,

        @NotBlank(message = "El campo es requerido")
        @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*$",
                 message = "Debe contener al menos: un número, una letra minúscula y una mayúscula ")
        @Size(min = 8,message = "La longitud mínima es 8")
        String contrasena) {

    public ClienteRegistrationRequest {

    }
}
