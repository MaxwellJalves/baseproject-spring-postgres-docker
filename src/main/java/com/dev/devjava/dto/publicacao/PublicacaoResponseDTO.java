package com.dev.devjava.dto.publicacao;

import com.dev.devjava.model.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicacaoResponseDTO {

    private UUID id;

    private String detalhes;

    private Categoria categoria;

    private Date data;

    private String apelidoUsuario;
}
