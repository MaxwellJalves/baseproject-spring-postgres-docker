package com.dev.devjava.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "publicacao")
public class Publicacao {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;

}
