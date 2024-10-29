package com.example.databasefirst.Trabalho;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "reuniao")
public class Reuniao {
    @Id
    @Column(name = "ID_REUNIAO", nullable = false)
    private Integer id;

    @Column(name = "TITULO_REUNIAO", length = 100)
    private String tituloReuniao;

    @Lob
    @Column(name = "ASSUNTO_REUNIAO")
    private String assuntoReuniao;

    @Column(name = "DATA_INICIO_REUNIAO")
    private LocalDate dataInicioReuniao;

    @Column(name = "DATA_FIM_REUNIAO")
    private LocalDate dataFimReuniao;

    @Column(name = "LINK_REUNIAO")
    private String linkReuniao;

    @Lob
    @Column(name = "ATA_REUNIAO")
    private String ataReuniao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SINDICO_RESPONSAVEL_REUNIAO")
    private Sindico sindicoResponsavelReuniao;

}