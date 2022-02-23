package com.dev.devjava.controller;

import com.dev.devjava.model.Publicacao;
import com.dev.devjava.model.Usuario;
import com.dev.devjava.services.PublicacaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/publicacoes")
public class PublicacaoController {


    @Autowired
    PublicacaoServices publicacaoServices;

    @GetMapping
    public ResponseEntity<List<?>> listarPublicacoes(){
        return ResponseEntity.ok().body(publicacaoServices.findAll());
    }

    @PostMapping
    public ResponseEntity<Publicacao> publicar(@RequestBody Publicacao publicacao) throws URISyntaxException {
        var services = publicacaoServices.save(publicacao);
        URI location = URI.create(String.format("/api/publicacoes/%s", services.getId()));
        return ResponseEntity.created(location).body(services);
    }


}
