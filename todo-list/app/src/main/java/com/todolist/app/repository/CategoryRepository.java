package com.todolist.app.repository;

import com.todolist.app.model.Category;
import com.todolist.app.model.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
