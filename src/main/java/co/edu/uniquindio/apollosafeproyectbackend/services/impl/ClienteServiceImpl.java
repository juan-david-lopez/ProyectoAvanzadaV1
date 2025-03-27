package co.edu.uniquindio.apollosafeproyectbackend.services.impl;

import co.edu.uniquindio.apollosafeproyectbackend.dto.requests.ClienteRegistrationRequest;
import co.edu.uniquindio.apollosafeproyectbackend.dto.requests.UsuarioDeleteRequest;
import co.edu.uniquindio.apollosafeproyectbackend.dto.responses.ClienteResponse;
import co.edu.uniquindio.apollosafeproyectbackend.exceptions.ValueConflictException;
import co.edu.uniquindio.apollosafeproyectbackend.models.Cliente;
import co.edu.uniquindio.apollosafeproyectbackend.repositories.ClienteRepository;
import co.edu.uniquindio.apollosafeproyectbackend.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public ClienteResponse createCliente(ClienteRegistrationRequest clienteRegistrationRequest) {
        if (clienteRepository.findClienteByEmail(clienteRegistrationRequest.email()).isPresent()) {
            throw new ValueConflictException("Email ya registrado");
        }
        Cliente cliente = new Cliente(
                clienteRegistrationRequest.nombreCompleto(),
                clienteRegistrationRequest.ciudadResidencia(),
                clienteRegistrationRequest.telefono(),
                clienteRegistrationRequest.direccion(),
                clienteRegistrationRequest.email(),
                passwordEncoder.encode(clienteRegistrationRequest.contrasena()),
                false,
                false,
                UUID.randomUUID().toString(),
                new ArrayList<String>()
        );
        clienteRepository.save(cliente);
        return new ClienteResponse(
                cliente.getIdCliente(),
                cliente.getNombreCompleto(),
                cliente.getCiudadResidencia(),
                cliente.getTelefono(),
                cliente.getDireccion(),
                cliente.getEmail()
        );
    }

    @Override
    public void eliminarUsuario(UsuarioDeleteRequest usuario) {

    }
}