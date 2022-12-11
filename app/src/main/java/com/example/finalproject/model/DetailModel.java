//Mason Kjolso
package com.example.finalproject.model;

import java.util.ArrayList;

public class DetailModel {
    public String title;
    public String subtitle;
    public ArrayList<String> authors;
    public String publisher;
    public String publishedDate;
    public String description;
    public ImageLinks imageLinks;

    public DetailModel(String title, String subtitle, ArrayList<String> authors, String publisher, String publishedDate, String description, ImageLinks imageLinks) {
        this.title = title;
        this.subtitle = subtitle;
        this.authors = authors;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.description = description;
        this.imageLinks = imageLinks;
    }

}
