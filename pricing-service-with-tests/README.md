# Pricing Service

The Pricing Service is a REST WebService integrated with Spring Boot that simulates a backend that
would store and retrieve the price of a vehicle given a vehicle id as input.
The service is available on port `8082`.
[H2 console](http://localhost:8082/h2) ativated with jdbc url = jdbc:h2:mem:pricingdata (user "sa" with no password)

## Operations

### GET (in order to retrieve list of prices)
```
http://localhost:8082/services/prices
```
### GET (in order to retrieve a certain price by id)
```
http://localhost:8082/services/price?vehicleId=1
```

## Run the code

To run this service you execute:

```
$ mvn clean package
```

```
$ java -jar target/pricing-service-0.0.1-SNAPSHOT.jar
```

It can also be imported in your IDE as a Maven project.
