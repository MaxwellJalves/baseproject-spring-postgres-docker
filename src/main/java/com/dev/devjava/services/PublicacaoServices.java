package com.dev.devjava.services;

import com.dev.devjava.dto.mappers.PublicacaoMapper;
import com.dev.devjava.dto.publicacao.PublicacaoRequestDTO;
import com.dev.devjava.dto.publicacao.PublicacaoResponseDTO;
import com.dev.devjava.exception.PublicacaoExceptionBadRequest;
import com.dev.devjava.model.Publicacao;
import com.dev.devjava.repository.PublicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PublicacaoServices {

    @Autowired
    PublicacaoRepository publicacaoRepository;

    @Autowired
    PublicacaoMapper publicacaoMapper;

    public List<PublicacaoResponseDTO> findAll() {

        return publicacaoMapper.obterPublicacoes(publicacaoRepository.findAll());
    }

    public PublicacaoResponseDTO save(PublicacaoRequestDTO publicacao) {

        Optional<Publicacao> publicacaoResponse = Optional.of(publicacaoRepository.save(publicacaoMapper.converterEmPublicacao(publicacao)));
        return publicacaoMapper.converterEmPublicacaoResponseDTO(publicacaoResponse.orElseThrow(() -> new PublicacaoExceptionBadRequest("Erro ao Criar publicação")));
    }

    public Publicacao obterPublicacao(String id) {

        Optional<Publicacao> obterPublicacao = publicacaoRepository.findById(id);
        return obterPublicacao.get();
    }
}
