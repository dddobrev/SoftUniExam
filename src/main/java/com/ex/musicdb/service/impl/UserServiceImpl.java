package com.ex.musicdb.service.impl;

import com.ex.musicdb.model.entities.UserEntity;
import com.ex.musicdb.model.service.UserServiceModel;
import com.ex.musicdb.repository.UserRepository;
import com.ex.musicdb.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public boolean register(UserServiceModel userServiceModel) {
        try {
            userRepository.save(modelMapper.map(userServiceModel, UserEntity.class));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public UserServiceModel findByUsernameAndPassword(String username, String password) {
        return userRepository
                .findByUsernameAndPassword(username, password)
                .map(user-> modelMapper.map(user, UserServiceModel.class))
        .orElse(null);
    }

}
