package com.teste.teste.controller;

import com.teste.teste.model.DadosProprietario;
import com.teste.teste.repository.DadosProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api")
public class ProprietarioController {
    @Autowired
    DadosProprietarioRepository dadosProprietarioRepository;

    @ResponseStatus (HttpStatus.CREATED)
    @PostMapping ("/salvarDadosProprietario")
    public DadosProprietario novoDadosProprietario (@RequestBody DadosProprietario dadosProprietario) {
        dadosProprietarioRepository.save(dadosProprietario);
        return dadosProprietario;
    }


}
