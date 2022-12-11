//Mason Kjolso
package com.example.finalproject.model;

import java.util.ArrayList;

public class CardViewModel {
    String bookTitle;
    String bookDescription;
    String imageUrl;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CardViewModel(Item item) {
        bookTitle = item.volumeInfo.title;
        bookDescription = item.volumeInfo.description;
    }
}
