package com.rycardofarias.github.Springboot_mongoDB.services;

import com.rycardofarias.github.Springboot_mongoDB.domain.User;
import com.rycardofarias.github.Springboot_mongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
