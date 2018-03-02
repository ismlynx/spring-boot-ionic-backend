package com.ismaelamaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismaelamaral.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
