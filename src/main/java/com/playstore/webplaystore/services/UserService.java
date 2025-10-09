package com.playstore.webplaystore.services;

import com.playstore.webplaystore.entities.User;
import com.playstore.webplaystore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> busqueTodos(){
        return userRepository.findAll();
    }

    public User buscarPeloId(Long id){
        Optional<User> objeto = userRepository.findById(id);
        return objeto.get();
    }

}
