package com.teste.teste.repository;


import com.teste.teste.model.Endereco;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnderecoRepository extends MongoRepository<Endereco, String>{

}
