package co.edu.uniquindio.apollosafeproyectbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "Notificaciones")
public class Notificacion {
    @Id
    String idNotificacion;
    String idClienteDestino;
    String descripcion;
    boolean leido;
    LocalDateTime fechaPublicacion;
}
