package com.teste.teste.services;

import com.teste.teste.model.DadosProprietario;
import com.teste.teste.repository.DadosProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadosProprietarioServiceImpl implements DadosProprietarioService {
    @Autowired
    DadosProprietarioRepository dadosProprietarioRepository;

    @Override
    public DadosProprietario salvar(DadosProprietario dadosProprietario) {
        return dadosProprietarioRepository.save(dadosProprietario);
    }

    @Override
    public void deletar(String id) {
        dadosProprietarioRepository.deleteById(id);

    }

    @Override
    public DadosProprietario atualizar(DadosProprietario dadosProprietario) {return dadosProprietarioRepository.save(dadosProprietario);}


    @Override
    public DadosProprietario obterPorId(String id) {return dadosProprietarioRepository.findById(id).get();}

    @Override
    public List<DadosProprietario> obterTodos() {return dadosProprietarioRepository.findAll();}
}
