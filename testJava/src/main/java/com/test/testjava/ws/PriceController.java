package com.test.testjava.ws;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.testjava.constants.Constants;
import com.test.testjava.core.PriceService;
import com.test.testjava.dto.PriceDTO;
import com.test.testjava.dto.PriceFilterDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(
    value = Constants.VERSION + "/price",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PriceController {

    private final PriceService priceService;

    @PostMapping(value = "/check")
    public ResponseEntity<PriceDTO> check(@Valid @RequestBody PriceFilterDTO request) {
        return ResponseEntity.ok(priceService.check(request));
    }
}
