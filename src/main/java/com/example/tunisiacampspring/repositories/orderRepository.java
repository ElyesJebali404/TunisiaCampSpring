package com.example.tunisiacampspring.repositories;

import com.example.tunisiacampspring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface orderRepository extends JpaRepository<Order,Long> {

}