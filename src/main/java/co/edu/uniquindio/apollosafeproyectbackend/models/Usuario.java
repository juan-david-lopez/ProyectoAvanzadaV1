package co.edu.uniquindio.apollosafeproyectbackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
public abstract class Usuario {
    String nombreCompleto;
    String ciudadResidencia;
    String telefono;
    Ubicacion direccion;
    String email;
    String contrasena;
}