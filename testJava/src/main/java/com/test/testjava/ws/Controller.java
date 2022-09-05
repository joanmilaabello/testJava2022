package com.test.testjava.ws;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.testjava.constants.Constants;
import com.test.testjava.dto.PriceAvailDTO;
import com.test.testjava.dto.PriceDTO;

@RestController
@RequestMapping(
    value = Constants.VERSION + "/price",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {

    @PostMapping
    public PriceDTO getPrices(@Valid @RequestBody PriceAvailDTO request) {
        return null;
    }
}
