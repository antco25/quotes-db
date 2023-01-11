package com.antco.quotesdb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.antco.quotesdb.models.Quote;

public interface QuoteRepository extends MongoRepository<Quote, String> {

}