package com.dev.devjava.services;

import com.dev.devjava.model.Publicacao;
import com.dev.devjava.model.Usuario;
import com.dev.devjava.repository.PublicacaoRepository;
import com.dev.devjava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@Service
public class PublicacaoServices {

    @Autowired
    PublicacaoRepository publicacaoRepository;

    public List<Publicacao> findAll() {

        return publicacaoRepository.findAll();
    }

    public Publicacao save(Publicacao publicacao) {
        Publicacao salvar = publicacaoRepository.save(publicacao);
        System.out.printf("LOGGGGGG %s",salvar);
        return salvar;
    }

    public Publicacao obterPublicacao(String id){

        Optional<Publicacao> obterPublicacao = publicacaoRepository.findById(id);
        return obterPublicacao.get();
    }
}
