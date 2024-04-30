package com.ayildirim.todo.repository;

import com.ayildirim.todo.entity.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends MongoRepository <ToDo, String>{
}
