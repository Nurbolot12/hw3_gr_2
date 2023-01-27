package com.example.iman_tulenaliev_hw3_3;

public class Accessories {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Accessories(String title, String price, int image) {
        this.title = title;
        this.price = price;
        this.image = image;
    }

    String title;
    String price;
    int image;
}
