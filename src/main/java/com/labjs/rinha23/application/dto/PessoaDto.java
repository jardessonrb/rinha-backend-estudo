package com.labjs.rinha23.application.dto;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PessoaDto {

        private UUID id;

        private String apelido;

        private String nome;

        private LocalDate nascimento;

        private List<String> stack;

}
