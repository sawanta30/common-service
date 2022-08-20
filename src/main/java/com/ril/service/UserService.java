package com.ril.service;

import com.ril.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User addUser(User user);
    List<User> getAllUsers();

    User findById(long id);

    void deleteById(long id);

    User updateUser(User newUser, long id);
}
