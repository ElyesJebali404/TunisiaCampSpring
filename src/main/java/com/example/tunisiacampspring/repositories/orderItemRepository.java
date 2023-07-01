package com.example.tunisiacampspring.repositories;

import com.example.tunisiacampspring.entities.orderItem;
import org.springframework.data.jpa.repository.JpaRepository;
public interface orderItemRepository extends JpaRepository<orderItem,Long> {

}