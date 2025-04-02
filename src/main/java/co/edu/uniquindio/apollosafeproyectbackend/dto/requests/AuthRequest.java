package co.edu.uniquindio.apollosafeproyectbackend.dto.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

public record AuthRequest(
        @NotBlank
        @Email(message="de be ser un email valido")
        String email,
        @NotBlank(message = "El campo es requerido")
        @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*$",
                message = "Debe contener al menos: un número, una letra minúscula y una mayúscula ")
        @Size(min = 8,message = "La longitud mínima es 8")
        String password
) {
}
