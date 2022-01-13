package com.teste.teste.services;

import com.teste.teste.DTO.DadosProprietarioDTO;
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


    @Override
    public DadosProprietarioDTO converteDadosProprietario(DadosProprietario dadosProprietario){
        DadosProprietarioDTO dadosProprietarioDTO = new DadosProprietarioDTO();
        dadosProprietarioDTO.setNome(dadosProprietario.getNome());
        dadosProprietarioDTO.setSobrenome(dadosProprietario.getSobrenome());
        dadosProprietarioDTO.setDataNascimento(dadosProprietario.getDataNascimento());
        dadosProprietarioDTO.setCpf(dadosProprietario.getCpf());
        dadosProprietarioDTO.setSexo(dadosProprietario.getSexo());
        dadosProprietarioDTO.setRg(dadosProprietario.getRg());
        dadosProprietarioDTO.setTelefone(dadosProprietario.getTelefone());
        return dadosProprietarioDTO;

    }


    @Override
    public DadosProprietario convertDadosProprietarioDTO(DadosProprietarioDTO dadosProprietarioDTO){
        DadosProprietario dadosProprietario = new DadosProprietario();
        dadosProprietario.setNome(dadosProprietarioDTO.getNome());
        dadosProprietario.setSobrenome(dadosProprietarioDTO.getSobrenome());
        dadosProprietario.setDataNascimento(dadosProprietarioDTO.getDataNascimento());
        dadosProprietario.setCpf(dadosProprietarioDTO.getCpf());
        dadosProprietario.setSexo(dadosProprietarioDTO.getSexo());
        dadosProprietario.setRg(dadosProprietarioDTO.getRg());
        dadosProprietario.setTelefone(dadosProprietarioDTO.getTelefone());
        return dadosProprietario;

    }
}
