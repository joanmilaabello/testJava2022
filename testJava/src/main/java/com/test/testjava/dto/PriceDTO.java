package com.test.testjava.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PriceDTO implements Serializable {

    private static final long serialVersionUID = -6865067574370010704L;

    private Integer productId;
    private Short brandId;
    private Short rateId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double price;
    private String currencyCode;
}
