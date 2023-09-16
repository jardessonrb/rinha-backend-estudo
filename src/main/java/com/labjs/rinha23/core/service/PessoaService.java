package com.labjs.rinha23.core.service;

import com.labjs.rinha23.application.dto.PessoaDto;
import com.labjs.rinha23.application.forms.PessoaForm;

import java.util.List;
import java.util.UUID;

public interface PessoaService {

    PessoaDto findByIdPessoa(UUID pessoaId);

    List<PessoaDto> findByTermPessoa(String termo);

    PessoaDto create(PessoaForm pessoa);

    Long countPessoa();
}
