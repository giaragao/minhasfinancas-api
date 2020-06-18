package com.giaragao.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giaragao.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
