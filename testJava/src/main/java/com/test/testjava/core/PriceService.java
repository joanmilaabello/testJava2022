package com.test.testjava.core;

import static com.test.testjava.constants.Constants.PAGE_FIRST_ITEM;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.testjava.db.entity.PriceEntity;
import com.test.testjava.db.repository.PriceRepository;
import com.test.testjava.dto.PriceDTO;
import com.test.testjava.dto.PriceFilterDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PriceService {

    private final PriceRepository priceRepository;

    public PriceDTO check(PriceFilterDTO request) {
        List<PriceEntity> page = priceRepository.check(request, PAGE_FIRST_ITEM);
        PriceEntity priceEntity = page.get(0);
        // TODO: Map response
        return null;
    }
}
