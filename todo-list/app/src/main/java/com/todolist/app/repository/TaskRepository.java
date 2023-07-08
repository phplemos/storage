package com.todolist.app.repository;

import com.todolist.app.model.Comment;
import com.todolist.app.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {

}
