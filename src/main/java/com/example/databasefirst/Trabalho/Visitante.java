package com.example.databasefirst.Trabalho;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "visitante")
public class Visitante {
    @Id
    @Column(name = "RG_VISITANTE", nullable = false, length = 20)
    private String rgVisitante;

    @Column(name = "DATA_VISITA")
    private LocalDate dataVisita;

    @Column(name = "NOME_VISITANTE", length = 100)
    private String nomeVisitante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MORADOR_RESPONSAVEL")
    private Morador moradorResponsavel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PORTEIRO_RESPONSAVEL")
    private Porteiro porteiroResponsavel;

}