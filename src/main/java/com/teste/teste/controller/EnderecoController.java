package com.teste.teste.controller;


import com.teste.teste.model.Endereco;
import com.teste.teste.services.EnderecoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EnderecoController {
    @Autowired
    EnderecoService enderecoService;

    @Operation(summary="Salvar um endereco")
    @PostMapping("/salvarEnderecoProprietario")
    public Endereco salvar (@RequestBody Endereco endereco) {
        enderecoService.salvar(endereco);
        return endereco;
    }

    @Operation(summary="Deletar um endereco")
    @DeleteMapping(path = "/{id}")
    public void deletar (@PathVariable String id) {
        enderecoService.deletar(id);

    }
    @Operation(summary="Obter um endereco")
    @GetMapping
    public List<Endereco> obterTodos () {
        return enderecoService.obterTodos();
    }

    @Operation(summary="Obter por codigo- endereco")
    @GetMapping (path = "/{id}")
    public Endereco obterPorCodigo (@PathVariable String id) {
        return enderecoService.obterPorId(id);
    }

    @Operation(summary="Atualizar endereco")
    @PutMapping (path = "/{id}")
    public Endereco atualizar(@PathVariable String id, @RequestBody Endereco endereco) {return enderecoService.atualizar(endereco);}
}
