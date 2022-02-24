package com.dev.devjava.services;

import com.dev.devjava.dto.mappers.PublicacaoMapper;
import com.dev.devjava.dto.publicacao.PublicacaoRequestDTO;
import com.dev.devjava.dto.publicacao.PublicacaoResponseDTO;
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
        var publicacaoResponse = publicacaoRepository.save(publicacaoMapper.converterEmPublicacao(publicacao));
        try{
            return publicacaoMapper.converterEmPublicacaoResponseDTO(publicacaoResponse);
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    public Publicacao obterPublicacao(String id) {

        Optional<Publicacao> obterPublicacao = publicacaoRepository.findById(id);
        return obterPublicacao.get();
    }
}
