package com.example.myfoodapp.models;

public class DetailedDailyModel {

    int image;
    String name;
    String description;
    String rating;
    String time;
    String price;

    public DetailedDailyModel(int image, String name, String description, String rating, String time, String price) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.time = time;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
