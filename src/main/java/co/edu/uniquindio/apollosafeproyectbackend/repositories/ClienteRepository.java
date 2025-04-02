package co.edu.uniquindio.apollosafeproyectbackend.repositories;

import co.edu.uniquindio.apollosafeproyectbackend.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
    //Optional<Object> findClienteByEmail(String email);
    @Query(value="{'status' :  { $ne :  'DELETE'}, " +
    " 'fullName': {$regex:  ?1, $options:  'i'}, " +
    " 'email': {$regex:  ?2, $options:  'i'}, " +
    " ?# { [2]!= null ? 'dateBirth' : '_ignore'} :?2}",
    sort = "{ 'fullName'}")
    Optional<Object> findClienteByEmail(String email);
}
