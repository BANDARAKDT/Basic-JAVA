package com.ruh.tec.dependencydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyDemoApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext context=SpringApplication.run(DependencyDemoApplication.class, args);
        Customer c= context.getBean(customer.class);
        c.display();
    }

}
