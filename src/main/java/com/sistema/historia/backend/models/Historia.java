package com.sistema.historia.backend.models;

import java.time.LocalDateTime;
import java.util.UUID;


import com.sistema.historia.backend.models.enums.GeneroEnum;
import com.sistema.historia.backend.models.enums.StatusEnum;

import jakarta.persistence.Entity;
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

    private GeneroEnum genero;

    private StatusEnum status;

    private LocalDateTime criadoEm;
}
