package com.playstore.webplaystore.repositories;

import com.playstore.webplaystore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
