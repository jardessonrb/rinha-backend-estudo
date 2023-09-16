package com.labjs.rinha23.core.repository;

import com.labjs.rinha23.core.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Optional<Pessoa> findByUuid(UUID id);

    Long countBy();

    @Query(value = "select * from pessoa where termo_busca like '%'||:termoBusca||'%' limit 50",
        nativeQuery = true)
    List<Pessoa> buscarPessoasPeloTermoBusca(@Param("termoBusca") String termo);

}
