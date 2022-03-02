package com.dev.devjava;

import com.dev.devjava.model.Publicacao;
import com.dev.devjava.model.Usuario;
import com.dev.devjava.repository.PublicacaoRepository;
import com.dev.devjava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


@SpringBootApplication
public class DevjavaApplication implements CommandLineRunner {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PublicacaoRepository publicacaoRepository;


    public static void main(String[] args) {
        SpringApplication.run(DevjavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        var maxwell =new Usuario(null,"Maxwell");
        var joao =new Usuario("joao");

        var response = usuarioRepository.saveAll(Arrays.asList(maxwell,joao));

        //Publicação
        var primeiraPublicacao = Publicacao.builder().descricao("Teste primeira publicacação").build();
        var segundaPublicacao = Publicacao.builder().descricao("Teste primeira publicacação").build();
        var responsePublicacoes = publicacaoRepository.saveAll(Arrays.asList(primeiraPublicacao,segundaPublicacao));

        System.out.println(response);
        System.out.println(responsePublicacoes);


    }
}
