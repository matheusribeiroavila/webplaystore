package com.playstore.webplaystore.configs;

import com.playstore.webplaystore.entities.Order;
import com.playstore.webplaystore.entities.User;
import com.playstore.webplaystore.repositories.OrderRepository;
import com.playstore.webplaystore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Matheus Avila", "avila@gmail.com", "043996089567", "123456");
        User u2 = new User(null, "Maria Clara", "maria@gmail.com", "0439999222233", "123456");
        Order order1 = new Order(null, Instant.parse("2025-10-22T21:21:21Z"), u1);
        Order order2 = new Order(null, Instant.parse("2025-09-01T08:30:12Z"), u2);
        Order order3 = new Order(null, Instant.parse("2024-11-25T09:30:10Z"), u2);
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }

}
