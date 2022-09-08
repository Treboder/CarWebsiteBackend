package com.udacity.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 */
@SpringBootApplication
@EnableEurekaClient // is optional, but supports code readability
public class PricingMicroserviceWithHeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingMicroserviceWithHeurekaApplication.class, args);
    }

}
