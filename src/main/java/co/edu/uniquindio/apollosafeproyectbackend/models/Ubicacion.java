package co.edu.uniquindio.apollosafeproyectbackend.models;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Ubicacion {
    @NotBlank
    Double latitud;
    @NotBlank
    Double longitud;
}
