package com.dev.devjava.dto;

import com.dev.devjava.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper
public interface UsuarioMapper {

    @Mapping(target = "id" , source = "uuid" )
    UsuarioDTO usuarioToUsuarioDto(Usuario usuario);

    @Mapping(target = "nome" ,source = "nome")
    @Mapping(target = "apelido" ,source = "apelido")
    Usuario usuarioDtoToUsuario(UsuarioDtoRequest usuarioDtoRequest);
}

/*
*
* Ao utilizar a propriedade do Mapper (componentModel = "jsr330") utilizada no micronout retornar a seguinte critica no sprig.
*
* Compilation failure
Couldn't find type javax.inject.Singleton. Are you missing a dependency on your classpath?
* */