package co.edu.uniquindio.apollosafeproyectbackend.services.impl;

import co.edu.uniquindio.apollosafeproyectbackend.repositories.ClienteRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.regex.Pattern;

public class AuthServiceImpl {
    // Patrón para validar email y prevenir NoSQL injection
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    private final ClienteRepository clienteRepository;

    public AuthServiceImpl(ClienteRepository clienteRepository, PasswordEncoder passwordEncoder) {
        this.clienteRepository = clienteRepository;
        //this.passwordEncoder = passwordEncoder;
    }

}
