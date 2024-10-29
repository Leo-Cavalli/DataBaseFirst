package com.example.databasefirst.Trabalho;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "voto")
public class Voto {
    @Id
    @Column(name = "ID_VOTO", nullable = false)
    private Integer id;

    @Column(name = "ESCOLHA_VOTO", length = 10)
    private String escolhaVoto;

    @Column(name = "VOTACAO_APLICADA")
    private Integer votacaoAplicada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MORADOR_VOTANTE")
    private Morador moradorVotante;

}