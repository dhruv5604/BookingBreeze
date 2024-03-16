package com.example.BookingBreeze.service;

import com.example.BookingBreeze.model.User;
//import com.example.BookingBreeze.repository.RoleRepository;
import com.example.BookingBreeze.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User authenticateUser(String email, String password) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            // Check if the provided password matches the user's password
            if (password.equals(user.getPassword())) {
                return user;
            }
        }
        return null; // Authentication failed
    }
}
