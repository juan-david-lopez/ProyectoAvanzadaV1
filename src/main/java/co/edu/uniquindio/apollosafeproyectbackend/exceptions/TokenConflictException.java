package co.edu.uniquindio.apollosafeproyectbackend.exceptions;

import java.util.Collection;

public class TokenConflictException extends RuntimeException {
    public TokenConflictException(String message) {
        super("problemas de validacion con el token actual: " + message);
    }
}
