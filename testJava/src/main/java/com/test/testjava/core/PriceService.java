package com.test.testjava.core;

import static com.test.testjava.constants.Constants.PAGE_FIRST_ITEM;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.test.testjava.db.entity.PriceEntity;
import com.test.testjava.db.repository.PriceRepository;
import com.test.testjava.dto.PriceDTO;
import com.test.testjava.dto.PriceFilterDTO;
import com.test.testjava.mapper.PriceMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PriceService {

    private final PriceRepository priceRepository;

    private final PriceMapper priceMapper;

    public PriceDTO check(PriceFilterDTO request) {
        List<PriceEntity> page = priceRepository.check(request, PAGE_FIRST_ITEM);
        validateData(page);
        return priceMapper.toDto(page.get(0));
    }

    private void validateData(List<PriceEntity> page) {
        if (CollectionUtils.isEmpty(page)) {
            // TODO: Manage exceptions
            throw new RuntimeException("Not Found");
        }
    }
}
