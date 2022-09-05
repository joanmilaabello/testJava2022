package com.test.testjava.core;

import static com.test.testjava.constants.Constants.PAGE_FIRST_ITEM;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.test.testjava.db.entity.PriceEntity;
import com.test.testjava.db.repository.PriceRepository;
import com.test.testjava.dto.PriceFilterDTO;

@RunWith(MockitoJUnitRunner.class)
public class PriceServiceTest {

    @InjectMocks
    private PriceService sut;

    @Mock
    private PriceRepository priceRepository;

    @Test
    public void check() {
        PriceFilterDTO request = PriceFilterDTO.builder().build();
        List<PriceEntity> entities = List.of(PriceEntity.builder().build());
        when(priceRepository.check(request, PAGE_FIRST_ITEM)).thenReturn(entities);
        assertNull(sut.check(request));
    }
}
