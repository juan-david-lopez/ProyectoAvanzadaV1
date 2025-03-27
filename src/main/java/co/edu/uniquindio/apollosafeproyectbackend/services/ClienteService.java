package co.edu.uniquindio.apollosafeproyectbackend.services;

import co.edu.uniquindio.apollosafeproyectbackend.dto.requests.ClienteRegistrationRequest;
import co.edu.uniquindio.apollosafeproyectbackend.dto.requests.UsuarioDeleteRequest;
import co.edu.uniquindio.apollosafeproyectbackend.dto.responses.ClienteResponse;

public interface ClienteService {
    ClienteResponse createCliente(ClienteRegistrationRequest cliente);
}
