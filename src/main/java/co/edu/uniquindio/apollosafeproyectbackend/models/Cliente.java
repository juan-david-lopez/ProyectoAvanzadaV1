package co.edu.uniquindio.apollosafeproyectbackend.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Clientes")
@Getter
@Setter
public class Cliente extends Usuario {
    @Id
    String idCliente;
    List<String> idReportes;
    Boolean esVerificado;
    Boolean esEliminado;

    @Builder
    public Cliente(String nombreCompleto, String ciudadResidencia, String telefono, Ubicacion direccion,
                   String email, String contrasena, Boolean esVerificado, Boolean esEliminado, String idCliente, List<String> idReportes) {
        super(nombreCompleto, ciudadResidencia, telefono, direccion, email, contrasena);
        this.esVerificado = esVerificado;
        this.esEliminado = esEliminado;
        this.idCliente = idCliente;
        this.idReportes = idReportes;
    }
}