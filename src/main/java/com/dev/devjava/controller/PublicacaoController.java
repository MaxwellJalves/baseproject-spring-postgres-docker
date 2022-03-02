package com.dev.devjava.controller;

import com.dev.devjava.repository.PublicacaoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "publicacao")
public class PublicacaoController {

    @Autowired
    private PublicacaoRepository publicacaoRepository;

    @GetMapping(value = "/{id}")
    @ApiResponses(
            @ApiResponse(responseCode = "204 No Content")
    )
    @Operation(description = "Obter Publicação por id",
               summary = "Obter Publicacao")
    public ResponseEntity obterPublicacaoPorId(@PathVariable Long id) {

        var validacao = publicacaoRepository.findById(id);
        return validacao.isPresent() ?
                ResponseEntity.ok().body(validacao.get()) :
                ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity obterPublicacoes() {
        var validacao = publicacaoRepository.findAll();
        return ResponseEntity.ok().body(validacao);
    }
}
