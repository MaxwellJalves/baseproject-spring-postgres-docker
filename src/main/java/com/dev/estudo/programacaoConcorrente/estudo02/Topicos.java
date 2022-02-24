package com.dev.estudo.programacaoConcorrente.estudo02;

public enum Topicos {

    SP("SPORT"),
    VALORES("BOLSA DE VALORES"),
    NOTICIAS_QUENTES("BOMBA DO MOMENTO");

    private String nome;

    Topicos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
