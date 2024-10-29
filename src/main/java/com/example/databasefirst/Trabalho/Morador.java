package com.example.databasefirst.Trabalho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "morador")
public class Morador {
    @Id
    @Column(name = "RG_MORADOR", nullable = false, length = 20)
    private String rgMorador;

    @Column(name = "NOME_MORADOR", nullable = false, length = 100)
    private String nomeMorador;

    @Column(name = "APARTAMENTO_MORADOR", nullable = false, length = 50)
    private String apartamentoMorador;

}