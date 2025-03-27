package co.edu.uniquindio.apollosafeproyectbackend.controllers;

import co.edu.uniquindio.apollosafeproyectbackend.dto.requests.ClienteRegistrationRequest;
import co.edu.uniquindio.apollosafeproyectbackend.dto.responses.ClienteResponse;
import co.edu.uniquindio.apollosafeproyectbackend.services.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteResponse> create(@Valid @RequestBody ClienteRegistrationRequest request){
        var response = clienteService.createCliente(request);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.id())
                .toUri();
        return ResponseEntity.created(location).body(response);
    }
}
