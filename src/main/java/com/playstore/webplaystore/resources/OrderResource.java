package com.playstore.webplaystore.resources;

import com.playstore.webplaystore.entities.Order;
import com.playstore.webplaystore.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> busqueTodosUsuarios(){
        List<Order> listaDeUsuarios = orderService.busqueTodos();
        return ResponseEntity.ok().body(listaDeUsuarios);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> buscarPorIdDoUsuario(@PathVariable Long id){
        Order order = orderService.buscarPeloId(id);
        return ResponseEntity.ok().body(order);
    }

}
