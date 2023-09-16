package com.labjs.rinha23.application.forms;

import com.labjs.rinha23.core.models.Pessoa;
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
public class PessoaForm{

        @Nonnull
        private String apelido;
        @Nonnull
        private String nome;

        @Nonnull
        private LocalDate nascimento;

        private List<String> stack;

        public static Pessoa toModel(PessoaForm pessoaForm){
                return Pessoa
                        .builder()
                        .apelido(pessoaForm.getApelido())
                        .nome(pessoaForm.getNome())
                        .nascimento(pessoaForm.getNascimento())
                        .stack(pessoaForm.getStack())
                        .uuid(UUID.randomUUID())
                        .build();
        }

}
