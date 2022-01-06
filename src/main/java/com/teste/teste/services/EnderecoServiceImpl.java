package com.teste.teste.services;

import com.teste.teste.model.Endereco;
import com.teste.teste.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService {
   @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public void deletar(String id) {
        enderecoRepository.deleteById(id);

    }

    @Override
    public Endereco atualizar(Endereco endereco) {
        return  enderecoRepository.save(endereco);
    }

    @Override
    public Endereco obterPorId(String id) {
        return enderecoRepository.findById(id).get();
    }

    @Override
    public List<Endereco> obterTodos() {
        return enderecoRepository.findAll();
    }
}
