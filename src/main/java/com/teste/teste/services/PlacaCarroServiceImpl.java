package com.teste.teste.services;


import com.teste.teste.DTO.PlacaCarroDTO;
import com.teste.teste.model.DadosProprietario;
import com.teste.teste.model.PlacaCarro;
import com.teste.teste.repository.PlacaCarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlacaCarroServiceImpl implements PlacaCarroService {
    @Autowired
    PlacaCarroRepository placaCarroRepository;

    @Override
    public PlacaCarro salvar(PlacaCarro placaCarro) {
        return placaCarroRepository.save(placaCarro);
    }

    @Override
    public void deletar(String id) {
        placaCarroRepository.deleteById(id);

    }

    @Override
    public PlacaCarro atualizar(PlacaCarro placaCarro) {
        Optional<PlacaCarro> placaCarroid = placaCarroRepository.findById(placaCarro.getCodigo());
        if(placaCarroid.isEmpty()){
            throw new RuntimeException("Placa nao  encontrada");
        }

        return placaCarroRepository.save(placaCarro);
    }

    @Override
    public PlacaCarro obterPorId(String id) {
        return placaCarroRepository.findById(id).get();
    }

    @Override
    public List<PlacaCarro> obterTodos() {
        return placaCarroRepository.findAll();
    }


    @Override
    public PlacaCarroDTO convertePlacaCarro(PlacaCarro placaCarro){
        PlacaCarroDTO placaCarroDTO = new PlacaCarroDTO();
        placaCarroDTO.setLetras(placaCarro.getLetras());
        placaCarroDTO.setNumeros(placaCarro.getNumeros());
        placaCarroDTO.setModelo(placaCarro.getModelo());
        placaCarroDTO.setCidade(placaCarro.getCidade());
        placaCarroDTO.setEstado(placaCarro.getEstado());
        return placaCarroDTO;
    }

    @Override
    public PlacaCarro convertePlacaCarroDTO(PlacaCarroDTO placaCarroDTO){
        PlacaCarro placaCarro = new PlacaCarro();
        placaCarro.setLetras(placaCarroDTO.getLetras());
        placaCarro.setNumeros(placaCarroDTO.getNumeros());
        placaCarro.setModelo(placaCarroDTO.getModelo());
        placaCarro.setCidade(placaCarroDTO.getCidade());
        placaCarro.setEstado(placaCarroDTO.getEstado());
        return placaCarro;
    }
}
