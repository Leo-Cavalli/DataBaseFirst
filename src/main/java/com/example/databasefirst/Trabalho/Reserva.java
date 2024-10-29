package com.example.databasefirst.Trabalho;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @Column(name = "ID_RESERVA", nullable = false)
    private Integer id;

    @Column(name = "DATA_INICIO_RESERVA")
    private LocalDate dataInicioReserva;

    @Column(name = "DATA_FIM_RESERVA")
    private LocalDate dataFimReserva;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AREA_RESERVADA")
    private AreaComum areaReservada;

}