package com.dev.estudo.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class CarroDaPolicia implements Observer, Carro {
    @Override
    public void frente() {
        System.out.println("VIATURA DA POLICIA : PEGA ESSE FELAAAA!  em frente");
    }

    @Override
    public void direita() {
        System.out.println("VIATURA DA POLICIA : PEGA ESSE FELAAAA! a direita");
    }

    @Override
    public void esquerda() {
        System.out.println("VIATURA DA POLICIA : PEGA ESSE FELAAAA!  a esquerda");
    }

    @Override
    public void para() {
        System.out.println("VIATURA DA POLICIA : MÃOS NA CABEÇA VOCÊ ESTÁ PRESODA UPEGA ESSE FELAAAA! ");
    }


    @Override
    public void update(Observable param1, Object param2) {
        CarroRoubado roubado = (CarroRoubado) param1;
        String action = String.valueOf(param2);

        switch (action) {
            case "frente":
                this.frente();
                break;
            case "esquerda":
                this.esquerda();
                break;
            case "direita":
                this.direita();
                break;
            case "parar":
                this.para();
                break;
        }
    }
}
