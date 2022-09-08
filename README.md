# Vehicles API Project

Project repository for JavaND Project 2, where students implement a Vehicles API using Java and Spring Boot that can 
communicate with separate location and pricing services. 
In this project, a REST-based Vehicles API communicates with a location and pricing service using Spring Boot, 
along with converting the existing Pricing Service API to a microservice registered on a Eureka server.

## Shortcuts

- [Swagger UI](http://localhost:8081/swagger-ui.html) on port `8081`
- [Car API](http://localhost:8081) on port `8081`
- [Car API H2 console](http://localhost:8081/h2) on port `8081` with jdbc url = jdbc:h2:mem:vehicledata (user "sa" with no password)
- [Pricing Service](http://localhost:8082) on port `8082`
- [Pricing Service H2 console](http://localhost:8082/h2) on port `8082` with jdbc url = jdbc:h2:mem:pricingdata (user "sa" with no password)
- [Location Service](http://localhost:8083) on port `8083`
- [Eureka Server](http://localhost:8761) on port `8761` by default

## Features

- REST API exploring the main HTTP verbs and features
- Hateoas
- Custom API Error handling using `ControllerAdvice`
- Swagger API docs
- HTTP WebClient
- MVC Test
- Automatic model mapping

## Instructions

Check each component to see its details and instructions. Note that all three applications
should be running at once for full operation.

- [Eureka-Server](eureka-server/README.md)
- [Vehicles API](vehicles-api/README.md)
- [Pricing Service with Eureka](pricing-service-with-eureka/README.md)
- [Pricing Service with Tests](pricing-service-with-tests/README.md)
- [Boogle Maps](boogle-maps/README.md)

## Dependencies

The project requires the use of Maven and Spring Boot, along with Java v11.

