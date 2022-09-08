# Pricing Service (Microservice with Eureka)

The pricing service simulates a backend that would store and retrieve the price of a vehicle given a vehicle id as input.
This version of the pricing service is a microservice based on spring-data-rest.
The service is available on port `8082`. 
cf. [Baeldung spring-data-rest-intro](https://www.baeldung.com/spring-data-rest-intro)

## Operations

### GET (in order to retrieve list of prices)
```
http://localhost:8082/prices
```
### GET (in order to retrieve a certain price by id)
```
http://localhost:8082/prices/1
``` 
### POST (in order to save a new price) 
```
http://localhost:8082/prices/
``` 
with following JSON payload:
```
    {
        "currency" : "USD",
            "price" : "100",
            "vehicleId" : "100"
    }
```

### DELETE (a certain price by id)
```
http://localhost:8082/prices/1
```

### PUT (in order to update a certain price by id)
```
http://localhost:8082/prices/1
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