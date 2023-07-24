package com.todolist.app.service;

import com.todolist.app.model.Task;
import com.todolist.app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    public TaskRepository repository;
    public List<Task> getAllTasks(){
        return repository.findAll();
    };
    public Task getTaskById(Integer taskId){
        Optional<Task> task = repository.findById(taskId);
        return task.orElse(null);
    }

    public ResponseEntity<Task> createTask(Task task){
        Task newTask = repository.save(task);
        if(newTask != null){
            return ResponseEntity.ok(task);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
