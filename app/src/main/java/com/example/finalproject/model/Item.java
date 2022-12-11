//Mason Kjolso
package com.example.finalproject.model;

public class Item {
    public String kind;
    public String id;
    public String selfLink;
    public VolumeInfo volumeInfo;
    public SaleInfo saleInfo;
    public SearchInfo searchInfo;

    @Override
    public String toString() {
        return "Volume{" +
                "kind='" + kind + '\'' +
                ", id='" + id + '\'' +
                ", selfLink='" + selfLink + '\'' +
                ", volumeInfo=" + volumeInfo +
                ", saleInfo=" + saleInfo +
                ", searchInfo=" + searchInfo +
                '}';
    }
}
