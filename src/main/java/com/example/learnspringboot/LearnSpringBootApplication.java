package com.example.learnspringboot;

import com.example.utills.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class LearnSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LearnSpringBootApplication.class, args);
		Dev dev1 = context.getBean(Dev.class);
        dev1.build();
    }

}
