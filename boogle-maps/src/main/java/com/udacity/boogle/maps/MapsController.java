package com.udacity.boogle.maps;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maps")
public class MapsController {

    // with lat=1 and lon=2 the call would be http://localhost:9191/maps/coord?lat=1&lon=2
    // cf. https://www.baeldung.com/spring-request-param for more examples
    @GetMapping
    public ResponseEntity<Address> get(@RequestParam Double lat, @RequestParam Double lon) {
        return new ResponseEntity<Address>(MockAddressRepository.getRandom(), HttpStatus.OK);
    }

}
