package com.dev.devjava.controller;


import com.dev.devjava.dto.mappers.UsuarioMapper;
import com.dev.devjava.dto.usuario.UsuarioRequestDTO;
import com.dev.devjava.dto.usuario.UsuarioResponseDTO;
import com.dev.devjava.model.Usuario;
import com.dev.devjava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("api/cadastro/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioMapper usuarioMapper;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listarUsuarios() {
        var lista = usuarioMapper.obterUsuarios(usuarioRepository.findAll());
        return ResponseEntity.ok().body(lista);
    }


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UsuarioResponseDTO> registrarUsuario(@RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        try {
            Usuario response = usuarioRepository.save(usuarioMapper.converterParaUsuario(usuarioRequestDTO));
            URI uri = URI.create(String.format("/api/cadastro/usuario/%s", response.getId().toString()));
            return ResponseEntity.created(uri).build();
        } catch (Exception exception) {
            return ResponseEntity.badRequest().build();
        }


    }
}
