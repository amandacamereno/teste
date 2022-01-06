package com.teste.teste.services;

import com.teste.teste.model.DadosProprietario;

import java.util.List;

public interface DadosProprietarioService {

    DadosProprietario salvar (DadosProprietario dadosProprietario);

    void deletar (String id);

    DadosProprietario atualizar (DadosProprietario dadosProprietario);
    DadosProprietario obterPorId (String id);
    List<DadosProprietario> obterTodos ();



}
