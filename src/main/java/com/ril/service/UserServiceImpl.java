package com.ril.service;

import com.ril.dao.UserRepository;
import com.ril.entity.User;
import com.ril.exception.UserNotFoundException;
import com.ril.utils.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Supplier;

@Component
public class UserServiceImpl implements UserService{

    private static final Logger log = LoggerFactory.make();

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        log.info("Received request for adding user {}",user);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        log.info("Received request for retrieving all users");
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        log.info("Received request for finding user with id : {}",id);
        return userRepository.findById(id).orElseThrow(()->new UserNotFoundException("User not found with id : "+id));
    }

    @Override
    public void deleteById(long id) {
        log.info("Received request for deleting user with id :{}",id);
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User newUser, long id) {
        log.info("Received request for updating user with id : {}", id);
        User oldUser = userRepository.findById(id).orElseThrow(()->new UserNotFoundException("User not found with id : "+id));
        return userRepository.save(updateUserChanges(newUser,oldUser));
    }

    private User updateUserChanges(User newUser, User oldUser){

        oldUser.setFirstname(newUser.getFirstname());
        oldUser.setLastname(newUser.getLastname());
        oldUser.setAdhar(newUser.getAdhar());
        oldUser.setEmail(newUser.getEmail());
        oldUser.setMobile(newUser.getMobile());
        oldUser.setPan(newUser.getPan());
        return oldUser;

    }
}
