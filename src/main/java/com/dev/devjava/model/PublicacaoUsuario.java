package com.dev.devjava.model;

import javax.persistence.*;

@Entity
public class PublicacaoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "publicacao_id")
    private Publicacao publicacao;

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public PublicacaoUsuario() {
    }

    public PublicacaoUsuario(Long idUsuario, Long idPublicacao) {
        this.usuario.setId(idUsuario);
        this.publicacao.setId(idPublicacao);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }
}
