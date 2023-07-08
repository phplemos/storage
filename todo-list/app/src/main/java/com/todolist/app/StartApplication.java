package com.todolist.app;

import com.todolist.app.model.User;
import com.todolist.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    public UserRepository repository;
    public void run(String ... args) throws Exception{

    }

}
