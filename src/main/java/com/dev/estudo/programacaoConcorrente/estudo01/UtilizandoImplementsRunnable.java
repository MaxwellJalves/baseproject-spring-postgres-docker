package com.dev.estudo.programacaoConcorrente.estudo01;

public class UtilizandoImplementsRunnable implements Runnable {
    @Override
    public void run() {
        String nome = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.format(" %s  quantun %s %n", nome, String.valueOf(i));
        }
        System.out.printf("Finalizando %s %n", nome);
    }
}
