package com.ril.service;

import com.ril.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User addUser(User user);
}
