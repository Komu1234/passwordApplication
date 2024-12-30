package com.example.demo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.Model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}
