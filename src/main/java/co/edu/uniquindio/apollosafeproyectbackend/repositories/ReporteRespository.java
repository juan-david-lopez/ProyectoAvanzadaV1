package co.edu.uniquindio.apollosafeproyectbackend.repositories;

import co.edu.uniquindio.apollosafeproyectbackend.models.Reporte;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteRespository extends MongoRepository<Reporte, String> {
}
