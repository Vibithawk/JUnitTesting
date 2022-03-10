package com.example.JUnitTesting.Repository;

import com.example.JUnitTesting.Model.Junitmodel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Junitrepository extends MongoRepository<Junitmodel,String> {

    @Query("{authorname:?0}")
    List<Junitmodel> findByAuthor(String author);
}
