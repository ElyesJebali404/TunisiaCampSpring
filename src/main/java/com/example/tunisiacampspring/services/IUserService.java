package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.User;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IUserService {
    public User addUser(User user) ;

    public void deleteUser (long id_user) ;

    public User getUserById(Long id_user);
    public List<User> getAllUsers() ;
    public User updateUser(Long id,User user) ;

}