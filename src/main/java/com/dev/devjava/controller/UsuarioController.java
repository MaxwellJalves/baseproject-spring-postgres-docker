package com.dev.devjava.controller;

import com.dev.devjava.repository.UsuarioRepository;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/{id}")
    @ApiResponses(
            @ApiResponse(responseCode = "204 No Content")
    )
    public ResponseEntity obterUsuarioPorID(@PathVariable Long id) {

        var validacao = usuarioRepository.findById(id);
        return validacao.isPresent() ?
                ResponseEntity.ok().body(validacao.get()) :
                ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity obterUsuarios() {
        var validacao = usuarioRepository.findAll();
        return ResponseEntity.ok().body(validacao);
    }
}
