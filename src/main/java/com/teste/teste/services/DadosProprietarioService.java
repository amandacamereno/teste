package com.teste.teste.services;

import com.teste.teste.DTO.DadosProprietarioDTO;
import com.teste.teste.DTO.VeiculoDTO;
import com.teste.teste.model.DadosProprietario;
import com.teste.teste.model.Veiculo;

import java.util.List;

public interface DadosProprietarioService {

    DadosProprietario salvar (DadosProprietario dadosProprietario);

    void deletar (String id);

    DadosProprietario atualizar (DadosProprietario dadosProprietario);
    DadosProprietario obterPorId (String id);
    List<DadosProprietario> obterTodos ();

    DadosProprietarioDTO converteDadosProprietario(DadosProprietario DadosProprietario);
    DadosProprietario convertDadosProprietarioDTO(DadosProprietarioDTO dadosProprietarioDTO);



}
