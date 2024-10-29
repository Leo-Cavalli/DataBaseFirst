package com.example.databasefirst.Trabalho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "multa")
public class Multa {
    @Id
    @Column(name = "ID_MULTA", nullable = false)
    private Integer id;

    @Column(name = "VALOR", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "CATEGORIA_MULTA", nullable = false, length = 100)
    private String categoriaMulta;

}