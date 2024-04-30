package com.ayildirim.todo.controller;

import com.ayildirim.todo.entity.ToDo;
import com.ayildirim.todo.toDoService.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/todo")
public class ToDoController {
@Autowired
private ToDoService toDoService;

@GetMapping
    public ResponseEntity <List<ToDo>> getAlltoDos() {
        List<ToDo> toDos = toDoService.getAllToDos();
        return new ResponseEntity<List<ToDo>>(toDos, HttpStatus.OK);
    }
    @GetMapping ("/{id}")
    public ResponseEntity <ToDo> gettoDoById(@PathVariable String id) {
        ToDo toDo = toDoService.getById(id);
        return new ResponseEntity<ToDo>(toDo, HttpStatus.OK);
    }
    @PostMapping ("/create")

    public ResponseEntity <ToDo> addToDo (@RequestBody ToDo toDo) {
        ToDo newtoDo = toDoService.addToDo(toDo);
        return new ResponseEntity<ToDo>(newtoDo, HttpStatus.CREATED);
    }
}
