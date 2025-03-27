package co.edu.uniquindio.apollosafeproyectbackend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "Categorias")
public class Categoria {
    @Id
    String idCategoria;
    String nombre;
    String descripcion;
}