package com.teste.teste.services;


import com.teste.teste.model.PlacaCarro;
import com.teste.teste.repository.PlacaCarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
