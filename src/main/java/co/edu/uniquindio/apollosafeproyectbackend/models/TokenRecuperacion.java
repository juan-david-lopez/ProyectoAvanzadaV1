package co.edu.uniquindio.apollosafeproyectbackend.models;

import java.time.LocalDateTime;


public class TokenRecuperacion {
    String idToken;
    String idUsuario;
    String codigo;
    LocalDateTime fechaExpiracion;
}
