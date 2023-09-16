package com.labjs.rinha23.core.validators;

import com.labjs.rinha23.application.forms.PessoaForm;

import java.util.Objects;

public class PessoaValidator {

    public static void validateForm(PessoaForm pessoaForm){
        if(Objects.isNull(pessoaForm.getApelido()) || Objects.isNull(pessoaForm.getNome()) || Objects.isNull(pessoaForm.getNascimento())){
            throw new IllegalArgumentException("Parâmetros inválidos.");
        }

        if(pessoaForm.getNome().isEmpty() || pessoaForm.getNome().isEmpty() || pessoaForm.getNome().matches("\\d+")){
            throw new IllegalArgumentException("Parâmetros inválidos.");
        }

        if(pessoaForm.getStack() != null){
            Boolean possuiStackQueNaoEhString = pessoaForm.getStack().stream().anyMatch(stack -> stack.matches("\\d+"));
            if(possuiStackQueNaoEhString){
                throw new IllegalArgumentException("Parâmetros inválidos.");
            }
        }
    }
}
