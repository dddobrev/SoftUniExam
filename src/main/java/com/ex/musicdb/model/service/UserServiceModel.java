package com.ex.musicdb.model.service;

public class UserServiceModel {
    private String id;
    private String username;
    private String fullName;
    private String password;
    private String Email;

    public UserServiceModel() {
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return Email;
    }

    public UserServiceModel setId(String id) {
        this.id = id;
        return this;
    }

    public UserServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserServiceModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public UserServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserServiceModel setEmail(String email) {
        Email = email;
        return this;
    }
}
