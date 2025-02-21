package com.udacity.vehicles.service;

import com.udacity.vehicles.client.maps.MapsClient;
import com.udacity.vehicles.client.prices.PriceClient;
import com.udacity.vehicles.domain.car.Car;
import com.udacity.vehicles.domain.car.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implements the car service create, read, update or delete
 * information about vehicles, as well as gather related
 * location and price data when desired.
 */
@Service
public class CarService {

    private static final Logger log = LoggerFactory.getLogger(CarService.class);

    private final CarRepository repository;
    private final PriceClient priceClient;
    private final MapsClient mapsClient;

    @Autowired
    public CarService(CarRepository repository, PriceClient priceClient, MapsClient mapsClient){
        this.repository = repository;
        this.priceClient = priceClient;
        this.mapsClient = mapsClient;
    }

    /**
     * Gathers a list of all vehicles
     * @return a list of all vehicles in the CarRepository
     */
    public List<Car> list() {
        return repository.findAll();
    }

    /**
     * Gets car information by ID (or throws exception if non-existent)
     * @param id the ID number of the car to gather information on
     * @return the requested car's information, including location and price
     */
    public Car findById(Long id) {
        //Find the car by ID from the `repository` if it exists, otherwise throw a CarNotFoundException
        Car car = repository.findById(id).orElseThrow(CarNotFoundException::new);
        //Set the price of the car using the Pricing Web client you create in `VehiclesApiApplication`
        //Note: The car class file uses @transient, meaning you will need to call the pricing service each time to get the price.
        car.setPrice(priceClient.getPrice(car.getId()));
        // Set the location of the vehicle (including the address information) using the Maps Web client you create in `VehiclesApiApplication`
        // To get the address for the vehicle. You should access the location from the car object and feed it to the Maps service.
        // Note: The Location class file also uses @transient for the address, meaning the Maps service needs to be called each time for the address.
        car.setLocation(mapsClient.getAddress(car.getLocation()));
        log.info("Service found car with id=" + id);
        return car;
    }

    /**
     * Either creates or updates a vehicle, based on prior existence of car
     * @param car A car object, which can be either new or existing
     * @return the new/updated car is stored in the repository
     */
    public Car save(Car car) {
        if (car.getId() != null) {
            return repository.findById(car.getId())
                    .map(carToBeUpdated -> {
                        carToBeUpdated.setDetails(car.getDetails());
                        carToBeUpdated.setLocation(car.getLocation());
                        return repository.save(carToBeUpdated);
                    }).orElseThrow(CarNotFoundException::new);
        }
        log.info("Service saved car with price=" + car.getPrice());
        return repository.save(car);
    }

    /**
     * Deletes a given car by ID
     * @param id the ID number of the car to delete
     */
    public void delete(Long id) {
        // Find the car by ID from the `repository` if it exists, otherwise throw a CarNotFoundException
        Car car = repository.findById(id).orElseThrow(CarNotFoundException::new);
        // Delete the car from the repository
        repository.delete(car);
        log.info("Service deleted car with id=" + id);
    }
}
