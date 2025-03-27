package co.edu.uniquindio.apollosafeproyectbackend.repositories;

import co.edu.uniquindio.apollosafeproyectbackend.models.Comentario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ComentarioRepository extends MongoRepository<Comentario, String> {
}
