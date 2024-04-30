package com.ayildirim.todo.toDoService.imp;

import com.ayildirim.todo.entity.ToDo;
import com.ayildirim.todo.repository.ToDoRepository;
import com.ayildirim.todo.toDoService.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;
    @Override
    public List<ToDo> getAllToDos() {

        List <ToDo> toDos = toDoRepository.findAll();
        return toDos;
    }

    @Override
    public ToDo addToDo(ToDo toDo) {
        ToDo newToDo = toDoRepository.save(toDo);
        return newToDo;
    }

    @Override
    public ToDo getById(String id) {
        Optional<ToDo> todo = toDoRepository.findById(id);
        if(!todo.isPresent()) {
            throw new RuntimeException("No ToDo with currrent id" + id);
        }
        return todo.get();
    }
}
