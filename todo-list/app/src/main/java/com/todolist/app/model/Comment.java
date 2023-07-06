package com.todolist.app.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
@Data
public class Comment {
    @Id
    private Integer id;
    @Column
    private String author;
    @Column
    private LocalDateTime created_at;
    @Column
    private String content;
    @ManyToOne
    private Task task;
}
