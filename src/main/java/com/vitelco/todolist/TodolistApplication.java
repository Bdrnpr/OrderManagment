package com.vitelco.todolist;

import com.vitelco.todolist.model.Task;
import com.vitelco.todolist.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);

		/*User user = new User(1l,"bedran","piro",25);
		Task task = new Task(1l,"book",user,Task.Category.PERSONAL);

		log.info("Task: {} User:{}",task);*/
	}

}
