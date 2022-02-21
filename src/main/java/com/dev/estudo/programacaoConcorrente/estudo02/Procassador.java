package com.dev.estudo.programacaoConcorrente.estudo02;

public class Procassador {

    public static void main(String[] args) {
        Thread thread = new Thread(new ProcessarPublicacoes());
        thread.start();
        Thread thread2 = new Thread(new ProcessarTopicos());
        thread2.start();

    }
}
