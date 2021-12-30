package com.teste.teste.controller;


import com.teste.teste.model.Endereco;
import com.teste.teste.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api")
public class EnderecoController {
    @Autowired
    EnderecoRepository enderecoRepository;

    @ResponseStatus (HttpStatus.CREATED)
    @PostMapping ("/SalvarEnderecoProprietario")
    public Endereco novoEndereco (@RequestBody Endereco endereco) {
        enderecoRepository.save(endereco);
        return endereco;
    }
}
