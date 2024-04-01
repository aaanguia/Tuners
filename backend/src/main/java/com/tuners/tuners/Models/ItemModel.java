package com.tuners.tuners.Models;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


public class ItemModel {

    @Id
    private String id;


    private String itemName;
    private String img;
    private String description;
    private String createdDate;
    private Double price;
    private int quantity;

    private UserModel user;

    public ItemModel(){}

    public ItemModel(String id, String itemName, String img, String description, String createdDate, Double price, int quantity) {
        this.id = id;
        this.itemName = itemName;
        this.img = img;
        this.description = description;
        this.createdDate = createdDate;
        this.price = price;
        this.quantity = quantity;
    }

    public ItemModel(String name){
        this.setItemName(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Item " + getId() + " " + getImg() + " " + getDescription() + " " + getCreatedDate() + " " + getPrice() + " " + getQuantity();
    }
}
