package com.teste.teste.controller;

import com.teste.teste.model.DadosProprietario;
import com.teste.teste.services.DadosProprietarioService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dadosProprietario")
public class DadosProprietarioController {
    @Autowired
    DadosProprietarioService dadosProprietarioService;

    Logger log = Logger.getLogger("com.teste.teste.controller");

    @Operation(summary="Salva dados proprietario")
    @PostMapping("/salvarDadosProprietario")
    @ResponseStatus (HttpStatus.CREATED)
    public DadosProprietario salvar(@RequestBody DadosProprietario dadosProprietario) {
        dadosProprietarioService.salvar(dadosProprietario);
    log.info("Dados do proprietario salvos com sucesso retornando no corpo da requisicao os dados do proprietario e Status Created");
        return dadosProprietario;
    }

    @Operation(summary="Deletar dados proprietario")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id) {
        dadosProprietarioService.deletar(id);
        log.info("Dados deletados com sucesso e retornando Status noContent");
        return ResponseEntity.noContent().build();

    }

    @Operation(summary="Obter dados")
    @GetMapping
    public ResponseEntity<List<DadosProprietario>> obterTodos() {
        log.info("Retornando dados do proprietario e Status ok");
        return ResponseEntity.ok().body(dadosProprietarioService.obterTodos());
    }

    @Operation(summary="Obter por codigo- dados proprietario")
    @GetMapping(path = "/{id}")
    public ResponseEntity<DadosProprietario> obterPorCodigo(@PathVariable String id) {
        log.info("Retornando dados do proprietario no corpo da requisicao e Status ok");
        return ResponseEntity.ok().body(dadosProprietarioService.obterPorId(id));
    }

    @Operation(summary="Atualizar dados")
    @PutMapping(path = "/{id}")
    public ResponseEntity<DadosProprietario> atualizar(@PathVariable String id, @RequestBody DadosProprietario dadosProprietario) {
        log.info("Dados do proprietario atualizados com sucesso e retornando Status ok");
        return ResponseEntity.ok().body(dadosProprietarioService.atualizar(dadosProprietario));
    }
}
