package com.havi;


import com.community.CommunityApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HaviApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaviApplication.class, args);
    }

    @GetMapping
    public String HelloWorld() {
        return "Hello World";
    }
}
