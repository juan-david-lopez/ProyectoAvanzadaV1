package co.edu.uniquindio.apollosafeproyectbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Document(collection = "Reportes")
public class Reporte {
    @Id
    String idReporte;
    String idCliente;
    String titulo;
    String descripcion;
    @DBRef
    List<Categoria> categorias;
    Ubicacion ubicacion;
    List<String> imagenes;
    List<String> Comentarios;
    LocalDateTime fechaPublicacion;
    Set<String> idClientesVotoImportante;
    List<HistorialEstadoReporte> historialEstados;
}
