package com.example.redisdemo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisDemoApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(CustomerRepo customerRepo) {
        return args -> {
            Customer customer = new Customer("111", "Burak");
            customerRepo.save(customer);
            Customer retrievedCustomer = customerRepo.findById("111").get();
            System.out.println(retrievedCustomer);
        };
    }
}
