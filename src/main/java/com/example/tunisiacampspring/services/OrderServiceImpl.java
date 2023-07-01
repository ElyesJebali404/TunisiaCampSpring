package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Order;
import com.example.tunisiacampspring.repositories.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService{
    @Autowired
    private orderRepository orderRepository;
    @Override
    public Order add_order(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order retreive_order(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order update_Order(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void delete_order(Long id) {
        orderRepository.deleteById(id);
    }
}
