package com.example.demo1.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo1.Model.UserDetails;
import com.example.demo1.Service.UserDetailsService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserDetailsController {

    @Autowired
    private UserDetailsService service;

    @PostMapping("/add")
    public ResponseEntity<UserDetails> addUser(@RequestBody UserDetails userDetails) {
        UserDetails user = service.saveUser(userDetails.getFirstName(), userDetails.getMiddleName(), userDetails.getLastName());
        return ResponseEntity.ok(user);
    }
    @GetMapping("/all")
    public ResponseEntity<List<UserDetails>> getAllUsers() {
        return ResponseEntity.ok(service.getAllUsers());
    }
}
