package com.todolist.app.controller;

import com.todolist.app.model.User;
import com.todolist.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Integer userId){
        User user = userService.getUserById(userId);
        if(user != null){
            return ResponseEntity.ok(user);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<String> create(@RequestBody User user){
        ResponseEntity<User> newUser = userService.createUser(user);
        return ResponseEntity.status(newUser.getStatusCode()).build();
    }
}
