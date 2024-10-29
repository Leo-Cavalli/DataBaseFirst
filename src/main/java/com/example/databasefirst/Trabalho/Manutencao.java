package com.example.databasefirst.Trabalho;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "manutencao")
public class Manutencao {
    @Id
    @Column(name = "ID_MANUTENCAO", nullable = false)
    private Integer id;

    @Column(name = "LOCAL_AFETADO", length = 100)
    private String localAfetado;

    @Column(name = "CUSTO", precision = 10, scale = 2)
    private BigDecimal custo;

    @Lob
    @Column(name = "CONTRATO_MANUTENCAO")
    private String contratoManutencao;

}