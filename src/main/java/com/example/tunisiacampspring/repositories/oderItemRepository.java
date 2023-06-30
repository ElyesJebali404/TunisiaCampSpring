package com.example.tunisiacampspring.repositories;

import com.example.tunisiacampspring.entities.orderItem;
import org.springframework.data.jpa.repository.JpaRepository;
public interface oderItemRepository extends JpaRepository<orderItem,Long> {

}