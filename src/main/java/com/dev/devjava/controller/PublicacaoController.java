package com.dev.devjava.controller;

import com.dev.devjava.dto.publicacao.PublicacaoRequestDTO;
import com.dev.devjava.dto.publicacao.PublicacaoResponseDTO;
import com.dev.devjava.services.PublicacaoServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("api/publicacoes")
public class PublicacaoController {


    @Autowired
    PublicacaoServices publicacaoServices;

    @GetMapping
    @Operation(summary = "Listar todas as publicações", description = "Utilize esse end-poin para recuperar todas as publicações da base de dados.",
               tags={"Publicação"})
    @ApiResponses(value={
            @ApiResponse(responseCode = "200", description = "OK")
    })
    public ResponseEntity<List<PublicacaoResponseDTO>> listarPublicacoes() {

        return ResponseEntity.ok().body(publicacaoServices.findAll());
    }

    @PostMapping
    @Operation(summary = "Criar Publicação", description = "Utilize esse end-poin para criar uma publicação.",
            tags={"Publicação"})
    @ApiResponses(value = {
          @ApiResponse(responseCode = "201" , description = "Created :indica que a requisição foi bem sucedida e que um novo recurso foi criado "),
          @ApiResponse(responseCode = "400", description = "Bad Request : servidor não entendeu a requisição pois está com uma sintaxe inválida.")  ,
          @ApiResponse(responseCode = "404",description = "Not Found : O servidor não pode encontrar o recurso solicitado")
    })
    public ResponseEntity<PublicacaoResponseDTO> publicar( @RequestBody PublicacaoRequestDTO publicacao) throws URISyntaxException {
        var responsePublicacao = publicacaoServices.save(publicacao);
        URI location = URI.create(String.format("/api/publicacoes/%s", responsePublicacao.getId().toString()));
        return ResponseEntity.created(location).body(responsePublicacao);
    }


}
