package com.todolist.app.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String color;
    @Column
    private String description;
}
