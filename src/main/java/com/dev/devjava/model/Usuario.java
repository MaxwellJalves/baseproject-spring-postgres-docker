package com.dev.devjava.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid = UUID.randomUUID();

    @Column(name = "nome")
    private String nome;

    @Column(name = "apelido" , length = 50  )
    private String apelido;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }
}
