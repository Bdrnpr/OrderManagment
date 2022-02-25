package com.vitelco.OrderManagment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class OrderManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagmentApplication.class, args);

		/*User user = new User(1l,"bedran","piro",25,"bmkd");
		Order order = new Order(1l,"book",user,Order.Category.PERSONAL);

		log.info("Order: {} User:{}", order);*/
	}

}
