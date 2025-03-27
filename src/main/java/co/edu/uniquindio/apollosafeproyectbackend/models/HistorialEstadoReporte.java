package co.edu.uniquindio.apollosafeproyectbackend.models;

import co.edu.uniquindio.apollosafeproyectbackend.enums.EstadoReporte;

import java.time.LocalDateTime;

public class HistorialEstadoReporte {
    EstadoReporte estado;
    String comentarioAdmin;
    LocalDateTime fechaCambio;
}
