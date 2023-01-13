package com.antco.quotesdb.models;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class User {
    
    @Id
    private String id;
    private String name;
    private ArrayList<ObjectId> categories;

    public User(String name) {
        super();
        this.name = name;
        this.categories = new ArrayList<ObjectId>();
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

    public List<ObjectId> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<ObjectId> categories) {
        this.categories = categories;
    }

    public void addCategory(String id) {
        categories.add(new ObjectId(id));
    }
}
