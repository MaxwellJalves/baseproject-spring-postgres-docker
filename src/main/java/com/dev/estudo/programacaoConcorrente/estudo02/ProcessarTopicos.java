package com.dev.estudo.programacaoConcorrente.estudo02;

public class ProcessarTopicos extends  Thread{


    public void run() {
     String nome = Thread.currentThread().getName();
     System.out.println("DEBUG" +  nome);
     System.out.println(Topicos.NOTICIAS_QUENTES.getNome());

    }
}
