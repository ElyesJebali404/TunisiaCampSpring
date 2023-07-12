package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.User;
import com.example.tunisiacampspring.repositories.userRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.*;

@Service
@Slf4j
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

    private userRepository userRepository;
    @Override
    public User addUser(User user) {

        return userRepository.save(user);
    }
    @Override
    public void deleteUser (long id_user) {

        userRepository.deleteById(id_user);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @PathVariable User user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            user.setId_user(existingUser.getId_user()); // Ensure the ID remains the same
            User updatedUser = userRepository.save(user);
            return updatedUser;
        } else {
            return null;
        }
    }

}