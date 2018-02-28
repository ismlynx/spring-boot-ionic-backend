package com.ismaelamaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismaelamaral.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
