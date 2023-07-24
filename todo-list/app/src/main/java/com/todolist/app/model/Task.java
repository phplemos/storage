package com.todolist.app.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "task")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(length = 50)
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
    @JsonIgnore
    @ManyToOne
    private TaskList taskList;

}
