package com.ril.controller;

import com.ril.entity.User;
import com.ril.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user){

        return null;
    }
}
