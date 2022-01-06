package com.teste.teste.services;



import com.teste.teste.model.Veiculo;

import java.util.List;

public interface VeiculoService {

    Veiculo salvar (Veiculo veiculo);

    void deletar (String id);

    Veiculo atualizar (Veiculo veiculo);
    Veiculo obterPorId (String id);
    List<Veiculo> obterTodos ();



}
