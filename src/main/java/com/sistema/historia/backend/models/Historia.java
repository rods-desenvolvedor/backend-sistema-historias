package com.sistema.historia.backend.models;

import java.time.LocalDateTime;
import java.util.UUID;


import com.sistema.historia.backend.models.enums.GeneroEnum;
import com.sistema.historia.backend.models.enums.StatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_HISTORIA")
public class Historia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String titulo;
    
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero_enum")
    private GeneroEnum generoEnum;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status_enum")
    private StatusEnum statusEnum;

    @Column(name = "criado_em")
    private LocalDateTime criadoEm;
}
