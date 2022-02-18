package com.vitelco.todolist.controller;

import com.vitelco.todolist.Exception.NotFoundException;
import com.vitelco.todolist.model.Task;
import com.vitelco.todolist.model.User;
import com.vitelco.todolist.service.TaskService;
import com.vitelco.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    @ResponseBody
    public List<Task> findAll()
    {
        return taskService.findAll();
    }
    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id){
        return taskService.findById(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping
    @ResponseBody
    public Task createTask(@RequestBody Task task){
        return taskService.save(task);
    }
}
