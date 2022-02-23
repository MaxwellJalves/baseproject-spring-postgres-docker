package com.dev.devjava.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Publicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    @ManyToOne
    @JoinColumn(name = "usuario_uuid")
    private Usuario usuario;

    private  String detalhes;
}
