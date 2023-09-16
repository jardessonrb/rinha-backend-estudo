package com.labjs.rinha23.core.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private UUID uuid = UUID.randomUUID();

    @Column(nullable = false, unique = true, length = 32)
    private String apelido;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false)
    private LocalDate nascimento;

    @ElementCollection
    @CollectionTable(name = "pessoa_stack", joinColumns = @JoinColumn(name = "pessoa_id"))
    @Column(name = "stack")
    private List<String> stack =  new ArrayList<>();

    @Column(nullable = false)
    private String termoBusca;
}
