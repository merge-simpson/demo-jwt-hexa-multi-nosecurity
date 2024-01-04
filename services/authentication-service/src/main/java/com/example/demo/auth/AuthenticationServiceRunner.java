package com.example.demo.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(scanBasePackages = "com.example")
@ConfigurationPropertiesScan(basePackages = "com.example")
public class AuthenticationServiceRunner {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationServiceRunner.class, args);
    }
}
