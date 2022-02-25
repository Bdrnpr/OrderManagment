package com.vitelco.todolist.service;

import com.vitelco.todolist.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Order> findAll();
    Order save(Order order);
    Optional<Order> findById(long id);
}
