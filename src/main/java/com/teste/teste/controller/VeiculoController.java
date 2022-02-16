package com.teste.teste.controller;



import com.teste.teste.DTO.VeiculoDTO;
import com.teste.teste.model.Veiculo;
import com.teste.teste.repository.VeiculoRepository;
import com.teste.teste.services.VeiculoService;
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
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @Autowired
    VeiculoRepository veiculoRepository;


    Logger log = Logger.getLogger("com.teste.teste.controller");

    @Operation(summary="Salva um veiculo")
    @PostMapping("/admin/salvarVeiculo")
    @ResponseStatus (HttpStatus.CREATED)
    public Veiculo salvar (@Valid @RequestBody VeiculoDTO veiculoDTO) {

        log.info("Entrando no metodo salvar veiculo");

        Veiculo veiculo = veiculoService.convertVeiculoDTO(veiculoDTO);

        log.info("Veiculo salvo com sucesso retornando no corpo da requisicao o veiculo e Status Created");
        veiculoService.salvar(veiculo);

        return veiculo;
    }

    @Operation(summary="Deletar um veiculo")
    @DeleteMapping(path = "/admin/{id}")
    public ResponseEntity <Void> deletar (@PathVariable String id) {

        log.info("Entrando no metodo deletar veiculo");

        if(!veiculoRepository.existsById(id)){
            log.info("Veiculo nao encontrado");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        veiculoService.deletar(id);

        log.info("Veiculo deletado com sucesso e retornando Status noContent");
        return ResponseEntity.noContent().build();

    }

    @Operation(summary="Obter um veiculo")
    @GetMapping
    public ResponseEntity<List<Veiculo>> obterTodos () {

        log.info("Entrando no metodo retornar veiculo");

        List<Veiculo> lista = veiculoService.obterTodos();

        if(lista.isEmpty()){
            log.info("Veiculo nao encontrado");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Retornando veiculo e Status ok");
        return ResponseEntity.ok().body(veiculoService.obterTodos());
    }

    @Operation(summary="Obter por codigo- veiculo")
    @GetMapping (path = "/{id}")
    public ResponseEntity<Veiculo> obterPorCodigo (@PathVariable String id) {

        log.info("Entrando no metodo retornar veiculo");

        if (!veiculoRepository.existsById(id)){
            log.info("Veiculo nao encontrado");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Retornando veiculo no corpo da requisicao e Status ok");
        return ResponseEntity.ok().body(veiculoService.obterPorId(id));
    }

    @Operation(summary="Atualizar um veiculo")
    @PutMapping (path = "/admin/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable String id, @RequestBody VeiculoDTO veiculoDTO) {

        log.info("Entrando no metodo atualizar veiculo");

        Veiculo veiculo = veiculoService.convertVeiculoDTO(veiculoDTO);




            veiculo.setCodigo(id);
            veiculo = veiculoService.atualizar(veiculo);

        log.info("Veiculo atualizados com sucesso e retornando Status ok");
        return ResponseEntity.ok().body(veiculo);
    }
}
