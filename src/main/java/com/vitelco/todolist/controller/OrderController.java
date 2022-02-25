package com.vitelco.todolist.controller;

import com.vitelco.todolist.Exception.NotFoundException;
import com.vitelco.todolist.model.Order;
import com.vitelco.todolist.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping
    @ResponseBody
    public List<Order> findAll()
    {
        return orderService.findAll();
    }
    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id){
        return orderService.findById(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping
    @ResponseBody
    public Order createOrder(@RequestBody Order order){
        return orderService.save(order);
    }
}
