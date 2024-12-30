package com.example.demo1.Model;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String middleName;
    private String lastName;
    private String password;

    public UserDetails() {}

    public UserDetails(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.password = generatePassword(firstName, middleName, lastName);
    }

    private String generatePassword(String firstName, String middleName, String lastName) {
        String firstTwo = firstName.substring(0, 2);
        String middleTwo = middleName.substring(0, 2);
        String lastTwo = lastName.substring(0, 2);
        int randomDigits = new Random().nextInt(900) + 100; // Generates a 3-digit random number
        return firstTwo + middleTwo + lastTwo + randomDigits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDetails [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
                + lastName + ", password=" + password + "]";
    }

    
}