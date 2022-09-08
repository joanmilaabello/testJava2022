package com.test.testjava.ws;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.test.testjava.core.PriceService;
import com.test.testjava.dto.PriceDTO;
import com.test.testjava.dto.PriceFilterDTO;

@RunWith(MockitoJUnitRunner.class)
public class PriceControllerTest {

    @InjectMocks
    private PriceController sut;

    @Mock
    private PriceService priceService;

    @Test
    public void findShouldReturnServiceResponse() {
        PriceFilterDTO request = PriceFilterDTO.builder().build();
        PriceDTO expected = PriceDTO.builder().build();
        when(priceService.check(request)).thenReturn(expected);
        ResponseEntity<PriceDTO> response = sut.check(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expected, response.getBody());
    }
}
