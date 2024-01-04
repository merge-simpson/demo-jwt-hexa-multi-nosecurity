package com.example.demo.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(scanBasePackages = "com.example")
@ConfigurationPropertiesScan(basePackages = "com.example")
public class MemberProfileServerRunner {
    public static void main(String[] args) {
        SpringApplication.run(MemberProfileServerRunner.class, args);
    }
}
