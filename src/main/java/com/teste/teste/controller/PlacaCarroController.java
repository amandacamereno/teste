package com.teste.teste.controller;


import com.teste.teste.model.PlacaCarro;
import com.teste.teste.services.PlacaCarroService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/placaCarro")
public class PlacaCarroController {
    @Autowired
    PlacaCarroService placaCarroService;

    Logger log = Logger.getLogger("com.teste.teste.controller");

    @Operation(summary="Salvar placa carro")
    @PostMapping("/salvarPlacaCarro")
    @ResponseStatus (HttpStatus.CREATED)
    public PlacaCarro salvar (@RequestBody PlacaCarro placaCarro) {
        placaCarroService.salvar(placaCarro);
        log.info("Placa do carro salva com sucesso retornando no corpo da requisicao a placa do veiculo e Status Created");
        return placaCarro;
    }

    @Operation(summary="Deletar placa carro")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity <Void> deletar(@PathVariable String id) {
        placaCarroService.deletar(id);
        log.info("Placa carro deletado com sucesso e retornando Status noContent");
        return ResponseEntity.noContent().build();

    }
    @Operation(summary="Obter uma placa")
    @GetMapping
    public ResponseEntity<List<PlacaCarro>> obterTodos () {
        log.info("Retornando placa carro e Status ok");
        return ResponseEntity.ok().body(placaCarroService.obterTodos());
    }

    @Operation(summary="Obter por codigo- placa")
    @GetMapping (path = "/{id}")
    public ResponseEntity<PlacaCarro> obterPorCodigo (@PathVariable String id) {
        log.info("Retornando placa carro no corpo da requisicao e Status ok");
        return ResponseEntity.ok().body(placaCarroService.obterPorId(id));
    }

    @Operation(summary="Atualizar placa")
    @PutMapping (path = "/{id}")
    public ResponseEntity<PlacaCarro> atualizar(@PathVariable String id, @RequestBody PlacaCarro placaCarro) {
        log.info("Placa carro atualizados com sucesso e retornando Status ok");
        return ResponseEntity.ok().body(placaCarroService.atualizar(placaCarro));
    }

}
