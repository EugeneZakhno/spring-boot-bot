package com.example.test_bot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class TestBotAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestBotAppApplication.class, args);

        ApiContextInitializer.init();
        SpringApplication.run(TestBotAppApplication.class, args);
    }
}
