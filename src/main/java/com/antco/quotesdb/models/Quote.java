package com.antco.quotesdb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("quote")
public class Quote {
    
    @Id
    private String id;
    private String quote;

    public Quote(String quote) {
        super();
        this.quote = quote;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
