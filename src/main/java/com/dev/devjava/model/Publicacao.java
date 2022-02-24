package com.dev.devjava.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
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

    private String detalhes;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private Date data;

    @ManyToOne
    @JoinColumn(name = "usuario_uuid")
    private Usuario usuario;

}
