package com.example.tunisiacampspring.repositories;

import com.example.tunisiacampspring.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
public interface reservationRepository extends JpaRepository<Reservation,Long> {

}