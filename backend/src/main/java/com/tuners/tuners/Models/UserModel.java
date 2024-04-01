package com.tuners.tuners.Models;


import org.springframework.data.annotation.Id;

import java.util.List;

public class UserModel {

    @Id
    private String userId;

    private String username;
    private String profileImageSrc;
    private String email;

    private List<ItemModel> listedItems;

    public UserModel(){}

    public UserModel(String username, String profileImageSrc, String email){
        this.username = username;
        this.profileImageSrc = profileImageSrc;
        this.email = email;
    }

    public List<ItemModel> getListedItems() {
        return listedItems;
    }

    public void setListedItems(List<ItemModel> listedItems) {
        this.listedItems = listedItems;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileImageSrc() {
        return profileImageSrc;
    }

    public void setProfileImageSrc(String profileImageSrc) {
        this.profileImageSrc = profileImageSrc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
