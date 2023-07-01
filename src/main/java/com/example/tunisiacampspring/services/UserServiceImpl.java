package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.User;
import com.example.tunisiacampspring.repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private userRepository userRepository;
    @Override
    public User add_user(User user) {
        return userRepository.save(user);
    }

    @Override
    public User retreive_user(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User update_User(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete_user(Long id) {
        userRepository.deleteById(id);
    }
}
