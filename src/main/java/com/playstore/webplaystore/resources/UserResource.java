package com.playstore.webplaystore.resources;

import com.playstore.webplaystore.entities.User;
import com.playstore.webplaystore.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> busqueTodosUsuarios(){
        List<User> listaDeUsuarios = userService.busqueTodos();
        return ResponseEntity.ok().body(listaDeUsuarios);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> buscarPorIdDoUsuario(@PathVariable Long id){
        User user = userService.buscarPeloId(id);
        return ResponseEntity.ok().body(user);
    }

}
