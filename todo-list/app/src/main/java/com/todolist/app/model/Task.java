package com.todolist.app.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "task")
@Data
public class Task {

    @Id
    private Integer id;
    @Column

    private String title;
    @Column
    private String description;
    @Column
    private LocalDateTime create_at;
    @Column
    private LocalDateTime conclusion_at;
    @Column
    private boolean status;
    @Column
    private int priority;

    @ManyToOne
    private TaskList taskList;

    @ManyToMany
    private List<Category> categories;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<Comment> comments;
}
