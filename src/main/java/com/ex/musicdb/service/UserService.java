package com.ex.musicdb.service;

import com.ex.musicdb.model.service.UserServiceModel;

public interface UserService {
    boolean register(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);
}
