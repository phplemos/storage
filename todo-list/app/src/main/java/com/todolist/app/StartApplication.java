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
        User user = new User();
        user.setId(1);
        user.setName("Rita");
        user.setPassword("123");
        user.setEmail("airamatirsevla@gmail.com");
        repository.save(user);
        User user1 = new User();
        user1.setId(2);
        user1.setName("Pedro");
        user1.setPassword("123");
        user1.setEmail("phpinheirolemos@gmail.com");
        repository.save(user1);
        User user2 = new User();
        user2.setId(3);
        user2.setName("Julia");
        user2.setPassword("123");
        user2.setEmail("juh.pine1587@gmail.com");
        repository.save(user2);

    }

}
