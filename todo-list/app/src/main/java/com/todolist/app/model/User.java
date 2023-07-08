package com.todolist.app.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

import static jakarta.persistence.GenerationType.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
}
