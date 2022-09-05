package com.test.testjava.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PriceFilterDTO {

    @NotNull
    private Integer productId;
    @NotNull
    private Short brandId;
    private LocalDateTime date;
}
