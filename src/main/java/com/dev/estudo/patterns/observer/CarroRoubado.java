package com.dev.estudo.patterns.observer;

import java.util.Observable;

public class CarroRoubado extends Observable implements Carro {
    String acao = "";

    @Override
    public void frente() {
        acao = "frente";
        System.out.println("Siga em frente");
        this.mudaEstado();
    }

    @Override
    public void direita() {
        acao = "direita";
        System.out.println("Dobre a direita");
        this.mudaEstado();
    }

    @Override
    public void esquerda() {
        acao = "esquerda";
        System.out.println("Dobre a esquerda");
        this.mudaEstado();
    }

    @Override
    public void para() {
        acao = "parar";
        System.out.println("Pare o veiculo");
        this.mudaEstado();
    }

    public void mudaEstado() {
        setChanged();
        notifyObservers(acao);
    }
}
