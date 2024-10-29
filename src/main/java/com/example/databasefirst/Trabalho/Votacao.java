package com.example.databasefirst.Trabalho;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "votacao")
public class Votacao {
    @Id
    @Column(name = "ID_VOTACAO", nullable = false)
    private Integer id;

    @Column(name = "TITULO_VOTACAO", length = 100)
    private String tituloVotacao;

    @Column(name = "QUANTIA_VOTOS")
    private Integer quantiaVotos;

    @Lob
    @Column(name = "CONTEUDO_VOTACAO")
    private String conteudoVotacao;

    @Column(name = "RESULTADO", length = 50)
    private String resultado;

}