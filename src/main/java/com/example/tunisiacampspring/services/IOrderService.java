package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Order;

public interface IOrderService {
    public Order add_order(Order order);
    public Order retreive_order(Long id);
    public Order update_Order(Order order);
    public void delete_order(Long id );
}