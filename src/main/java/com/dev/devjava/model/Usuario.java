package com.dev.devjava.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
@Data
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String nome;

    public Usuario(){}

    public Usuario(Long id,String nome,Local localId){
        this.id = id;
        this.nome = nome;
        this.local = localId;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id.local")
    private Local local;
}
