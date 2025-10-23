package com.playstore.webplaystore.services;

import com.playstore.webplaystore.entities.Order;
import com.playstore.webplaystore.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;


    public List<Order> busqueTodos(){
        return orderRepository.findAll();
    }

    public Order buscarPeloId(Long id){
        Optional<Order> objeto = orderRepository.findById(id);
        return objeto.get();
    }

}
