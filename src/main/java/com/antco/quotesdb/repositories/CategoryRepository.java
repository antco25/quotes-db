package com.antco.quotesdb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.antco.quotesdb.models.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

}