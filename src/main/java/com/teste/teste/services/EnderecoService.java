package com.teste.teste.services;

import com.teste.teste.model.Endereco;

import java.util.List;

public interface EnderecoService {

    Endereco salvar(Endereco endereco);

    void deletar(String id);

    Endereco atualizar (Endereco endereco);
    Endereco obterPorId(String id);
    List<Endereco> obterTodos();



}
