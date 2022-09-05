package com.test.testjava.dto;

import java.time.LocalDateTime;

import lombok.Builder;

@Builder
public class PriceDTO {

    private Integer productId;
    private Short brandId;
    private Short rateId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double price;
    private String currencyCode;
}
