package com.antco.quotesdb.models;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Category {

    @Id
    private String id;
    private String name;
    private ObjectId userId;
    private ArrayList<ObjectId> quotes;

    public Category(String name, ObjectId userId) {
        super();
        this.name = name;
        this.userId = userId;
        this.quotes = new ArrayList<ObjectId>();
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectId getUserId() {
        return userId;
    }

    public void setUser(String userId) {
        this.userId = new ObjectId(userId);
    }

    public List<ObjectId> getQuotes() {
        return quotes;
    }

    public void setQuotes(ArrayList<ObjectId> quotes) {
        this.quotes = quotes;
    }

    public void addQuote(String id) {
        quotes.add(new ObjectId(id));
    }
}
