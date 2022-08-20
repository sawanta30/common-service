package com.ril.controller;

import com.ril.entity.User;
import com.ril.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user-service")
public class UserController {

    @Autowired
    UserService userService;



    @PostMapping("/users")
    public User addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PutMapping("/users/{id}")
    public User updateUser(@Valid @RequestBody User user, @PathVariable long id){
       return userService.updateUser(user,id);
    }
    @GetMapping("/users/{id}")
    public User getuserByid(@PathVariable long id){
        return userService.findById(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable long id){
        userService.deleteById(id);
    }




}
