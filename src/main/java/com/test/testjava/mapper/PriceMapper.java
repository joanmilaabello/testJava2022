package com.test.testjava.mapper;

import org.mapstruct.Mapper;

import com.test.testjava.db.entity.PriceEntity;
import com.test.testjava.dto.PriceDTO;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    PriceDTO toDto(PriceEntity entity);
}
