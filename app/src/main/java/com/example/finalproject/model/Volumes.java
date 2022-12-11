//Mason Kjolso
package com.example.finalproject.model;

import java.util.ArrayList;

 class ImageLinks{
    public String smallThumbnail;
    public String thumbnail;
}

class ListPrice{
    public double amount;
    public String currencyCode;
    public int amountInMicros;
}

 class Offer{
    public int finskyOfferType;
    public ListPrice listPrice;
    public RetailPrice retailPrice;
    public boolean giftable;
}

 class RetailPrice{
    public double amount;
    public String currencyCode;
    public int amountInMicros;
}

public class Volumes{
    public String kind;
    public int totalItems;
    public ArrayList<Item> items;

    @Override
    public String toString() {
        return "Volumes{" +
                "kind='" + kind + '\'' +
                ", totalItems=" + totalItems +
                ", volumes=" + items +
                '}';
    }
}

 class SaleInfo{
    public String country;
    public ListPrice listPrice;
    public RetailPrice retailPrice;
    public String buyLink;
    public ArrayList<Offer> offers;
}

 class SearchInfo{
    public String textSnippet;
}

 class VolumeInfo{
    public String title;
    public String subtitle;
    public ArrayList<String> authors;
    public String publisher;
    public String publishedDate;
    public String description;
    public ImageLinks imageLinks;
}

