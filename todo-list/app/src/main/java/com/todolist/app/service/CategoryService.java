package com.todolist.app.service;

import com.todolist.app.model.Category;
import com.todolist.app.model.Comment;
import com.todolist.app.repository.CategoryRepository;
import com.todolist.app.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    public CategoryRepository repository;
    public List<Category> getAllCategorys(){
        return repository.findAll();
    };
    public Category getCategoryById(Integer categoryId){
        Optional<Category> category = repository.findById(categoryId);
        return category.orElse(null);
    }

    public ResponseEntity<Category> createCategory(Category category){
        Category newCategory = repository.save(category);
        if(newCategory != null){
            return ResponseEntity.ok(category);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
