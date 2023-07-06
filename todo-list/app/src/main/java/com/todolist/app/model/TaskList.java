package com.todolist.app.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "taskList")
@Data
public class TaskList {
    @Id
    private Integer id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private LocalDateTime created_at;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "taskList",cascade = CascadeType.ALL)
    private List<Task> tasks;
}
