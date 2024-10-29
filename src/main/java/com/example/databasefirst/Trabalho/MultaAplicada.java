package com.example.databasefirst.Trabalho;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "multa_aplicada")
public class MultaAplicada {
    @Id
    @Column(name = "ID_MULTA_APLICADA", nullable = false)
    private Integer id;

    @Column(name = "DATA_APLICACAO", nullable = false)
    private LocalDate dataAplicacao;

    @Column(name = "APARTAMENTO_MULTADO", nullable = false, length = 50)
    private String apartamentoMultado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_MULTA")
    private Multa tipoMulta;

}