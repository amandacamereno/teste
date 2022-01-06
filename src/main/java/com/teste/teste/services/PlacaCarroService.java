package com.teste.teste.services;

import com.teste.teste.model.PlacaCarro;

import java.util.List;

public interface PlacaCarroService {
    PlacaCarro salvar (PlacaCarro placaCarro);

    void deletar(String id);

    PlacaCarro atualizar (PlacaCarro placaCarro);
    PlacaCarro obterPorId (String id);
    List<PlacaCarro> obterTodos ();

}
