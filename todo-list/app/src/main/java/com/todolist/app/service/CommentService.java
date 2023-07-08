package com.todolist.app.service;

import com.todolist.app.model.Comment;
import com.todolist.app.model.Task;
import com.todolist.app.repository.CommentRepository;
import com.todolist.app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    public CommentRepository repository;
    public List<Comment> getAllComments(){
        return repository.findAll();
    };
    public Comment getTaskById(Integer commentId){
        Optional<Comment> comment = repository.findById(commentId);
        return comment.orElse(null);
    }

    public ResponseEntity<Comment> createComment(Comment comment){
        Comment newComment = repository.save(comment);
        if(newComment != null){
            return ResponseEntity.ok(comment);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
