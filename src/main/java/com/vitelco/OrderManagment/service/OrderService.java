package com.vitelco.OrderManagment.service;

import com.vitelco.OrderManagment.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Order> findAll();
    Order save(Order order);
    Optional<Order> findById(long id);
}
