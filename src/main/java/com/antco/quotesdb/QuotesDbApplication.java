package com.antco.quotesdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.antco.quotesdb.models.Quote;
import com.antco.quotesdb.repositories.QuoteRepository;

@SpringBootApplication
@EnableMongoRepositories
public class QuotesDbApplication implements CommandLineRunner {

	@Autowired
	QuoteRepository quoteRepo;

	public static void main(String[] args) {
		SpringApplication.run(QuotesDbApplication.class, args);
	}

	public void run(String... args) {		
		System.out.println("-------------CREATE ITEMS-------------------------------\n");
		//createItems();			
		System.out.println("\n----------------SHOW ALL ITEMS---------------------------\n");
        showAllItems();
		System.out.println("\n-------------------THANK YOU---------------------------");
	}

	void createItems() {
		System.out.println("Data creation started...");
		quoteRepo.save(new Quote("Whole Wheat Biscuit"));
		quoteRepo.save(new Quote("Dried Red Chilli"));
		System.out.println("Data creation complete...");
	}

	void showAllItems() {
		quoteRepo.findAll().forEach(item -> System.out.println(item.getQuote()));
	}

}
