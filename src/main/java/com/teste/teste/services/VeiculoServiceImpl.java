package com.teste.teste.services;

import com.teste.teste.model.Veiculo;
import com.teste.teste.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {
    @Autowired
    VeiculoRepository veiculoRepository;

    @Override
    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @Override
    public void deletar(String id) {
        veiculoRepository.deleteById(id);

    }

    @Override
    public Veiculo atualizar(Veiculo veiculo) {return veiculoRepository.save(veiculo); }

    @Override
    public Veiculo obterPorId(String id) {
        return veiculoRepository.findById(id).get();
    }

    @Override
    public List<Veiculo> obterTodos() {
        return veiculoRepository.findAll();
    }
}
