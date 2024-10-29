package com.example.databasefirst.Trabalho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "area_comum")
public class AreaComum {
    @Id
    @Column(name = "ID_AREA_COMUM", nullable = false)
    private Integer id;

    @Column(name = "NOME_AREA_COMUM", nullable = false, length = 100)
    private String nomeAreaComum;

    @Column(name = "DISPONIBILIDADE", nullable = false)
    private Boolean disponibilidade = false;

    @Column(name = "HORARIO_DE_USO")
    private LocalTime horarioDeUso;

}