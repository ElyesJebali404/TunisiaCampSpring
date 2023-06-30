package com.example.tunisiacampspring.repositories;

import com.example.tunisiacampspring.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
public interface itemRepository extends JpaRepository<Item,Long> {

}