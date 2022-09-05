package com.test.testjava.ws;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.test.testjava.core.PriceService;
import com.test.testjava.dto.PriceFilterDTO;
import com.test.testjava.dto.PriceDTO;

@RunWith(MockitoJUnitRunner.class)
public class PriceControllerTest {

    @InjectMocks
    private PriceController sut;

    @Mock
    private PriceService priceService;

    @Test
    public void findShouldReturnServiceResponse() {
        PriceFilterDTO request = PriceFilterDTO.builder().build();
        PriceDTO response = PriceDTO.builder().build();
        when(priceService.check(request)).thenReturn(response);
        assertEquals(response, sut.check(request));
    }
}
