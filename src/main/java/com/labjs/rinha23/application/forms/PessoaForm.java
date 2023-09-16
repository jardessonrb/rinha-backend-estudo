package com.labjs.rinha23.application.forms;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PessoaForm{

        @Nonnull
        private String apelido;
        @Nonnull
        private String nome;

        @Nonnull
        private LocalDate nascimento;

        private List<String> stack;

}
