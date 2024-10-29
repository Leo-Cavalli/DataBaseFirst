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
@Table(name = "sindico")
public class Sindico {
    @Id
    @Column(name = "RG_SINDICO", nullable = false, length = 20)
    private String rgSindico;

    @Column(name = "NOME_SINDICO", nullable = false, length = 100)
    private String nomeSindico;

    @Column(name = "LOGIN_SINDICO", nullable = false, length = 50)
    private String loginSindico;

    @Column(name = "SENHA_SINDICO", nullable = false, length = 50)
    private String senhaSindico;

}