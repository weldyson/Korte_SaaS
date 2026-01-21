package com.example.weldyson.korteSaas.Korte_SaaS.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity

@Table(name = "tenants")
@Getter
@Setter
@NoArgsConstructor

public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    private String cnpj;

    @Column(name = "data_cadastro", updatable = false)
    private LocalDateTime dataCadastro;
}

