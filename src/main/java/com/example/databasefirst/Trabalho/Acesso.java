package com.example.databasefirst.Trabalho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "acesso")
public class Acesso {
    @Id
    @Column(name = "ID_ACESSO", nullable = false)
    private Integer id;

    @Column(name = "DATA_ACESSO")
    private LocalDate dataAcesso;

    @Column(name = "RG_ENTRADA", length = 20)
    private String rgEntrada;

}