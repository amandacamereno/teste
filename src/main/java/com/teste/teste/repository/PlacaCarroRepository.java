package com.teste.teste.repository;

import com.teste.teste.model.PlacaCarro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacaCarroRepository extends MongoRepository<PlacaCarro, String>{

}
