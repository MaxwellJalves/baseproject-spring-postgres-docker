package com.dev.devjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Teste {

    @GetMapping
    public String connect(){
        return "CONEXão ATIVA";
    }
}
