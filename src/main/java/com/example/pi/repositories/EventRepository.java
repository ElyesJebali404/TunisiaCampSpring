package com.example.pi.repositories;

import com.example.pi.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Evenement, Long> {
}
