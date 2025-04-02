package co.edu.uniquindio.apollosafeproyectbackend.repositories;

import co.edu.uniquindio.apollosafeproyectbackend.models.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String> {
    Optional<Categoria> findByIdCategoria(UUID idCategoria);
    Optional<Categoria> findByNombre(String nombre);
}
