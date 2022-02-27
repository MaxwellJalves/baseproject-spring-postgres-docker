package com.dev.estudo.programacaoConcorrente.estudo01;

public class UtilizandoExtendsThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.format("Executando Thread!!  contador %s %n", String.valueOf(i));
        }
    }

}
