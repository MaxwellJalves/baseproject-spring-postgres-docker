package com.dev.devjava.dto;


import java.util.UUID;

public class UsuarioDTO {

    private UUID id;
    private String nome;
    private String apelido;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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
