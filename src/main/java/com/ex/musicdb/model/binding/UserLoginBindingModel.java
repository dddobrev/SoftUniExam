package com.ex.musicdb.model.binding;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserLoginBindingModel {
    private String username;
    private String password;

    public UserLoginBindingModel() {
    }

    @NotBlank(message = "Username cannot be empty")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    public String getUsername() {
        return username;
    }

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 5, max = 20, message = "Password length must be between 5 and 20 characters")
    public String getPassword() {
        return password;
    }

    public UserLoginBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserLoginBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }
}
