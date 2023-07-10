package com.todolist.app.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "taskList")
@Data
public class TaskList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(nullable = false)
    private String title;
    @Column
    private String description;
    @Column
    private LocalDateTime created_at;
    @ManyToOne()
    private User user;
    @OneToMany(mappedBy = "taskList",cascade = CascadeType.ALL)
    private List<Task> tasks;
}
