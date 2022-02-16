package com.teste.teste.controller;

import com.teste.teste.DTO.DadosProprietarioDTO;
import com.teste.teste.model.DadosProprietario;
import com.teste.teste.repository.DadosProprietarioRepository;
import com.teste.teste.services.DadosProprietarioService;
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
@RequestMapping("/dadosProprietario")
public class DadosProprietarioController {
    @Autowired
    DadosProprietarioService dadosProprietarioService;

    @Autowired
    DadosProprietarioRepository dadosProprietarioRepository;

    Logger log = Logger.getLogger("com.teste.teste.controller");

    @Operation(summary="Salva dados proprietario")
    @PostMapping("/admin/salvarDadosProprietario")
    @ResponseStatus (HttpStatus.CREATED)
    public DadosProprietario salvar(@Valid @RequestBody DadosProprietarioDTO dadosProprietarioDTO) {

        log.info("Entrando no metodp salvar dados do proprietario");

        DadosProprietario dadosProprietario = dadosProprietarioService.convertDadosProprietarioDTO(dadosProprietarioDTO);
        dadosProprietarioService.salvar(dadosProprietario);

        log.info("Dados do proprietario salvos com sucesso retornando no corpo da requisicao os dados do proprietario e Status Created");
        return dadosProprietario;
    }

    @Operation(summary="Deletar dados proprietario")
    @DeleteMapping(path = "/admin/{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id) {

        log.info("Entrando no metodo deletar dados");

        if (!dadosProprietarioRepository.existsById(id)){
            log.info("Dados nao encontrados");

            log.info("Proprietario nao encontrado");

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        dadosProprietarioService.deletar(id);

        log.info("Dados deletados com sucesso e retornando Status noContent");
        return ResponseEntity.noContent().build();

    }

    @Operation(summary="Obter dados")
    @GetMapping
    public ResponseEntity<List<DadosProprietario>> obterTodos() {

        log.info("Entrando no metodo retornar Dados do proprietario");

        List<DadosProprietario> lista = dadosProprietarioService.obterTodos();

        if(lista.isEmpty()){
            log.info("Dados nao encontrados");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Retornando dados do proprietario e Status ok");
        return ResponseEntity.ok().body(dadosProprietarioService.obterTodos());
    }

    @Operation(summary="Obter por codigo- dados proprietario")
    @GetMapping(path = "/{id}")
    public ResponseEntity<DadosProprietario> obterPorCodigo(@PathVariable String id) {

        log.info("Entrando no metodo retornar dadoss do proprietario");

        if (!dadosProprietarioRepository.existsById(id)){
            log.info("Dados nao encontrados");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Retornando dados do proprietario no corpo da requisicao e Status ok");
        return ResponseEntity.ok().body(dadosProprietarioService.obterPorId(id));
    }

    @Operation(summary="Atualizar dados")
    @PutMapping(path = "/admin/{id}")
    public ResponseEntity<DadosProprietario> atualizar(@PathVariable String id, @RequestBody DadosProprietarioDTO dadosProprietarioDTO) {
        log.info("Entrando no metodo atualizar dados");

        DadosProprietario dadosProprietario = dadosProprietarioService.convertDadosProprietarioDTO(dadosProprietarioDTO);



            dadosProprietario.setCodigo(id);
            dadosProprietario = dadosProprietarioService.atualizar(dadosProprietario);

        log.info("Dados do proprietario atualizados com sucesso e retornando Status ok");
        return ResponseEntity.ok().body(dadosProprietario);
    }
}
