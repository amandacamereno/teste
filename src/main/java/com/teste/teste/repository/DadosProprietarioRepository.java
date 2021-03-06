package com.teste.teste.repository;

import com.teste.teste.model.DadosProprietario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosProprietarioRepository extends MongoRepository<DadosProprietario, String> {
}
