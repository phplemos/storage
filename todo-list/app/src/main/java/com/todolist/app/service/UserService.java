package com.todolist.app.service;

import com.todolist.app.model.User;
import com.todolist.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public UserRepository repository;
    public List<User> getAllUsers(){
        return repository.findAll();
    };
    public User getUserById(Integer userId){
        Optional<User> user = repository.findById(userId);
        return user.orElse(null);
    }

    public ResponseEntity<User> createUser(User user){

    }

}
