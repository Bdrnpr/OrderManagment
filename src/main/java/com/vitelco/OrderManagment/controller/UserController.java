package com.vitelco.OrderManagment.controller;

import com.vitelco.OrderManagment.Exception.NotFoundException;
import com.vitelco.OrderManagment.model.User;
import com.vitelco.OrderManagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    @ResponseBody
    public List<User> findAll()
    {
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id).orElseThrow(NotFoundException::new);
    }
    @GetMapping("/byemail/{email}")
    public User findByEmail(@PathVariable String email){
        return userService.findByEmail(email).orElseThrow(NotFoundException::new);
    }
    @PostMapping
    @ResponseBody
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }
}
