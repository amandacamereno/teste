package com.teste.teste.services;

import com.teste.teste.DTO.EnderecoDTO;
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

    @Override
    public EnderecoDTO converteEndereco(Endereco endereco) {
        EnderecoDTO enderecoDTO = new EnderecoDTO();
        enderecoDTO.setRua(endereco.getRua());
        enderecoDTO.setPais(endereco.getPais());
        enderecoDTO.setCidade(endereco.getCidade());
        enderecoDTO.setBairro(endereco.getBairro());
        enderecoDTO.setEstado(endereco.getEstado());
        enderecoDTO.setNumero(endereco.getComplemento());
        enderecoDTO.setComplemento(endereco.getCep());
        return enderecoDTO;
    }


    @Override
    public Endereco converteEnderecoDTO(EnderecoDTO enderecoDTO){
        Endereco endereco = new Endereco();
        endereco.setRua(enderecoDTO.getRua());
        endereco.setPais(enderecoDTO.getPais());
        endereco.setCidade(enderecoDTO.getCidade());
        endereco.setBairro(enderecoDTO.getBairro());
        endereco.setEstado(enderecoDTO.getEstado());
        endereco.setNumero(enderecoDTO.getNumero());
        endereco.setComplemento(enderecoDTO.getComplemento());
        return endereco;
    }
}
