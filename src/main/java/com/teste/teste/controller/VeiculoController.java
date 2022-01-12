package com.teste.teste.controller;



import com.teste.teste.model.Veiculo;
import com.teste.teste.services.VeiculoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    @Autowired
    VeiculoService veiculoService;

    Logger log = Logger.getLogger("com.teste.teste.controller");

    @Operation(summary="Salva um veiculo")
    @PostMapping("/salvarVeiculo")
    @ResponseStatus (HttpStatus.CREATED)
    public Veiculo salvar (@RequestBody Veiculo veiculo) {
        veiculoService.salvar(veiculo);
        log.info("Veiculo salvo com sucesso retornando no corpo da requisicao o veiculo e Status Created");
        return veiculo;
    }

    @Operation(summary="Deletar um veiculo")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity <Void> deletar (@PathVariable String id) {
        veiculoService.deletar(id);
        log.info("Veiculo deletado com sucesso e retornando Status noContent");
        return ResponseEntity.noContent().build();

    }

    @Operation(summary="Obter um veiculo")
    @GetMapping
    public ResponseEntity<List<Veiculo>> obterTodos () {
        log.info("Retornando veiculo e Status ok");
        return ResponseEntity.ok().body(veiculoService.obterTodos());
    }

    @Operation(summary="Obter por codigo- veiculo")
    @GetMapping (path = "/{id}")
    public ResponseEntity<Veiculo> obterPorCodigo (@PathVariable String id) {
        log.info("Retornando veiculo no corpo da requisicao e Status ok");
        return ResponseEntity.ok().body(veiculoService.obterPorId(id));
    }

    @Operation(summary="Atualizar um veiculo")
    @PutMapping (path = "/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable String id, @RequestBody Veiculo veiculo) {
        log.info("Veiculo atualizados com sucesso e retornando Status ok");
        return ResponseEntity.ok().body(veiculoService.atualizar(veiculo));
    }
}
