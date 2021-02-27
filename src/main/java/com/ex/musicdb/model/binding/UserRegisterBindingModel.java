package com.ex.musicdb.model.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRegisterBindingModel {

    private String username;
    private String password;
    private String fullName;
    private String confirmPassword;
    private String email;

    public UserRegisterBindingModel() {
    }

    @NotBlank(message = "Username cannot be empty")
    @Size(min=3, max = 20, message = "Username must be between 3 and 20 characters")
    public String getUsername() {
        return username;
    }

    @NotBlank
    @Size(min = 3, max = 20)
    public String getFullName() {
        return fullName;
    }

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 5, max = 20, message = "Password length must be between 5 and 20 characters")
    public String getPassword() {
        return password;
    }

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 5, max = 20, message = "Password length must be between 5 and 20 characters")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Email(message = "Email must be valid")
    public String getEmail() {
        return email;
    }

    public UserRegisterBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserRegisterBindingModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public UserRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public UserRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }
}
