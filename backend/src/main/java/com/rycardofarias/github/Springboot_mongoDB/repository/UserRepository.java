package com.rycardofarias.github.Springboot_mongoDB.repository;

import com.rycardofarias.github.Springboot_mongoDB.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, String> {
}
