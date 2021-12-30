package com.teste.teste.controller;


import com.teste.teste.model.PlacaCarro;
import com.teste.teste.repository.PlacaCarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/api")
public class PlacaController {
    @Autowired
    PlacaCarroRepository placaCarroRepository;

    @ResponseStatus (HttpStatus.CREATED)
    @PostMapping ("/salvarPlacaCarro")
    public PlacaCarro novaPlacaCarro (@RequestBody PlacaCarro placaCarro) {
        placaCarroRepository.save(placaCarro);
        return placaCarro;
    }

}
