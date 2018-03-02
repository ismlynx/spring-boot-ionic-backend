package com.ismaelamaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismaelamaral.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
