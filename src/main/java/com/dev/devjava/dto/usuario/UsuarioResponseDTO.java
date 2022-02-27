package com.dev.devjava.dto.usuario;

import lombok.Data;

import java.util.UUID;

@Data
public class UsuarioResponseDTO {
    private UUID id;
    private String nome;
    private String apelido;

}
