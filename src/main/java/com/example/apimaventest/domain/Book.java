package com.example.apimaventest.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    public String title;
    public String area;
    public String image;
    public String publisher;
    @JsonProperty("publication_year")
    public String publicationYear;
    public String isbn;
}
