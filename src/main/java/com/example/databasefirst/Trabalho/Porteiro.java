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
@Table(name = "porteiro")
public class Porteiro {
    @Id
    @Column(name = "RG_PORTEIRO", nullable = false, length = 20)
    private String rgPorteiro;

    @Column(name = "NOME_PORTEIRO", nullable = false, length = 100)
    private String nomePorteiro;

    @Column(name = "TURNO_PORTEIRO", length = 50)
    private String turnoPorteiro;

}