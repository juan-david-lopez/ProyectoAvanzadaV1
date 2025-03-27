package co.edu.uniquindio.apollosafeproyectbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "Comentarios")
public class Comentario {
    @Id
    String idComentario;
    String idClienteComenta;
    String idReporte;
    String descripcion;
    LocalDateTime fechaPublicacion;
}
