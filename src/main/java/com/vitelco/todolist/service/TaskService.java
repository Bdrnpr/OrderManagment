package com.vitelco.todolist.service;

import com.vitelco.todolist.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    List<Task> findAll();
    Task save(Task task);
    Optional<Task> findById(long id);
}
