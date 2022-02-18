package com.dev.devjava.application.controller;

import com.dev.devjava.application.entity.Galeria;
import com.dev.devjava.application.repository.GaleriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("api/galeria")
public class GaleriaController {

    @Autowired
    private GaleriaRepository galeriaRepository;

    @GetMapping
    public ResponseEntity<List<Galeria>> listarDadosGaleria(){

       var galeria = galeriaRepository.findAll();
       if(!galeria.isEmpty()){
           return ResponseEntity.ok().body(galeria);
       }else{
           return ResponseEntity.notFound().build();
       }

    }
}
