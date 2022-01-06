package com.teste.teste.repository;


import com.teste.teste.model.Veiculo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends MongoRepository<Veiculo, String> {

}
