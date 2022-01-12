package com.teste.teste.controller;


import com.teste.teste.model.Endereco;
import com.teste.teste.services.EnderecoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EnderecoController {
    @Autowired
    EnderecoService enderecoService;

    Logger log = Logger.getLogger("com.teste.teste.controller");

    @Operation(summary="Salvar um endereco")
    @PostMapping("/salvarEnderecoProprietario")
    @ResponseStatus (HttpStatus.CREATED)
    public Endereco salvar (@RequestBody Endereco endereco) {
        enderecoService.salvar(endereco);
        log.info("Endereco salvo com sucesso retornando no corpo da requisicao o endereco do proprietario e Status Created");
        return endereco;
    }

    @Operation(summary="Deletar um endereco")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletar (@PathVariable String id) {
        enderecoService.deletar(id);
        log.info("Endereco deletado com sucesso e retornando Status noContent");
        return ResponseEntity.noContent().build();

    }
    @Operation(summary="Obter um endereco")
    @GetMapping
    public ResponseEntity<List<Endereco>> obterTodos () {
        log.info("Retornando endereco e Status ok");
        return ResponseEntity.ok().body(enderecoService.obterTodos());
    }

    @Operation(summary="Obter por codigo- endereco")
    @GetMapping (path = "/{id}")
    public ResponseEntity<Endereco> obterPorCodigo (@PathVariable String id) {
        log.info("Retornando endereco no corpo da requisicao e Status ok");
        return ResponseEntity.ok().body(enderecoService.obterPorId(id));
    }

    @Operation(summary="Atualizar endereco")
    @PutMapping (path = "/{id}")
    public ResponseEntity<Endereco> atualizar(@PathVariable String id, @RequestBody Endereco endereco) {
        log.info("Endereco atualizados com sucesso e retornando Status ok");
        return ResponseEntity.ok().body(enderecoService.atualizar(endereco));
    }
}
