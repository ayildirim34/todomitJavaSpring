package com.ayildirim.todo.toDoService;

import com.ayildirim.todo.entity.ToDo;

import java.util.List;

public interface ToDoService {
    List <ToDo> getAllToDos ();

    ToDo addToDo(ToDo toDo);

    ToDo getById(String id);
}
