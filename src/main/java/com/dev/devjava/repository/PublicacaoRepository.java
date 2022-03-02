package com.dev.devjava.repository;

import com.dev.devjava.model.Publicacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacaoRepository extends JpaRepository<Publicacao,Long> {
}
