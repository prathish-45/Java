package com.example.website_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final UserRepository userRepository;

    @Autowired
    public GreetingService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String createAndGreetUser (String name) {
        User newUser = new User(name);
        User savedUser = userRepository.save(newUser);
        return "Hello " + savedUser.getName() + "Your Id is " + savedUser.getId();
    }
}