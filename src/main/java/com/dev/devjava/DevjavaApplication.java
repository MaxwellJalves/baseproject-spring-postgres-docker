package com.dev.devjava;

import com.dev.devjava.model.Local;
import com.dev.devjava.model.Publicacao;
import com.dev.devjava.model.Usuario;
import com.dev.devjava.repository.LocalRepository;
import com.dev.devjava.repository.PublicacaoRepository;
import com.dev.devjava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class DevjavaApplication implements CommandLineRunner {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PublicacaoRepository publicacaoRepository;

    @Autowired
    LocalRepository localRepository;


    public static void main(String[] args) {
        SpringApplication.run(DevjavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {





        //Publicação
        var primeiraPublicacao = Publicacao.builder().descricao("Teste primeira publicacação").build();
        var segundaPublicacao = Publicacao.builder().descricao("Teste primeira publicacação").build();


        var local = new Local();
        local.setNumero(1200);
        local.setBairro("Centro");
        local.setPontoDeReferencia("Proximo a Tupan dos aflitos");
        local.setSala(122);

        var localJoao = new Local();
        localJoao.setNumero(100);
        localJoao.setBairro("Boa vista");
        localJoao.setPontoDeReferencia("Segunda parada depois do shopping , sentido metrô.");
        localJoao.setSala(3);
        var maxwell =new Usuario(null,"Maxwell",local);
        var joao =new Usuario(null,"joao",localJoao);

        System.out.println("Valor antes de inserir no bando"+ maxwell);


        var response = usuarioRepository.saveAll(Arrays.asList(maxwell,joao));
        var localResponse=  localRepository.save(local);
        var responsePublicacoes = publicacaoRepository.saveAll(Arrays.asList(primeiraPublicacao,segundaPublicacao));


        System.out.printf("LOG Usuario : %s",response);
        System.out.printf("\nLOG Local   : %s",localResponse);
        System.out.printf("\nLOG Publicacao: %s",responsePublicacoes);


    }
}
