package com.dev.estudo.programacaoConcorrente.estudo02;

import java.util.ArrayList;
import java.util.List;

public class ProcessarPublicacoes extends Thread {
    List<String> publicacao = new ArrayList<>();

     private void adicionar(){
        publicacao.add("Primeiro post");
        publicacao.add("Segundo post");
        publicacao.add("Terceiro post");
        publicacao.add("Quarto post");
        publicacao.add("Quinto post");
     }
    public void run(){
         String nomeDaTarefa = Thread.currentThread().getName();
         this.adicionar();
         for(String pub: publicacao){
             System.out.printf("Executando %s valor obtido %s %n",nomeDaTarefa,pub);
         }
    }
}
