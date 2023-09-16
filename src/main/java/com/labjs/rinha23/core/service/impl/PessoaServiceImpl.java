package com.labjs.rinha23.core.service.impl;

import com.labjs.rinha23.application.dto.PessoaDto;
import com.labjs.rinha23.application.forms.PessoaForm;
import com.labjs.rinha23.core.models.Pessoa;
import com.labjs.rinha23.core.repository.PessoaRepository;
import com.labjs.rinha23.core.service.PessoaService;
import com.labjs.rinha23.core.validators.PessoaValidator;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    @Override
    public PessoaDto findByIdPessoa(UUID pessoaId) {
        Pessoa pessoa = pessoaRepository.findByUuid(pessoaId).orElse(null);

        return PessoaDto.toDto(pessoa);
    }

    @Override
    public List<PessoaDto> findByTermPessoa(String termo) {
        List<Pessoa> pessoas = pessoaRepository.buscarPessoasPeloTermoBusca(termo);
        return pessoas.stream().map(PessoaDto::toDto).toList();
    }

    @Override
    public PessoaDto create(PessoaForm pessoaForm) {
        PessoaValidator.validateForm(pessoaForm);

        Pessoa pessoa = PessoaForm.toModel(pessoaForm);
        pessoa.setTermoBusca(getTermForSearch(pessoaForm));
        pessoa = pessoaRepository.save(pessoa);

        return PessoaDto.toDto(pessoa);
    }

    @Override
    public Long countPessoa() {
        return pessoaRepository.countBy();
    }

    private String getTermForSearch(PessoaForm pessoaForm){
        StringBuilder termoBuilder = new StringBuilder();
        termoBuilder.append(pessoaForm.getNome().toLowerCase());
        termoBuilder.append(pessoaForm.getApelido().toLowerCase());
        termoBuilder.append(pessoaForm.getStack().stream().map(String::toLowerCase).collect(Collectors.joining()));
        return termoBuilder.toString();
    }
}
