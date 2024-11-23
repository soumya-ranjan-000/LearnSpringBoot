package com.example.learnspringboot;

import com.example.utils.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class LearnSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context;
        context= SpringApplication.run(LearnSpringBootApplication.class, args);
//        context = new ClassPathXmlApplicationContext("spring.xml");

		Dev dev1 = context.getBean(Dev.class);
        dev1.build();
    }
}
