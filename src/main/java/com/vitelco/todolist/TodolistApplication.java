package com.vitelco.todolist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);

		/*User user = new User(1l,"bedran","piro",25,"bmkd");
		Order order = new Order(1l,"book",user,Order.Category.PERSONAL);

		log.info("Order: {} User:{}", order);*/
	}

}
