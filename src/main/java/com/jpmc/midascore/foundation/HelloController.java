package com.jpmc.midascore.foundation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "✅ Hello! Your Spring Boot app is running.";
    }
}
