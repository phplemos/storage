package com.todolist.app.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
}
