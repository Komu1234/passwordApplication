package com.example.demo1.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.Model.UserDetails;
import com.example.demo1.Repository.UserDetailsRepository;

import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    private UserDetailsRepository repository;

    public UserDetails saveUser(String firstName, String middleName, String lastName) {
        UserDetails user = new UserDetails(firstName, middleName, lastName);
        return repository.save(user);
    }

    public List<UserDetails> getAllUsers() {
        return repository.findAll();
    }
}
