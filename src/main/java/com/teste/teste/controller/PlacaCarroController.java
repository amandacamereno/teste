package com.teste.teste.controller;


import com.teste.teste.DTO.PlacaCarroDTO;
import com.teste.teste.model.PlacaCarro;
import com.teste.teste.repository.PlacaCarroRepository;
import com.teste.teste.services.PlacaCarroService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/placaCarro")
public class PlacaCarroController {

    @Autowired
    PlacaCarroService placaCarroService;

    @Autowired
    PlacaCarroRepository placaCarroRepository;

    Logger log = Logger.getLogger("com.teste.teste.controller");

    @Operation(summary="Salvar placa carro")
    @PostMapping("/admin/salvarPlacaCarro")
    @ResponseStatus (HttpStatus.CREATED)
    public PlacaCarro salvar (@Valid @RequestBody PlacaCarroDTO placaCarroDTO) {

        log.info("Entrando no metodo salvar placa");
        PlacaCarro placaCarro = placaCarroService.convertePlacaCarroDTO(placaCarroDTO);
        placaCarroService.salvar(placaCarro);
        log.info("Placa do carro salva com sucesso retornando no corpo da requisicao a placa do veiculo e Status Created");
        return placaCarro;
    }

    @Operation(summary="Deletar placa carro")
    @DeleteMapping(path = "/admin/{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id) {

        log.info("Entrando no metodo deletar placa");

        if (!placaCarroRepository.existsById(id)){
            log.info("Placa nao encontrada");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        placaCarroService.deletar(id);

        log.info("Placa carro deletado com sucesso e retornando Status noContent");
        return ResponseEntity.noContent().build();

    }
    @Operation(summary="Obter uma placa")
    @GetMapping
    public ResponseEntity<List<PlacaCarro>> obterTodos () {

        log.info("Entrando no metodo retornar placa");

        List<PlacaCarro> lista = placaCarroService.obterTodos();

        if (lista.isEmpty()){
            log.info("Placa nao encontrada");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Retornando placa carro e Status ok");
        return ResponseEntity.ok().body(placaCarroService.obterTodos());
    }

    @Operation(summary="Obter por codigo- placa")
    @GetMapping (path = "/{id}")
    public ResponseEntity<PlacaCarro> obterPorCodigo (@PathVariable String id) {

        log.info("Entrando no metodo retornar placa" );

        if (!placaCarroRepository.existsById(id)){
            log.info("Placa nao encontrada");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Retornando placa carro no corpo da requisicao e Status ok");
        return ResponseEntity.ok().body(placaCarroService.obterPorId(id));
    }

    @Operation(summary="Atualizar placa")
    @PutMapping (path = "/admin/{id}")
    public ResponseEntity<PlacaCarro> atualizar(@PathVariable String id, @RequestBody PlacaCarroDTO placaCarroDTO) {

        log.info("Entrando no metodo atualizar placa");

        PlacaCarro placaCarro = placaCarroService.convertePlacaCarroDTO(placaCarroDTO);


        placaCarro.setCodigo(id);
        placaCarro = placaCarroService.atualizar(placaCarro);

        log.info("Placa carro atualizados com sucesso e retornando Status ok");
        return ResponseEntity.ok().body(placaCarroService.atualizar(placaCarro));
    }

}
