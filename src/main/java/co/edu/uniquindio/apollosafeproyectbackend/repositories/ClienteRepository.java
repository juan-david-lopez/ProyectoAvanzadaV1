package co.edu.uniquindio.apollosafeproyectbackend.repositories;

import co.edu.uniquindio.apollosafeproyectbackend.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
    Optional<Object> findClienteByEmail(String email);
}
