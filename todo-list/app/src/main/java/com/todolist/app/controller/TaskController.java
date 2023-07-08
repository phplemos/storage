package com.todolist.app.controller;

import com.todolist.app.model.Task;
import com.todolist.app.model.TaskList;
import com.todolist.app.service.TaskListService;
import com.todolist.app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")

public class TaskController {
    @Autowired
    private TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    @GetMapping("/{taskId}")
    public ResponseEntity<Task> getTaskById(@PathVariable Integer taskId){
        Task task = taskService.getTaskById(taskId);
        if(task != null){
            return ResponseEntity.ok(task);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<String> create(@RequestBody Task task){
        ResponseEntity<Task> newTask = taskService.createTask(task);
        return ResponseEntity.status(newTask.getStatusCode()).build();
    }
}
