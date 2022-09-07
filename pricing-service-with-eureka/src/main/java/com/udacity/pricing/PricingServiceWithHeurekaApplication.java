package com.udacity.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 * TODO: Add proper test for the microservice.
 */
@SpringBootApplication
@EnableEurekaClient // is optional when spring-cloud-starter-netflix-eureka-client is part of the dependencies
public class PricingServiceWithHeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceWithHeurekaApplication.class, args);
    }

}
