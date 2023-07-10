package com.todolist.app.service;

import com.todolist.app.model.TaskList;
import com.todolist.app.model.User;
import com.todolist.app.repository.TaskListRepository;
import com.todolist.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TaskListService {
    @Autowired
    public TaskListRepository repository;
    public List<TaskList> getAllTaskLists(){
        return repository.findAll();
    };
    public TaskList getTaskListById(Integer taskListId){
        Optional<TaskList> taskList = repository.findById(taskListId);
        return taskList.orElse(null);
    }

    public ResponseEntity<TaskList> createTaskList(TaskList taskList){
        TaskList newTaskList = repository.save(taskList);
        if(newTaskList != null){
            return ResponseEntity.ok(newTaskList);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
