package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.User;

public interface IUserService {
    public User add_user(User user);
    public User retreive_user(Long id);
    public User update_User(User user);
    public void delete_user(Long id );
}