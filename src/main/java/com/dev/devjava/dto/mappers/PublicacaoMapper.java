package com.dev.devjava.dto.mappers;

import com.dev.devjava.dto.publicacao.PublicacaoRequestDTO;
import com.dev.devjava.dto.publicacao.PublicacaoResponseDTO;
import com.dev.devjava.model.Publicacao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PublicacaoMapper {

    Publicacao converterEmPublicacao(PublicacaoRequestDTO publicacaoRequestDTO);


    @Mapping(target = "apelidoUsuario" , source = "publicacao.usuario.apelido")
    PublicacaoResponseDTO converterEmPublicacaoResponseDTO(Publicacao publicacao);

    List<PublicacaoResponseDTO> obterPublicacoes(List<Publicacao> all);
}
