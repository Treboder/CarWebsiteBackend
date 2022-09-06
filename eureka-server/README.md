# Eureka Service

This is Eureka service will register the web services, i.e. at least the pricing service.
The service is available by default on port `8761`. You can log in on the service using: http://localhost:8761

## Instructions

Via shell it can be started using

```
$ mvn clean package
```

```
$ java -jar target/discovery-service-0.0.1-SNAPSHOT.jar
```

It can also be imported in your IDE as a Maven project.

