package com.udacity.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 * TODO: Add proper test for the microservice.
 */
@SpringBootApplication
public class PricingServiceWithHeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceWithHeurekaApplication.class, args);
    }

}
