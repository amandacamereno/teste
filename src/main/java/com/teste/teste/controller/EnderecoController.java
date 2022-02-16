package com.teste.teste.controller;


import com.teste.teste.DTO.EnderecoDTO;
import com.teste.teste.model.Endereco;
import com.teste.teste.repository.EnderecoRepository;
import com.teste.teste.services.EnderecoService;
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
@RequestMapping("/api")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @Autowired
    EnderecoRepository enderecoRepository;

    Logger log = Logger.getLogger("com.teste.teste.controller");

    @Operation(summary="Salvar um endereco")
    @PostMapping("/admin/salvarEnderecoProprietario")
    @ResponseStatus (HttpStatus.CREATED)

    public Endereco salvar (@Valid @RequestBody EnderecoDTO enderecoDTO) {

        log.info("Entrando no metodo salvar endereco");

        Endereco endereco = enderecoService.converteEnderecoDTO(enderecoDTO);
        enderecoService.salvar(endereco);

        log.info("Endereco salvo com sucesso retornando no corpo da requisicao o endereco do proprietario e Status Created");
        return endereco;
    }

    @Operation(summary="Deletar um endereco")
    @DeleteMapping(path = "/admin/{id}")
    public ResponseEntity<Void> deletar (@PathVariable String id) {

        log.info("Entrando no metodo deletar endereco");

        if (!enderecoRepository.existsById(id)){
            log.info("Endereco nao encontrado");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        enderecoService.deletar(id);

        log.info("Endereco deletado com sucesso e retornando Status noContent");

        return ResponseEntity.noContent().build();

    }
    @Operation(summary="Obter um endereco")
    @GetMapping
    public ResponseEntity<List<Endereco>> obterTodos () {

        log.info("Entrando no metodo retornar endereco");

        List<Endereco> lista = enderecoService.obterTodos();

        if (lista.isEmpty()){
            log.info("Endereco nao encontrado");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Retornando endereco e Status ok");
        return ResponseEntity.ok().body(enderecoService.obterTodos());
    }

    @Operation(summary="Obter por codigo- endereco")
    @GetMapping (path = "/{id}")
    public ResponseEntity<Endereco> obterPorCodigo (@PathVariable String id) {

        log.info("Entrando no metodo retornar endereco");

        if (!enderecoRepository.existsById(id)){
            log.info("Endereco nao encontrado");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Retornando endereco no corpo da requisicao e Status ok");
        return ResponseEntity.ok().body(enderecoService.obterPorId(id));
    }

    @Operation(summary="Atualizar endereco")
    @PutMapping (path = "/admin/{id}")
    public ResponseEntity<Endereco> atualizar(@PathVariable String id, @RequestBody EnderecoDTO enderecoDTO) {

        log.info("Entrando no metodo atualizar endereco");

                Endereco endereco = enderecoService.converteEnderecoDTO(enderecoDTO);


        endereco.setCodigo(id);
        endereco = enderecoService.atualizar(endereco);

        log.info("Endereco atualizados com sucesso e retornando Status ok");
        return ResponseEntity.ok().body(enderecoService.atualizar(endereco));
    }
}
