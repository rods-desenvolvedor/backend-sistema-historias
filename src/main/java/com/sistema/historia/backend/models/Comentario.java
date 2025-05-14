package com.sistema.historia.backend.models;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_COMENTARIO")
public class Comentario {

    @Id
    @GeneratedValue()
    private UUID id;

    private String conteudo;

    @Column(name = "criado_em")
    private LocalDateTime criadoEm;
    
}
