package com.example.pi.services;

import com.example.pi.entities.User;
import com.example.pi.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User addUser(User user) {

        return userRepository.save(user);
    }

    public void deleteUser (long id_user) {
        userRepository.deleteById(id_user);
    }

    public User getUserById(Long id_user){
       return userRepository.findById(id_user).orElse(null);


    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
