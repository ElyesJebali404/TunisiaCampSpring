package com.example.tunisiacampspring.repositories;

import com.example.tunisiacampspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {

}