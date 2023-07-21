package com.example.pi.controllers;


import com.example.pi.entities.User;
import com.example.pi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
//@Api(tags = "Gestion des user")
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService ;
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
    public ResponseEntity<User> getUserById(@PathVariable Long userId) {
        User user = userService.getUserById(userId);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
