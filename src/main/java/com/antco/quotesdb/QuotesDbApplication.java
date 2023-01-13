package com.antco.quotesdb;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.antco.quotesdb.models.Category;
import com.antco.quotesdb.models.Quote;
import com.antco.quotesdb.models.User;
import com.antco.quotesdb.repositories.CategoryRepository;
import com.antco.quotesdb.repositories.QuoteRepository;
import com.antco.quotesdb.repositories.UserRepository;

@SpringBootApplication
@EnableMongoRepositories
public class QuotesDbApplication implements CommandLineRunner {

	@Autowired
	QuoteRepository quoteRepo;

	@Autowired
	CategoryRepository categoryRepo;

	@Autowired
	UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(QuotesDbApplication.class, args);
	}

	public void run(String... args) {
		System.out.println("-------------CREATE ITEMS-------------------------------\n");
		createItems();
		System.out.println("\n----------------SHOW ALL ITEMS---------------------------\n");
		showAllItems();
		System.out.println("\n-------------------THANK YOU---------------------------");
	}

	void createItems() {
		System.out.println("Data creation started...");
		
		User john = userRepo.save(new User("John"));
		Category favorite = categoryRepo.save(new Category("Favorites", new ObjectId(john.getId())));
		favorite.addQuote("63c0c95dda1814180da04870");
		favorite.addQuote("63c0c95dda1814180da04871");
		john.addCategory(favorite.getId());
		userRepo.save(john);
		categoryRepo.save(favorite);

		System.out.println("Data creation complete...");
	}

	void showAllItems() {
		userRepo.findAll().forEach(item -> System.out.println(item));
		categoryRepo.findAll().forEach(item -> System.out.println(item));
		quoteRepo.findAll().forEach(item -> System.out.println(item));
	}

}
