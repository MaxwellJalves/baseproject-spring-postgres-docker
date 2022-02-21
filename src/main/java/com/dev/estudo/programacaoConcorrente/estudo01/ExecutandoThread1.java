package com.dev.estudo.programacaoConcorrente.estudo01;

public class ExecutandoThread1 {

    private static final String [] nomeDaThread = new String[]{"THREAD1","\t\tTHREAD2"};

    public static void main(String[] args) {


        Thread thread = new Thread(new UtilizandoImplementsRunnable(),nomeDaThread[0]);
        Thread thread2 = new Thread(new UtilizandoImplementsRunnable(),nomeDaThread[1]);

        thread.start();
        thread2.start();
    }
}
