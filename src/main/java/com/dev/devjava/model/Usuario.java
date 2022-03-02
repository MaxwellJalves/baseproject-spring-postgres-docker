package com.dev.devjava.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String nome;

    public Usuario(){}

    public Usuario(Long id,String nome){
        this.id = id;
        this.nome = nome;
    }
    public Usuario(String nome){
        this.nome = nome;
    }
}
