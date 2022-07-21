package com.example.apijava.controller;


import com.example.apijava.model.UsersModel;
import com.example.apijava.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    private UsersRepository repository;

    @GetMapping(path = "/api/users/{password}")
    public ResponseEntity consult (@PathVariable ( "password" ) Integer password ) {
        return repository.findById (password)
                .map(record -> ResponseEntity.ok().body (record))
                .orElse (ResponseEntity.notFound ().build ());
    }
    @PostMapping(path = "/api/users/save")
    public UsersModel save(@RequestBody UsersModel user) {
        return repository.save ((user));
    }

}