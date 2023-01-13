package com.antco.quotesdb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.antco.quotesdb.models.User;

public interface UserRepository extends MongoRepository<User, String> {

}