package com.example.tunisiacampspring.controllers;

import com.example.tunisiacampspring.entities.User;
import com.example.tunisiacampspring.services.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class userController {

    private UserServiceImpl userService ;
    @PostMapping("/ajouterUser")
    @ResponseBody
    public User adduser(@RequestBody User s) {
        User user = userService.addUser(s);
        return user;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);

    }

    @GetMapping("fetch/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);

    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @PathVariable User user) {
        return userService.updateUser(id,user);
    }
}