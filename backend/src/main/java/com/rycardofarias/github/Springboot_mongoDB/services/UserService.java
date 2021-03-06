package com.rycardofarias.github.Springboot_mongoDB.services;

import com.rycardofarias.github.Springboot_mongoDB.domain.User;
import com.rycardofarias.github.Springboot_mongoDB.dto.UserDTO;
import com.rycardofarias.github.Springboot_mongoDB.repository.UserRepository;
import com.rycardofarias.github.Springboot_mongoDB.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repository.deleteById(id);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}
