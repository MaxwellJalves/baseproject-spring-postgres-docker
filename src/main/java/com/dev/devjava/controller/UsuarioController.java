package com.dev.devjava.controller;

import com.dev.devjava.dto.UsuarioDtoRequest;
import com.dev.devjava.dto.UsuarioMapper;
import com.dev.devjava.model.Usuario;
import com.dev.devjava.repository.UsuarioRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/cadastro/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    UsuarioMapper mapper;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Usuario registrarUsuario(@RequestBody UsuarioDtoRequest usuario){
        //refatorar o mapper está eretornando null
        //mapper.usuarioDtoToUsuario(usuario);
        var us = usuario;

        Usuario request = usuarioRepository.save(new Usuario(UUID.randomUUID(),us.getNome(),us.getApelido()));
        return  request;
    }
}
