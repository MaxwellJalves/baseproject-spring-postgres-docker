package com.dev.devjava.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    private UUID id;

    @Column(name = "nome", nullable = false)
    @NotNull(message = "Nome do usuário não pode ser nulo")
    private String nome;

    @Column(name = "apelido", length = 50)
    private String apelido;


}
