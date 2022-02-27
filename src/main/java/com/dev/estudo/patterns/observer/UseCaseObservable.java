package com.dev.estudo.patterns.observer;

import java.util.Observer;

public class UseCaseObservable {
    public static void main(String[] args) {
        //Observador
        CarroDaPolicia policia = new CarroDaPolicia();

        //Observado
        CarroRoubado ladrao = new CarroRoubado();

        //Adicionar observador ao observado
        ladrao.addObserver((Observer) policia);

        ladrao.direita();
        ladrao.esquerda();
        ladrao.frente();
        ladrao.esquerda();
        ladrao.esquerda();
        ladrao.para();

    }
}
