package com.dev.devjava.model;

import lombok.Getter;

@Getter
public enum Categoria {
    TI("Tecnologia da Informação"),
    ADM("Administração"),
    MIDIA("Midias Digitais"),
    MENTORIA("Mentoria");

    private String nome;

    Categoria(String props) {
        this.nome = props;
    }
}
