package com.dev.devjava.dto.mappers;

import com.dev.devjava.dto.usuario.UsuarioRequestDTO;
import com.dev.devjava.dto.usuario.UsuarioResponseDTO;
import com.dev.devjava.model.Usuario;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {


    UsuarioResponseDTO converterParaUsuarioResponseDTO(Usuario usuario);

    Usuario converterParaUsuario(UsuarioRequestDTO usuarioDtoRequest);

    List<UsuarioResponseDTO> obterUsuarios(List<Usuario> all);
}
