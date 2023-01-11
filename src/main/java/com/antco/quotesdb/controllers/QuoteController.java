package com.antco.quotesdb.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antco.quotesdb.models.Quote;
import com.antco.quotesdb.repositories.QuoteRepository;

@RestController
public class QuoteController {

    private final QuoteRepository repository;

    QuoteController(QuoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/quotes")
    List<Quote> getAll() {
      return repository.findAll();
    }
}
