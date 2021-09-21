package ru.netology.domain;


public class Film {
    private int id;
    private int productId;
    private String productName;
    private String genre;

    public Film(int id, int productId, String productName, String genre) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.genre = genre;
    }
}

