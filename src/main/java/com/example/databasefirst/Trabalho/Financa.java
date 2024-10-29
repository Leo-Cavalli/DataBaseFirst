package com.example.databasefirst.Trabalho;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "financa")
public class Financa {
    @Id
    @Column(name = "ID_FINANCA", nullable = false)
    private Integer id;

    @Column(name = "CATEGORIA_FINANCA", length = 100)
    private String categoriaFinanca;

    @Lob
    @Column(name = "DOCUMENTO_FINANCA")
    private String documentoFinanca;

    @Lob
    @Column(name = "OBJETIVO_FINANCA")
    private String objetivoFinanca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SINDICO_RESPONSAVEL_FINANCA")
    private Sindico sindicoResponsavelFinanca;

}