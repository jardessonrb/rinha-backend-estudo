package com.labjs.rinha23.application.dto;

import com.labjs.rinha23.core.models.Pessoa;
import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class PessoaDto {

        private UUID id;

        private String apelido;

        private String nome;

        private LocalDate nascimento;

        private List<String> stack;


        public static PessoaDto toDto(Pessoa pessoa){
                if(pessoa == null) return null;

                return PessoaDto
                        .builder()
                        .id(pessoa.getUuid())
                        .nascimento(pessoa.getNascimento())
                        .stack(pessoa.getStack())
                        .apelido(pessoa.getApelido())
                        .nome(pessoa.getNome())
                        .build();
        }

}
