package com.example.tunisiacampspring.repositories;

import com.example.tunisiacampspring.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface activityRepository extends JpaRepository<Activity,Long> {

}