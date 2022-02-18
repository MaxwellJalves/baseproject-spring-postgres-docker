package com.dev.devjava.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class Ping {

    @RequestMapping
    public String pong(){
        return "Conexão ativa! ";
    }
}
