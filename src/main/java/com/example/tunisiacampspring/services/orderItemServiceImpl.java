package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.orderItem;
import com.example.tunisiacampspring.repositories.orderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderItemServiceImpl implements IorderItemService{
    @Autowired
    private orderItemRepository orderItemRepository;
    @Override
    public orderItem add_orderItem(orderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public orderItem retreive_orderItem(Long id) {
        return orderItemRepository.findById(id).orElse(null);
    }

    @Override
    public orderItem update_orderItem(orderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public void delete_orderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}
