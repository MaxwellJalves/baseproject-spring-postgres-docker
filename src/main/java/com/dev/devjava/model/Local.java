package com.dev.devjava.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Local implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bairro;
    private int numero;
    private int sala;
    private String pontoDeReferencia;

    @OneToOne(mappedBy ="local")
    @JsonBackReference
    private Usuario usuario;
}
