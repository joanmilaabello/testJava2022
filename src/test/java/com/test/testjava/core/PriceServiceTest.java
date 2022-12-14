package com.test.testjava.core;

import static com.test.testjava.constants.Constants.PAGE_FIRST_ITEM;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.test.testjava.db.entity.PriceEntity;
import com.test.testjava.db.repository.PriceRepository;
import com.test.testjava.dto.PriceDTO;
import com.test.testjava.dto.PriceFilterDTO;
import com.test.testjava.exception.PriceNotFoundApiException;
import com.test.testjava.mapper.PriceMapper;

@RunWith(MockitoJUnitRunner.class)
public class PriceServiceTest {

    @InjectMocks
    private PriceService sut;

    @Mock
    private PriceRepository priceRepository;

    @Mock
    private PriceMapper priceMapper;

    @Test
    public void checkShouldReturnMappedResponse() {
        PriceFilterDTO request = PriceFilterDTO.builder().build();
        PriceEntity priceEntity = PriceEntity.builder().build();
        List<PriceEntity> entities = List.of(priceEntity);
        PriceDTO expected = PriceDTO.builder().build();
        when(priceRepository.check(request, PAGE_FIRST_ITEM)).thenReturn(entities);
        when(priceMapper.toDto(priceEntity)).thenReturn(expected);
        assertEquals(expected, sut.check(request));
    }

    @Test(expected = PriceNotFoundApiException.class)
    public void checkShouldThrowNotFoundException() {
        PriceFilterDTO request = PriceFilterDTO.builder().build();
        when(priceRepository.check(request, PAGE_FIRST_ITEM)).thenReturn(Collections.emptyList());
        sut.check(request);
    }
}
