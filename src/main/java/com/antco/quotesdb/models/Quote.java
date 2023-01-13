package com.antco.quotesdb.models;

import org.springframework.data.annotation.Id;

public class Quote {
    
    @Id
    private String id;
    private String quote;
    private String url;

    public Quote(String quote, String url) {
        super();
        this.quote = quote;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
