package com.teste.teste.controller;



import com.teste.teste.model.Veiculo;
import com.teste.teste.services.VeiculoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    @Autowired
    VeiculoService veiculoService;

    @Operation(summary="Salva um veiculo")
    @PostMapping("/salvarVeiculo")
    public Veiculo salvar (@RequestBody Veiculo veiculo) {
        veiculoService.salvar(veiculo);
        return veiculo;
    }

    @Operation(summary="Deletar um veiculo")
    @DeleteMapping(path = "/{id}")
    public void deletar (@PathVariable String id) {
        veiculoService.deletar(id);

    }

    @Operation(summary="Obter um veiculo")
    @GetMapping
    public List<Veiculo> obterTodos () {
        return veiculoService.obterTodos();
    }

    @Operation(summary="Obter por codigo- veiculo")
    @GetMapping (path = "/{id}")
    public Veiculo obterPorCodigo (@PathVariable String id) {
        return veiculoService.obterPorId(id);
    }

    @Operation(summary="Atualizar um veiculo")
    @PutMapping (path = "/{id}")
    public Veiculo atualizar(@PathVariable String id, @RequestBody Veiculo veiculo) {
        return veiculoService.atualizar(veiculo);
    }
}
