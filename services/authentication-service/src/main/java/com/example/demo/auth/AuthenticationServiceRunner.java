package com.example.demo.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import static com.example.common.support.BaseConstants.ROOT_PACKAGE;

@SpringBootApplication(scanBasePackages = ROOT_PACKAGE)
@ConfigurationPropertiesScan(basePackages = ROOT_PACKAGE)
public class AuthenticationServiceRunner {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationServiceRunner.class, args);
    }
}
