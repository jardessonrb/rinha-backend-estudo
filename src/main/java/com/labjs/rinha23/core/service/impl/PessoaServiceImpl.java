package com.labjs.rinha23.core.service.impl;

import com.labjs.rinha23.application.dto.PessoaDto;
import com.labjs.rinha23.application.forms.PessoaForm;
import com.labjs.rinha23.core.repository.PessoaRepository;
import com.labjs.rinha23.core.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    @Override
    public PessoaDto findByIdPessoa(UUID pessoaId) {
        return null;
    }

    @Override
    public List<PessoaDto> findByTermPessoa(String termo) {
        return null;
    }

    @Override
    public PessoaDto create(PessoaForm pessoa) {
        return null;
    }

    @Override
    public Long countPessoa() {
        return null;
    }
}
