package com.dev.devjava.controller;

import com.dev.devjava.model.Usuario;
import com.dev.devjava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cadastro/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Usuario registrarUsuario(@RequestBody Usuario usuario){
        var request = usuarioRepository.save(usuario);
        return  request;
    }
}
