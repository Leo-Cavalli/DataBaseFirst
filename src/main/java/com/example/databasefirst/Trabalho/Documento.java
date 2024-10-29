package com.example.databasefirst.Trabalho;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "documentos")
public class Documento {
    @Id
    @Column(name = "ID_DOCUMENTO", nullable = false)
    private Integer id;

    @Column(name = "CATEGORIA_DOCUMENTO", length = 100)
    private String categoriaDocumento;

    @Lob
    @Column(name = "DOCUMENTO_ARQUIVO")
    private String documentoArquivo;

}