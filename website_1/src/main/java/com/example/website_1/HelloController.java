package com.example.website_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final GreetingService greetingService;

    @Autowired
    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/create-user")
    public String hello(@RequestParam (value = "name", defaultValue = "world") String name) {
        return greetingService.createAndGreetUser(name);
    }
}