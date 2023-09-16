package com.labjs.rinha23.application.controllers;

import com.labjs.rinha23.application.dto.PessoaDto;
import com.labjs.rinha23.application.forms.PessoaForm;
import com.labjs.rinha23.core.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class PessoaController {

    private final PessoaService pessoaService;

    @PostMapping("/pessoas")
    public ResponseEntity<PessoaDto> createPessoa(@RequestBody @Validated PessoaForm pessoaForm, UriComponentsBuilder uriComponentsBuilder){
        PessoaDto pessoaDto = pessoaService.create(pessoaForm);

        URI uri =uriComponentsBuilder.path("/pessoas/{id}").buildAndExpand(pessoaDto.getId()).toUri();

        return ResponseEntity.created(uri).body(pessoaDto);
    }

    @GetMapping("/pessoas")
    public ResponseEntity<List<PessoaDto>> findPessoas(@RequestParam(required = true, name = "t") String termo){
        return ResponseEntity.ok(pessoaService.findByTermPessoa(termo));
    }

    @GetMapping("/pessoas/{id}")
    public ResponseEntity<PessoaDto> findPessoas(@PathVariable(name = "id") UUID id){
        return ResponseEntity.ok(pessoaService.findByIdPessoa(id));
    }

    @GetMapping("/contagem-pessoas")
    public ResponseEntity<Long> countPessoas(){
        return ResponseEntity.ok(pessoaService.countPessoa());
    }
}
