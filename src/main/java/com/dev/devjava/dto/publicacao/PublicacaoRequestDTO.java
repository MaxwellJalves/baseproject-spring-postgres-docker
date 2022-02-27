package com.dev.devjava.dto.publicacao;

import com.dev.devjava.model.Categoria;
import com.dev.devjava.model.Usuario;
import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "Detalhe o que deseja publicar",example = "Publicação referente ao setor de tecnologia que está em constante evolução.")
    private String detalhes;

    @Schema(description = "Infome qual categoria a publicação pertence", example = "TI")
    private Categoria categoria;

    @Schema(description = "Responsável por registrar o momento da publicação")
    private Date data;

    @Schema(description = "Dados do úsuario que está publicando",example = "nome: 'dev-fullstack")
    private Usuario usuario;
}
