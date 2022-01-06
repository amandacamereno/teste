package com.teste.teste.controller;

import com.teste.teste.model.DadosProprietario;
import com.teste.teste.services.DadosProprietarioService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dadosProprietario")
public class DadosProprietarioController {
    @Autowired
    DadosProprietarioService dadosProprietarioService;

    @Operation(summary="Salva dados proprietario")
    @PostMapping("/salvarDadosProprietario")
    public DadosProprietario salvar(@RequestBody DadosProprietario dadosProprietario) {
        dadosProprietarioService.salvar(dadosProprietario);
        return dadosProprietario;
    }

    @Operation(summary="Deletar dados proprietario")
    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable String id) {
        dadosProprietarioService.deletar(id);

    }

    @Operation(summary="Obter um veiculo")
    @GetMapping
    public List<DadosProprietario> obterTodos() {
        return dadosProprietarioService.obterTodos();
    }

    @Operation(summary="Obter por codigo- veiculo")
    @GetMapping(path = "/{id}")
    public DadosProprietario obterPorCodigo(@PathVariable String id) {
        return dadosProprietarioService.obterPorId(id);
    }

    @Operation(summary="Atualizar um veiculo")
    @PutMapping(path = "/{id}")
    public DadosProprietario atualizar(@PathVariable String id, @RequestBody DadosProprietario dadosProprietario) {
        return dadosProprietarioService.atualizar(dadosProprietario);
    }
}
