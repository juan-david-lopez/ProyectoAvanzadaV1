package co.edu.uniquindio.apollosafeproyectbackend.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Admins")
@Getter
@Setter
public class Admin extends Usuario {
    @Id
    String idAdmin;

    @Builder
    public Admin(String idAdmin, String nombreCompleto, String ciudadResidencia, String telefono,
                 Ubicacion direccion, String email, String contrasena) {
        super(nombreCompleto, ciudadResidencia, telefono, direccion, email, contrasena);
        this.idAdmin = idAdmin;
    }
}