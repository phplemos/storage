package com.todolist.app.controller;

import com.todolist.app.model.TaskList;
import com.todolist.app.model.User;
import com.todolist.app.service.TaskListService;
import com.todolist.app.service.TaskService;
import com.todolist.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task-lists")

public class TaskListController {
    @Autowired
    private TaskListService taskListService;
    public TaskListController(TaskListService taskListService) {
        this.taskListService = taskListService;
    }
    @GetMapping
    public List<TaskList> getAllTaskLists() {
        return taskListService.getAllTaskLists();
    }
    @GetMapping("/{taskListId}")
    public ResponseEntity<TaskList> getTaskListById(@PathVariable Integer taskListId){
        TaskList taskList = taskListService.getTaskListById(taskListId);
        if(taskList != null){
            return ResponseEntity.ok(taskList);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<TaskList> create(@RequestBody TaskList taskList){
        ResponseEntity<TaskList> newTaskList = taskListService.createTaskList(taskList);
        return ResponseEntity.status(newTaskList.getStatusCode()).build();
    }
}
