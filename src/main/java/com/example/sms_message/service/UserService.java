package com.example.sms_message.service;

import com.example.sms_message.model.User;
import com.example.sms_message.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }
}
