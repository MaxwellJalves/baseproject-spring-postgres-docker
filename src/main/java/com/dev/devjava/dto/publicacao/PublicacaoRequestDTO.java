package com.dev.devjava.dto.publicacao;

import com.dev.devjava.model.Categoria;
import com.dev.devjava.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicacaoRequestDTO {


    private UUID id;

    private String detalhes;

    private Categoria categoria;

    private Date data;

    private Usuario usuario;
}
