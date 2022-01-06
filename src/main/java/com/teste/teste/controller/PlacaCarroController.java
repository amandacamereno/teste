package com.teste.teste.controller;


import com.teste.teste.model.PlacaCarro;
import com.teste.teste.services.PlacaCarroService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/placaCarro")
public class PlacaCarroController {
    @Autowired
    PlacaCarroService placaCarroService;

    @Operation(summary="Salvar placa carro")
    @PostMapping("/salvarPlacaCarro")
    public PlacaCarro salvar (@RequestBody PlacaCarro placaCarro) {
        placaCarroService.salvar(placaCarro);
        return placaCarro;
    }

    @Operation(summary="Deletar placa carro")
    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable String id) {
        placaCarroService.deletar(id);

    }
    @Operation(summary="Obter uma placa")
    @GetMapping
    public List<PlacaCarro> obterTodos () {
        return placaCarroService.obterTodos();
    }

    @Operation(summary="Obter por codigo- placa")
    @GetMapping (path = "/{id}")
    public PlacaCarro obterPorCodigo (@PathVariable String id) {
        return placaCarroService.obterPorId(id);
    }

    @Operation(summary="Atualizar placa")
    @PutMapping (path = "/{id}")
    public PlacaCarro atualizar(@PathVariable String id, @RequestBody PlacaCarro placaCarro) {
        return placaCarroService.atualizar(placaCarro);
    }
}
