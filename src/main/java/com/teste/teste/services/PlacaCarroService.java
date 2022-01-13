package com.teste.teste.services;

import com.teste.teste.DTO.PlacaCarroDTO;
import com.teste.teste.DTO.VeiculoDTO;
import com.teste.teste.model.PlacaCarro;
import com.teste.teste.model.Veiculo;

import java.util.List;

public interface PlacaCarroService {
    PlacaCarro salvar (PlacaCarro placaCarro);

    void deletar(String id);

    PlacaCarro atualizar (PlacaCarro placaCarro);
    PlacaCarro obterPorId (String id);
    List<PlacaCarro> obterTodos ();


    PlacaCarroDTO convertePlacaCarro(PlacaCarro placaCarro);
    PlacaCarro convertePlacaCarroDTO(PlacaCarroDTO placaCarroDTO);


}
