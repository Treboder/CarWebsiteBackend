package com.udacity.pricing.api;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.websocket.server.PathParam;

/**
 * Implements a REST-based controller for the pricing service.
 */
@RestController
@RequestMapping("/prices")
public class PricingController {

    /**
     * Gets the price for a requested vehicle.
     * This is variant uses the path variable in order to expose an identical endpoint as provided by the webservice
     * For an example with vehicleId= 1 the call would be http://localhost:8082/prices/1
     * @param vehicleId ID number of the vehicle for which the price is requested
     * @return price of the vehicle, or error that it was not found.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Price> getPriceWithPathVariable(@PathVariable("id") Long vehicleId) {
        try {
            return new ResponseEntity<Price>(PricingService.getPrice(vehicleId), HttpStatus.OK);
        } catch (PriceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Price Not Found", ex);
        }

    }

    // Originally an alternative variant using the request parameter (as part of the startup project)
    // For an example with vehicleId= 1 the call would be http://localhost:8082/prices?vehicleId=1
//    @GetMapping()
//    public ResponseEntity<Price> getPriceWithRequestParam(@RequestParam Long vehicleId) {
//        try {
//            return new ResponseEntity<Price>(PricingService.getPrice(vehicleId), HttpStatus.OK);
//        } catch (PriceException ex) {
//            throw new ResponseStatusException(
//                    HttpStatus.NOT_FOUND, "Price Not Found", ex);
//        }
//    }


}
