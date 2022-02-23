package com.dev.devjava.dto;


import java.util.UUID;

public class UsuarioDtoRequest {
    private String nome;
    private String apelido;

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
