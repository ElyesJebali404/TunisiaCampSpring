package com.example.pi.services;

import com.example.pi.entities.User;

import java.util.List;

public interface IUserService {
    User addUser(User user);
    public void deleteUser (long id_user);
    User getUserById(Long userId) ;
    public List<User> getAllUsers();
}
