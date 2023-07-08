package com.todolist.app.controller;

import com.todolist.app.model.Comment;
import com.todolist.app.model.Task;
import com.todolist.app.service.CommentService;
import com.todolist.app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")

public class CommentController {
    @Autowired
    private CommentService commentService;
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }
    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }
    @GetMapping("/{commentId}")
    public ResponseEntity<Comment> getCommentById(@PathVariable Integer commentId){
        Comment comment = commentService.getTaskById(commentId);
        if(comment != null){
            return ResponseEntity.ok(comment);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<String> create(@RequestBody Comment comment){
        ResponseEntity<Comment> newComment = commentService.createComment(comment);
        return ResponseEntity.status(newComment.getStatusCode()).build();
    }
}
