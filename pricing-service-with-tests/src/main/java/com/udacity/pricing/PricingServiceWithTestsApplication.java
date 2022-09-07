package com.udacity.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 * TODO: Convert the application from a REST API to a microservice.
 */
@SpringBootApplication
public class PricingServiceWithTestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceWithTestsApplication.class, args);
    }

}
